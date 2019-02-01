package com.iptv2.control;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.FontMetrics;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.iptv2.C0489R;
import com.iptv2.p043b.C0591c;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MarqueeView extends AppCompatTextView {
    /* renamed from: A */
    private int f2251A;
    /* renamed from: B */
    private C0687a f2252B;
    /* renamed from: a */
    List<C0688b> f2253a;
    /* renamed from: b */
    List<C0688b> f2254b;
    /* renamed from: c */
    private float f2255c;
    /* renamed from: d */
    private float f2256d;
    /* renamed from: e */
    private float f2257e;
    /* renamed from: f */
    private float f2258f;
    /* renamed from: g */
    private String f2259g;
    /* renamed from: h */
    private int f2260h;
    /* renamed from: i */
    private String f2261i;
    /* renamed from: j */
    private String f2262j;
    /* renamed from: k */
    private TextPaint f2263k;
    /* renamed from: l */
    private TextPaint f2264l;
    /* renamed from: m */
    private float f2265m;
    /* renamed from: n */
    private int f2266n;
    /* renamed from: o */
    private int f2267o;
    /* renamed from: p */
    private int f2268p;
    /* renamed from: q */
    private boolean f2269q;
    /* renamed from: r */
    private boolean f2270r;
    /* renamed from: s */
    private int f2271s;
    /* renamed from: t */
    private boolean f2272t;
    /* renamed from: u */
    private float f2273u;
    /* renamed from: v */
    private boolean f2274v;
    /* renamed from: w */
    private boolean f2275w;
    /* renamed from: x */
    private int f2276x;
    /* renamed from: y */
    private final C0689c f2277y;
    /* renamed from: z */
    private int f2278z;

    /* renamed from: com.iptv2.control.MarqueeView$a */
    public interface C0687a {
        /* renamed from: a */
        void mo1318a(String str);
    }

    /* renamed from: com.iptv2.control.MarqueeView$b */
    public static class C0688b {
        /* renamed from: a */
        public String f1045a;
        /* renamed from: b */
        public boolean f1046b;
        /* renamed from: c */
        public int f1047c;
        /* renamed from: d */
        public int f1048d;
        /* renamed from: e */
        public float f1049e;
        /* renamed from: f */
        public float f1050f;
    }

    /* renamed from: com.iptv2.control.MarqueeView$c */
    private final class C0689c implements Runnable {
        /* renamed from: a */
        final /* synthetic */ MarqueeView f1051a;

        private C0689c(MarqueeView marqueeView) {
            this.f1051a = marqueeView;
        }

        public void run() {
            if (this.f1051a.f2256d < this.f1051a.f2255c && !this.f1051a.f2275w) {
                this.f1051a.f2260h = (int) ((this.f1051a.f2256d * 1.0f) / (this.f1051a.f2258f * 3.0f));
                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 0; i < this.f1051a.f2260h; i++) {
                    stringBuilder.append("\t");
                }
                this.f1051a.f2259g = stringBuilder.toString();
                this.f1051a.f2257e = this.f1051a.f2255c + (this.f1051a.f2258f * ((float) this.f1051a.f2260h));
                this.f1051a.f2275w = true;
                MarqueeView marqueeView = this.f1051a;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(this.f1051a.f2261i);
                stringBuilder2.append(this.f1051a.f2259g);
                stringBuilder2.append(this.f1051a.f2261i);
                marqueeView.f2262j = stringBuilder2.toString();
                if (this.f1051a.f2269q) {
                    List b = MarqueeView.m2761b(this.f1051a.f2262j);
                    if (b.size() == 0) {
                        this.f1051a.f2269q = false;
                    } else {
                        this.f1051a.f2254b = MarqueeView.m2756a(this.f1051a.f2262j, b, this.f1051a.f2263k);
                    }
                }
                this.f1051a.invalidate();
            }
        }
    }

    public boolean willNotDraw() {
        return false;
    }

    public void setSupportUrl(boolean z) {
        this.f2269q = z;
    }

    public void setScrollX(float f) {
        this.f2273u = f;
    }

    public MarqueeView(Context context) {
        this(context, null);
    }

    public MarqueeView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MarqueeView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2260h = 0;
        this.f2269q = false;
        this.f2270r = false;
        this.f2272t = false;
        this.f2273u = 0.9f;
        this.f2275w = false;
        this.f2276x = 0;
        this.f2277y = new C0689c();
        context = context.obtainStyledAttributes(attributeSet, C0489R.styleable.IMarqueeView);
        CharSequence string = context.getString(1);
        this.f2266n = context.getColor(6, ViewCompat.MEASURED_STATE_MASK);
        this.f2267o = context.getColor(5, ViewCompat.MEASURED_STATE_MASK);
        this.f2268p = context.getColor(2, ViewCompat.MEASURED_STATE_MASK);
        this.f2271s = context.getColor(7, ViewCompat.MEASURED_STATE_MASK);
        this.f2269q = context.getBoolean(4, false);
        this.f2272t = context.getBoolean(8, false);
        this.f2270r = context.getBoolean(3, false);
        this.f2273u = context.getFloat(0, 0.9f);
        if (TextUtils.equals(string, "center") != 0) {
            this.f2276x = 1;
        }
        context.recycle();
        setGravity(16);
        setSingleLine(true);
        setEllipsize(TruncateAt.END);
    }

    public CharSequence getText() {
        if (getTag() == null) {
            return "";
        }
        return (String) getTag();
    }

    /* renamed from: a */
    public void m2773a(String str) {
        removeCallbacks(this.f2277y);
        this.f2275w = false;
        this.f2274v = false;
        this.f2265m = 0.0f;
        setTag(str);
        if (!TextUtils.isEmpty(str)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("      ");
            stringBuilder.append(str);
            this.f2261i = stringBuilder.toString();
            this.f2263k = getPaint();
            this.f2264l = getPaint();
            this.f2258f = this.f2263k.measureText("\t");
            invalidate();
            m2762b();
        }
    }

    private float getMetricsY() {
        FontMetrics fontMetrics = this.f2263k.getFontMetrics();
        return ((float) (getHeight() / 2)) + ((Math.abs(fontMetrics.ascent) - fontMetrics.descent) / 2.0f);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!TextUtils.isEmpty(this.f2261i)) {
            if (!this.f2274v) {
                this.f2256d = (float) getWidth();
                this.f2255c = this.f2263k.measureText(this.f2261i);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("supportUrl:");
                stringBuilder.append(this.f2269q);
                C0591c.m790a(stringBuilder.toString());
                if (this.f2269q) {
                    List b = m2761b(this.f2261i);
                    if (b.size() == 0) {
                        this.f2269q = false;
                    } else {
                        this.f2253a = m2756a(this.f2261i, b, this.f2263k);
                    }
                }
                this.f2274v = true;
                setText(canvas);
            } else if (this.f2275w) {
                if (this.f2265m >= this.f2257e) {
                    this.f2265m = 0.0f;
                } else {
                    this.f2265m += this.f2273u;
                }
                m2757a(this.f2254b, this.f2262j, canvas, this.f2265m);
                invalidate();
            } else {
                setText(canvas);
            }
        }
    }

    /* renamed from: a */
    private void m2757a(List<C0688b> list, String str, Canvas canvas, float f) {
        String str2 = str;
        Canvas canvas2 = canvas;
        float f2 = f;
        float metricsY = getMetricsY();
        if (this.f2269q) {
            for (int i = 0; i < list.size(); i++) {
                List<C0688b> list2 = list;
                C0688b c0688b = (C0688b) list.get(i);
                if (!c0688b.f1046b) {
                    if (r0.f2270r) {
                        r0.f2264l.setColor(r0.f2268p);
                        canvas2.drawText(c0688b.f1045a, ((-f2) + c0688b.f1049e) - 1.0f, metricsY - 1.0f, r0.f2264l);
                    }
                    r0.f2263k.setColor(r0.f2267o);
                    canvas2.drawText(c0688b.f1045a, (-f2) + c0688b.f1049e, metricsY, r0.f2263k);
                } else if (r0.f2272t) {
                    if (r0.f2270r) {
                        r0.f2264l.setColor(r0.f2271s);
                        canvas2.drawText(c0688b.f1045a, ((-f2) + c0688b.f1049e) - 1.0f, (metricsY - 3.0f) - 1.0f, r0.f2264l);
                    }
                    r0.f2263k.setColor(r0.f2266n);
                    float f3 = -f2;
                    canvas2.drawText(c0688b.f1045a, c0688b.f1049e + f3, metricsY - 3.0f, r0.f2263k);
                    canvas.drawRect(c0688b.f1049e + f3, (float) ((getHeight() - 5) - getPaddingBottom()), f3 + c0688b.f1050f, (float) ((getHeight() - 2) - getPaddingBottom()), r0.f2263k);
                } else {
                    if (r0.f2270r) {
                        r0.f2264l.setColor(r0.f2271s);
                        canvas2.drawText(c0688b.f1045a, ((-f2) + c0688b.f1049e) - 1.0f, metricsY - 1.0f, r0.f2264l);
                    }
                    r0.f2263k.setColor(r0.f2266n);
                    canvas2.drawText(c0688b.f1045a, (-f2) + c0688b.f1049e, metricsY, r0.f2263k);
                }
            }
            return;
        }
        if (r0.f2270r) {
            r0.f2264l.setColor(r0.f2268p);
            canvas2.drawText(str, (-f2) - 1.0f, metricsY - 1.0f, r0.f2264l);
        }
        r0.f2263k.setColor(r0.f2267o);
        canvas2.drawText(str, -f2, metricsY, r0.f2263k);
    }

    /* renamed from: b */
    private void m2762b() {
        if (!this.f2275w) {
            removeCallbacks(this.f2277y);
            postDelayed(this.f2277y, 1500);
        }
    }

    /* renamed from: a */
    public void m2772a() {
        m2773a((String) getTag());
    }

    private void setText(Canvas canvas) {
        if (this.f2261i != null) {
            float f = 0.0f;
            if (this.f2256d >= this.f2255c) {
                List list = this.f2253a;
                String str = this.f2261i;
                if (this.f2276x == 1) {
                    f = (-(this.f2256d - this.f2255c)) / 2.0f;
                }
                m2757a(list, str, canvas, f);
            } else {
                m2757a(this.f2253a, this.f2261i, canvas, 0.0f);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f2269q) {
            return super.onTouchEvent(motionEvent);
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        switch (motionEvent.getAction()) {
            case null:
                this.f2278z = x;
                this.f2251A = y;
                break;
            case 1:
                float f;
                motionEvent = null;
                List list;
                if (this.f2256d >= this.f2255c) {
                    list = this.f2253a;
                    f = this.f2276x == 1 ? (-(this.f2256d - this.f2255c)) / 2.0f : 0.0f;
                } else {
                    list = this.f2254b;
                    f = this.f2265m;
                }
                for (C0688b c0688b : r3) {
                    if (((float) this.f2278z) > c0688b.f1049e - f && ((float) this.f2278z) < c0688b.f1050f - f) {
                        if (c0688b.f1046b) {
                            motionEvent = c0688b.f1045a;
                        }
                        if (!(motionEvent == null || ((x - this.f2278z) * (x - this.f2278z)) + ((y - this.f2251A) * (y - this.f2251A)) >= 2000 || this.f2252B == null)) {
                            this.f2252B.mo1318a(motionEvent);
                            break;
                        }
                    }
                }
                this.f2252B.mo1318a(motionEvent);
                break;
            case 2:
                break;
            default:
                break;
        }
        return true;
    }

    public void setOnUrlClick(C0687a c0687a) {
        this.f2252B = c0687a;
    }

    /* renamed from: b */
    public static List<String> m2761b(String str) {
        List<String> arrayList = new ArrayList();
        Matcher matcher = Pattern.compile("(((https?)://)|(www.))[-A-Za-z0-9+&@#/%?=~_|!:.;]+[-A-Za-z0-9+&@#/%=~_|]", 2).matcher(str);
        while (matcher.find()) {
            arrayList.add(str.substring(matcher.start(0), matcher.end(0)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<C0688b> m2756a(String str, List<String> list, TextPaint textPaint) {
        List<C0688b> arrayList = new ArrayList();
        String[] split = TextUtils.split(str, "(((https?)://)|(www.))[-A-Za-z0-9+&@#/%?=~_|!:.;]+[-A-Za-z0-9+&@#/%=~_|]");
        int i = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < split.length; i2++) {
            String str2 = split[i2];
            if (!TextUtils.isEmpty(str2)) {
                C0688b c0688b = new C0688b();
                c0688b.f1045a = str2;
                c0688b.f1046b = false;
                c0688b.f1047c = str.indexOf(str2, i);
                c0688b.f1048d = (c0688b.f1047c + str2.length()) - 1;
                i = c0688b.f1048d;
                c0688b.f1049e = f;
                arrayList.add(c0688b);
                f += textPaint.measureText(c0688b.f1045a);
                c0688b.f1050f = f;
            }
            if (i2 != split.length - 1) {
                C0688b c0688b2 = new C0688b();
                String str3 = (String) list.get(i2);
                c0688b2.f1045a = str3;
                c0688b2.f1046b = true;
                c0688b2.f1047c = str.indexOf(str3, i);
                c0688b2.f1048d = (c0688b2.f1047c + str3.length()) - 1;
                i = c0688b2.f1048d;
                c0688b2.f1049e = f;
                arrayList.add(c0688b2);
                f += textPaint.measureText(c0688b2.f1045a);
                c0688b2.f1050f = f;
            }
        }
        return arrayList;
    }
}
