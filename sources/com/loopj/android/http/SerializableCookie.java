package com.loopj.android.http;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import p000a.p001a.p002a.p003a.p019f.C0083b;
import p000a.p001a.p002a.p003a.p022i.p027d.C1267c;

public class SerializableCookie implements Serializable {
    private static final long serialVersionUID = 6374381828722046732L;
    private transient C1267c clientCookie;
    private final transient C0083b cookie;

    public SerializableCookie(C0083b c0083b) {
        this.cookie = c0083b;
    }

    public C0083b getCookie() {
        return this.clientCookie != null ? this.clientCookie : this.cookie;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.cookie.mo1605a());
        objectOutputStream.writeObject(this.cookie.mo1610b());
        objectOutputStream.writeObject(this.cookie.mo1613c());
        objectOutputStream.writeObject(this.cookie.mo1619f());
        objectOutputStream.writeObject(this.cookie.mo1615d());
        objectOutputStream.writeObject(this.cookie.mo1620g());
        objectOutputStream.writeInt(this.cookie.mo1623j());
        objectOutputStream.writeBoolean(this.cookie.mo1622i());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.clientCookie = new C1267c((String) objectInputStream.readObject(), (String) objectInputStream.readObject());
        this.clientCookie.mo1614c((String) objectInputStream.readObject());
        this.clientCookie.mo1616d((String) objectInputStream.readObject());
        this.clientCookie.mo1611b((Date) objectInputStream.readObject());
        this.clientCookie.mo1617e((String) objectInputStream.readObject());
        this.clientCookie.mo1607a(objectInputStream.readInt());
        this.clientCookie.mo1608a(objectInputStream.readBoolean());
    }
}
