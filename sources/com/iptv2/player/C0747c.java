package com.iptv2.player;

import android.view.View;
import android.view.View.MeasureSpec;
import java.lang.ref.WeakReference;

/* compiled from: MeasureHelper */
/* renamed from: com.iptv2.player.c */
public final class C0747c {
    /* renamed from: a */
    private WeakReference<View> f1379a;
    /* renamed from: b */
    private int f1380b;
    /* renamed from: c */
    private int f1381c;
    /* renamed from: d */
    private int f1382d;
    /* renamed from: e */
    private int f1383e;
    /* renamed from: f */
    private int f1384f;
    /* renamed from: g */
    private int f1385g;
    /* renamed from: h */
    private int f1386h;
    /* renamed from: i */
    private int f1387i = 0;

    public C0747c(View view) {
        this.f1379a = new WeakReference(view);
    }

    /* renamed from: a */
    public void m1413a(int i, int i2) {
        this.f1380b = i;
        this.f1381c = i2;
    }

    /* renamed from: b */
    public void m1416b(int i, int i2) {
        this.f1382d = i;
        this.f1383e = i2;
    }

    /* renamed from: a */
    public void m1412a(int i) {
        this.f1384f = i;
    }

    /* renamed from: c */
    public void m1417c(int i, int i2) {
        if (this.f1384f == 90 || this.f1384f == 270) {
            int i3 = i2;
            i2 = i;
            i = i3;
        }
        int defaultSize = View.getDefaultSize(this.f1380b, i);
        int defaultSize2 = View.getDefaultSize(this.f1381c, i2);
        if (this.f1387i != 3) {
            if (this.f1380b > 0 && this.f1381c > 0) {
                defaultSize = MeasureSpec.getMode(i);
                i = MeasureSpec.getSize(i);
                defaultSize2 = MeasureSpec.getMode(i2);
                i2 = MeasureSpec.getSize(i2);
                if (defaultSize == Integer.MIN_VALUE && defaultSize2 == Integer.MIN_VALUE) {
                    float f;
                    float f2 = (float) i;
                    float f3 = (float) i2;
                    float f4 = f2 / f3;
                    switch (this.f1387i) {
                        case 4:
                            f = 1.7777778f;
                            if (this.f1384f == 90 || this.f1384f == 270) {
                                f = 0.5625f;
                                break;
                            }
                        case 5:
                            f = 1.3333334f;
                            if (this.f1384f == 90 || this.f1384f == 270) {
                                f = 0.75f;
                                break;
                            }
                        default:
                            f = ((float) this.f1380b) / ((float) this.f1381c);
                            if (this.f1382d > 0 && this.f1383e > 0) {
                                f = (f * ((float) this.f1382d)) / ((float) this.f1383e);
                                break;
                            }
                    }
                    Object obj = f > f4 ? 1 : null;
                    switch (this.f1387i) {
                        case 0:
                        case 4:
                        case 5:
                            if (obj == null) {
                                i = (int) (f3 * f);
                                break;
                            } else {
                                i2 = (int) (f2 / f);
                                break;
                            }
                        case 1:
                            if (obj == null) {
                                i2 = (int) (f2 / f);
                                break;
                            } else {
                                i = (int) (f3 * f);
                                break;
                            }
                        default:
                            if (obj == null) {
                                i = Math.min(this.f1381c, i2);
                                i2 = i;
                                i = (int) (((float) i) * f);
                                break;
                            }
                            i = Math.min(this.f1380b, i);
                            i2 = (int) (((float) i) / f);
                            break;
                    }
                } else if (defaultSize == 1073741824 && defaultSize2 == 1073741824) {
                    if (this.f1380b * i2 < this.f1381c * i) {
                        i = (this.f1380b * i2) / this.f1381c;
                    } else if (this.f1380b * i2 > this.f1381c * i) {
                        i2 = (this.f1381c * i) / this.f1380b;
                    }
                } else if (defaultSize == 1073741824) {
                    defaultSize = (this.f1381c * i) / this.f1380b;
                    if (defaultSize2 != Integer.MIN_VALUE || defaultSize <= i2) {
                        i2 = defaultSize;
                    }
                } else {
                    int i4;
                    if (defaultSize2 == 1073741824) {
                        i4 = (this.f1380b * i2) / this.f1381c;
                        if (defaultSize == Integer.MIN_VALUE && i4 > i) {
                        }
                    } else {
                        i4 = this.f1380b;
                        int i5 = this.f1381c;
                        if (defaultSize2 != Integer.MIN_VALUE || i5 <= i2) {
                            i2 = i5;
                        } else {
                            i4 = (this.f1380b * i2) / this.f1381c;
                        }
                        if (defaultSize == Integer.MIN_VALUE && r1 > i) {
                            i2 = (this.f1381c * i) / this.f1380b;
                        }
                    }
                    i = i4;
                }
            } else {
                i = defaultSize;
                i2 = defaultSize2;
            }
        }
        this.f1385g = i;
        this.f1386h = i2;
    }

    /* renamed from: a */
    public int m1411a() {
        return this.f1385g;
    }

    /* renamed from: b */
    public int m1414b() {
        return this.f1386h;
    }

    /* renamed from: b */
    public void m1415b(int i) {
        this.f1387i = i;
    }
}
