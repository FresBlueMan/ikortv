package com.loopj.android.http;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0149k;
import p000a.p001a.p002a.p003a.p031k.C0894b;

class SimpleMultipartEntity implements C0149k {
    private static final byte[] CR_LF = STR_CR_LF.getBytes();
    private static final String LOG_TAG = "SimpleMultipartEntity";
    private static final char[] MULTIPART_CHARS = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final String STR_CR_LF = "\r\n";
    private static final byte[] TRANSFER_ENCODING_BINARY = "Content-Transfer-Encoding: binary\r\n".getBytes();
    private final String boundary;
    private final byte[] boundaryEnd;
    private final byte[] boundaryLine;
    private long bytesWritten;
    private final List<FilePart> fileParts = new ArrayList();
    private boolean isRepeatable;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final ResponseHandlerInterface progressHandler;
    private long totalSize;

    private class FilePart {
        public final File file;
        public final byte[] header;

        public FilePart(String str, File file, String str2, String str3) {
            if (TextUtils.isEmpty(str3) != null) {
                str3 = file.getName();
            }
            this.header = createHeader(str, str3, str2);
            this.file = file;
        }

        public FilePart(String str, File file, String str2) {
            this.header = createHeader(str, file.getName(), str2);
            this.file = file;
        }

        private byte[] createHeader(String str, String str2, String str3) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(SimpleMultipartEntity.this.boundaryLine);
                byteArrayOutputStream.write(SimpleMultipartEntity.this.createContentDisposition(str, str2));
                byteArrayOutputStream.write(SimpleMultipartEntity.this.createContentType(str3));
                byteArrayOutputStream.write(SimpleMultipartEntity.TRANSFER_ENCODING_BINARY);
                byteArrayOutputStream.write(SimpleMultipartEntity.CR_LF);
            } catch (String str4) {
                AsyncHttpClient.log.mo1431e(SimpleMultipartEntity.LOG_TAG, "createHeader ByteArrayOutputStream exception", str4);
            }
            return byteArrayOutputStream.toByteArray();
        }

        public long getTotalLength() {
            return ((long) this.header.length) + (this.file.length() + ((long) SimpleMultipartEntity.CR_LF.length));
        }

        public void writeTo(OutputStream outputStream) {
            outputStream.write(this.header);
            SimpleMultipartEntity.this.updateProgress((long) this.header.length);
            InputStream fileInputStream = new FileInputStream(this.file);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                    SimpleMultipartEntity.this.updateProgress((long) read);
                } else {
                    outputStream.write(SimpleMultipartEntity.CR_LF);
                    SimpleMultipartEntity.this.updateProgress((long) SimpleMultipartEntity.CR_LF.length);
                    outputStream.flush();
                    AsyncHttpClient.silentCloseInputStream(fileInputStream);
                    return;
                }
            }
        }
    }

    private String normalizeContentType(String str) {
        return str == null ? RequestParams.APPLICATION_OCTET_STREAM : str;
    }

    public C0082e getContentEncoding() {
        return null;
    }

    public boolean isChunked() {
        return false;
    }

    public boolean isStreaming() {
        return false;
    }

    public SimpleMultipartEntity(ResponseHandlerInterface responseHandlerInterface) {
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            stringBuilder.append(MULTIPART_CHARS[random.nextInt(MULTIPART_CHARS.length)]);
        }
        this.boundary = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append("--");
        stringBuilder.append(this.boundary);
        stringBuilder.append(STR_CR_LF);
        this.boundaryLine = stringBuilder.toString().getBytes();
        stringBuilder = new StringBuilder();
        stringBuilder.append("--");
        stringBuilder.append(this.boundary);
        stringBuilder.append("--");
        stringBuilder.append(STR_CR_LF);
        this.boundaryEnd = stringBuilder.toString().getBytes();
        this.progressHandler = responseHandlerInterface;
    }

    public void addPart(String str, String str2, String str3) {
        try {
            this.out.write(this.boundaryLine);
            this.out.write(createContentDisposition(str));
            this.out.write(createContentType(str3));
            this.out.write(CR_LF);
            this.out.write(str2.getBytes());
            this.out.write(CR_LF);
        } catch (String str4) {
            AsyncHttpClient.log.mo1431e(LOG_TAG, "addPart ByteArrayOutputStream exception", str4);
        }
    }

    public void addPartWithCharset(String str, String str2, String str3) {
        if (str3 == null) {
            str3 = AsyncHttpResponseHandler.DEFAULT_CHARSET;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("text/plain; charset=");
        stringBuilder.append(str3);
        addPart(str, str2, stringBuilder.toString());
    }

    public void addPart(String str, String str2) {
        addPartWithCharset(str, str2, null);
    }

    public void addPart(String str, File file) {
        addPart(str, file, null);
    }

    public void addPart(String str, File file, String str2) {
        this.fileParts.add(new FilePart(str, file, normalizeContentType(str2)));
    }

    public void addPart(String str, File file, String str2, String str3) {
        this.fileParts.add(new FilePart(str, file, normalizeContentType(str2), str3));
    }

    public void addPart(String str, String str2, InputStream inputStream, String str3) {
        this.out.write(this.boundaryLine);
        this.out.write(createContentDisposition(str, str2));
        this.out.write(createContentType(str3));
        this.out.write(TRANSFER_ENCODING_BINARY);
        this.out.write(CR_LF);
        str = new byte[4096];
        while (true) {
            str2 = inputStream.read(str);
            if (str2 != -1) {
                this.out.write(str, 0, str2);
            } else {
                this.out.write(CR_LF);
                this.out.flush();
                return;
            }
        }
    }

    private byte[] createContentType(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Content-Type: ");
        stringBuilder.append(normalizeContentType(str));
        stringBuilder.append(STR_CR_LF);
        return stringBuilder.toString().getBytes();
    }

    private byte[] createContentDisposition(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Content-Disposition: form-data; name=\"");
        stringBuilder.append(str);
        stringBuilder.append("\"");
        stringBuilder.append(STR_CR_LF);
        return stringBuilder.toString().getBytes();
    }

    private byte[] createContentDisposition(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Content-Disposition: form-data; name=\"");
        stringBuilder.append(str);
        stringBuilder.append("\"");
        stringBuilder.append("; filename=\"");
        stringBuilder.append(str2);
        stringBuilder.append("\"");
        stringBuilder.append(STR_CR_LF);
        return stringBuilder.toString().getBytes();
    }

    private void updateProgress(long j) {
        this.bytesWritten += j;
        this.progressHandler.sendProgressMessage(this.bytesWritten, this.totalSize);
    }

    public long getContentLength() {
        long size = (long) this.out.size();
        for (FilePart totalLength : this.fileParts) {
            long totalLength2 = totalLength.getTotalLength();
            if (totalLength2 < 0) {
                return -1;
            }
            size += totalLength2;
        }
        return size + ((long) this.boundaryEnd.length);
    }

    public C0082e getContentType() {
        String str = AsyncHttpClient.HEADER_CONTENT_TYPE;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("multipart/form-data; boundary=");
        stringBuilder.append(this.boundary);
        return new C0894b(str, stringBuilder.toString());
    }

    public void setIsRepeatable(boolean z) {
        this.isRepeatable = z;
    }

    public boolean isRepeatable() {
        return this.isRepeatable;
    }

    public void writeTo(OutputStream outputStream) {
        this.bytesWritten = 0;
        this.totalSize = (long) ((int) getContentLength());
        this.out.writeTo(outputStream);
        updateProgress((long) this.out.size());
        for (FilePart writeTo : this.fileParts) {
            writeTo.writeTo(outputStream);
        }
        outputStream.write(this.boundaryEnd);
        updateProgress((long) this.boundaryEnd.length);
    }

    public void consumeContent() {
        if (isStreaming()) {
            throw new UnsupportedOperationException("Streaming entity does not implement #consumeContent()");
        }
    }

    public InputStream getContent() {
        throw new UnsupportedOperationException("getContent() is not supported. Use writeTo() instead.");
    }
}
