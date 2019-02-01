package com.iptv2.core;

import android.content.ContentResolver;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap.Config;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import com.iptv2.activity.DispatchActivity;
import com.iptv2.base.Activity;
import com.iptv2.ikortv.R;
import com.iptv2.p043b.C0591c;
import com.iptv2.p043b.C0595e;
import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration.Builder;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

/* compiled from: AppContext */
/* renamed from: com.iptv2.core.c */
public class C0730c {
    /* renamed from: N */
    private static Date f1237N;
    /* renamed from: O */
    private static long f1238O;
    /* renamed from: c */
    public static int f1239c;
    /* renamed from: d */
    public static int f1240d;
    /* renamed from: e */
    public static final SimpleDateFormat f1241e = new SimpleDateFormat("Z", C0595e.f658a);
    /* renamed from: f */
    public static final SimpleDateFormat f1242f = new SimpleDateFormat("/yyyy/MM/yyyyMMdd", C0595e.f658a);
    /* renamed from: g */
    public static final SimpleDateFormat f1243g = new SimpleDateFormat("yyyy-MM-dd", C0595e.f658a);
    /* renamed from: h */
    public static final SimpleDateFormat f1244h = new SimpleDateFormat("dd", C0595e.f658a);
    /* renamed from: i */
    public static final SimpleDateFormat f1245i = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", C0595e.f658a);
    /* renamed from: A */
    public int f1246A;
    /* renamed from: B */
    public boolean f1247B = false;
    /* renamed from: C */
    public C0734d f1248C;
    /* renamed from: D */
    public C0728b f1249D;
    /* renamed from: E */
    public C0740e f1250E;
    /* renamed from: F */
    public C0741f f1251F;
    /* renamed from: G */
    public int f1252G;
    /* renamed from: H */
    public int f1253H;
    /* renamed from: I */
    public ImageLoader f1254I;
    /* renamed from: J */
    public DisplayImageOptions f1255J;
    /* renamed from: K */
    public DisplayImageOptions f1256K;
    /* renamed from: L */
    public DisplayImageOptions f1257L;
    /* renamed from: M */
    public String f1258M;
    /* renamed from: P */
    private Toast f1259P;
    /* renamed from: a */
    public Application f1260a;
    /* renamed from: b */
    public C0729a f1261b;
    /* renamed from: j */
    public Activity f1262j;
    /* renamed from: k */
    public Handler f1263k;
    /* renamed from: l */
    public LayoutInflater f1264l;
    /* renamed from: m */
    public Resources f1265m;
    /* renamed from: n */
    public DisplayMetrics f1266n;
    /* renamed from: o */
    public WindowManager f1267o;
    /* renamed from: p */
    public WifiManager f1268p;
    /* renamed from: q */
    public TelephonyManager f1269q;
    /* renamed from: r */
    public InputMethodManager f1270r;
    /* renamed from: s */
    public AssetManager f1271s;
    /* renamed from: t */
    public AudioManager f1272t;
    /* renamed from: u */
    public ContentResolver f1273u;
    /* renamed from: v */
    public PackageManager f1274v;
    /* renamed from: w */
    public PackageInfo f1275w;
    /* renamed from: x */
    public SharedPreferences f1276x;
    /* renamed from: y */
    public Typeface f1277y;
    /* renamed from: z */
    public Typeface f1278z;

    /* compiled from: AppContext */
    /* renamed from: com.iptv2.core.c$a */
    public enum C0729a {
        All,
        Live,
        Vod
    }

    static {
        C0730c.m1255a(Calendar.getInstance().getTime());
    }

    public C0730c(Application application) {
        C0591c.m791a("AppContext", "init");
        try {
            this.f1260a = application;
            this.f1263k = new Handler();
            this.f1273u = this.f1260a.getContentResolver();
            this.f1276x = this.f1260a.getSharedPreferences("IPTV", 0);
            this.f1258M = m1257e();
            this.f1264l = (LayoutInflater) this.f1260a.getSystemService("layout_inflater");
            this.f1268p = (WifiManager) this.f1260a.getSystemService("wifi");
            this.f1269q = (TelephonyManager) this.f1260a.getSystemService("phone");
            this.f1270r = (InputMethodManager) this.f1260a.getSystemService("input_method");
            this.f1267o = (WindowManager) this.f1260a.getSystemService("window");
            this.f1272t = (AudioManager) this.f1260a.getSystemService("audio");
            this.f1271s = this.f1260a.getAssets();
            this.f1274v = this.f1260a.getPackageManager();
            this.f1275w = this.f1274v.getPackageInfo(this.f1260a.getPackageName(), 0);
            this.f1265m = this.f1260a.getResources();
            this.f1266n = this.f1265m.getDisplayMetrics();
            this.f1277y = Typeface.createFromAsset(this.f1271s, "icomoon/fonts/icomoon.ttf");
            this.f1278z = Typeface.createFromAsset(this.f1271s, "awesome/fonts/fontawesome-webfont.ttf");
            this.f1246A = this.f1272t.getStreamMaxVolume(3);
            this.f1248C = new C0734d(this);
            this.f1250E = new C0740e(this);
            this.f1251F = new C0741f(this);
            this.f1249D = new C0728b(this);
            this.f1252G = this.f1265m.getDimensionPixelSize(R.dimen.focus_border_size);
            this.f1253H = this.f1265m.getDimensionPixelSize(R.dimen.focus_border_offset);
            this.f1254I = ImageLoader.getInstance();
            application = new Builder(this.f1260a);
            application.threadPriority(3);
            application.denyCacheImageMultipleSizesInMemory();
            application.diskCacheFileNameGenerator(new Md5FileNameGenerator());
            application.diskCacheSize(41943040);
            application.memoryCacheSize(31457280);
            application.tasksProcessingOrder(QueueProcessingType.LIFO);
            this.f1254I.init(application.build());
            this.f1255J = new DisplayImageOptions.Builder().cacheInMemory(true).cacheOnDisk(true).resetViewBeforeLoading(true).bitmapConfig(Config.RGB_565).displayer(new FadeInBitmapDisplayer(IjkMediaCodecInfo.RANK_SECURE, true, true, false)).build();
            this.f1256K = new DisplayImageOptions.Builder().cacheInMemory(true).cacheOnDisk(true).showImageOnFail((int) R.drawable.icon_live_channel_logo_empty).showImageOnLoading((int) R.drawable.icon_live_channel_logo_empty).resetViewBeforeLoading(true).displayer(new FadeInBitmapDisplayer(IjkMediaCodecInfo.RANK_SECURE, true, true, false)).build();
            this.f1257L = new DisplayImageOptions.Builder().cacheInMemory(true).cacheOnDisk(true).showImageOnFail((int) R.drawable.icon_live_channel_logo_empty).showImageOnLoading((int) R.drawable.icon_live_channel_logo_empty).resetViewBeforeLoading(true).build();
        } catch (Application application2) {
            C0591c.m792a("AppContext", "init", application2);
        }
    }

    /* renamed from: a */
    public static String m1254a() {
        String format = f1241e.format(new Date());
        String substring = format.substring(0, 1);
        double parseDouble = Double.parseDouble(format.substring(1, 3));
        double parseDouble2 = Double.parseDouble(format.substring(3, 5)) / 60.0d;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(substring);
        stringBuilder.append(parseDouble + parseDouble2);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static void m1255a(Date date) {
        f1237N = date;
        f1238O = SystemClock.elapsedRealtime();
    }

    /* renamed from: b */
    public static Date m1256b() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - f1238O;
        Calendar instance = Calendar.getInstance();
        instance.setTime(f1237N);
        instance.add(14, (int) elapsedRealtime);
        return instance.getTime();
    }

    /* renamed from: a */
    public void m1260a(String str, int i) {
        if (this.f1259P != null) {
            this.f1259P.cancel();
        }
        this.f1259P = Toast.makeText(this.f1260a, str, i);
        this.f1259P.show();
    }

    /* renamed from: a */
    public int m1258a(float f) {
        return (int) ((f * this.f1266n.density) + 0.5f);
    }

    /* renamed from: c */
    public void m1261c() {
        this.f1260a.sendBroadcast(new Intent("com.iptv2.ikortvaction.closeallactivity"));
    }

    /* renamed from: a */
    public void m1259a(Activity activity) {
        this.f1262j = null;
        m1261c();
        activity.startActivity(new Intent(activity, DispatchActivity.class));
    }

    /* renamed from: d */
    public void m1262d() {
        this.f1262j = null;
        this.f1248C.f1282a = null;
        this.f1248C.f1284c = null;
        this.f1248C.f1285d = null;
        m1261c();
    }

    /* renamed from: e */
    private String m1257e() {
        Editor edit = this.f1276x.edit();
        String string = this.f1276x.getString("InAppUUID", "");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        string = UUID.randomUUID().toString().replace("-", "");
        edit.putString("InAppUUID", string);
        edit.commit();
        return string;
    }
}
