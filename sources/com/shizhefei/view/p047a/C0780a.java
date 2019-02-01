package com.shizhefei.view.p047a;

import android.graphics.Color;

/* compiled from: ColorGradient */
/* renamed from: com.shizhefei.view.a.a */
public class C0780a {
    /* renamed from: a */
    private int f1391a;
    /* renamed from: b */
    private int f1392b;
    /* renamed from: c */
    private int f1393c;
    /* renamed from: d */
    private int[] f1394d;
    /* renamed from: e */
    private int[] f1395e;

    public C0780a(int i, int i2, int i3) {
        this.f1391a = i;
        this.f1392b = i2;
        this.f1393c = i3;
        this.f1394d = m1434b(i);
        this.f1395e = m1434b(i2);
    }

    /* renamed from: a */
    public int m1435a(int i) {
        int[] iArr = new int[4];
        for (int i2 = 0; i2 < this.f1395e.length; i2++) {
            double d = (double) this.f1394d[i2];
            double d2 = (double) (this.f1395e[i2] - this.f1394d[i2]);
            Double.isNaN(d2);
            d2 *= 1.0d;
            double d3 = (double) this.f1393c;
            Double.isNaN(d3);
            d2 /= d3;
            d3 = (double) i;
            Double.isNaN(d3);
            d2 *= d3;
            Double.isNaN(d);
            iArr[i2] = (int) (d + d2);
        }
        return Color.argb(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    /* renamed from: b */
    private int[] m1434b(int i) {
        return new int[]{Color.alpha(i), Color.red(i), Color.green(i), Color.blue(i)};
    }
}
