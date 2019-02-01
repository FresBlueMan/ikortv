package com.loopj.android.http;

import android.text.TextUtils;
import com.loopj.android.http.RequestParams.FileWrapper;
import com.loopj.android.http.RequestParams.StreamWrapper;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0149k;
import p000a.p001a.p002a.p003a.p031k.C0894b;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class JsonStreamerEntity implements C0149k {
    private static final int BUFFER_SIZE = 4096;
    private static final UnsupportedOperationException ERR_UNSUPPORTED = new UnsupportedOperationException("Unsupported operation in this implementation.");
    private static final C0082e HEADER_GZIP_ENCODING = new C0894b(AsyncHttpClient.HEADER_CONTENT_ENCODING, AsyncHttpClient.ENCODING_GZIP);
    private static final C0082e HEADER_JSON_CONTENT = new C0894b(AsyncHttpClient.HEADER_CONTENT_TYPE, RequestParams.APPLICATION_JSON);
    private static final byte[] JSON_FALSE = "false".getBytes();
    private static final byte[] JSON_NULL = "null".getBytes();
    private static final byte[] JSON_TRUE = "true".getBytes();
    private static final String LOG_TAG = "JsonStreamerEntity";
    private static final byte[] STREAM_CONTENTS = escape("contents");
    private static final byte[] STREAM_NAME = escape("name");
    private static final byte[] STREAM_TYPE = escape(IjkMediaMeta.IJKM_KEY_TYPE);
    private final byte[] buffer = new byte[4096];
    private final C0082e contentEncoding;
    private final byte[] elapsedField;
    private final Map<String, Object> jsonParams = new HashMap();
    private final ResponseHandlerInterface progressHandler;

    public void consumeContent() {
    }

    public long getContentLength() {
        return -1;
    }

    public boolean isChunked() {
        return false;
    }

    public boolean isRepeatable() {
        return false;
    }

    public boolean isStreaming() {
        return false;
    }

    public JsonStreamerEntity(ResponseHandlerInterface responseHandlerInterface, boolean z, String str) {
        this.progressHandler = responseHandlerInterface;
        responseHandlerInterface = null;
        this.contentEncoding = z ? HEADER_GZIP_ENCODING : false;
        if (!TextUtils.isEmpty(str)) {
            responseHandlerInterface = escape(str);
        }
        this.elapsedField = responseHandlerInterface;
    }

    static byte[] escape(String str) {
        if (str == null) {
            return JSON_NULL;
        }
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append('\"');
        int length = str.length();
        int i = -1;
        while (true) {
            i++;
            if (i < length) {
                char charAt = str.charAt(i);
                if (charAt == '\"') {
                    stringBuilder.append("\\\"");
                } else if (charAt != '\\') {
                    switch (charAt) {
                        case '\b':
                            stringBuilder.append("\\b");
                            break;
                        case '\t':
                            stringBuilder.append("\\t");
                            break;
                        case '\n':
                            stringBuilder.append("\\n");
                            break;
                        default:
                            switch (charAt) {
                                case '\f':
                                    stringBuilder.append("\\f");
                                    break;
                                case '\r':
                                    stringBuilder.append("\\r");
                                    break;
                                default:
                                    if (charAt > '\u001f' && (charAt < '' || charAt > '')) {
                                        if (charAt < ' ' || charAt > '⃿') {
                                            stringBuilder.append(charAt);
                                            break;
                                        }
                                    }
                                    String toHexString = Integer.toHexString(charAt);
                                    stringBuilder.append("\\u");
                                    int length2 = 4 - toHexString.length();
                                    for (int i2 = 0; i2 < length2; i2++) {
                                        stringBuilder.append('0');
                                    }
                                    stringBuilder.append(toHexString.toUpperCase(Locale.US));
                                    break;
                            }
                    }
                } else {
                    stringBuilder.append("\\\\");
                }
            } else {
                stringBuilder.append('\"');
                return stringBuilder.toString().getBytes();
            }
        }
    }

    public void addPart(String str, Object obj) {
        this.jsonParams.put(str, obj);
    }

    public C0082e getContentEncoding() {
        return this.contentEncoding;
    }

    public C0082e getContentType() {
        return HEADER_JSON_CONTENT;
    }

    public InputStream getContent() {
        throw ERR_UNSUPPORTED;
    }

    public void writeTo(OutputStream outputStream) {
        if (outputStream != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.contentEncoding != null) {
                outputStream = new GZIPOutputStream(outputStream, 4096);
            }
            outputStream.write(123);
            Set<String> keySet = this.jsonParams.keySet();
            int size = keySet.size();
            if (size > 0) {
                int i = 0;
                for (String str : keySet) {
                    i++;
                    try {
                        Object obj = this.jsonParams.get(str);
                        outputStream.write(escape(str));
                        outputStream.write(58);
                        if (obj == null) {
                            outputStream.write(JSON_NULL);
                        } else {
                            boolean z = obj instanceof FileWrapper;
                            if (!z) {
                                if (!(obj instanceof StreamWrapper)) {
                                    if (obj instanceof JsonValueInterface) {
                                        outputStream.write(((JsonValueInterface) obj).getEscapedJsonValue());
                                    } else if (obj instanceof JSONObject) {
                                        outputStream.write(obj.toString().getBytes());
                                    } else if (obj instanceof JSONArray) {
                                        outputStream.write(obj.toString().getBytes());
                                    } else if (obj instanceof Boolean) {
                                        outputStream.write(((Boolean) obj).booleanValue() ? JSON_TRUE : JSON_FALSE);
                                    } else if (obj instanceof Long) {
                                        r7 = new StringBuilder();
                                        r7.append(((Number) obj).longValue());
                                        r7.append("");
                                        outputStream.write(r7.toString().getBytes());
                                    } else if (obj instanceof Double) {
                                        r7 = new StringBuilder();
                                        r7.append(((Number) obj).doubleValue());
                                        r7.append("");
                                        outputStream.write(r7.toString().getBytes());
                                    } else if (obj instanceof Float) {
                                        r7 = new StringBuilder();
                                        r7.append(((Number) obj).floatValue());
                                        r7.append("");
                                        outputStream.write(r7.toString().getBytes());
                                    } else if (obj instanceof Integer) {
                                        r7 = new StringBuilder();
                                        r7.append(((Number) obj).intValue());
                                        r7.append("");
                                        outputStream.write(r7.toString().getBytes());
                                    } else {
                                        outputStream.write(escape(obj.toString()));
                                    }
                                }
                            }
                            outputStream.write(123);
                            if (z) {
                                writeToFromFile(outputStream, (FileWrapper) obj);
                            } else {
                                writeToFromStream(outputStream, (StreamWrapper) obj);
                            }
                            outputStream.write(125);
                        }
                        if (this.elapsedField != null || i < size) {
                            outputStream.write(44);
                        }
                    } catch (Throwable th) {
                        if (this.elapsedField != null || i < size) {
                            outputStream.write(44);
                        }
                    }
                }
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                if (this.elapsedField != null) {
                    outputStream.write(this.elapsedField);
                    outputStream.write(58);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(currentTimeMillis2);
                    stringBuilder.append("");
                    outputStream.write(stringBuilder.toString().getBytes());
                }
                LogInterface logInterface = AsyncHttpClient.log;
                String str2 = LOG_TAG;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Uploaded JSON in ");
                stringBuilder2.append(Math.floor((double) (currentTimeMillis2 / 1000)));
                stringBuilder2.append(" seconds");
                logInterface.mo1433i(str2, stringBuilder2.toString());
            }
            outputStream.write(125);
            outputStream.flush();
            AsyncHttpClient.silentCloseOutputStream(outputStream);
            return;
        }
        throw new IllegalStateException("Output stream cannot be null.");
    }

    private void writeToFromStream(OutputStream outputStream, StreamWrapper streamWrapper) {
        writeMetaData(outputStream, streamWrapper.name, streamWrapper.contentType);
        OutputStream base64OutputStream = new Base64OutputStream(outputStream, 18);
        while (true) {
            int read = streamWrapper.inputStream.read(this.buffer);
            if (read == -1) {
                break;
            }
            base64OutputStream.write(this.buffer, 0, read);
        }
        AsyncHttpClient.silentCloseOutputStream(base64OutputStream);
        endMetaData(outputStream);
        if (streamWrapper.autoClose != null) {
            AsyncHttpClient.silentCloseInputStream(streamWrapper.inputStream);
        }
    }

    private void writeToFromFile(OutputStream outputStream, FileWrapper fileWrapper) {
        writeMetaData(outputStream, fileWrapper.file.getName(), fileWrapper.contentType);
        long length = fileWrapper.file.length();
        InputStream fileInputStream = new FileInputStream(fileWrapper.file);
        fileWrapper = new Base64OutputStream(outputStream, 18);
        long j = 0;
        while (true) {
            int read = fileInputStream.read(this.buffer);
            if (read != -1) {
                fileWrapper.write(this.buffer, 0, read);
                j += (long) read;
                this.progressHandler.sendProgressMessage(j, length);
            } else {
                AsyncHttpClient.silentCloseOutputStream(fileWrapper);
                endMetaData(outputStream);
                AsyncHttpClient.silentCloseInputStream(fileInputStream);
                return;
            }
        }
    }

    private void writeMetaData(OutputStream outputStream, String str, String str2) {
        outputStream.write(STREAM_NAME);
        outputStream.write(58);
        outputStream.write(escape(str));
        outputStream.write(44);
        outputStream.write(STREAM_TYPE);
        outputStream.write(58);
        outputStream.write(escape(str2));
        outputStream.write(44);
        outputStream.write(STREAM_CONTENTS);
        outputStream.write(58);
        outputStream.write(34);
    }

    private void endMetaData(OutputStream outputStream) {
        outputStream.write(34);
    }
}
