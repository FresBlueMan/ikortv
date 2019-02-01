package tv.danmaku.ijk.media.player;

import android.media.MediaCodecInfo;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class IjkMediaCodecInfo {
    public static final int RANK_ACCEPTABLE = 700;
    public static final int RANK_LAST_CHANCE = 600;
    public static final int RANK_MAX = 1000;
    public static final int RANK_NON_STANDARD = 100;
    public static final int RANK_NO_SENSE = 0;
    public static final int RANK_SECURE = 300;
    public static final int RANK_SOFTWARE = 200;
    public static final int RANK_TESTED = 800;
    private static final String TAG = "IjkMediaCodecInfo";
    private static Map<String, Integer> sKnownCodecList;
    public MediaCodecInfo mCodecInfo;
    public String mMimeType;
    public int mRank = 0;

    public static String getLevelName(int i) {
        switch (i) {
            case 1:
                return "1";
            case 2:
                return "1b";
            case 4:
                return "11";
            case 8:
                return "12";
            case 16:
                return "13";
            case 32:
                return "2";
            case 64:
                return "21";
            case 128:
                return "22";
            case 256:
                return "3";
            case 512:
                return "31";
            case 1024:
                return "32";
            case 2048:
                return "4";
            case 4096:
                return "41";
            case 8192:
                return "42";
            case 16384:
                return "5";
            case 32768:
                return "51";
            case 65536:
                return "52";
            default:
                return "0";
        }
    }

    public static String getProfileName(int i) {
        if (i == 4) {
            return "Extends";
        }
        if (i == 8) {
            return "High";
        }
        if (i == 16) {
            return "High10";
        }
        if (i == 32) {
            return "High422";
        }
        if (i == 64) {
            return "High444";
        }
        switch (i) {
            case 1:
                return "Baseline";
            case 2:
                return "Main";
            default:
                return "Unknown";
        }
    }

    private static synchronized Map<String, Integer> getKnownCodecList() {
        synchronized (IjkMediaCodecInfo.class) {
            if (sKnownCodecList != null) {
                Map<String, Integer> map = sKnownCodecList;
                return map;
            }
            sKnownCodecList = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            sKnownCodecList.put("OMX.Nvidia.h264.decode", Integer.valueOf(800));
            sKnownCodecList.put("OMX.Nvidia.h264.decode.secure", Integer.valueOf(RANK_SECURE));
            sKnownCodecList.put("OMX.Intel.hw_vd.h264", Integer.valueOf(IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE));
            sKnownCodecList.put("OMX.Intel.VideoDecoder.AVC", Integer.valueOf(800));
            sKnownCodecList.put("OMX.qcom.video.decoder.avc", Integer.valueOf(800));
            sKnownCodecList.put("OMX.ittiam.video.decoder.avc", Integer.valueOf(0));
            sKnownCodecList.put("OMX.SEC.avc.dec", Integer.valueOf(800));
            sKnownCodecList.put("OMX.SEC.AVC.Decoder", Integer.valueOf(799));
            sKnownCodecList.put("OMX.SEC.avcdec", Integer.valueOf(798));
            sKnownCodecList.put("OMX.SEC.avc.sw.dec", Integer.valueOf(200));
            sKnownCodecList.put("OMX.Exynos.avc.dec", Integer.valueOf(800));
            sKnownCodecList.put("OMX.Exynos.AVC.Decoder", Integer.valueOf(799));
            sKnownCodecList.put("OMX.k3.video.decoder.avc", Integer.valueOf(800));
            sKnownCodecList.put("OMX.IMG.MSVDX.Decoder.AVC", Integer.valueOf(800));
            sKnownCodecList.put("OMX.TI.DUCATI1.VIDEO.DECODER", Integer.valueOf(800));
            sKnownCodecList.put("OMX.rk.video_decoder.avc", Integer.valueOf(800));
            sKnownCodecList.put("OMX.amlogic.avc.decoder.awesome", Integer.valueOf(800));
            sKnownCodecList.put("OMX.MARVELL.VIDEO.HW.CODA7542DECODER", Integer.valueOf(800));
            sKnownCodecList.put("OMX.MARVELL.VIDEO.H264DECODER", Integer.valueOf(200));
            sKnownCodecList.remove("OMX.Action.Video.Decoder");
            sKnownCodecList.remove("OMX.allwinner.video.decoder.avc");
            sKnownCodecList.remove("OMX.BRCM.vc4.decoder.avc");
            sKnownCodecList.remove("OMX.brcm.video.h264.hw.decoder");
            sKnownCodecList.remove("OMX.brcm.video.h264.decoder");
            sKnownCodecList.remove("OMX.cosmo.video.decoder.avc");
            sKnownCodecList.remove("OMX.duos.h264.decoder");
            sKnownCodecList.remove("OMX.hantro.81x0.video.decoder");
            sKnownCodecList.remove("OMX.hantro.G1.video.decoder");
            sKnownCodecList.remove("OMX.hisi.video.decoder");
            sKnownCodecList.remove("OMX.LG.decoder.video.avc");
            sKnownCodecList.remove("OMX.MS.AVC.Decoder");
            sKnownCodecList.remove("OMX.RENESAS.VIDEO.DECODER.H264");
            sKnownCodecList.remove("OMX.RTK.video.decoder");
            sKnownCodecList.remove("OMX.sprd.h264.decoder");
            sKnownCodecList.remove("OMX.ST.VFM.H264Dec");
            sKnownCodecList.remove("OMX.vpu.video_decoder.avc");
            sKnownCodecList.remove("OMX.WMT.decoder.avc");
            sKnownCodecList.remove("OMX.bluestacks.hw.decoder");
            sKnownCodecList.put("OMX.google.h264.decoder", Integer.valueOf(200));
            sKnownCodecList.put("OMX.google.h264.lc.decoder", Integer.valueOf(200));
            sKnownCodecList.put("OMX.k3.ffmpeg.decoder", Integer.valueOf(200));
            sKnownCodecList.put("OMX.ffmpeg.video.decoder", Integer.valueOf(200));
            sKnownCodecList.put("OMX.sprd.soft.h264.decoder", Integer.valueOf(200));
            map = sKnownCodecList;
            return map;
        }
    }

    @android.annotation.TargetApi(16)
    public static tv.danmaku.ijk.media.player.IjkMediaCodecInfo setupCandidate(android.media.MediaCodecInfo r5, java.lang.String r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/293907205.run(Unknown Source)
*/
        /*
        r0 = 0;
        if (r5 == 0) goto L_0x009f;
    L_0x0003:
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 16;
        if (r1 >= r2) goto L_0x000b;
    L_0x0009:
        goto L_0x009f;
    L_0x000b:
        r1 = r5.getName();
        r2 = android.text.TextUtils.isEmpty(r1);
        if (r2 == 0) goto L_0x0016;
    L_0x0015:
        return r0;
    L_0x0016:
        r0 = java.util.Locale.US;
        r0 = r1.toLowerCase(r0);
        r1 = "omx.";
        r1 = r0.startsWith(r1);
        r2 = 600; // 0x258 float:8.41E-43 double:2.964E-321;
        r3 = 0;
        r4 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r1 != 0) goto L_0x002d;
    L_0x0029:
        r2 = 100;
        goto L_0x0093;
    L_0x002d:
        r1 = "omx.pv";
        r1 = r0.startsWith(r1);
        if (r1 == 0) goto L_0x0038;
    L_0x0035:
        r2 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        goto L_0x0093;
    L_0x0038:
        r1 = "omx.google.";
        r1 = r0.startsWith(r1);
        if (r1 == 0) goto L_0x0041;
    L_0x0040:
        goto L_0x0035;
    L_0x0041:
        r1 = "omx.ffmpeg.";
        r1 = r0.startsWith(r1);
        if (r1 == 0) goto L_0x004a;
    L_0x0049:
        goto L_0x0035;
    L_0x004a:
        r1 = "omx.k3.ffmpeg.";
        r1 = r0.startsWith(r1);
        if (r1 == 0) goto L_0x0053;
    L_0x0052:
        goto L_0x0035;
    L_0x0053:
        r1 = "omx.avcodec.";
        r1 = r0.startsWith(r1);
        if (r1 == 0) goto L_0x005c;
    L_0x005b:
        goto L_0x0035;
    L_0x005c:
        r1 = "omx.ittiam.";
        r1 = r0.startsWith(r1);
        if (r1 == 0) goto L_0x0066;
    L_0x0064:
        r2 = 0;
        goto L_0x0093;
    L_0x0066:
        r1 = "omx.mtk.";
        r1 = r0.startsWith(r1);
        if (r1 == 0) goto L_0x0078;
    L_0x006e:
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 18;
        if (r0 >= r1) goto L_0x0075;
    L_0x0074:
        goto L_0x0064;
    L_0x0075:
        r2 = 800; // 0x320 float:1.121E-42 double:3.953E-321;
        goto L_0x0093;
    L_0x0078:
        r1 = getKnownCodecList();
        r0 = r1.get(r0);
        r0 = (java.lang.Integer) r0;
        if (r0 == 0) goto L_0x0089;
    L_0x0084:
        r2 = r0.intValue();
        goto L_0x0093;
    L_0x0089:
        r0 = r5.getCapabilitiesForType(r6);	 Catch:{ Throwable -> 0x0093 }
        if (r0 == 0) goto L_0x0093;
    L_0x008f:
        r0 = 700; // 0x2bc float:9.81E-43 double:3.46E-321;
        r2 = 700; // 0x2bc float:9.81E-43 double:3.46E-321;
    L_0x0093:
        r0 = new tv.danmaku.ijk.media.player.IjkMediaCodecInfo;
        r0.<init>();
        r0.mCodecInfo = r5;
        r0.mRank = r2;
        r0.mMimeType = r6;
        return r0;
    L_0x009f:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.IjkMediaCodecInfo.setupCandidate(android.media.MediaCodecInfo, java.lang.String):tv.danmaku.ijk.media.player.IjkMediaCodecInfo");
    }

    @android.annotation.TargetApi(16)
    public void dumpProfileLevels(java.lang.String r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/293907205.run(Unknown Source)
*/
        /*
        r7 = this;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 16;
        if (r0 >= r1) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        r0 = r7.mCodecInfo;	 Catch:{ Throwable -> 0x0049 }
        r8 = r0.getCapabilitiesForType(r8);	 Catch:{ Throwable -> 0x0049 }
        r0 = 0;	 Catch:{ Throwable -> 0x0049 }
        if (r8 == 0) goto L_0x0030;	 Catch:{ Throwable -> 0x0049 }
    L_0x0010:
        r1 = r8.profileLevels;	 Catch:{ Throwable -> 0x0049 }
        if (r1 == 0) goto L_0x0030;	 Catch:{ Throwable -> 0x0049 }
    L_0x0014:
        r8 = r8.profileLevels;	 Catch:{ Throwable -> 0x0049 }
        r1 = r8.length;	 Catch:{ Throwable -> 0x0049 }
        r2 = 0;	 Catch:{ Throwable -> 0x0049 }
        r3 = 0;	 Catch:{ Throwable -> 0x0049 }
        r4 = 0;	 Catch:{ Throwable -> 0x0049 }
    L_0x001a:
        if (r2 >= r1) goto L_0x0032;	 Catch:{ Throwable -> 0x0049 }
    L_0x001c:
        r5 = r8[r2];	 Catch:{ Throwable -> 0x0049 }
        if (r5 != 0) goto L_0x0021;	 Catch:{ Throwable -> 0x0049 }
    L_0x0020:
        goto L_0x002d;	 Catch:{ Throwable -> 0x0049 }
    L_0x0021:
        r6 = r5.profile;	 Catch:{ Throwable -> 0x0049 }
        r3 = java.lang.Math.max(r3, r6);	 Catch:{ Throwable -> 0x0049 }
        r5 = r5.level;	 Catch:{ Throwable -> 0x0049 }
        r4 = java.lang.Math.max(r4, r5);	 Catch:{ Throwable -> 0x0049 }
    L_0x002d:
        r2 = r2 + 1;	 Catch:{ Throwable -> 0x0049 }
        goto L_0x001a;	 Catch:{ Throwable -> 0x0049 }
    L_0x0030:
        r3 = 0;	 Catch:{ Throwable -> 0x0049 }
        r4 = 0;	 Catch:{ Throwable -> 0x0049 }
    L_0x0032:
        r8 = "IjkMediaCodecInfo";	 Catch:{ Throwable -> 0x0049 }
        r1 = java.util.Locale.US;	 Catch:{ Throwable -> 0x0049 }
        r2 = "%s";	 Catch:{ Throwable -> 0x0049 }
        r5 = 1;	 Catch:{ Throwable -> 0x0049 }
        r5 = new java.lang.Object[r5];	 Catch:{ Throwable -> 0x0049 }
        r3 = getProfileLevelName(r3, r4);	 Catch:{ Throwable -> 0x0049 }
        r5[r0] = r3;	 Catch:{ Throwable -> 0x0049 }
        r0 = java.lang.String.format(r1, r2, r5);	 Catch:{ Throwable -> 0x0049 }
        android.util.Log.i(r8, r0);	 Catch:{ Throwable -> 0x0049 }
        goto L_0x0050;
    L_0x0049:
        r8 = "IjkMediaCodecInfo";
        r0 = "profile-level: exception";
        android.util.Log.i(r8, r0);
    L_0x0050:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.IjkMediaCodecInfo.dumpProfileLevels(java.lang.String):void");
    }

    public static String getProfileLevelName(int i, int i2) {
        return String.format(Locale.US, " %s Profile Level %s (%d,%d)", new Object[]{getProfileName(i), getLevelName(i2), Integer.valueOf(i), Integer.valueOf(i2)});
    }
}
