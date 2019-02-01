package com.loopj.android.http;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.HashSet;
import javax.net.ssl.SSLException;
import p000a.p001a.p002a.p003a.C0176z;
import p000a.p001a.p002a.p003a.p005b.C0036k;
import p000a.p001a.p002a.p003a.p005b.p007c.C1238l;
import p000a.p001a.p002a.p003a.p034n.C0157e;

class RetryHandler implements C0036k {
    private static final HashSet<Class<?>> exceptionBlacklist = new HashSet();
    private static final HashSet<Class<?>> exceptionWhitelist = new HashSet();
    private final int maxRetries;
    private final int retrySleepTimeMS;

    static {
        exceptionWhitelist.add(C0176z.class);
        exceptionWhitelist.add(UnknownHostException.class);
        exceptionWhitelist.add(SocketException.class);
        exceptionBlacklist.add(InterruptedIOException.class);
        exceptionBlacklist.add(SSLException.class);
    }

    public RetryHandler(int i, int i2) {
        this.maxRetries = i;
        this.retrySleepTimeMS = i2;
    }

    static void addClassToWhitelist(Class<?> cls) {
        exceptionWhitelist.add(cls);
    }

    static void addClassToBlacklist(Class<?> cls) {
        exceptionBlacklist.add(cls);
    }

    public boolean retryRequest(IOException iOException, int i, C0157e c0157e) {
        Boolean bool = (Boolean) c0157e.mo159a("http.request_sent");
        boolean z = true;
        if (bool == null || !bool.booleanValue()) {
        }
        if (i <= this.maxRetries) {
            if (isInList(exceptionWhitelist, iOException) == 0) {
                if (isInList(exceptionBlacklist, iOException) != 0) {
                }
            }
            if (!z && ((C1238l) c0157e.mo159a("http.request")) == null) {
                return false;
            }
            if (z) {
                iOException.printStackTrace();
            } else {
                SystemClock.sleep((long) this.retrySleepTimeMS);
            }
            return z;
        }
        z = false;
        if (!z) {
        }
        if (z) {
            iOException.printStackTrace();
        } else {
            SystemClock.sleep((long) this.retrySleepTimeMS);
        }
        return z;
    }

    protected boolean isInList(HashSet<Class<?>> hashSet, Throwable th) {
        hashSet = hashSet.iterator();
        while (hashSet.hasNext()) {
            if (((Class) hashSet.next()).isInstance(th)) {
                return true;
            }
        }
        return null;
    }
}
