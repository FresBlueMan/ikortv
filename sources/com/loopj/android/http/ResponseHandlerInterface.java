package com.loopj.android.http;

import java.net.URI;
import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0916s;

public interface ResponseHandlerInterface {
    C0082e[] getRequestHeaders();

    URI getRequestURI();

    Object getTag();

    boolean getUsePoolThread();

    boolean getUseSynchronousMode();

    void onPostProcessResponse(ResponseHandlerInterface responseHandlerInterface, C0916s c0916s);

    void onPreProcessResponse(ResponseHandlerInterface responseHandlerInterface, C0916s c0916s);

    void sendCancelMessage();

    void sendFailureMessage(int i, C0082e[] c0082eArr, byte[] bArr, Throwable th);

    void sendFinishMessage();

    void sendProgressMessage(long j, long j2);

    void sendResponseMessage(C0916s c0916s);

    void sendRetryMessage(int i);

    void sendStartMessage();

    void sendSuccessMessage(int i, C0082e[] c0082eArr, byte[] bArr);

    void setRequestHeaders(C0082e[] c0082eArr);

    void setRequestURI(URI uri);

    void setTag(Object obj);

    void setUsePoolThread(boolean z);

    void setUseSynchronousMode(boolean z);
}
