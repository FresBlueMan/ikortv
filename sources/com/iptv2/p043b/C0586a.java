package com.iptv2.p043b;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterOutputStream;
import javax.crypto.Cipher;
import org.json.JSONObject;

/* compiled from: DataUtility */
/* renamed from: com.iptv2.b.a */
public final class C0586a {

    /* compiled from: DataUtility */
    /* renamed from: com.iptv2.b.a$a */
    public static class C0585a extends Exception {
        public C0585a(Throwable th) {
            super(th);
        }
    }

    /* renamed from: a */
    public static synchronized byte[] m777a(Cipher cipher, byte[] bArr, int i, int i2) {
        synchronized (C0586a.class) {
            cipher = cipher.doFinal(bArr, i, i2);
        }
        return cipher;
    }

    /* renamed from: b */
    public static synchronized byte[] m782b(Cipher cipher, byte[] bArr, int i, int i2) {
        synchronized (C0586a.class) {
            cipher = cipher.doFinal(bArr, i, i2);
        }
        return cipher;
    }

    /* renamed from: a */
    public static byte[] m779a(byte[] bArr, int i, int i2) {
        i += 4;
        i2 -= 4;
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InflaterOutputStream inflaterOutputStream = new InflaterOutputStream(byteArrayOutputStream);
        inflaterOutputStream.write(bArr, i, i2);
        inflaterOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: b */
    public static byte[] m783b(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream);
        deflaterOutputStream.write(bArr, i, i2);
        deflaterOutputStream.close();
        bArr = byteArrayOutputStream.toByteArray();
        i = new byte[(bArr.length + 4)];
        Object a = C0595e.m814a(length);
        System.arraycopy(a, 0, i, 0, a.length);
        System.arraycopy(bArr, 0, i, 4, bArr.length);
        return i;
    }

    /* renamed from: a */
    public static String m774a(Cipher cipher, JSONObject jSONObject, int i) {
        return Base64.encodeToString(C0586a.m781b(cipher, jSONObject, i), null);
    }

    /* renamed from: a */
    public static byte[] m776a(Cipher cipher, String str, int i) {
        str = str.getBytes();
        return C0586a.m778a(cipher, str, 0, str.length, i);
    }

    /* renamed from: b */
    public static byte[] m781b(Cipher cipher, JSONObject jSONObject, int i) {
        return C0586a.m776a(cipher, jSONObject.toString(0).replace("\n", ""), i);
    }

    /* renamed from: a */
    public static String m773a(Cipher cipher, String str) {
        str = Base64.decode(str, 0);
        return C0586a.m784c(cipher, str, 0, str.length);
    }

    /* renamed from: b */
    public static JSONObject m780b(Cipher cipher, String str) {
        try {
            return new JSONObject(C0586a.m773a(cipher, str));
        } catch (Cipher cipher2) {
            throw new C0585a(cipher2);
        }
    }

    /* renamed from: a */
    public static byte[] m778a(Cipher cipher, byte[] bArr, int i, int i2, int i3) {
        if (i3 > 3) {
            return null;
        }
        Object obj = new byte[i2];
        System.arraycopy(bArr, i, obj, 0, i2);
        if ((i3 & 2) == 2) {
            obj = C0586a.m783b((byte[]) obj, 0, obj.length);
        }
        if ((i3 & 1) == 1) {
            obj = C0586a.m777a(cipher, obj, 0, obj.length);
        }
        cipher = new byte[(obj.length + 1)];
        cipher[0] = (byte) i3;
        System.arraycopy(obj, 0, cipher, 1, obj.length);
        return cipher;
    }

    /* renamed from: a */
    public static String m775a(Cipher cipher, byte[] bArr) {
        return C0586a.m784c(cipher, bArr, 0, bArr.length);
    }

    /* renamed from: c */
    public static String m784c(Cipher cipher, byte[] bArr, int i, int i2) {
        byte b = bArr[i];
        if (b > (byte) 3) {
            return "{}";
        }
        i2--;
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i + 1, bArr2, 0, i2);
        if ((b & 1) == 1) {
            bArr2 = C0586a.m782b(cipher, bArr2, 0, bArr2.length);
        }
        if ((b & 2) == 2) {
            bArr2 = C0586a.m779a(bArr2, 0, bArr2.length);
        }
        return new String(bArr2);
    }
}
