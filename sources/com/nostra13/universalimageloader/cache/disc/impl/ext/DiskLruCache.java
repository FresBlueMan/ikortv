package com.nostra13.universalimageloader.cache.disc.impl.ext;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

final class DiskLruCache implements Closeable {
    static final long ANY_SEQUENCE_NUMBER = -1;
    private static final String CLEAN = "CLEAN";
    private static final String DIRTY = "DIRTY";
    static final String JOURNAL_FILE = "journal";
    static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    static final String JOURNAL_FILE_TEMP = "journal.tmp";
    static final Pattern LEGAL_KEY_PATTERN = Pattern.compile("[a-z0-9_-]{1,64}");
    static final String MAGIC = "libcore.io.DiskLruCache";
    private static final OutputStream NULL_OUTPUT_STREAM = new C07652();
    private static final String READ = "READ";
    private static final String REMOVE = "REMOVE";
    static final String VERSION_1 = "1";
    private final int appVersion;
    private final Callable<Void> cleanupCallable = new C07641();
    private final File directory;
    final ThreadPoolExecutor executorService = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private int fileCount = 0;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    private Writer journalWriter;
    private final LinkedHashMap<String, Entry> lruEntries = new LinkedHashMap(0, 0.75f, true);
    private int maxFileCount;
    private long maxSize;
    private long nextSequenceNumber = 0;
    private int redundantOpCount;
    private long size = 0;
    private final int valueCount;

    /* renamed from: com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache$1 */
    class C07641 implements Callable<Void> {
        C07641() {
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() {
            /*
            r4 = this;
            r0 = com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.this;
            monitor-enter(r0);
            r1 = com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.this;	 Catch:{ all -> 0x002d }
            r1 = r1.journalWriter;	 Catch:{ all -> 0x002d }
            r2 = 0;
            if (r1 != 0) goto L_0x000e;
        L_0x000c:
            monitor-exit(r0);	 Catch:{ all -> 0x002d }
            return r2;
        L_0x000e:
            r1 = com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.this;	 Catch:{ all -> 0x002d }
            r1.trimToSize();	 Catch:{ all -> 0x002d }
            r1 = com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.this;	 Catch:{ all -> 0x002d }
            r1.trimToFileCount();	 Catch:{ all -> 0x002d }
            r1 = com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.this;	 Catch:{ all -> 0x002d }
            r1 = r1.journalRebuildRequired();	 Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x002b;
        L_0x0020:
            r1 = com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.this;	 Catch:{ all -> 0x002d }
            r1.rebuildJournal();	 Catch:{ all -> 0x002d }
            r1 = com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.this;	 Catch:{ all -> 0x002d }
            r3 = 0;
            r1.redundantOpCount = r3;	 Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r0);	 Catch:{ all -> 0x002d }
            return r2;
        L_0x002d:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x002d }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.1.call():java.lang.Void");
        }
    }

    /* renamed from: com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache$2 */
    static class C07652 extends OutputStream {
        public void write(int i) {
        }

        C07652() {
        }
    }

    public final class Editor {
        private boolean committed;
        private final Entry entry;
        private boolean hasErrors;
        private final boolean[] written;

        private class FaultHidingOutputStream extends FilterOutputStream {
            private FaultHidingOutputStream(OutputStream outputStream) {
                super(outputStream);
            }

            public void write(int r2) {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/293907205.run(Unknown Source)
*/
                /*
                r1 = this;
                r0 = r1.out;	 Catch:{ IOException -> 0x0006 }
                r0.write(r2);	 Catch:{ IOException -> 0x0006 }
                goto L_0x000c;
            L_0x0006:
                r2 = com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.Editor.this;
                r0 = 1;
                r2.hasErrors = r0;
            L_0x000c:
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.Editor.FaultHidingOutputStream.write(int):void");
            }

            public void write(byte[] r2, int r3, int r4) {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/293907205.run(Unknown Source)
*/
                /*
                r1 = this;
                r0 = r1.out;	 Catch:{ IOException -> 0x0006 }
                r0.write(r2, r3, r4);	 Catch:{ IOException -> 0x0006 }
                goto L_0x000c;
            L_0x0006:
                r2 = com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.Editor.this;
                r3 = 1;
                r2.hasErrors = r3;
            L_0x000c:
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.Editor.FaultHidingOutputStream.write(byte[], int, int):void");
            }

            public void close() {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/293907205.run(Unknown Source)
*/
                /*
                r2 = this;
                r0 = r2.out;	 Catch:{ IOException -> 0x0006 }
                r0.close();	 Catch:{ IOException -> 0x0006 }
                goto L_0x000c;
            L_0x0006:
                r0 = com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.Editor.this;
                r1 = 1;
                r0.hasErrors = r1;
            L_0x000c:
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.Editor.FaultHidingOutputStream.close():void");
            }

            public void flush() {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/293907205.run(Unknown Source)
*/
                /*
                r2 = this;
                r0 = r2.out;	 Catch:{ IOException -> 0x0006 }
                r0.flush();	 Catch:{ IOException -> 0x0006 }
                goto L_0x000c;
            L_0x0006:
                r0 = com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.Editor.this;
                r1 = 1;
                r0.hasErrors = r1;
            L_0x000c:
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.Editor.FaultHidingOutputStream.flush():void");
            }
        }

        private Editor(Entry entry) {
            this.entry = entry;
            this.written = entry.readable != null ? null : new boolean[DiskLruCache.this.valueCount];
        }

        public java.io.InputStream newInputStream(int r5) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/293907205.run(Unknown Source)
*/
            /*
            r4 = this;
            r0 = com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.this;
            monitor-enter(r0);
            r1 = r4.entry;	 Catch:{ all -> 0x002b }
            r1 = r1.currentEditor;	 Catch:{ all -> 0x002b }
            if (r1 != r4) goto L_0x0025;	 Catch:{ all -> 0x002b }
        L_0x000b:
            r1 = r4.entry;	 Catch:{ all -> 0x002b }
            r1 = r1.readable;	 Catch:{ all -> 0x002b }
            r2 = 0;	 Catch:{ all -> 0x002b }
            if (r1 != 0) goto L_0x0016;	 Catch:{ all -> 0x002b }
        L_0x0014:
            monitor-exit(r0);	 Catch:{ all -> 0x002b }
            return r2;
        L_0x0016:
            r1 = new java.io.FileInputStream;	 Catch:{ FileNotFoundException -> 0x0023 }
            r3 = r4.entry;	 Catch:{ FileNotFoundException -> 0x0023 }
            r5 = r3.getCleanFile(r5);	 Catch:{ FileNotFoundException -> 0x0023 }
            r1.<init>(r5);	 Catch:{ FileNotFoundException -> 0x0023 }
            monitor-exit(r0);	 Catch:{ all -> 0x002b }
            return r1;	 Catch:{ all -> 0x002b }
        L_0x0023:
            monitor-exit(r0);	 Catch:{ all -> 0x002b }
            return r2;	 Catch:{ all -> 0x002b }
        L_0x0025:
            r5 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x002b }
            r5.<init>();	 Catch:{ all -> 0x002b }
            throw r5;	 Catch:{ all -> 0x002b }
        L_0x002b:
            r5 = move-exception;	 Catch:{ all -> 0x002b }
            monitor-exit(r0);	 Catch:{ all -> 0x002b }
            throw r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.Editor.newInputStream(int):java.io.InputStream");
        }

        public String getString(int i) {
            i = newInputStream(i);
            return i != 0 ? DiskLruCache.inputStreamToString(i) : 0;
        }

        public java.io.OutputStream newOutputStream(int r4) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/293907205.run(Unknown Source)
*/
            /*
            r3 = this;
            r0 = com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.this;
            monitor-enter(r0);
            r1 = r3.entry;	 Catch:{ all -> 0x0046 }
            r1 = r1.currentEditor;	 Catch:{ all -> 0x0046 }
            if (r1 != r3) goto L_0x0040;	 Catch:{ all -> 0x0046 }
        L_0x000b:
            r1 = r3.entry;	 Catch:{ all -> 0x0046 }
            r1 = r1.readable;	 Catch:{ all -> 0x0046 }
            if (r1 != 0) goto L_0x0018;	 Catch:{ all -> 0x0046 }
        L_0x0013:
            r1 = r3.written;	 Catch:{ all -> 0x0046 }
            r2 = 1;	 Catch:{ all -> 0x0046 }
            r1[r4] = r2;	 Catch:{ all -> 0x0046 }
        L_0x0018:
            r1 = r3.entry;	 Catch:{ all -> 0x0046 }
            r4 = r1.getDirtyFile(r4);	 Catch:{ all -> 0x0046 }
            r1 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x0024 }
            r1.<init>(r4);	 Catch:{ FileNotFoundException -> 0x0024 }
            goto L_0x0032;
        L_0x0024:
            r1 = com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.this;	 Catch:{ all -> 0x0046 }
            r1 = r1.directory;	 Catch:{ all -> 0x0046 }
            r1.mkdirs();	 Catch:{ all -> 0x0046 }
            r1 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x003a }
            r1.<init>(r4);	 Catch:{ FileNotFoundException -> 0x003a }
        L_0x0032:
            r4 = new com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache$Editor$FaultHidingOutputStream;	 Catch:{ all -> 0x0046 }
            r2 = 0;	 Catch:{ all -> 0x0046 }
            r4.<init>(r1);	 Catch:{ all -> 0x0046 }
            monitor-exit(r0);	 Catch:{ all -> 0x0046 }
            return r4;	 Catch:{ all -> 0x0046 }
        L_0x003a:
            r4 = com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.NULL_OUTPUT_STREAM;	 Catch:{ all -> 0x0046 }
            monitor-exit(r0);	 Catch:{ all -> 0x0046 }
            return r4;	 Catch:{ all -> 0x0046 }
        L_0x0040:
            r4 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0046 }
            r4.<init>();	 Catch:{ all -> 0x0046 }
            throw r4;	 Catch:{ all -> 0x0046 }
        L_0x0046:
            r4 = move-exception;	 Catch:{ all -> 0x0046 }
            monitor-exit(r0);	 Catch:{ all -> 0x0046 }
            throw r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.Editor.newOutputStream(int):java.io.OutputStream");
        }

        public void set(int i, String str) {
            Closeable closeable = null;
            try {
                Closeable outputStreamWriter = new OutputStreamWriter(newOutputStream(i), Util.UTF_8);
                try {
                    outputStreamWriter.write(str);
                    Util.closeQuietly(outputStreamWriter);
                } catch (Throwable th) {
                    i = th;
                    closeable = outputStreamWriter;
                    Util.closeQuietly(closeable);
                    throw i;
                }
            } catch (Throwable th2) {
                i = th2;
                Util.closeQuietly(closeable);
                throw i;
            }
        }

        public void commit() {
            if (this.hasErrors) {
                DiskLruCache.this.completeEdit(this, false);
                DiskLruCache.this.remove(this.entry.key);
            } else {
                DiskLruCache.this.completeEdit(this, true);
            }
            this.committed = true;
        }

        public void abort() {
            DiskLruCache.this.completeEdit(this, false);
        }

        public void abortUnlessCommitted() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/293907205.run(Unknown Source)
*/
            /*
            r1 = this;
            r0 = r1.committed;
            if (r0 != 0) goto L_0x0007;
        L_0x0004:
            r1.abort();	 Catch:{ IOException -> 0x0007 }
        L_0x0007:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.Editor.abortUnlessCommitted():void");
        }
    }

    private final class Entry {
        private Editor currentEditor;
        private final String key;
        private final long[] lengths;
        private boolean readable;
        private long sequenceNumber;

        private Entry(String str) {
            this.key = str;
            this.lengths = new long[DiskLruCache.this.valueCount];
        }

        public String getLengths() {
            StringBuilder stringBuilder = new StringBuilder();
            for (long j : this.lengths) {
                stringBuilder.append(' ');
                stringBuilder.append(j);
            }
            return stringBuilder.toString();
        }

        private void setLengths(java.lang.String[] r5) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/293907205.run(Unknown Source)
*/
            /*
            r4 = this;
            r0 = r5.length;
            r1 = com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.this;
            r1 = r1.valueCount;
            if (r0 != r1) goto L_0x0020;
        L_0x0009:
            r0 = 0;
        L_0x000a:
            r1 = r5.length;	 Catch:{ NumberFormatException -> 0x001b }
            if (r0 >= r1) goto L_0x001a;	 Catch:{ NumberFormatException -> 0x001b }
        L_0x000d:
            r1 = r4.lengths;	 Catch:{ NumberFormatException -> 0x001b }
            r2 = r5[r0];	 Catch:{ NumberFormatException -> 0x001b }
            r2 = java.lang.Long.parseLong(r2);	 Catch:{ NumberFormatException -> 0x001b }
            r1[r0] = r2;	 Catch:{ NumberFormatException -> 0x001b }
            r0 = r0 + 1;
            goto L_0x000a;
        L_0x001a:
            return;
        L_0x001b:
            r5 = r4.invalidLengths(r5);
            throw r5;
        L_0x0020:
            r5 = r4.invalidLengths(r5);
            throw r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.Entry.setLengths(java.lang.String[]):void");
        }

        private IOException invalidLengths(String[] strArr) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unexpected journal line: ");
            stringBuilder.append(Arrays.toString(strArr));
            throw new IOException(stringBuilder.toString());
        }

        public File getCleanFile(int i) {
            File access$2000 = DiskLruCache.this.directory;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.key);
            stringBuilder.append("");
            stringBuilder.append(i);
            return new File(access$2000, stringBuilder.toString());
        }

        public File getDirtyFile(int i) {
            File access$2000 = DiskLruCache.this.directory;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.key);
            stringBuilder.append("");
            stringBuilder.append(i);
            stringBuilder.append(".tmp");
            return new File(access$2000, stringBuilder.toString());
        }
    }

    public final class Snapshot implements Closeable {
        private File[] files;
        private final InputStream[] ins;
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;

        private Snapshot(String str, long j, File[] fileArr, InputStream[] inputStreamArr, long[] jArr) {
            this.key = str;
            this.sequenceNumber = j;
            this.files = fileArr;
            this.ins = inputStreamArr;
            this.lengths = jArr;
        }

        public Editor edit() {
            return DiskLruCache.this.edit(this.key, this.sequenceNumber);
        }

        public File getFile(int i) {
            return this.files[i];
        }

        public InputStream getInputStream(int i) {
            return this.ins[i];
        }

        public String getString(int i) {
            return DiskLruCache.inputStreamToString(getInputStream(i));
        }

        public long getLength(int i) {
            return this.lengths[i];
        }

        public void close() {
            for (Closeable closeQuietly : this.ins) {
                Util.closeQuietly(closeQuietly);
            }
        }
    }

    private DiskLruCache(File file, int i, int i2, long j, int i3) {
        File file2 = file;
        this.directory = file2;
        this.appVersion = i;
        this.journalFile = new File(file2, JOURNAL_FILE);
        this.journalFileTmp = new File(file2, JOURNAL_FILE_TEMP);
        this.journalFileBackup = new File(file2, JOURNAL_FILE_BACKUP);
        this.valueCount = i2;
        this.maxSize = j;
        this.maxFileCount = i3;
    }

    public static DiskLruCache open(File file, int i, int i2, long j, int i3) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i3 <= 0) {
            throw new IllegalArgumentException("maxFileCount <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, JOURNAL_FILE_BACKUP);
            if (file2.exists()) {
                File file3 = new File(file, JOURNAL_FILE);
                if (file3.exists()) {
                    file2.delete();
                } else {
                    renameTo(file2, file3, false);
                }
            }
            DiskLruCache diskLruCache = new DiskLruCache(file, i, i2, j, i3);
            if (diskLruCache.journalFile.exists()) {
                try {
                    diskLruCache.readJournal();
                    diskLruCache.processJournal();
                    diskLruCache.journalWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(diskLruCache.journalFile, true), Util.US_ASCII));
                    return diskLruCache;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("DiskLruCache ");
                    stringBuilder.append(file);
                    stringBuilder.append(" is corrupt: ");
                    stringBuilder.append(e.getMessage());
                    stringBuilder.append(", removing");
                    printStream.println(stringBuilder.toString());
                    diskLruCache.delete();
                }
            }
            file.mkdirs();
            diskLruCache = new DiskLruCache(file, i, i2, j, i3);
            diskLruCache.rebuildJournal();
            return diskLruCache;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    private void readJournal() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/293907205.run(Unknown Source)
*/
        /*
        r8 = this;
        r0 = new com.nostra13.universalimageloader.cache.disc.impl.ext.StrictLineReader;
        r1 = new java.io.FileInputStream;
        r2 = r8.journalFile;
        r1.<init>(r2);
        r2 = com.nostra13.universalimageloader.cache.disc.impl.ext.Util.US_ASCII;
        r0.<init>(r1, r2);
        r1 = r0.readLine();	 Catch:{ all -> 0x009e }
        r2 = r0.readLine();	 Catch:{ all -> 0x009e }
        r3 = r0.readLine();	 Catch:{ all -> 0x009e }
        r4 = r0.readLine();	 Catch:{ all -> 0x009e }
        r5 = r0.readLine();	 Catch:{ all -> 0x009e }
        r6 = "libcore.io.DiskLruCache";	 Catch:{ all -> 0x009e }
        r6 = r6.equals(r1);	 Catch:{ all -> 0x009e }
        if (r6 == 0) goto L_0x006a;	 Catch:{ all -> 0x009e }
    L_0x002a:
        r6 = "1";	 Catch:{ all -> 0x009e }
        r6 = r6.equals(r2);	 Catch:{ all -> 0x009e }
        if (r6 == 0) goto L_0x006a;	 Catch:{ all -> 0x009e }
    L_0x0032:
        r6 = r8.appVersion;	 Catch:{ all -> 0x009e }
        r6 = java.lang.Integer.toString(r6);	 Catch:{ all -> 0x009e }
        r3 = r6.equals(r3);	 Catch:{ all -> 0x009e }
        if (r3 == 0) goto L_0x006a;	 Catch:{ all -> 0x009e }
    L_0x003e:
        r3 = r8.valueCount;	 Catch:{ all -> 0x009e }
        r3 = java.lang.Integer.toString(r3);	 Catch:{ all -> 0x009e }
        r3 = r3.equals(r4);	 Catch:{ all -> 0x009e }
        if (r3 == 0) goto L_0x006a;	 Catch:{ all -> 0x009e }
    L_0x004a:
        r3 = "";	 Catch:{ all -> 0x009e }
        r3 = r3.equals(r5);	 Catch:{ all -> 0x009e }
        if (r3 == 0) goto L_0x006a;
    L_0x0052:
        r1 = 0;
    L_0x0053:
        r2 = r0.readLine();	 Catch:{ EOFException -> 0x005d }
        r8.readJournalLine(r2);	 Catch:{ EOFException -> 0x005d }
        r1 = r1 + 1;
        goto L_0x0053;
    L_0x005d:
        r2 = r8.lruEntries;	 Catch:{ all -> 0x009e }
        r2 = r2.size();	 Catch:{ all -> 0x009e }
        r1 = r1 - r2;	 Catch:{ all -> 0x009e }
        r8.redundantOpCount = r1;	 Catch:{ all -> 0x009e }
        com.nostra13.universalimageloader.cache.disc.impl.ext.Util.closeQuietly(r0);
        return;
    L_0x006a:
        r3 = new java.io.IOException;	 Catch:{ all -> 0x009e }
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x009e }
        r6.<init>();	 Catch:{ all -> 0x009e }
        r7 = "unexpected journal header: [";	 Catch:{ all -> 0x009e }
        r6.append(r7);	 Catch:{ all -> 0x009e }
        r6.append(r1);	 Catch:{ all -> 0x009e }
        r1 = ", ";	 Catch:{ all -> 0x009e }
        r6.append(r1);	 Catch:{ all -> 0x009e }
        r6.append(r2);	 Catch:{ all -> 0x009e }
        r1 = ", ";	 Catch:{ all -> 0x009e }
        r6.append(r1);	 Catch:{ all -> 0x009e }
        r6.append(r4);	 Catch:{ all -> 0x009e }
        r1 = ", ";	 Catch:{ all -> 0x009e }
        r6.append(r1);	 Catch:{ all -> 0x009e }
        r6.append(r5);	 Catch:{ all -> 0x009e }
        r1 = "]";	 Catch:{ all -> 0x009e }
        r6.append(r1);	 Catch:{ all -> 0x009e }
        r1 = r6.toString();	 Catch:{ all -> 0x009e }
        r3.<init>(r1);	 Catch:{ all -> 0x009e }
        throw r3;	 Catch:{ all -> 0x009e }
    L_0x009e:
        r1 = move-exception;
        com.nostra13.universalimageloader.cache.disc.impl.ext.Util.closeQuietly(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.readJournal():void");
    }

    private void readJournalLine(String str) {
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            String substring;
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                substring = str.substring(i);
                if (indexOf == REMOVE.length() && str.startsWith(REMOVE)) {
                    this.lruEntries.remove(substring);
                    return;
                }
            }
            substring = str.substring(i, indexOf2);
            Entry entry = (Entry) this.lruEntries.get(substring);
            if (entry == null) {
                entry = new Entry(substring);
                this.lruEntries.put(substring, entry);
            }
            if (indexOf2 != -1 && indexOf == CLEAN.length() && str.startsWith(CLEAN)) {
                str = str.substring(indexOf2 + 1).split(" ");
                entry.readable = true;
                entry.currentEditor = null;
                entry.setLengths(str);
            } else if (indexOf2 == -1 && indexOf == DIRTY.length() && str.startsWith(DIRTY)) {
                entry.currentEditor = new Editor(entry);
            } else if (!(indexOf2 == -1 && indexOf == READ.length() && str.startsWith(READ))) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("unexpected journal line: ");
                stringBuilder.append(str);
                throw new IOException(stringBuilder.toString());
            }
            return;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("unexpected journal line: ");
        stringBuilder.append(str);
        throw new IOException(stringBuilder.toString());
    }

    private void processJournal() {
        deleteIfExists(this.journalFileTmp);
        Iterator it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            int i = 0;
            if (entry.currentEditor == null) {
                while (i < this.valueCount) {
                    this.size += entry.lengths[i];
                    this.fileCount++;
                    i++;
                }
            } else {
                entry.currentEditor = null;
                while (i < this.valueCount) {
                    deleteIfExists(entry.getCleanFile(i));
                    deleteIfExists(entry.getDirtyFile(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    private synchronized void rebuildJournal() {
        if (this.journalWriter != null) {
            this.journalWriter.close();
        }
        Writer bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFileTmp), Util.US_ASCII));
        try {
            bufferedWriter.write(MAGIC);
            bufferedWriter.write("\n");
            bufferedWriter.write(VERSION_1);
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.appVersion));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.valueCount));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (Entry entry : this.lruEntries.values()) {
                StringBuilder stringBuilder;
                if (entry.currentEditor != null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("DIRTY ");
                    stringBuilder.append(entry.key);
                    stringBuilder.append('\n');
                    bufferedWriter.write(stringBuilder.toString());
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("CLEAN ");
                    stringBuilder.append(entry.key);
                    stringBuilder.append(entry.getLengths());
                    stringBuilder.append('\n');
                    bufferedWriter.write(stringBuilder.toString());
                }
            }
            if (this.journalFile.exists()) {
                renameTo(this.journalFile, this.journalFileBackup, true);
            }
            renameTo(this.journalFileTmp, this.journalFile, false);
            this.journalFileBackup.delete();
            this.journalWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFile, true), Util.US_ASCII));
        } finally {
            bufferedWriter.close();
        }
    }

    private static void deleteIfExists(File file) {
        if (!file.exists()) {
            return;
        }
        if (file.delete() == null) {
            throw new IOException();
        }
    }

    private static void renameTo(File file, File file2, boolean z) {
        if (z) {
            deleteIfExists(file2);
        }
        if (file.renameTo(file2) == null) {
            throw new IOException();
        }
    }

    public synchronized com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.Snapshot get(java.lang.String r13) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/293907205.run(Unknown Source)
*/
        /*
        r12 = this;
        monitor-enter(r12);
        r12.checkNotClosed();	 Catch:{ all -> 0x008d }
        r12.validateKey(r13);	 Catch:{ all -> 0x008d }
        r0 = r12.lruEntries;	 Catch:{ all -> 0x008d }
        r0 = r0.get(r13);	 Catch:{ all -> 0x008d }
        r0 = (com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.Entry) r0;	 Catch:{ all -> 0x008d }
        r1 = 0;
        if (r0 != 0) goto L_0x0014;
    L_0x0012:
        monitor-exit(r12);
        return r1;
    L_0x0014:
        r2 = r0.readable;	 Catch:{ all -> 0x008d }
        if (r2 != 0) goto L_0x001c;
    L_0x001a:
        monitor-exit(r12);
        return r1;
    L_0x001c:
        r2 = r12.valueCount;	 Catch:{ all -> 0x008d }
        r8 = new java.io.File[r2];	 Catch:{ all -> 0x008d }
        r2 = r12.valueCount;	 Catch:{ all -> 0x008d }
        r9 = new java.io.InputStream[r2];	 Catch:{ all -> 0x008d }
        r2 = 0;
        r3 = 0;
    L_0x0026:
        r4 = r12.valueCount;	 Catch:{ FileNotFoundException -> 0x007b }
        if (r3 >= r4) goto L_0x003a;	 Catch:{ FileNotFoundException -> 0x007b }
    L_0x002a:
        r4 = r0.getCleanFile(r3);	 Catch:{ FileNotFoundException -> 0x007b }
        r8[r3] = r4;	 Catch:{ FileNotFoundException -> 0x007b }
        r5 = new java.io.FileInputStream;	 Catch:{ FileNotFoundException -> 0x007b }
        r5.<init>(r4);	 Catch:{ FileNotFoundException -> 0x007b }
        r9[r3] = r5;	 Catch:{ FileNotFoundException -> 0x007b }
        r3 = r3 + 1;
        goto L_0x0026;
    L_0x003a:
        r1 = r12.redundantOpCount;	 Catch:{ all -> 0x008d }
        r1 = r1 + 1;	 Catch:{ all -> 0x008d }
        r12.redundantOpCount = r1;	 Catch:{ all -> 0x008d }
        r1 = r12.journalWriter;	 Catch:{ all -> 0x008d }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x008d }
        r2.<init>();	 Catch:{ all -> 0x008d }
        r3 = "READ ";	 Catch:{ all -> 0x008d }
        r2.append(r3);	 Catch:{ all -> 0x008d }
        r2.append(r13);	 Catch:{ all -> 0x008d }
        r3 = 10;	 Catch:{ all -> 0x008d }
        r2.append(r3);	 Catch:{ all -> 0x008d }
        r2 = r2.toString();	 Catch:{ all -> 0x008d }
        r1.append(r2);	 Catch:{ all -> 0x008d }
        r1 = r12.journalRebuildRequired();	 Catch:{ all -> 0x008d }
        if (r1 == 0) goto L_0x0068;	 Catch:{ all -> 0x008d }
    L_0x0061:
        r1 = r12.executorService;	 Catch:{ all -> 0x008d }
        r2 = r12.cleanupCallable;	 Catch:{ all -> 0x008d }
        r1.submit(r2);	 Catch:{ all -> 0x008d }
    L_0x0068:
        r1 = new com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache$Snapshot;	 Catch:{ all -> 0x008d }
        r6 = r0.sequenceNumber;	 Catch:{ all -> 0x008d }
        r10 = r0.lengths;	 Catch:{ all -> 0x008d }
        r11 = 0;	 Catch:{ all -> 0x008d }
        r3 = r1;	 Catch:{ all -> 0x008d }
        r4 = r12;	 Catch:{ all -> 0x008d }
        r5 = r13;	 Catch:{ all -> 0x008d }
        r3.<init>(r5, r6, r8, r9, r10);	 Catch:{ all -> 0x008d }
        monitor-exit(r12);
        return r1;
    L_0x007b:
        r13 = r12.valueCount;	 Catch:{ all -> 0x008d }
        if (r2 >= r13) goto L_0x008b;	 Catch:{ all -> 0x008d }
    L_0x007f:
        r13 = r9[r2];	 Catch:{ all -> 0x008d }
        if (r13 == 0) goto L_0x008b;	 Catch:{ all -> 0x008d }
    L_0x0083:
        r13 = r9[r2];	 Catch:{ all -> 0x008d }
        com.nostra13.universalimageloader.cache.disc.impl.ext.Util.closeQuietly(r13);	 Catch:{ all -> 0x008d }
        r2 = r2 + 1;
        goto L_0x007b;
    L_0x008b:
        monitor-exit(r12);
        return r1;
    L_0x008d:
        r13 = move-exception;
        monitor-exit(r12);
        throw r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.get(java.lang.String):com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache$Snapshot");
    }

    public Editor edit(String str) {
        return edit(str, -1);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.Editor edit(java.lang.String r6, long r7) {
        /*
        r5 = this;
        monitor-enter(r5);
        r5.checkNotClosed();	 Catch:{ all -> 0x0061 }
        r5.validateKey(r6);	 Catch:{ all -> 0x0061 }
        r0 = r5.lruEntries;	 Catch:{ all -> 0x0061 }
        r0 = r0.get(r6);	 Catch:{ all -> 0x0061 }
        r0 = (com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.Entry) r0;	 Catch:{ all -> 0x0061 }
        r1 = -1;
        r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1));
        r1 = 0;
        if (r3 == 0) goto L_0x0022;
    L_0x0016:
        if (r0 == 0) goto L_0x0020;
    L_0x0018:
        r2 = r0.sequenceNumber;	 Catch:{ all -> 0x0061 }
        r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1));
        if (r4 == 0) goto L_0x0022;
    L_0x0020:
        monitor-exit(r5);
        return r1;
    L_0x0022:
        if (r0 != 0) goto L_0x002f;
    L_0x0024:
        r0 = new com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache$Entry;	 Catch:{ all -> 0x0061 }
        r0.<init>(r6);	 Catch:{ all -> 0x0061 }
        r7 = r5.lruEntries;	 Catch:{ all -> 0x0061 }
        r7.put(r6, r0);	 Catch:{ all -> 0x0061 }
        goto L_0x0037;
    L_0x002f:
        r7 = r0.currentEditor;	 Catch:{ all -> 0x0061 }
        if (r7 == 0) goto L_0x0037;
    L_0x0035:
        monitor-exit(r5);
        return r1;
    L_0x0037:
        r7 = new com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache$Editor;	 Catch:{ all -> 0x0061 }
        r7.<init>(r0);	 Catch:{ all -> 0x0061 }
        r0.currentEditor = r7;	 Catch:{ all -> 0x0061 }
        r8 = r5.journalWriter;	 Catch:{ all -> 0x0061 }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0061 }
        r0.<init>();	 Catch:{ all -> 0x0061 }
        r1 = "DIRTY ";
        r0.append(r1);	 Catch:{ all -> 0x0061 }
        r0.append(r6);	 Catch:{ all -> 0x0061 }
        r6 = 10;
        r0.append(r6);	 Catch:{ all -> 0x0061 }
        r6 = r0.toString();	 Catch:{ all -> 0x0061 }
        r8.write(r6);	 Catch:{ all -> 0x0061 }
        r6 = r5.journalWriter;	 Catch:{ all -> 0x0061 }
        r6.flush();	 Catch:{ all -> 0x0061 }
        monitor-exit(r5);
        return r7;
    L_0x0061:
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.edit(java.lang.String, long):com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache$Editor");
    }

    public File getDirectory() {
        return this.directory;
    }

    public synchronized long getMaxSize() {
        return this.maxSize;
    }

    public synchronized int getMaxFileCount() {
        return this.maxFileCount;
    }

    public synchronized void setMaxSize(long j) {
        this.maxSize = j;
        this.executorService.submit(this.cleanupCallable);
    }

    public synchronized long size() {
        return this.size;
    }

    public synchronized long fileCount() {
        return (long) this.fileCount;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void completeEdit(com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.Editor r11, boolean r12) {
        /*
        r10 = this;
        monitor-enter(r10);
        r0 = r11.entry;	 Catch:{ all -> 0x011c }
        r1 = r0.currentEditor;	 Catch:{ all -> 0x011c }
        if (r1 != r11) goto L_0x0116;
    L_0x000b:
        r1 = 0;
        if (r12 == 0) goto L_0x004d;
    L_0x000e:
        r2 = r0.readable;	 Catch:{ all -> 0x011c }
        if (r2 != 0) goto L_0x004d;
    L_0x0014:
        r2 = 0;
    L_0x0015:
        r3 = r10.valueCount;	 Catch:{ all -> 0x011c }
        if (r2 >= r3) goto L_0x004d;
    L_0x0019:
        r3 = r11.written;	 Catch:{ all -> 0x011c }
        r3 = r3[r2];	 Catch:{ all -> 0x011c }
        if (r3 == 0) goto L_0x0033;
    L_0x0021:
        r3 = r0.getDirtyFile(r2);	 Catch:{ all -> 0x011c }
        r3 = r3.exists();	 Catch:{ all -> 0x011c }
        if (r3 != 0) goto L_0x0030;
    L_0x002b:
        r11.abort();	 Catch:{ all -> 0x011c }
        monitor-exit(r10);
        return;
    L_0x0030:
        r2 = r2 + 1;
        goto L_0x0015;
    L_0x0033:
        r11.abort();	 Catch:{ all -> 0x011c }
        r11 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x011c }
        r12 = new java.lang.StringBuilder;	 Catch:{ all -> 0x011c }
        r12.<init>();	 Catch:{ all -> 0x011c }
        r0 = "Newly created entry didn't create value for index ";
        r12.append(r0);	 Catch:{ all -> 0x011c }
        r12.append(r2);	 Catch:{ all -> 0x011c }
        r12 = r12.toString();	 Catch:{ all -> 0x011c }
        r11.<init>(r12);	 Catch:{ all -> 0x011c }
        throw r11;	 Catch:{ all -> 0x011c }
    L_0x004d:
        r11 = r10.valueCount;	 Catch:{ all -> 0x011c }
        r2 = 1;
        if (r1 >= r11) goto L_0x0088;
    L_0x0052:
        r11 = r0.getDirtyFile(r1);	 Catch:{ all -> 0x011c }
        if (r12 == 0) goto L_0x0082;
    L_0x0058:
        r3 = r11.exists();	 Catch:{ all -> 0x011c }
        if (r3 == 0) goto L_0x0085;
    L_0x005e:
        r3 = r0.getCleanFile(r1);	 Catch:{ all -> 0x011c }
        r11.renameTo(r3);	 Catch:{ all -> 0x011c }
        r11 = r0.lengths;	 Catch:{ all -> 0x011c }
        r4 = r11[r1];	 Catch:{ all -> 0x011c }
        r6 = r3.length();	 Catch:{ all -> 0x011c }
        r11 = r0.lengths;	 Catch:{ all -> 0x011c }
        r11[r1] = r6;	 Catch:{ all -> 0x011c }
        r8 = r10.size;	 Catch:{ all -> 0x011c }
        r11 = 0;
        r8 = r8 - r4;
        r8 = r8 + r6;
        r10.size = r8;	 Catch:{ all -> 0x011c }
        r11 = r10.fileCount;	 Catch:{ all -> 0x011c }
        r11 = r11 + r2;
        r10.fileCount = r11;	 Catch:{ all -> 0x011c }
        goto L_0x0085;
    L_0x0082:
        deleteIfExists(r11);	 Catch:{ all -> 0x011c }
    L_0x0085:
        r1 = r1 + 1;
        goto L_0x004d;
    L_0x0088:
        r11 = r10.redundantOpCount;	 Catch:{ all -> 0x011c }
        r11 = r11 + r2;
        r10.redundantOpCount = r11;	 Catch:{ all -> 0x011c }
        r11 = 0;
        r0.currentEditor = r11;	 Catch:{ all -> 0x011c }
        r11 = r0.readable;	 Catch:{ all -> 0x011c }
        r11 = r11 | r12;
        r1 = 10;
        if (r11 == 0) goto L_0x00ce;
    L_0x009a:
        r0.readable = r2;	 Catch:{ all -> 0x011c }
        r11 = r10.journalWriter;	 Catch:{ all -> 0x011c }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x011c }
        r2.<init>();	 Catch:{ all -> 0x011c }
        r3 = "CLEAN ";
        r2.append(r3);	 Catch:{ all -> 0x011c }
        r3 = r0.key;	 Catch:{ all -> 0x011c }
        r2.append(r3);	 Catch:{ all -> 0x011c }
        r3 = r0.getLengths();	 Catch:{ all -> 0x011c }
        r2.append(r3);	 Catch:{ all -> 0x011c }
        r2.append(r1);	 Catch:{ all -> 0x011c }
        r1 = r2.toString();	 Catch:{ all -> 0x011c }
        r11.write(r1);	 Catch:{ all -> 0x011c }
        if (r12 == 0) goto L_0x00f4;
    L_0x00c3:
        r11 = r10.nextSequenceNumber;	 Catch:{ all -> 0x011c }
        r1 = 1;
        r1 = r1 + r11;
        r10.nextSequenceNumber = r1;	 Catch:{ all -> 0x011c }
        r0.sequenceNumber = r11;	 Catch:{ all -> 0x011c }
        goto L_0x00f4;
    L_0x00ce:
        r11 = r10.lruEntries;	 Catch:{ all -> 0x011c }
        r12 = r0.key;	 Catch:{ all -> 0x011c }
        r11.remove(r12);	 Catch:{ all -> 0x011c }
        r11 = r10.journalWriter;	 Catch:{ all -> 0x011c }
        r12 = new java.lang.StringBuilder;	 Catch:{ all -> 0x011c }
        r12.<init>();	 Catch:{ all -> 0x011c }
        r2 = "REMOVE ";
        r12.append(r2);	 Catch:{ all -> 0x011c }
        r0 = r0.key;	 Catch:{ all -> 0x011c }
        r12.append(r0);	 Catch:{ all -> 0x011c }
        r12.append(r1);	 Catch:{ all -> 0x011c }
        r12 = r12.toString();	 Catch:{ all -> 0x011c }
        r11.write(r12);	 Catch:{ all -> 0x011c }
    L_0x00f4:
        r11 = r10.journalWriter;	 Catch:{ all -> 0x011c }
        r11.flush();	 Catch:{ all -> 0x011c }
        r11 = r10.size;	 Catch:{ all -> 0x011c }
        r0 = r10.maxSize;	 Catch:{ all -> 0x011c }
        r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1));
        if (r2 > 0) goto L_0x010d;
    L_0x0101:
        r11 = r10.fileCount;	 Catch:{ all -> 0x011c }
        r12 = r10.maxFileCount;	 Catch:{ all -> 0x011c }
        if (r11 > r12) goto L_0x010d;
    L_0x0107:
        r11 = r10.journalRebuildRequired();	 Catch:{ all -> 0x011c }
        if (r11 == 0) goto L_0x0114;
    L_0x010d:
        r11 = r10.executorService;	 Catch:{ all -> 0x011c }
        r12 = r10.cleanupCallable;	 Catch:{ all -> 0x011c }
        r11.submit(r12);	 Catch:{ all -> 0x011c }
    L_0x0114:
        monitor-exit(r10);
        return;
    L_0x0116:
        r11 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x011c }
        r11.<init>();	 Catch:{ all -> 0x011c }
        throw r11;	 Catch:{ all -> 0x011c }
    L_0x011c:
        r11 = move-exception;
        monitor-exit(r10);
        throw r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.completeEdit(com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache$Editor, boolean):void");
    }

    private boolean journalRebuildRequired() {
        return this.redundantOpCount >= 2000 && this.redundantOpCount >= this.lruEntries.size();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean remove(java.lang.String r9) {
        /*
        r8 = this;
        monitor-enter(r8);
        r8.checkNotClosed();	 Catch:{ all -> 0x0099 }
        r8.validateKey(r9);	 Catch:{ all -> 0x0099 }
        r0 = r8.lruEntries;	 Catch:{ all -> 0x0099 }
        r0 = r0.get(r9);	 Catch:{ all -> 0x0099 }
        r0 = (com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.Entry) r0;	 Catch:{ all -> 0x0099 }
        r1 = 0;
        if (r0 == 0) goto L_0x0097;
    L_0x0012:
        r2 = r0.currentEditor;	 Catch:{ all -> 0x0099 }
        if (r2 == 0) goto L_0x001a;
    L_0x0018:
        goto L_0x0097;
    L_0x001a:
        r2 = r8.valueCount;	 Catch:{ all -> 0x0099 }
        r3 = 1;
        if (r1 >= r2) goto L_0x0063;
    L_0x001f:
        r2 = r0.getCleanFile(r1);	 Catch:{ all -> 0x0099 }
        r4 = r2.exists();	 Catch:{ all -> 0x0099 }
        if (r4 == 0) goto L_0x0047;
    L_0x0029:
        r4 = r2.delete();	 Catch:{ all -> 0x0099 }
        if (r4 == 0) goto L_0x0030;
    L_0x002f:
        goto L_0x0047;
    L_0x0030:
        r9 = new java.io.IOException;	 Catch:{ all -> 0x0099 }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0099 }
        r0.<init>();	 Catch:{ all -> 0x0099 }
        r1 = "failed to delete ";
        r0.append(r1);	 Catch:{ all -> 0x0099 }
        r0.append(r2);	 Catch:{ all -> 0x0099 }
        r0 = r0.toString();	 Catch:{ all -> 0x0099 }
        r9.<init>(r0);	 Catch:{ all -> 0x0099 }
        throw r9;	 Catch:{ all -> 0x0099 }
    L_0x0047:
        r4 = r8.size;	 Catch:{ all -> 0x0099 }
        r2 = r0.lengths;	 Catch:{ all -> 0x0099 }
        r6 = r2[r1];	 Catch:{ all -> 0x0099 }
        r2 = 0;
        r4 = r4 - r6;
        r8.size = r4;	 Catch:{ all -> 0x0099 }
        r2 = r8.fileCount;	 Catch:{ all -> 0x0099 }
        r2 = r2 - r3;
        r8.fileCount = r2;	 Catch:{ all -> 0x0099 }
        r2 = r0.lengths;	 Catch:{ all -> 0x0099 }
        r3 = 0;
        r2[r1] = r3;	 Catch:{ all -> 0x0099 }
        r1 = r1 + 1;
        goto L_0x001a;
    L_0x0063:
        r0 = r8.redundantOpCount;	 Catch:{ all -> 0x0099 }
        r0 = r0 + r3;
        r8.redundantOpCount = r0;	 Catch:{ all -> 0x0099 }
        r0 = r8.journalWriter;	 Catch:{ all -> 0x0099 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0099 }
        r1.<init>();	 Catch:{ all -> 0x0099 }
        r2 = "REMOVE ";
        r1.append(r2);	 Catch:{ all -> 0x0099 }
        r1.append(r9);	 Catch:{ all -> 0x0099 }
        r2 = 10;
        r1.append(r2);	 Catch:{ all -> 0x0099 }
        r1 = r1.toString();	 Catch:{ all -> 0x0099 }
        r0.append(r1);	 Catch:{ all -> 0x0099 }
        r0 = r8.lruEntries;	 Catch:{ all -> 0x0099 }
        r0.remove(r9);	 Catch:{ all -> 0x0099 }
        r9 = r8.journalRebuildRequired();	 Catch:{ all -> 0x0099 }
        if (r9 == 0) goto L_0x0095;
    L_0x008e:
        r9 = r8.executorService;	 Catch:{ all -> 0x0099 }
        r0 = r8.cleanupCallable;	 Catch:{ all -> 0x0099 }
        r9.submit(r0);	 Catch:{ all -> 0x0099 }
    L_0x0095:
        monitor-exit(r8);
        return r3;
    L_0x0097:
        monitor-exit(r8);
        return r1;
    L_0x0099:
        r9 = move-exception;
        monitor-exit(r8);
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.remove(java.lang.String):boolean");
    }

    public synchronized boolean isClosed() {
        return this.journalWriter == null;
    }

    private void checkNotClosed() {
        if (this.journalWriter == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public synchronized void flush() {
        checkNotClosed();
        trimToSize();
        trimToFileCount();
        this.journalWriter.flush();
    }

    public synchronized void close() {
        if (this.journalWriter != null) {
            Iterator it = new ArrayList(this.lruEntries.values()).iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                if (entry.currentEditor != null) {
                    entry.currentEditor.abort();
                }
            }
            trimToSize();
            trimToFileCount();
            this.journalWriter.close();
            this.journalWriter = null;
        }
    }

    private void trimToSize() {
        while (this.size > this.maxSize) {
            remove((String) ((java.util.Map.Entry) this.lruEntries.entrySet().iterator().next()).getKey());
        }
    }

    private void trimToFileCount() {
        while (this.fileCount > this.maxFileCount) {
            remove((String) ((java.util.Map.Entry) this.lruEntries.entrySet().iterator().next()).getKey());
        }
    }

    public void delete() {
        close();
        Util.deleteContents(this.directory);
    }

    private void validateKey(String str) {
        if (!LEGAL_KEY_PATTERN.matcher(str).matches()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("keys must match regex [a-z0-9_-]{1,64}: \"");
            stringBuilder.append(str);
            stringBuilder.append("\"");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    private static String inputStreamToString(InputStream inputStream) {
        return Util.readFully(new InputStreamReader(inputStream, Util.UTF_8));
    }
}
