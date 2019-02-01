package com.nostra13.universalimageloader.core;

import android.graphics.Bitmap;
import android.os.Handler;
import com.nostra13.universalimageloader.core.DisplayImageOptions.Builder;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.assist.FailReason.FailType;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.assist.ImageSize;
import com.nostra13.universalimageloader.core.assist.LoadedFrom;
import com.nostra13.universalimageloader.core.assist.ViewScaleType;
import com.nostra13.universalimageloader.core.decode.ImageDecoder;
import com.nostra13.universalimageloader.core.decode.ImageDecodingInfo;
import com.nostra13.universalimageloader.core.download.ImageDownloader;
import com.nostra13.universalimageloader.core.download.ImageDownloader.Scheme;
import com.nostra13.universalimageloader.core.imageaware.ImageAware;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;
import com.nostra13.universalimageloader.core.listener.ImageLoadingProgressListener;
import com.nostra13.universalimageloader.utils.C0778L;
import com.nostra13.universalimageloader.utils.IoUtils;
import com.nostra13.universalimageloader.utils.IoUtils.CopyListener;
import java.io.Closeable;
import java.io.File;

final class LoadAndDisplayImageTask implements CopyListener, Runnable {
    private static final String ERROR_NO_IMAGE_STREAM = "No stream for image [%s]";
    private static final String ERROR_POST_PROCESSOR_NULL = "Post-processor returned null [%s]";
    private static final String ERROR_PRE_PROCESSOR_NULL = "Pre-processor returned null [%s]";
    private static final String ERROR_PROCESSOR_FOR_DISK_CACHE_NULL = "Bitmap processor for disk cache returned null [%s]";
    private static final String LOG_CACHE_IMAGE_IN_MEMORY = "Cache image in memory [%s]";
    private static final String LOG_CACHE_IMAGE_ON_DISK = "Cache image on disk [%s]";
    private static final String LOG_DELAY_BEFORE_LOADING = "Delay %d ms before loading...  [%s]";
    private static final String LOG_GET_IMAGE_FROM_MEMORY_CACHE_AFTER_WAITING = "...Get cached bitmap from memory after waiting. [%s]";
    private static final String LOG_LOAD_IMAGE_FROM_DISK_CACHE = "Load image from disk cache [%s]";
    private static final String LOG_LOAD_IMAGE_FROM_NETWORK = "Load image from network [%s]";
    private static final String LOG_POSTPROCESS_IMAGE = "PostProcess image before displaying [%s]";
    private static final String LOG_PREPROCESS_IMAGE = "PreProcess image before caching in memory [%s]";
    private static final String LOG_PROCESS_IMAGE_BEFORE_CACHE_ON_DISK = "Process image before cache on disk [%s]";
    private static final String LOG_RESIZE_CACHED_IMAGE_FILE = "Resize image in disk cache [%s]";
    private static final String LOG_RESUME_AFTER_PAUSE = ".. Resume loading [%s]";
    private static final String LOG_START_DISPLAY_IMAGE_TASK = "Start display image task [%s]";
    private static final String LOG_TASK_CANCELLED_IMAGEAWARE_COLLECTED = "ImageAware was collected by GC. Task is cancelled. [%s]";
    private static final String LOG_TASK_CANCELLED_IMAGEAWARE_REUSED = "ImageAware is reused for another image. Task is cancelled. [%s]";
    private static final String LOG_TASK_INTERRUPTED = "Task was interrupted [%s]";
    private static final String LOG_WAITING_FOR_IMAGE_LOADED = "Image already is loading. Waiting... [%s]";
    private static final String LOG_WAITING_FOR_RESUME = "ImageLoader is paused. Waiting...  [%s]";
    private final ImageLoaderConfiguration configuration;
    private final ImageDecoder decoder;
    private final ImageDownloader downloader;
    private final ImageLoaderEngine engine;
    private final Handler handler;
    final ImageAware imageAware;
    private final ImageLoadingInfo imageLoadingInfo;
    final ImageLoadingListener listener;
    private LoadedFrom loadedFrom = LoadedFrom.NETWORK;
    private final String memoryCacheKey;
    private final ImageDownloader networkDeniedDownloader;
    final DisplayImageOptions options;
    final ImageLoadingProgressListener progressListener;
    private final ImageDownloader slowNetworkDownloader;
    private final boolean syncLoading;
    private final ImageSize targetSize;
    final String uri;

    /* renamed from: com.nostra13.universalimageloader.core.LoadAndDisplayImageTask$3 */
    class C07733 implements Runnable {
        C07733() {
        }

        public void run() {
            LoadAndDisplayImageTask.this.listener.onLoadingCancelled(LoadAndDisplayImageTask.this.uri, LoadAndDisplayImageTask.this.imageAware.getWrappedView());
        }
    }

    class TaskCancelledException extends Exception {
        TaskCancelledException() {
        }
    }

    public LoadAndDisplayImageTask(ImageLoaderEngine imageLoaderEngine, ImageLoadingInfo imageLoadingInfo, Handler handler) {
        this.engine = imageLoaderEngine;
        this.imageLoadingInfo = imageLoadingInfo;
        this.handler = handler;
        this.configuration = imageLoaderEngine.configuration;
        this.downloader = this.configuration.downloader;
        this.networkDeniedDownloader = this.configuration.networkDeniedDownloader;
        this.slowNetworkDownloader = this.configuration.slowNetworkDownloader;
        this.decoder = this.configuration.decoder;
        this.uri = imageLoadingInfo.uri;
        this.memoryCacheKey = imageLoadingInfo.memoryCacheKey;
        this.imageAware = imageLoadingInfo.imageAware;
        this.targetSize = imageLoadingInfo.targetSize;
        this.options = imageLoadingInfo.options;
        this.listener = imageLoadingInfo.listener;
        this.progressListener = imageLoadingInfo.progressListener;
        this.syncLoading = this.options.isSyncLoading();
    }

    public void run() {
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
        r0 = r7.waitIfPaused();
        if (r0 == 0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        r0 = r7.delayIfNeed();
        if (r0 == 0) goto L_0x000e;
    L_0x000d:
        return;
    L_0x000e:
        r0 = r7.imageLoadingInfo;
        r0 = r0.loadFromUriLock;
        r1 = "Start display image task [%s]";
        r2 = 1;
        r3 = new java.lang.Object[r2];
        r4 = r7.memoryCacheKey;
        r5 = 0;
        r3[r5] = r4;
        com.nostra13.universalimageloader.utils.C0778L.m1428d(r1, r3);
        r1 = r0.isLocked();
        if (r1 == 0) goto L_0x0030;
    L_0x0025:
        r1 = "Image already is loading. Waiting... [%s]";
        r3 = new java.lang.Object[r2];
        r4 = r7.memoryCacheKey;
        r3[r5] = r4;
        com.nostra13.universalimageloader.utils.C0778L.m1428d(r1, r3);
    L_0x0030:
        r0.lock();
        r7.checkTaskNotActual();	 Catch:{ TaskCancelledException -> 0x00fd }
        r1 = r7.configuration;	 Catch:{ TaskCancelledException -> 0x00fd }
        r1 = r1.memoryCache;	 Catch:{ TaskCancelledException -> 0x00fd }
        r3 = r7.memoryCacheKey;	 Catch:{ TaskCancelledException -> 0x00fd }
        r1 = r1.get(r3);	 Catch:{ TaskCancelledException -> 0x00fd }
        if (r1 == 0) goto L_0x0059;	 Catch:{ TaskCancelledException -> 0x00fd }
    L_0x0042:
        r3 = r1.isRecycled();	 Catch:{ TaskCancelledException -> 0x00fd }
        if (r3 == 0) goto L_0x0049;	 Catch:{ TaskCancelledException -> 0x00fd }
    L_0x0048:
        goto L_0x0059;	 Catch:{ TaskCancelledException -> 0x00fd }
    L_0x0049:
        r3 = com.nostra13.universalimageloader.core.assist.LoadedFrom.MEMORY_CACHE;	 Catch:{ TaskCancelledException -> 0x00fd }
        r7.loadedFrom = r3;	 Catch:{ TaskCancelledException -> 0x00fd }
        r3 = "...Get cached bitmap from memory after waiting. [%s]";	 Catch:{ TaskCancelledException -> 0x00fd }
        r4 = new java.lang.Object[r2];	 Catch:{ TaskCancelledException -> 0x00fd }
        r6 = r7.memoryCacheKey;	 Catch:{ TaskCancelledException -> 0x00fd }
        r4[r5] = r6;	 Catch:{ TaskCancelledException -> 0x00fd }
        com.nostra13.universalimageloader.utils.C0778L.m1428d(r3, r4);	 Catch:{ TaskCancelledException -> 0x00fd }
        goto L_0x00b1;	 Catch:{ TaskCancelledException -> 0x00fd }
    L_0x0059:
        r1 = r7.tryLoadBitmap();	 Catch:{ TaskCancelledException -> 0x00fd }
        if (r1 != 0) goto L_0x0063;
    L_0x005f:
        r0.unlock();
        return;
    L_0x0063:
        r7.checkTaskNotActual();	 Catch:{ TaskCancelledException -> 0x00fd }
        r7.checkTaskInterrupted();	 Catch:{ TaskCancelledException -> 0x00fd }
        r3 = r7.options;	 Catch:{ TaskCancelledException -> 0x00fd }
        r3 = r3.shouldPreProcess();	 Catch:{ TaskCancelledException -> 0x00fd }
        if (r3 == 0) goto L_0x0093;	 Catch:{ TaskCancelledException -> 0x00fd }
    L_0x0071:
        r3 = "PreProcess image before caching in memory [%s]";	 Catch:{ TaskCancelledException -> 0x00fd }
        r4 = new java.lang.Object[r2];	 Catch:{ TaskCancelledException -> 0x00fd }
        r6 = r7.memoryCacheKey;	 Catch:{ TaskCancelledException -> 0x00fd }
        r4[r5] = r6;	 Catch:{ TaskCancelledException -> 0x00fd }
        com.nostra13.universalimageloader.utils.C0778L.m1428d(r3, r4);	 Catch:{ TaskCancelledException -> 0x00fd }
        r3 = r7.options;	 Catch:{ TaskCancelledException -> 0x00fd }
        r3 = r3.getPreProcessor();	 Catch:{ TaskCancelledException -> 0x00fd }
        r1 = r3.process(r1);	 Catch:{ TaskCancelledException -> 0x00fd }
        if (r1 != 0) goto L_0x0093;	 Catch:{ TaskCancelledException -> 0x00fd }
    L_0x0088:
        r3 = "Pre-processor returned null [%s]";	 Catch:{ TaskCancelledException -> 0x00fd }
        r4 = new java.lang.Object[r2];	 Catch:{ TaskCancelledException -> 0x00fd }
        r6 = r7.memoryCacheKey;	 Catch:{ TaskCancelledException -> 0x00fd }
        r4[r5] = r6;	 Catch:{ TaskCancelledException -> 0x00fd }
        com.nostra13.universalimageloader.utils.C0778L.m1429e(r3, r4);	 Catch:{ TaskCancelledException -> 0x00fd }
    L_0x0093:
        if (r1 == 0) goto L_0x00b1;	 Catch:{ TaskCancelledException -> 0x00fd }
    L_0x0095:
        r3 = r7.options;	 Catch:{ TaskCancelledException -> 0x00fd }
        r3 = r3.isCacheInMemory();	 Catch:{ TaskCancelledException -> 0x00fd }
        if (r3 == 0) goto L_0x00b1;	 Catch:{ TaskCancelledException -> 0x00fd }
    L_0x009d:
        r3 = "Cache image in memory [%s]";	 Catch:{ TaskCancelledException -> 0x00fd }
        r4 = new java.lang.Object[r2];	 Catch:{ TaskCancelledException -> 0x00fd }
        r6 = r7.memoryCacheKey;	 Catch:{ TaskCancelledException -> 0x00fd }
        r4[r5] = r6;	 Catch:{ TaskCancelledException -> 0x00fd }
        com.nostra13.universalimageloader.utils.C0778L.m1428d(r3, r4);	 Catch:{ TaskCancelledException -> 0x00fd }
        r3 = r7.configuration;	 Catch:{ TaskCancelledException -> 0x00fd }
        r3 = r3.memoryCache;	 Catch:{ TaskCancelledException -> 0x00fd }
        r4 = r7.memoryCacheKey;	 Catch:{ TaskCancelledException -> 0x00fd }
        r3.put(r4, r1);	 Catch:{ TaskCancelledException -> 0x00fd }
    L_0x00b1:
        if (r1 == 0) goto L_0x00dd;	 Catch:{ TaskCancelledException -> 0x00fd }
    L_0x00b3:
        r3 = r7.options;	 Catch:{ TaskCancelledException -> 0x00fd }
        r3 = r3.shouldPostProcess();	 Catch:{ TaskCancelledException -> 0x00fd }
        if (r3 == 0) goto L_0x00dd;	 Catch:{ TaskCancelledException -> 0x00fd }
    L_0x00bb:
        r3 = "PostProcess image before displaying [%s]";	 Catch:{ TaskCancelledException -> 0x00fd }
        r4 = new java.lang.Object[r2];	 Catch:{ TaskCancelledException -> 0x00fd }
        r6 = r7.memoryCacheKey;	 Catch:{ TaskCancelledException -> 0x00fd }
        r4[r5] = r6;	 Catch:{ TaskCancelledException -> 0x00fd }
        com.nostra13.universalimageloader.utils.C0778L.m1428d(r3, r4);	 Catch:{ TaskCancelledException -> 0x00fd }
        r3 = r7.options;	 Catch:{ TaskCancelledException -> 0x00fd }
        r3 = r3.getPostProcessor();	 Catch:{ TaskCancelledException -> 0x00fd }
        r1 = r3.process(r1);	 Catch:{ TaskCancelledException -> 0x00fd }
        if (r1 != 0) goto L_0x00dd;	 Catch:{ TaskCancelledException -> 0x00fd }
    L_0x00d2:
        r3 = "Post-processor returned null [%s]";	 Catch:{ TaskCancelledException -> 0x00fd }
        r2 = new java.lang.Object[r2];	 Catch:{ TaskCancelledException -> 0x00fd }
        r4 = r7.memoryCacheKey;	 Catch:{ TaskCancelledException -> 0x00fd }
        r2[r5] = r4;	 Catch:{ TaskCancelledException -> 0x00fd }
        com.nostra13.universalimageloader.utils.C0778L.m1429e(r3, r2);	 Catch:{ TaskCancelledException -> 0x00fd }
    L_0x00dd:
        r7.checkTaskNotActual();	 Catch:{ TaskCancelledException -> 0x00fd }
        r7.checkTaskInterrupted();	 Catch:{ TaskCancelledException -> 0x00fd }
        r0.unlock();
        r0 = new com.nostra13.universalimageloader.core.DisplayBitmapTask;
        r2 = r7.imageLoadingInfo;
        r3 = r7.engine;
        r4 = r7.loadedFrom;
        r0.<init>(r1, r2, r3, r4);
        r1 = r7.syncLoading;
        r2 = r7.handler;
        r3 = r7.engine;
        runTask(r0, r1, r2, r3);
        return;
    L_0x00fb:
        r1 = move-exception;
        goto L_0x0104;
    L_0x00fd:
        r7.fireCancelEvent();	 Catch:{ all -> 0x00fb }
        r0.unlock();
        return;
    L_0x0104:
        r0.unlock();
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nostra13.universalimageloader.core.LoadAndDisplayImageTask.run():void");
    }

    private boolean waitIfPaused() {
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
        r6 = this;
        r0 = r6.engine;
        r0 = r0.getPause();
        r1 = r0.get();
        if (r1 == 0) goto L_0x004d;
    L_0x000c:
        r1 = r6.engine;
        r1 = r1.getPauseLock();
        monitor-enter(r1);
        r0 = r0.get();	 Catch:{ all -> 0x004a }
        if (r0 == 0) goto L_0x0048;	 Catch:{ all -> 0x004a }
    L_0x0019:
        r0 = "ImageLoader is paused. Waiting...  [%s]";	 Catch:{ all -> 0x004a }
        r2 = 1;	 Catch:{ all -> 0x004a }
        r3 = new java.lang.Object[r2];	 Catch:{ all -> 0x004a }
        r4 = r6.memoryCacheKey;	 Catch:{ all -> 0x004a }
        r5 = 0;	 Catch:{ all -> 0x004a }
        r3[r5] = r4;	 Catch:{ all -> 0x004a }
        com.nostra13.universalimageloader.utils.C0778L.m1428d(r0, r3);	 Catch:{ all -> 0x004a }
        r0 = r6.engine;	 Catch:{ InterruptedException -> 0x003b }
        r0 = r0.getPauseLock();	 Catch:{ InterruptedException -> 0x003b }
        r0.wait();	 Catch:{ InterruptedException -> 0x003b }
        r0 = ".. Resume loading [%s]";	 Catch:{ all -> 0x004a }
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x004a }
        r3 = r6.memoryCacheKey;	 Catch:{ all -> 0x004a }
        r2[r5] = r3;	 Catch:{ all -> 0x004a }
        com.nostra13.universalimageloader.utils.C0778L.m1428d(r0, r2);	 Catch:{ all -> 0x004a }
        goto L_0x0048;	 Catch:{ all -> 0x004a }
    L_0x003b:
        r0 = "Task was interrupted [%s]";	 Catch:{ all -> 0x004a }
        r3 = new java.lang.Object[r2];	 Catch:{ all -> 0x004a }
        r4 = r6.memoryCacheKey;	 Catch:{ all -> 0x004a }
        r3[r5] = r4;	 Catch:{ all -> 0x004a }
        com.nostra13.universalimageloader.utils.C0778L.m1429e(r0, r3);	 Catch:{ all -> 0x004a }
        monitor-exit(r1);	 Catch:{ all -> 0x004a }
        return r2;	 Catch:{ all -> 0x004a }
    L_0x0048:
        monitor-exit(r1);	 Catch:{ all -> 0x004a }
        goto L_0x004d;	 Catch:{ all -> 0x004a }
    L_0x004a:
        r0 = move-exception;	 Catch:{ all -> 0x004a }
        monitor-exit(r1);	 Catch:{ all -> 0x004a }
        throw r0;
    L_0x004d:
        r0 = r6.isTaskNotActual();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nostra13.universalimageloader.core.LoadAndDisplayImageTask.waitIfPaused():boolean");
    }

    private boolean delayIfNeed() {
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
        r5 = this;
        r0 = r5.options;
        r0 = r0.shouldDelayBeforeLoading();
        r1 = 0;
        if (r0 == 0) goto L_0x003d;
    L_0x0009:
        r0 = "Delay %d ms before loading...  [%s]";
        r2 = 2;
        r2 = new java.lang.Object[r2];
        r3 = r5.options;
        r3 = r3.getDelayBeforeLoading();
        r3 = java.lang.Integer.valueOf(r3);
        r2[r1] = r3;
        r3 = r5.memoryCacheKey;
        r4 = 1;
        r2[r4] = r3;
        com.nostra13.universalimageloader.utils.C0778L.m1428d(r0, r2);
        r0 = r5.options;	 Catch:{ InterruptedException -> 0x0031 }
        r0 = r0.getDelayBeforeLoading();	 Catch:{ InterruptedException -> 0x0031 }
        r2 = (long) r0;	 Catch:{ InterruptedException -> 0x0031 }
        java.lang.Thread.sleep(r2);	 Catch:{ InterruptedException -> 0x0031 }
        r0 = r5.isTaskNotActual();
        return r0;
    L_0x0031:
        r0 = "Task was interrupted [%s]";
        r2 = new java.lang.Object[r4];
        r3 = r5.memoryCacheKey;
        r2[r1] = r3;
        com.nostra13.universalimageloader.utils.C0778L.m1429e(r0, r2);
        return r4;
    L_0x003d:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nostra13.universalimageloader.core.LoadAndDisplayImageTask.delayIfNeed():boolean");
    }

    private android.graphics.Bitmap tryLoadBitmap() {
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
        r10 = this;
        r0 = 0;
        r1 = r10.configuration;	 Catch:{ IllegalStateException -> 0x00e2, TaskCancelledException -> 0x00e0, IOException -> 0x00d3, OutOfMemoryError -> 0x00c6, Throwable -> 0x00b9 }
        r1 = r1.diskCache;	 Catch:{ IllegalStateException -> 0x00e2, TaskCancelledException -> 0x00e0, IOException -> 0x00d3, OutOfMemoryError -> 0x00c6, Throwable -> 0x00b9 }
        r2 = r10.uri;	 Catch:{ IllegalStateException -> 0x00e2, TaskCancelledException -> 0x00e0, IOException -> 0x00d3, OutOfMemoryError -> 0x00c6, Throwable -> 0x00b9 }
        r1 = r1.get(r2);	 Catch:{ IllegalStateException -> 0x00e2, TaskCancelledException -> 0x00e0, IOException -> 0x00d3, OutOfMemoryError -> 0x00c6, Throwable -> 0x00b9 }
        r2 = 0;	 Catch:{ IllegalStateException -> 0x00e2, TaskCancelledException -> 0x00e0, IOException -> 0x00d3, OutOfMemoryError -> 0x00c6, Throwable -> 0x00b9 }
        r3 = 1;	 Catch:{ IllegalStateException -> 0x00e2, TaskCancelledException -> 0x00e0, IOException -> 0x00d3, OutOfMemoryError -> 0x00c6, Throwable -> 0x00b9 }
        if (r1 == 0) goto L_0x0040;	 Catch:{ IllegalStateException -> 0x00e2, TaskCancelledException -> 0x00e0, IOException -> 0x00d3, OutOfMemoryError -> 0x00c6, Throwable -> 0x00b9 }
    L_0x000f:
        r4 = r1.exists();	 Catch:{ IllegalStateException -> 0x00e2, TaskCancelledException -> 0x00e0, IOException -> 0x00d3, OutOfMemoryError -> 0x00c6, Throwable -> 0x00b9 }
        if (r4 == 0) goto L_0x0040;	 Catch:{ IllegalStateException -> 0x00e2, TaskCancelledException -> 0x00e0, IOException -> 0x00d3, OutOfMemoryError -> 0x00c6, Throwable -> 0x00b9 }
    L_0x0015:
        r4 = r1.length();	 Catch:{ IllegalStateException -> 0x00e2, TaskCancelledException -> 0x00e0, IOException -> 0x00d3, OutOfMemoryError -> 0x00c6, Throwable -> 0x00b9 }
        r6 = 0;	 Catch:{ IllegalStateException -> 0x00e2, TaskCancelledException -> 0x00e0, IOException -> 0x00d3, OutOfMemoryError -> 0x00c6, Throwable -> 0x00b9 }
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));	 Catch:{ IllegalStateException -> 0x00e2, TaskCancelledException -> 0x00e0, IOException -> 0x00d3, OutOfMemoryError -> 0x00c6, Throwable -> 0x00b9 }
        if (r8 <= 0) goto L_0x0040;	 Catch:{ IllegalStateException -> 0x00e2, TaskCancelledException -> 0x00e0, IOException -> 0x00d3, OutOfMemoryError -> 0x00c6, Throwable -> 0x00b9 }
    L_0x001f:
        r4 = "Load image from disk cache [%s]";	 Catch:{ IllegalStateException -> 0x00e2, TaskCancelledException -> 0x00e0, IOException -> 0x00d3, OutOfMemoryError -> 0x00c6, Throwable -> 0x00b9 }
        r5 = new java.lang.Object[r3];	 Catch:{ IllegalStateException -> 0x00e2, TaskCancelledException -> 0x00e0, IOException -> 0x00d3, OutOfMemoryError -> 0x00c6, Throwable -> 0x00b9 }
        r6 = r10.memoryCacheKey;	 Catch:{ IllegalStateException -> 0x00e2, TaskCancelledException -> 0x00e0, IOException -> 0x00d3, OutOfMemoryError -> 0x00c6, Throwable -> 0x00b9 }
        r5[r2] = r6;	 Catch:{ IllegalStateException -> 0x00e2, TaskCancelledException -> 0x00e0, IOException -> 0x00d3, OutOfMemoryError -> 0x00c6, Throwable -> 0x00b9 }
        com.nostra13.universalimageloader.utils.C0778L.m1428d(r4, r5);	 Catch:{ IllegalStateException -> 0x00e2, TaskCancelledException -> 0x00e0, IOException -> 0x00d3, OutOfMemoryError -> 0x00c6, Throwable -> 0x00b9 }
        r4 = com.nostra13.universalimageloader.core.assist.LoadedFrom.DISC_CACHE;	 Catch:{ IllegalStateException -> 0x00e2, TaskCancelledException -> 0x00e0, IOException -> 0x00d3, OutOfMemoryError -> 0x00c6, Throwable -> 0x00b9 }
        r10.loadedFrom = r4;	 Catch:{ IllegalStateException -> 0x00e2, TaskCancelledException -> 0x00e0, IOException -> 0x00d3, OutOfMemoryError -> 0x00c6, Throwable -> 0x00b9 }
        r10.checkTaskNotActual();	 Catch:{ IllegalStateException -> 0x00e2, TaskCancelledException -> 0x00e0, IOException -> 0x00d3, OutOfMemoryError -> 0x00c6, Throwable -> 0x00b9 }
        r4 = com.nostra13.universalimageloader.core.download.ImageDownloader.Scheme.FILE;	 Catch:{ IllegalStateException -> 0x00e2, TaskCancelledException -> 0x00e0, IOException -> 0x00d3, OutOfMemoryError -> 0x00c6, Throwable -> 0x00b9 }
        r1 = r1.getAbsolutePath();	 Catch:{ IllegalStateException -> 0x00e2, TaskCancelledException -> 0x00e0, IOException -> 0x00d3, OutOfMemoryError -> 0x00c6, Throwable -> 0x00b9 }
        r1 = r4.wrap(r1);	 Catch:{ IllegalStateException -> 0x00e2, TaskCancelledException -> 0x00e0, IOException -> 0x00d3, OutOfMemoryError -> 0x00c6, Throwable -> 0x00b9 }
        r1 = r10.decodeImage(r1);	 Catch:{ IllegalStateException -> 0x00e2, TaskCancelledException -> 0x00e0, IOException -> 0x00d3, OutOfMemoryError -> 0x00c6, Throwable -> 0x00b9 }
        goto L_0x0041;
    L_0x0040:
        r1 = r0;
    L_0x0041:
        if (r1 == 0) goto L_0x0059;
    L_0x0043:
        r4 = r1.getWidth();	 Catch:{ IllegalStateException -> 0x00e3, TaskCancelledException -> 0x00e0, IOException -> 0x0056, OutOfMemoryError -> 0x0053, Throwable -> 0x0050 }
        if (r4 <= 0) goto L_0x0059;	 Catch:{ IllegalStateException -> 0x00e3, TaskCancelledException -> 0x00e0, IOException -> 0x0056, OutOfMemoryError -> 0x0053, Throwable -> 0x0050 }
    L_0x0049:
        r4 = r1.getHeight();	 Catch:{ IllegalStateException -> 0x00e3, TaskCancelledException -> 0x00e0, IOException -> 0x0056, OutOfMemoryError -> 0x0053, Throwable -> 0x0050 }
        if (r4 > 0) goto L_0x00e8;	 Catch:{ IllegalStateException -> 0x00e3, TaskCancelledException -> 0x00e0, IOException -> 0x0056, OutOfMemoryError -> 0x0053, Throwable -> 0x0050 }
    L_0x004f:
        goto L_0x0059;	 Catch:{ IllegalStateException -> 0x00e3, TaskCancelledException -> 0x00e0, IOException -> 0x0056, OutOfMemoryError -> 0x0053, Throwable -> 0x0050 }
    L_0x0050:
        r0 = move-exception;	 Catch:{ IllegalStateException -> 0x00e3, TaskCancelledException -> 0x00e0, IOException -> 0x0056, OutOfMemoryError -> 0x0053, Throwable -> 0x0050 }
        goto L_0x00bd;	 Catch:{ IllegalStateException -> 0x00e3, TaskCancelledException -> 0x00e0, IOException -> 0x0056, OutOfMemoryError -> 0x0053, Throwable -> 0x0050 }
    L_0x0053:
        r0 = move-exception;	 Catch:{ IllegalStateException -> 0x00e3, TaskCancelledException -> 0x00e0, IOException -> 0x0056, OutOfMemoryError -> 0x0053, Throwable -> 0x0050 }
        goto L_0x00ca;	 Catch:{ IllegalStateException -> 0x00e3, TaskCancelledException -> 0x00e0, IOException -> 0x0056, OutOfMemoryError -> 0x0053, Throwable -> 0x0050 }
    L_0x0056:
        r0 = move-exception;	 Catch:{ IllegalStateException -> 0x00e3, TaskCancelledException -> 0x00e0, IOException -> 0x0056, OutOfMemoryError -> 0x0053, Throwable -> 0x0050 }
        goto L_0x00d7;	 Catch:{ IllegalStateException -> 0x00e3, TaskCancelledException -> 0x00e0, IOException -> 0x0056, OutOfMemoryError -> 0x0053, Throwable -> 0x0050 }
    L_0x0059:
        r4 = "Load image from network [%s]";	 Catch:{ IllegalStateException -> 0x00e3, TaskCancelledException -> 0x00e0, IOException -> 0x0056, OutOfMemoryError -> 0x0053, Throwable -> 0x0050 }
        r3 = new java.lang.Object[r3];	 Catch:{ IllegalStateException -> 0x00e3, TaskCancelledException -> 0x00e0, IOException -> 0x0056, OutOfMemoryError -> 0x0053, Throwable -> 0x0050 }
        r5 = r10.memoryCacheKey;	 Catch:{ IllegalStateException -> 0x00e3, TaskCancelledException -> 0x00e0, IOException -> 0x0056, OutOfMemoryError -> 0x0053, Throwable -> 0x0050 }
        r3[r2] = r5;	 Catch:{ IllegalStateException -> 0x00e3, TaskCancelledException -> 0x00e0, IOException -> 0x0056, OutOfMemoryError -> 0x0053, Throwable -> 0x0050 }
        com.nostra13.universalimageloader.utils.C0778L.m1428d(r4, r3);	 Catch:{ IllegalStateException -> 0x00e3, TaskCancelledException -> 0x00e0, IOException -> 0x0056, OutOfMemoryError -> 0x0053, Throwable -> 0x0050 }
        r2 = com.nostra13.universalimageloader.core.assist.LoadedFrom.NETWORK;	 Catch:{ IllegalStateException -> 0x00e3, TaskCancelledException -> 0x00e0, IOException -> 0x0056, OutOfMemoryError -> 0x0053, Throwable -> 0x0050 }
        r10.loadedFrom = r2;	 Catch:{ IllegalStateException -> 0x00e3, TaskCancelledException -> 0x00e0, IOException -> 0x0056, OutOfMemoryError -> 0x0053, Throwable -> 0x0050 }
        r2 = r10.uri;	 Catch:{ IllegalStateException -> 0x00e3, TaskCancelledException -> 0x00e0, IOException -> 0x0056, OutOfMemoryError -> 0x0053, Throwable -> 0x0050 }
        r3 = r10.options;	 Catch:{ IllegalStateException -> 0x00e3, TaskCancelledException -> 0x00e0, IOException -> 0x0056, OutOfMemoryError -> 0x0053, Throwable -> 0x0050 }
        r3 = r3.isCacheOnDisk();	 Catch:{ IllegalStateException -> 0x00e3, TaskCancelledException -> 0x00e0, IOException -> 0x0056, OutOfMemoryError -> 0x0053, Throwable -> 0x0050 }
        if (r3 == 0) goto L_0x008e;	 Catch:{ IllegalStateException -> 0x00e3, TaskCancelledException -> 0x00e0, IOException -> 0x0056, OutOfMemoryError -> 0x0053, Throwable -> 0x0050 }
    L_0x0072:
        r3 = r10.tryCacheImageOnDisk();	 Catch:{ IllegalStateException -> 0x00e3, TaskCancelledException -> 0x00e0, IOException -> 0x0056, OutOfMemoryError -> 0x0053, Throwable -> 0x0050 }
        if (r3 == 0) goto L_0x008e;	 Catch:{ IllegalStateException -> 0x00e3, TaskCancelledException -> 0x00e0, IOException -> 0x0056, OutOfMemoryError -> 0x0053, Throwable -> 0x0050 }
    L_0x0078:
        r3 = r10.configuration;	 Catch:{ IllegalStateException -> 0x00e3, TaskCancelledException -> 0x00e0, IOException -> 0x0056, OutOfMemoryError -> 0x0053, Throwable -> 0x0050 }
        r3 = r3.diskCache;	 Catch:{ IllegalStateException -> 0x00e3, TaskCancelledException -> 0x00e0, IOException -> 0x0056, OutOfMemoryError -> 0x0053, Throwable -> 0x0050 }
        r4 = r10.uri;	 Catch:{ IllegalStateException -> 0x00e3, TaskCancelledException -> 0x00e0, IOException -> 0x0056, OutOfMemoryError -> 0x0053, Throwable -> 0x0050 }
        r3 = r3.get(r4);	 Catch:{ IllegalStateException -> 0x00e3, TaskCancelledException -> 0x00e0, IOException -> 0x0056, OutOfMemoryError -> 0x0053, Throwable -> 0x0050 }
        if (r3 == 0) goto L_0x008e;	 Catch:{ IllegalStateException -> 0x00e3, TaskCancelledException -> 0x00e0, IOException -> 0x0056, OutOfMemoryError -> 0x0053, Throwable -> 0x0050 }
    L_0x0084:
        r2 = com.nostra13.universalimageloader.core.download.ImageDownloader.Scheme.FILE;	 Catch:{ IllegalStateException -> 0x00e3, TaskCancelledException -> 0x00e0, IOException -> 0x0056, OutOfMemoryError -> 0x0053, Throwable -> 0x0050 }
        r3 = r3.getAbsolutePath();	 Catch:{ IllegalStateException -> 0x00e3, TaskCancelledException -> 0x00e0, IOException -> 0x0056, OutOfMemoryError -> 0x0053, Throwable -> 0x0050 }
        r2 = r2.wrap(r3);	 Catch:{ IllegalStateException -> 0x00e3, TaskCancelledException -> 0x00e0, IOException -> 0x0056, OutOfMemoryError -> 0x0053, Throwable -> 0x0050 }
    L_0x008e:
        r10.checkTaskNotActual();	 Catch:{ IllegalStateException -> 0x00e3, TaskCancelledException -> 0x00e0, IOException -> 0x0056, OutOfMemoryError -> 0x0053, Throwable -> 0x0050 }
        r2 = r10.decodeImage(r2);	 Catch:{ IllegalStateException -> 0x00e3, TaskCancelledException -> 0x00e0, IOException -> 0x0056, OutOfMemoryError -> 0x0053, Throwable -> 0x0050 }
        if (r2 == 0) goto L_0x00b2;
    L_0x0097:
        r1 = r2.getWidth();	 Catch:{ IllegalStateException -> 0x00b0, TaskCancelledException -> 0x00e0, IOException -> 0x00ac, OutOfMemoryError -> 0x00a8, Throwable -> 0x00a4 }
        if (r1 <= 0) goto L_0x00b2;	 Catch:{ IllegalStateException -> 0x00b0, TaskCancelledException -> 0x00e0, IOException -> 0x00ac, OutOfMemoryError -> 0x00a8, Throwable -> 0x00a4 }
    L_0x009d:
        r1 = r2.getHeight();	 Catch:{ IllegalStateException -> 0x00b0, TaskCancelledException -> 0x00e0, IOException -> 0x00ac, OutOfMemoryError -> 0x00a8, Throwable -> 0x00a4 }
        if (r1 > 0) goto L_0x00b7;	 Catch:{ IllegalStateException -> 0x00b0, TaskCancelledException -> 0x00e0, IOException -> 0x00ac, OutOfMemoryError -> 0x00a8, Throwable -> 0x00a4 }
    L_0x00a3:
        goto L_0x00b2;	 Catch:{ IllegalStateException -> 0x00b0, TaskCancelledException -> 0x00e0, IOException -> 0x00ac, OutOfMemoryError -> 0x00a8, Throwable -> 0x00a4 }
    L_0x00a4:
        r1 = move-exception;	 Catch:{ IllegalStateException -> 0x00b0, TaskCancelledException -> 0x00e0, IOException -> 0x00ac, OutOfMemoryError -> 0x00a8, Throwable -> 0x00a4 }
        r0 = r1;	 Catch:{ IllegalStateException -> 0x00b0, TaskCancelledException -> 0x00e0, IOException -> 0x00ac, OutOfMemoryError -> 0x00a8, Throwable -> 0x00a4 }
        r1 = r2;	 Catch:{ IllegalStateException -> 0x00b0, TaskCancelledException -> 0x00e0, IOException -> 0x00ac, OutOfMemoryError -> 0x00a8, Throwable -> 0x00a4 }
        goto L_0x00bd;	 Catch:{ IllegalStateException -> 0x00b0, TaskCancelledException -> 0x00e0, IOException -> 0x00ac, OutOfMemoryError -> 0x00a8, Throwable -> 0x00a4 }
    L_0x00a8:
        r1 = move-exception;	 Catch:{ IllegalStateException -> 0x00b0, TaskCancelledException -> 0x00e0, IOException -> 0x00ac, OutOfMemoryError -> 0x00a8, Throwable -> 0x00a4 }
        r0 = r1;	 Catch:{ IllegalStateException -> 0x00b0, TaskCancelledException -> 0x00e0, IOException -> 0x00ac, OutOfMemoryError -> 0x00a8, Throwable -> 0x00a4 }
        r1 = r2;	 Catch:{ IllegalStateException -> 0x00b0, TaskCancelledException -> 0x00e0, IOException -> 0x00ac, OutOfMemoryError -> 0x00a8, Throwable -> 0x00a4 }
        goto L_0x00ca;	 Catch:{ IllegalStateException -> 0x00b0, TaskCancelledException -> 0x00e0, IOException -> 0x00ac, OutOfMemoryError -> 0x00a8, Throwable -> 0x00a4 }
    L_0x00ac:
        r1 = move-exception;	 Catch:{ IllegalStateException -> 0x00b0, TaskCancelledException -> 0x00e0, IOException -> 0x00ac, OutOfMemoryError -> 0x00a8, Throwable -> 0x00a4 }
        r0 = r1;	 Catch:{ IllegalStateException -> 0x00b0, TaskCancelledException -> 0x00e0, IOException -> 0x00ac, OutOfMemoryError -> 0x00a8, Throwable -> 0x00a4 }
        r1 = r2;	 Catch:{ IllegalStateException -> 0x00b0, TaskCancelledException -> 0x00e0, IOException -> 0x00ac, OutOfMemoryError -> 0x00a8, Throwable -> 0x00a4 }
        goto L_0x00d7;	 Catch:{ IllegalStateException -> 0x00b0, TaskCancelledException -> 0x00e0, IOException -> 0x00ac, OutOfMemoryError -> 0x00a8, Throwable -> 0x00a4 }
    L_0x00b0:
        r1 = r2;	 Catch:{ IllegalStateException -> 0x00b0, TaskCancelledException -> 0x00e0, IOException -> 0x00ac, OutOfMemoryError -> 0x00a8, Throwable -> 0x00a4 }
        goto L_0x00e3;	 Catch:{ IllegalStateException -> 0x00b0, TaskCancelledException -> 0x00e0, IOException -> 0x00ac, OutOfMemoryError -> 0x00a8, Throwable -> 0x00a4 }
    L_0x00b2:
        r1 = com.nostra13.universalimageloader.core.assist.FailReason.FailType.DECODING_ERROR;	 Catch:{ IllegalStateException -> 0x00b0, TaskCancelledException -> 0x00e0, IOException -> 0x00ac, OutOfMemoryError -> 0x00a8, Throwable -> 0x00a4 }
        r10.fireFailEvent(r1, r0);	 Catch:{ IllegalStateException -> 0x00b0, TaskCancelledException -> 0x00e0, IOException -> 0x00ac, OutOfMemoryError -> 0x00a8, Throwable -> 0x00a4 }
    L_0x00b7:
        r1 = r2;
        goto L_0x00e8;
    L_0x00b9:
        r1 = move-exception;
        r9 = r1;
        r1 = r0;
        r0 = r9;
    L_0x00bd:
        com.nostra13.universalimageloader.utils.C0778L.m1430e(r0);
        r2 = com.nostra13.universalimageloader.core.assist.FailReason.FailType.UNKNOWN;
        r10.fireFailEvent(r2, r0);
        goto L_0x00e8;
    L_0x00c6:
        r1 = move-exception;
        r9 = r1;
        r1 = r0;
        r0 = r9;
    L_0x00ca:
        com.nostra13.universalimageloader.utils.C0778L.m1430e(r0);
        r2 = com.nostra13.universalimageloader.core.assist.FailReason.FailType.OUT_OF_MEMORY;
        r10.fireFailEvent(r2, r0);
        goto L_0x00e8;
    L_0x00d3:
        r1 = move-exception;
        r9 = r1;
        r1 = r0;
        r0 = r9;
    L_0x00d7:
        com.nostra13.universalimageloader.utils.C0778L.m1430e(r0);
        r2 = com.nostra13.universalimageloader.core.assist.FailReason.FailType.IO_ERROR;
        r10.fireFailEvent(r2, r0);
        goto L_0x00e8;
    L_0x00e0:
        r0 = move-exception;
        throw r0;
    L_0x00e2:
        r1 = r0;
    L_0x00e3:
        r2 = com.nostra13.universalimageloader.core.assist.FailReason.FailType.NETWORK_DENIED;
        r10.fireFailEvent(r2, r0);
    L_0x00e8:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nostra13.universalimageloader.core.LoadAndDisplayImageTask.tryLoadBitmap():android.graphics.Bitmap");
    }

    private Bitmap decodeImage(String str) {
        String str2 = str;
        return this.decoder.decode(new ImageDecodingInfo(this.memoryCacheKey, str2, this.uri, this.targetSize, this.imageAware.getScaleType(), getDownloader(), this.options));
    }

    private boolean tryCacheImageOnDisk() {
        C0778L.m1428d(LOG_CACHE_IMAGE_ON_DISK, this.memoryCacheKey);
        try {
            boolean downloadImage = downloadImage();
            if (!downloadImage) {
                return downloadImage;
            }
            int i = this.configuration.maxImageWidthForDiskCache;
            int i2 = this.configuration.maxImageHeightForDiskCache;
            if (i <= 0 && i2 <= 0) {
                return downloadImage;
            }
            C0778L.m1428d(LOG_RESIZE_CACHED_IMAGE_FILE, this.memoryCacheKey);
            resizeAndSaveImage(i, i2);
            return downloadImage;
        } catch (Throwable e) {
            C0778L.m1430e(e);
            return false;
        }
    }

    private boolean downloadImage() {
        Closeable stream = getDownloader().getStream(this.uri, this.options.getExtraForDownloader());
        if (stream == null) {
            C0778L.m1429e(ERROR_NO_IMAGE_STREAM, this.memoryCacheKey);
            return false;
        }
        try {
            boolean save = this.configuration.diskCache.save(this.uri, stream, this);
            return save;
        } finally {
            IoUtils.closeSilently(stream);
        }
    }

    private boolean resizeAndSaveImage(int i, int i2) {
        File file = this.configuration.diskCache.get(this.uri);
        if (file == null || !file.exists()) {
            return false;
        }
        i = this.decoder.decode(new ImageDecodingInfo(this.memoryCacheKey, Scheme.FILE.wrap(file.getAbsolutePath()), this.uri, new ImageSize(i, i2), ViewScaleType.FIT_INSIDE, getDownloader(), new Builder().cloneFrom(this.options).imageScaleType(ImageScaleType.IN_SAMPLE_INT).build()));
        if (!(i == 0 || this.configuration.processorForDiskCache == 0)) {
            C0778L.m1428d(LOG_PROCESS_IMAGE_BEFORE_CACHE_ON_DISK, this.memoryCacheKey);
            i = this.configuration.processorForDiskCache.process(i);
            if (i == 0) {
                C0778L.m1429e(ERROR_PROCESSOR_FOR_DISK_CACHE_NULL, this.memoryCacheKey);
            }
        }
        if (i == 0) {
            return false;
        }
        boolean save = this.configuration.diskCache.save(this.uri, i);
        i.recycle();
        return save;
    }

    public boolean onBytesCopied(int i, int i2) {
        if (!this.syncLoading) {
            if (fireProgressEvent(i, i2) == 0) {
                return false;
            }
        }
        return true;
    }

    private boolean fireProgressEvent(final int i, final int i2) {
        if (!isTaskInterrupted()) {
            if (!isTaskNotActual()) {
                if (this.progressListener != null) {
                    runTask(new Runnable() {
                        public void run() {
                            LoadAndDisplayImageTask.this.progressListener.onProgressUpdate(LoadAndDisplayImageTask.this.uri, LoadAndDisplayImageTask.this.imageAware.getWrappedView(), i, i2);
                        }
                    }, false, this.handler, this.engine);
                }
                return true;
            }
        }
        return false;
    }

    private void fireFailEvent(final FailType failType, final Throwable th) {
        if (!(this.syncLoading || isTaskInterrupted())) {
            if (!isTaskNotActual()) {
                runTask(new Runnable() {
                    public void run() {
                        if (LoadAndDisplayImageTask.this.options.shouldShowImageOnFail()) {
                            LoadAndDisplayImageTask.this.imageAware.setImageDrawable(LoadAndDisplayImageTask.this.options.getImageOnFail(LoadAndDisplayImageTask.this.configuration.resources));
                        }
                        LoadAndDisplayImageTask.this.listener.onLoadingFailed(LoadAndDisplayImageTask.this.uri, LoadAndDisplayImageTask.this.imageAware.getWrappedView(), new FailReason(failType, th));
                    }
                }, null, this.handler, this.engine);
            }
        }
    }

    private void fireCancelEvent() {
        if (!this.syncLoading) {
            if (!isTaskInterrupted()) {
                runTask(new C07733(), false, this.handler, this.engine);
            }
        }
    }

    private ImageDownloader getDownloader() {
        if (this.engine.isNetworkDenied()) {
            return this.networkDeniedDownloader;
        }
        if (this.engine.isSlowNetwork()) {
            return this.slowNetworkDownloader;
        }
        return this.downloader;
    }

    private void checkTaskNotActual() {
        checkViewCollected();
        checkViewReused();
    }

    private boolean isTaskNotActual() {
        if (!isViewCollected()) {
            if (!isViewReused()) {
                return false;
            }
        }
        return true;
    }

    private void checkViewCollected() {
        if (isViewCollected()) {
            throw new TaskCancelledException();
        }
    }

    private boolean isViewCollected() {
        if (!this.imageAware.isCollected()) {
            return false;
        }
        C0778L.m1428d(LOG_TASK_CANCELLED_IMAGEAWARE_COLLECTED, this.memoryCacheKey);
        return true;
    }

    private void checkViewReused() {
        if (isViewReused()) {
            throw new TaskCancelledException();
        }
    }

    private boolean isViewReused() {
        if ((this.memoryCacheKey.equals(this.engine.getLoadingUriForView(this.imageAware)) ^ 1) == 0) {
            return false;
        }
        C0778L.m1428d(LOG_TASK_CANCELLED_IMAGEAWARE_REUSED, this.memoryCacheKey);
        return true;
    }

    private void checkTaskInterrupted() {
        if (isTaskInterrupted()) {
            throw new TaskCancelledException();
        }
    }

    private boolean isTaskInterrupted() {
        if (!Thread.interrupted()) {
            return false;
        }
        C0778L.m1428d(LOG_TASK_INTERRUPTED, this.memoryCacheKey);
        return true;
    }

    String getLoadingUri() {
        return this.uri;
    }

    static void runTask(Runnable runnable, boolean z, Handler handler, ImageLoaderEngine imageLoaderEngine) {
        if (z) {
            runnable.run();
        } else if (handler == null) {
            imageLoaderEngine.fireCallback(runnable);
        } else {
            handler.post(runnable);
        }
    }
}
