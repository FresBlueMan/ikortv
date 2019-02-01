package com.loopj.android.http;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p000a.p001a.p002a.p003a.C0149k;
import p000a.p001a.p002a.p003a.p005b.p010f.C0030e;
import p000a.p001a.p002a.p003a.p005b.p048b.C1316a;
import p000a.p001a.p002a.p003a.p031k.C0901l;

public class RequestParams implements Serializable {
    public static final String APPLICATION_JSON = "application/json";
    public static final String APPLICATION_OCTET_STREAM = "application/octet-stream";
    protected static final String LOG_TAG = "RequestParams";
    protected boolean autoCloseInputStreams;
    protected String contentEncoding;
    protected String elapsedFieldInJsonStreamer;
    protected final ConcurrentHashMap<String, List<FileWrapper>> fileArrayParams;
    protected final ConcurrentHashMap<String, FileWrapper> fileParams;
    protected boolean forceMultipartEntity;
    protected boolean isRepeatable;
    protected final ConcurrentHashMap<String, StreamWrapper> streamParams;
    protected final ConcurrentHashMap<String, String> urlParams;
    protected final ConcurrentHashMap<String, Object> urlParamsWithObjects;
    protected boolean useJsonStreamer;

    /* renamed from: com.loopj.android.http.RequestParams$1 */
    class C07631 extends HashMap<String, String> {
        final /* synthetic */ String val$key;
        final /* synthetic */ String val$value;

        C07631(String str, String str2) {
            this.val$key = str;
            this.val$value = str2;
            put(this.val$key, this.val$value);
        }
    }

    public static class FileWrapper implements Serializable {
        public final String contentType;
        public final String customFileName;
        public final File file;

        public FileWrapper(File file, String str, String str2) {
            this.file = file;
            this.contentType = str;
            this.customFileName = str2;
        }
    }

    public static class StreamWrapper {
        public final boolean autoClose;
        public final String contentType;
        public final InputStream inputStream;
        public final String name;

        public StreamWrapper(InputStream inputStream, String str, String str2, boolean z) {
            this.inputStream = inputStream;
            this.name = str;
            this.contentType = str2;
            this.autoClose = z;
        }

        static StreamWrapper newInstance(InputStream inputStream, String str, String str2, boolean z) {
            if (str2 == null) {
                str2 = RequestParams.APPLICATION_OCTET_STREAM;
            }
            return new StreamWrapper(inputStream, str, str2, z);
        }
    }

    public RequestParams() {
        this((Map) null);
    }

    public RequestParams(Map<String, String> map) {
        this.urlParams = new ConcurrentHashMap();
        this.streamParams = new ConcurrentHashMap();
        this.fileParams = new ConcurrentHashMap();
        this.fileArrayParams = new ConcurrentHashMap();
        this.urlParamsWithObjects = new ConcurrentHashMap();
        this.forceMultipartEntity = false;
        this.elapsedFieldInJsonStreamer = "_elapsed";
        this.contentEncoding = AsyncHttpResponseHandler.DEFAULT_CHARSET;
        if (map != null) {
            map = map.entrySet().iterator();
            while (map.hasNext()) {
                Entry entry = (Entry) map.next();
                put((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    public RequestParams(String str, String str2) {
        this(new C07631(str, str2));
    }

    public RequestParams(Object... objArr) {
        this.urlParams = new ConcurrentHashMap();
        this.streamParams = new ConcurrentHashMap();
        this.fileParams = new ConcurrentHashMap();
        this.fileArrayParams = new ConcurrentHashMap();
        this.urlParamsWithObjects = new ConcurrentHashMap();
        int i = 0;
        this.forceMultipartEntity = false;
        this.elapsedFieldInJsonStreamer = "_elapsed";
        this.contentEncoding = AsyncHttpResponseHandler.DEFAULT_CHARSET;
        int length = objArr.length;
        if (length % 2 == 0) {
            while (i < length) {
                put(String.valueOf(objArr[i]), String.valueOf(objArr[i + 1]));
                i += 2;
            }
            return;
        }
        throw new IllegalArgumentException("Supplied arguments must be even");
    }

    public void setContentEncoding(String str) {
        if (str != null) {
            this.contentEncoding = str;
        } else {
            AsyncHttpClient.log.mo1428d(LOG_TAG, "setContentEncoding called with null attribute");
        }
    }

    public void setForceMultipartEntityContentType(boolean z) {
        this.forceMultipartEntity = z;
    }

    public void put(String str, String str2) {
        if (str != null && str2 != null) {
            this.urlParams.put(str, str2);
        }
    }

    public void put(String str, File[] fileArr) {
        put(str, fileArr, null, null);
    }

    public void put(String str, File[] fileArr, String str2, String str3) {
        if (str != null) {
            List arrayList = new ArrayList();
            for (File file : fileArr) {
                if (file == null || !file.exists()) {
                    throw new FileNotFoundException();
                }
                arrayList.add(new FileWrapper(file, str2, str3));
            }
            this.fileArrayParams.put(str, arrayList);
        }
    }

    public void put(String str, File file) {
        put(str, file, null, null);
    }

    public void put(String str, String str2, File file) {
        put(str, file, null, str2);
    }

    public void put(String str, File file, String str2) {
        put(str, file, str2, null);
    }

    public void put(String str, File file, String str2, String str3) {
        if (file == null || !file.exists()) {
            throw new FileNotFoundException();
        } else if (str != null) {
            this.fileParams.put(str, new FileWrapper(file, str2, str3));
        }
    }

    public void put(String str, InputStream inputStream) {
        put(str, inputStream, null);
    }

    public void put(String str, InputStream inputStream, String str2) {
        put(str, inputStream, str2, null);
    }

    public void put(String str, InputStream inputStream, String str2, String str3) {
        put(str, inputStream, str2, str3, this.autoCloseInputStreams);
    }

    public void put(String str, InputStream inputStream, String str2, String str3, boolean z) {
        if (str != null && inputStream != null) {
            this.streamParams.put(str, StreamWrapper.newInstance(inputStream, str2, str3, z));
        }
    }

    public void put(String str, Object obj) {
        if (str != null && obj != null) {
            this.urlParamsWithObjects.put(str, obj);
        }
    }

    public void put(String str, int i) {
        if (str != null) {
            this.urlParams.put(str, String.valueOf(i));
        }
    }

    public void put(String str, long j) {
        if (str != null) {
            this.urlParams.put(str, String.valueOf(j));
        }
    }

    public void add(String str, String str2) {
        if (str != null && str2 != null) {
            Object obj = this.urlParamsWithObjects.get(str);
            if (obj == null) {
                obj = new HashSet();
                put(str, obj);
            }
            if ((obj instanceof List) != null) {
                ((List) obj).add(str2);
            } else if ((obj instanceof Set) != null) {
                ((Set) obj).add(str2);
            }
        }
    }

    public void remove(String str) {
        this.urlParams.remove(str);
        this.streamParams.remove(str);
        this.fileParams.remove(str);
        this.urlParamsWithObjects.remove(str);
        this.fileArrayParams.remove(str);
    }

    public boolean has(String str) {
        if (this.urlParams.get(str) == null && this.streamParams.get(str) == null && this.fileParams.get(str) == null && this.urlParamsWithObjects.get(str) == null) {
            if (this.fileArrayParams.get(str) == null) {
                return null;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Entry entry : this.urlParams.entrySet()) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append("&");
            }
            stringBuilder.append((String) entry.getKey());
            stringBuilder.append("=");
            stringBuilder.append((String) entry.getValue());
        }
        for (Entry entry2 : this.streamParams.entrySet()) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append("&");
            }
            stringBuilder.append((String) entry2.getKey());
            stringBuilder.append("=");
            stringBuilder.append("STREAM");
        }
        for (Entry entry22 : this.fileParams.entrySet()) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append("&");
            }
            stringBuilder.append((String) entry22.getKey());
            stringBuilder.append("=");
            stringBuilder.append("FILE");
        }
        for (Entry entry222 : this.fileArrayParams.entrySet()) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append("&");
            }
            stringBuilder.append((String) entry222.getKey());
            stringBuilder.append("=");
            stringBuilder.append("FILES(SIZE=");
            stringBuilder.append(((List) entry222.getValue()).size());
            stringBuilder.append(")");
        }
        for (C0901l c0901l : getParamsList(null, this.urlParamsWithObjects)) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append("&");
            }
            stringBuilder.append(c0901l.mo141a());
            stringBuilder.append("=");
            stringBuilder.append(c0901l.mo142b());
        }
        return stringBuilder.toString();
    }

    public void setHttpEntityIsRepeatable(boolean z) {
        this.isRepeatable = z;
    }

    public void setUseJsonStreamer(boolean z) {
        this.useJsonStreamer = z;
    }

    public void setElapsedFieldInJsonStreamer(String str) {
        this.elapsedFieldInJsonStreamer = str;
    }

    public void setAutoCloseInputStreams(boolean z) {
        this.autoCloseInputStreams = z;
    }

    public C0149k getEntity(ResponseHandlerInterface responseHandlerInterface) {
        if (this.useJsonStreamer) {
            return createJsonStreamerEntity(responseHandlerInterface);
        }
        if (!this.forceMultipartEntity && this.streamParams.isEmpty() && this.fileParams.isEmpty() && this.fileArrayParams.isEmpty()) {
            return createFormEntity();
        }
        return createMultipartEntity(responseHandlerInterface);
    }

    private C0149k createJsonStreamerEntity(ResponseHandlerInterface responseHandlerInterface) {
        boolean z;
        C0149k jsonStreamerEntity;
        StreamWrapper streamWrapper;
        if (this.fileParams.isEmpty()) {
            if (this.streamParams.isEmpty()) {
                z = false;
                jsonStreamerEntity = new JsonStreamerEntity(responseHandlerInterface, z, this.elapsedFieldInJsonStreamer);
                for (Entry entry : this.urlParams.entrySet()) {
                    jsonStreamerEntity.addPart((String) entry.getKey(), entry.getValue());
                }
                for (Entry entry2 : this.urlParamsWithObjects.entrySet()) {
                    jsonStreamerEntity.addPart((String) entry2.getKey(), entry2.getValue());
                }
                for (Entry entry22 : this.fileParams.entrySet()) {
                    jsonStreamerEntity.addPart((String) entry22.getKey(), entry22.getValue());
                }
                for (Entry entry222 : this.streamParams.entrySet()) {
                    streamWrapper = (StreamWrapper) entry222.getValue();
                    if (streamWrapper.inputStream != null) {
                        jsonStreamerEntity.addPart((String) entry222.getKey(), StreamWrapper.newInstance(streamWrapper.inputStream, streamWrapper.name, streamWrapper.contentType, streamWrapper.autoClose));
                    }
                }
                return jsonStreamerEntity;
            }
        }
        z = true;
        jsonStreamerEntity = new JsonStreamerEntity(responseHandlerInterface, z, this.elapsedFieldInJsonStreamer);
        for (Entry entry2222 : this.urlParams.entrySet()) {
            jsonStreamerEntity.addPart((String) entry2222.getKey(), entry2222.getValue());
        }
        for (Entry entry22222 : this.urlParamsWithObjects.entrySet()) {
            jsonStreamerEntity.addPart((String) entry22222.getKey(), entry22222.getValue());
        }
        for (Entry entry222222 : this.fileParams.entrySet()) {
            jsonStreamerEntity.addPart((String) entry222222.getKey(), entry222222.getValue());
        }
        for (Entry entry2222222 : this.streamParams.entrySet()) {
            streamWrapper = (StreamWrapper) entry2222222.getValue();
            if (streamWrapper.inputStream != null) {
                jsonStreamerEntity.addPart((String) entry2222222.getKey(), StreamWrapper.newInstance(streamWrapper.inputStream, streamWrapper.name, streamWrapper.contentType, streamWrapper.autoClose));
            }
        }
        return jsonStreamerEntity;
    }

    private C0149k createFormEntity() {
        try {
            return new C1316a(getParamsList(), this.contentEncoding);
        } catch (Throwable e) {
            AsyncHttpClient.log.mo1431e(LOG_TAG, "createFormEntity failed", e);
            return null;
        }
    }

    private C0149k createMultipartEntity(ResponseHandlerInterface responseHandlerInterface) {
        C0149k simpleMultipartEntity = new SimpleMultipartEntity(responseHandlerInterface);
        simpleMultipartEntity.setIsRepeatable(this.isRepeatable);
        for (Entry entry : this.urlParams.entrySet()) {
            simpleMultipartEntity.addPartWithCharset((String) entry.getKey(), (String) entry.getValue(), this.contentEncoding);
        }
        for (C0901l c0901l : getParamsList(null, this.urlParamsWithObjects)) {
            simpleMultipartEntity.addPartWithCharset(c0901l.mo141a(), c0901l.mo142b(), this.contentEncoding);
        }
        for (Entry entry2 : this.streamParams.entrySet()) {
            StreamWrapper streamWrapper = (StreamWrapper) entry2.getValue();
            if (streamWrapper.inputStream != null) {
                simpleMultipartEntity.addPart((String) entry2.getKey(), streamWrapper.name, streamWrapper.inputStream, streamWrapper.contentType);
            }
        }
        for (Entry entry22 : this.fileParams.entrySet()) {
            FileWrapper fileWrapper = (FileWrapper) entry22.getValue();
            simpleMultipartEntity.addPart((String) entry22.getKey(), fileWrapper.file, fileWrapper.contentType, fileWrapper.customFileName);
        }
        for (Entry entry222 : this.fileArrayParams.entrySet()) {
            for (FileWrapper fileWrapper2 : (List) entry222.getValue()) {
                simpleMultipartEntity.addPart((String) entry222.getKey(), fileWrapper2.file, fileWrapper2.contentType, fileWrapper2.customFileName);
            }
        }
        return simpleMultipartEntity;
    }

    protected List<C0901l> getParamsList() {
        List<C0901l> linkedList = new LinkedList();
        for (Entry entry : this.urlParams.entrySet()) {
            linkedList.add(new C0901l((String) entry.getKey(), (String) entry.getValue()));
        }
        linkedList.addAll(getParamsList(null, this.urlParamsWithObjects));
        return linkedList;
    }

    private List<C0901l> getParamsList(String str, Object obj) {
        List<C0901l> linkedList = new LinkedList();
        if (obj instanceof Map) {
            Map map = (Map) obj;
            List arrayList = new ArrayList(map.keySet());
            if (arrayList.size() > 0 && (arrayList.get(0) instanceof Comparable)) {
                Collections.sort(arrayList);
            }
            for (Object next : arrayList) {
                if (next instanceof String) {
                    Object obj2 = map.get(next);
                    if (obj2 != null) {
                        String str2;
                        if (str == null) {
                            str2 = (String) next;
                        } else {
                            str2 = String.format(Locale.US, "%s[%s]", new Object[]{str, next});
                        }
                        linkedList.addAll(getParamsList(str2, obj2));
                    }
                }
            }
        } else if (obj instanceof List) {
            List list = (List) obj;
            r1 = list.size();
            for (r5 = 0; r5 < r1; r5++) {
                linkedList.addAll(getParamsList(String.format(Locale.US, "%s[%d]", new Object[]{str, Integer.valueOf(r5)}), list.get(r5)));
            }
        } else if (obj instanceof Object[]) {
            for (Object paramsList : (Object[]) obj) {
                linkedList.addAll(getParamsList(String.format(Locale.US, "%s[%d]", new Object[]{str, Integer.valueOf(r5)}), paramsList));
            }
        } else if (obj instanceof Set) {
            for (Object paramsList2 : (Set) obj) {
                linkedList.addAll(getParamsList(str, paramsList2));
            }
        } else {
            linkedList.add(new C0901l(str, obj.toString()));
        }
        return linkedList;
    }

    protected String getParamString() {
        return C0030e.m120a(getParamsList(), this.contentEncoding);
    }
}
