package p000a.p001a.p002a.p003a.p022i.p025c;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import p000a.p001a.p002a.p003a.p021h.C0097b;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: Wire */
/* renamed from: a.a.a.a.i.c.r */
public class C0122r {
    /* renamed from: a */
    public C0097b f249a;
    /* renamed from: b */
    private final String f250b;

    public C0122r(C0097b c0097b, String str) {
        this.f249a = c0097b;
        this.f250b = str;
    }

    public C0122r(C0097b c0097b) {
        this(c0097b, "");
    }

    /* renamed from: a */
    private void m354a(String str, InputStream inputStream) {
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                break;
            } else if (read == 13) {
                stringBuilder.append("[\\r]");
            } else if (read == 10) {
                stringBuilder.append("[\\n]\"");
                stringBuilder.insert(0, "\"");
                stringBuilder.insert(0, str);
                C0097b c0097b = this.f249a;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(this.f250b);
                stringBuilder2.append(" ");
                stringBuilder2.append(stringBuilder.toString());
                c0097b.m260a(stringBuilder2.toString());
                stringBuilder.setLength(0);
            } else {
                if (read >= 32) {
                    if (read <= 127) {
                        stringBuilder.append((char) read);
                    }
                }
                stringBuilder.append("[0x");
                stringBuilder.append(Integer.toHexString(read));
                stringBuilder.append("]");
            }
        }
        if (stringBuilder.length() > null) {
            stringBuilder.append('\"');
            stringBuilder.insert(0, '\"');
            stringBuilder.insert(0, str);
            str = this.f249a;
            inputStream = new StringBuilder();
            inputStream.append(this.f250b);
            inputStream.append(" ");
            inputStream.append(stringBuilder.toString());
            str.m260a(inputStream.toString());
        }
    }

    /* renamed from: a */
    public boolean m358a() {
        return this.f249a.m262a();
    }

    /* renamed from: a */
    public void m357a(byte[] bArr, int i, int i2) {
        C0160a.m478a((Object) bArr, "Output");
        m354a(">> ", new ByteArrayInputStream(bArr, i, i2));
    }

    /* renamed from: b */
    public void m361b(byte[] bArr, int i, int i2) {
        C0160a.m478a((Object) bArr, "Input");
        m354a("<< ", new ByteArrayInputStream(bArr, i, i2));
    }

    /* renamed from: a */
    public void m356a(byte[] bArr) {
        C0160a.m478a((Object) bArr, "Output");
        m354a(">> ", new ByteArrayInputStream(bArr));
    }

    /* renamed from: b */
    public void m360b(byte[] bArr) {
        C0160a.m478a((Object) bArr, "Input");
        m354a("<< ", new ByteArrayInputStream(bArr));
    }

    /* renamed from: a */
    public void m355a(int i) {
        m356a(new byte[]{(byte) i});
    }

    /* renamed from: b */
    public void m359b(int i) {
        m360b(new byte[]{(byte) i});
    }
}
