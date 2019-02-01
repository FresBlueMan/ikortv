package com.nostra13.universalimageloader.core.download;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.ContactsContract.Contacts;
import android.provider.MediaStore.Video.Thumbnails;
import android.webkit.MimeTypeMap;
import com.nostra13.universalimageloader.core.assist.ContentLengthInputStream;
import com.nostra13.universalimageloader.core.download.ImageDownloader.Scheme;
import com.nostra13.universalimageloader.utils.IoUtils;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class BaseImageDownloader implements ImageDownloader {
    protected static final String ALLOWED_URI_CHARS = "@#&=*+-_.,:!?()/~'%";
    protected static final int BUFFER_SIZE = 32768;
    protected static final String CONTENT_CONTACTS_URI_PREFIX = "content://com.android.contacts/";
    public static final int DEFAULT_HTTP_CONNECT_TIMEOUT = 5000;
    public static final int DEFAULT_HTTP_READ_TIMEOUT = 20000;
    private static final String ERROR_UNSUPPORTED_SCHEME = "UIL doesn't support scheme(protocol) by default [%s]. You should implement this support yourself (BaseImageDownloader.getStreamFromOtherSource(...))";
    protected static final int MAX_REDIRECT_COUNT = 5;
    protected final int connectTimeout;
    protected final Context context;
    protected final int readTimeout;

    public BaseImageDownloader(Context context) {
        this(context, DEFAULT_HTTP_CONNECT_TIMEOUT, DEFAULT_HTTP_READ_TIMEOUT);
    }

    public BaseImageDownloader(Context context, int i, int i2) {
        this.context = context.getApplicationContext();
        this.connectTimeout = i;
        this.readTimeout = i2;
    }

    public InputStream getStream(String str, Object obj) {
        switch (Scheme.ofUri(str)) {
            case HTTP:
            case HTTPS:
                return getStreamFromNetwork(str, obj);
            case FILE:
                return getStreamFromFile(str, obj);
            case CONTENT:
                return getStreamFromContent(str, obj);
            case ASSETS:
                return getStreamFromAssets(str, obj);
            case DRAWABLE:
                return getStreamFromDrawable(str, obj);
            default:
                return getStreamFromOtherSource(str, obj);
        }
    }

    protected InputStream getStreamFromNetwork(String str, Object obj) {
        str = createConnection(str, obj);
        int i = 0;
        while (str.getResponseCode() / 100 == 3 && i < 5) {
            str = createConnection(str.getHeaderField("Location"), obj);
            i++;
        }
        try {
            obj = str.getInputStream();
            if (shouldBeProcessed(str)) {
                return new ContentLengthInputStream(new BufferedInputStream(obj, 32768), str.getContentLength());
            }
            IoUtils.closeSilently(obj);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Image request failed with response code ");
            stringBuilder.append(str.getResponseCode());
            throw new IOException(stringBuilder.toString());
        } catch (Object obj2) {
            IoUtils.readAndCloseStream(str.getErrorStream());
            throw obj2;
        }
    }

    protected boolean shouldBeProcessed(HttpURLConnection httpURLConnection) {
        return httpURLConnection.getResponseCode() == 200 ? true : null;
    }

    protected HttpURLConnection createConnection(String str, Object obj) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(Uri.encode(str, ALLOWED_URI_CHARS)).openConnection();
        httpURLConnection.setConnectTimeout(this.connectTimeout);
        httpURLConnection.setReadTimeout(this.readTimeout);
        return httpURLConnection;
    }

    protected InputStream getStreamFromFile(String str, Object obj) {
        obj = Scheme.FILE.crop(str);
        if (isVideoFileUri(str) != null) {
            return getVideoThumbnailStream(obj);
        }
        return new ContentLengthInputStream(new BufferedInputStream(new FileInputStream(obj), 32768), (int) new File(obj).length());
    }

    @TargetApi(8)
    private InputStream getVideoThumbnailStream(String str) {
        if (VERSION.SDK_INT >= 8) {
            str = ThumbnailUtils.createVideoThumbnail(str, 2);
            if (str != null) {
                OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                str.compress(CompressFormat.PNG, 0, byteArrayOutputStream);
                return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            }
        }
        return null;
    }

    protected InputStream getStreamFromContent(String str, Object obj) {
        obj = this.context.getContentResolver();
        Uri parse = Uri.parse(str);
        if (isVideoContentUri(parse)) {
            str = Thumbnails.getThumbnail(obj, Long.valueOf(parse.getLastPathSegment()).longValue(), 1, null);
            if (str != null) {
                obj = new ByteArrayOutputStream();
                str.compress(CompressFormat.PNG, 0, obj);
                return new ByteArrayInputStream(obj.toByteArray());
            }
        } else if (str.startsWith(CONTENT_CONTACTS_URI_PREFIX) != null) {
            return getContactPhotoStream(parse);
        }
        return obj.openInputStream(parse);
    }

    @TargetApi(14)
    protected InputStream getContactPhotoStream(Uri uri) {
        ContentResolver contentResolver = this.context.getContentResolver();
        if (VERSION.SDK_INT >= 14) {
            return Contacts.openContactPhotoInputStream(contentResolver, uri, true);
        }
        return Contacts.openContactPhotoInputStream(contentResolver, uri);
    }

    protected InputStream getStreamFromAssets(String str, Object obj) {
        return this.context.getAssets().open(Scheme.ASSETS.crop(str));
    }

    protected InputStream getStreamFromDrawable(String str, Object obj) {
        return this.context.getResources().openRawResource(Integer.parseInt(Scheme.DRAWABLE.crop(str)));
    }

    protected InputStream getStreamFromOtherSource(String str, Object obj) {
        throw new UnsupportedOperationException(String.format(ERROR_UNSUPPORTED_SCHEME, new Object[]{str}));
    }

    private boolean isVideoContentUri(Uri uri) {
        uri = this.context.getContentResolver().getType(uri);
        return (uri == null || uri.startsWith("video/") == null) ? null : true;
    }

    private boolean isVideoFileUri(String str) {
        str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
        return (str == null || str.startsWith("video/") == null) ? null : true;
    }
}
