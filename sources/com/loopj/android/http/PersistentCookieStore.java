package com.loopj.android.http;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import p000a.p001a.p002a.p003a.p005b.C0033h;
import p000a.p001a.p002a.p003a.p019f.C0083b;

public class PersistentCookieStore implements C0033h {
    private static final String COOKIE_NAME_PREFIX = "cookie_";
    private static final String COOKIE_NAME_STORE = "names";
    private static final String COOKIE_PREFS = "CookiePrefsFile";
    private static final String LOG_TAG = "PersistentCookieStore";
    private final SharedPreferences cookiePrefs;
    private final ConcurrentHashMap<String, C0083b> cookies;
    private boolean omitNonPersistentCookies = false;

    public PersistentCookieStore(Context context) {
        int i = 0;
        this.cookiePrefs = context.getSharedPreferences(COOKIE_PREFS, 0);
        this.cookies = new ConcurrentHashMap();
        context = this.cookiePrefs.getString(COOKIE_NAME_STORE, null);
        if (context != null) {
            context = TextUtils.split(context, ",");
            int length = context.length;
            while (i < length) {
                String str = context[i];
                SharedPreferences sharedPreferences = this.cookiePrefs;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(COOKIE_NAME_PREFIX);
                stringBuilder.append(str);
                String string = sharedPreferences.getString(stringBuilder.toString(), null);
                if (string != null) {
                    C0083b decodeCookie = decodeCookie(string);
                    if (decodeCookie != null) {
                        this.cookies.put(str, decodeCookie);
                    }
                }
                i++;
            }
            clearExpired(new Date());
        }
    }

    public void addCookie(C0083b c0083b) {
        if (!this.omitNonPersistentCookies || c0083b.mo1618e()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(c0083b.mo1605a());
            stringBuilder.append(c0083b.mo1619f());
            String stringBuilder2 = stringBuilder.toString();
            if (c0083b.mo1609a(new Date())) {
                this.cookies.remove(stringBuilder2);
            } else {
                this.cookies.put(stringBuilder2, c0083b);
            }
            Editor edit = this.cookiePrefs.edit();
            edit.putString(COOKIE_NAME_STORE, TextUtils.join(",", this.cookies.keySet()));
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(COOKIE_NAME_PREFIX);
            stringBuilder3.append(stringBuilder2);
            edit.putString(stringBuilder3.toString(), encodeCookie(new SerializableCookie(c0083b)));
            edit.commit();
        }
    }

    public void clear() {
        Editor edit = this.cookiePrefs.edit();
        for (String str : this.cookies.keySet()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(COOKIE_NAME_PREFIX);
            stringBuilder.append(str);
            edit.remove(stringBuilder.toString());
        }
        edit.remove(COOKIE_NAME_STORE);
        edit.commit();
        this.cookies.clear();
    }

    public boolean clearExpired(Date date) {
        Editor edit = this.cookiePrefs.edit();
        boolean z = false;
        for (Entry entry : this.cookies.entrySet()) {
            String str = (String) entry.getKey();
            if (((C0083b) entry.getValue()).mo1609a(date)) {
                this.cookies.remove(str);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(COOKIE_NAME_PREFIX);
                stringBuilder.append(str);
                edit.remove(stringBuilder.toString());
                z = true;
            }
        }
        if (z) {
            edit.putString(COOKIE_NAME_STORE, TextUtils.join(",", this.cookies.keySet()));
        }
        edit.commit();
        return z;
    }

    public List<C0083b> getCookies() {
        return new ArrayList(this.cookies.values());
    }

    public void setOmitNonPersistentCookies(boolean z) {
        this.omitNonPersistentCookies = z;
    }

    public void deleteCookie(C0083b c0083b) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c0083b.mo1605a());
        stringBuilder.append(c0083b.mo1619f());
        c0083b = stringBuilder.toString();
        this.cookies.remove(c0083b);
        Editor edit = this.cookiePrefs.edit();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(COOKIE_NAME_PREFIX);
        stringBuilder2.append(c0083b);
        edit.remove(stringBuilder2.toString());
        edit.commit();
    }

    protected String encodeCookie(SerializableCookie serializableCookie) {
        if (serializableCookie == null) {
            return null;
        }
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new ObjectOutputStream(byteArrayOutputStream).writeObject(serializableCookie);
            return byteArrayToHexString(byteArrayOutputStream.toByteArray());
        } catch (SerializableCookie serializableCookie2) {
            AsyncHttpClient.log.mo1429d(LOG_TAG, "IOException in encodeCookie", serializableCookie2);
            return null;
        }
    }

    protected C0083b decodeCookie(String str) {
        try {
            return ((SerializableCookie) new ObjectInputStream(new ByteArrayInputStream(hexStringToByteArray(str))).readObject()).getCookie();
        } catch (String str2) {
            AsyncHttpClient.log.mo1429d(LOG_TAG, "IOException in decodeCookie", str2);
            return null;
        } catch (String str22) {
            AsyncHttpClient.log.mo1429d(LOG_TAG, "ClassNotFoundException in decodeCookie", str22);
            return null;
        }
    }

    protected String byteArrayToHexString(byte[] bArr) {
        StringBuilder stringBuilder = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            if (i < 16) {
                stringBuilder.append('0');
            }
            stringBuilder.append(Integer.toHexString(i));
        }
        return stringBuilder.toString().toUpperCase(Locale.US);
    }

    protected byte[] hexStringToByteArray(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }
}
