package com.nostra13.universalimageloader.utils;

import android.content.Context;
import android.os.Environment;
import java.io.File;

public final class StorageUtils {
    private static final String EXTERNAL_STORAGE_PERMISSION = "android.permission.WRITE_EXTERNAL_STORAGE";
    private static final String INDIVIDUAL_DIR_NAME = "uil-images";

    private StorageUtils() {
    }

    public static File getCacheDirectory(Context context) {
        return getCacheDirectory(context, true);
    }

    public static java.io.File getCacheDirectory(android.content.Context r2, boolean r3) {
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
        r0 = android.os.Environment.getExternalStorageState();	 Catch:{ NullPointerException -> 0x0008, IncompatibleClassChangeError -> 0x0005 }
        goto L_0x000a;
    L_0x0005:
        r0 = "";
        goto L_0x000a;
    L_0x0008:
        r0 = "";
    L_0x000a:
        if (r3 == 0) goto L_0x001f;
    L_0x000c:
        r3 = "mounted";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x001f;
    L_0x0014:
        r3 = hasExternalStoragePermission(r2);
        if (r3 == 0) goto L_0x001f;
    L_0x001a:
        r3 = getExternalCacheDir(r2);
        goto L_0x0020;
    L_0x001f:
        r3 = 0;
    L_0x0020:
        if (r3 != 0) goto L_0x0026;
    L_0x0022:
        r3 = r2.getCacheDir();
    L_0x0026:
        if (r3 != 0) goto L_0x0052;
    L_0x0028:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r0 = "/data/data/";
        r3.append(r0);
        r2 = r2.getPackageName();
        r3.append(r2);
        r2 = "/cache/";
        r3.append(r2);
        r2 = r3.toString();
        r3 = "Can't define system cache directory! '%s' will be used.";
        r0 = 1;
        r0 = new java.lang.Object[r0];
        r1 = 0;
        r0[r1] = r2;
        com.nostra13.universalimageloader.utils.C0778L.m1433w(r3, r0);
        r3 = new java.io.File;
        r3.<init>(r2);
    L_0x0052:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nostra13.universalimageloader.utils.StorageUtils.getCacheDirectory(android.content.Context, boolean):java.io.File");
    }

    public static File getIndividualCacheDirectory(Context context) {
        return getIndividualCacheDirectory(context, INDIVIDUAL_DIR_NAME);
    }

    public static File getIndividualCacheDirectory(Context context, String str) {
        context = getCacheDirectory(context);
        File file = new File(context, str);
        return (file.exists() == null && file.mkdir() == null) ? context : file;
    }

    public static File getOwnCacheDirectory(Context context, String str) {
        File file = ("mounted".equals(Environment.getExternalStorageState()) && hasExternalStoragePermission(context)) ? new File(Environment.getExternalStorageDirectory(), str) : null;
        return (file == null || (file.exists() == null && file.mkdirs() == null)) ? context.getCacheDir() : file;
    }

    public static File getOwnCacheDirectory(Context context, String str, boolean z) {
        z = (z && "mounted".equals(Environment.getExternalStorageState()) && hasExternalStoragePermission(context)) ? new File(Environment.getExternalStorageDirectory(), str) : false;
        return (!z || (z.exists() == null && z.mkdirs() == null)) ? context.getCacheDir() : z;
    }

    private static java.io.File getExternalCacheDir(android.content.Context r4) {
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
        r0 = new java.io.File;
        r1 = new java.io.File;
        r2 = android.os.Environment.getExternalStorageDirectory();
        r3 = "Android";
        r1.<init>(r2, r3);
        r2 = "data";
        r0.<init>(r1, r2);
        r1 = new java.io.File;
        r2 = new java.io.File;
        r4 = r4.getPackageName();
        r2.<init>(r0, r4);
        r4 = "cache";
        r1.<init>(r2, r4);
        r4 = r1.exists();
        if (r4 != 0) goto L_0x004a;
    L_0x0028:
        r4 = r1.mkdirs();
        r0 = 0;
        if (r4 != 0) goto L_0x0038;
    L_0x002f:
        r4 = "Unable to create external cache directory";
        r0 = new java.lang.Object[r0];
        com.nostra13.universalimageloader.utils.C0778L.m1433w(r4, r0);
        r4 = 0;
        return r4;
    L_0x0038:
        r4 = new java.io.File;	 Catch:{ IOException -> 0x0043 }
        r2 = ".nomedia";	 Catch:{ IOException -> 0x0043 }
        r4.<init>(r1, r2);	 Catch:{ IOException -> 0x0043 }
        r4.createNewFile();	 Catch:{ IOException -> 0x0043 }
        goto L_0x004a;
    L_0x0043:
        r4 = "Can't create \".nomedia\" file in application external cache directory";
        r0 = new java.lang.Object[r0];
        com.nostra13.universalimageloader.utils.C0778L.m1432i(r4, r0);
    L_0x004a:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nostra13.universalimageloader.utils.StorageUtils.getExternalCacheDir(android.content.Context):java.io.File");
    }

    private static boolean hasExternalStoragePermission(Context context) {
        return context.checkCallingOrSelfPermission(EXTERNAL_STORAGE_PERMISSION) == null ? true : null;
    }
}
