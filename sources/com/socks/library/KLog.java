package com.socks.library;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.socks.library.klog.BaseLog;
import com.socks.library.klog.FileLog;
import com.socks.library.klog.JsonLog;
import com.socks.library.klog.XmlLog;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

public final class KLog {
    /* renamed from: A */
    public static final int f1407A = 6;
    /* renamed from: D */
    public static final int f1408D = 2;
    private static final String DEFAULT_MESSAGE = "execute";
    /* renamed from: E */
    public static final int f1409E = 5;
    /* renamed from: I */
    public static final int f1410I = 3;
    private static boolean IS_SHOW_LOG = true;
    private static final int JSON = 7;
    public static final int JSON_INDENT = 4;
    public static final String LINE_SEPARATOR = System.getProperty("line.separator");
    private static final String NULL = "null";
    public static final String NULL_TIPS = "Log with null object";
    private static final String PARAM = "Param";
    private static final int STACK_TRACE_INDEX_4 = 4;
    private static final int STACK_TRACE_INDEX_5 = 5;
    private static final String SUFFIX = ".java";
    private static final String TAG_DEFAULT = "KLog";
    /* renamed from: V */
    public static final int f1411V = 1;
    /* renamed from: W */
    public static final int f1412W = 4;
    private static final int XML = 8;
    private static String mGlobalTag;
    private static boolean mIsGlobalTagEmpty = true;

    public static void init(boolean z) {
        IS_SHOW_LOG = z;
    }

    public static void init(boolean z, @Nullable String str) {
        IS_SHOW_LOG = z;
        mGlobalTag = str;
        mIsGlobalTagEmpty = TextUtils.isEmpty(mGlobalTag);
    }

    /* renamed from: v */
    public static void m1456v() {
        printLog(1, null, DEFAULT_MESSAGE);
    }

    /* renamed from: v */
    public static void m1457v(Object obj) {
        printLog(1, null, obj);
    }

    /* renamed from: v */
    public static void m1458v(String str, Object... objArr) {
        printLog(1, str, objArr);
    }

    /* renamed from: d */
    public static void m1447d() {
        printLog(2, null, DEFAULT_MESSAGE);
    }

    /* renamed from: d */
    public static void m1448d(Object obj) {
        printLog(2, null, obj);
    }

    /* renamed from: d */
    public static void m1449d(String str, Object... objArr) {
        printLog(2, str, objArr);
    }

    /* renamed from: i */
    public static void m1453i() {
        printLog(3, null, DEFAULT_MESSAGE);
    }

    /* renamed from: i */
    public static void m1454i(Object obj) {
        printLog(3, null, obj);
    }

    /* renamed from: i */
    public static void m1455i(String str, Object... objArr) {
        printLog(3, str, objArr);
    }

    /* renamed from: w */
    public static void m1459w() {
        printLog(4, null, DEFAULT_MESSAGE);
    }

    /* renamed from: w */
    public static void m1460w(Object obj) {
        printLog(4, null, obj);
    }

    /* renamed from: w */
    public static void m1461w(String str, Object... objArr) {
        printLog(4, str, objArr);
    }

    /* renamed from: e */
    public static void m1450e() {
        printLog(5, null, DEFAULT_MESSAGE);
    }

    /* renamed from: e */
    public static void m1451e(Object obj) {
        printLog(5, null, obj);
    }

    /* renamed from: e */
    public static void m1452e(String str, Object... objArr) {
        printLog(5, str, objArr);
    }

    /* renamed from: a */
    public static void m1444a() {
        printLog(6, null, DEFAULT_MESSAGE);
    }

    /* renamed from: a */
    public static void m1445a(Object obj) {
        printLog(6, null, obj);
    }

    /* renamed from: a */
    public static void m1446a(String str, Object... objArr) {
        printLog(6, str, objArr);
    }

    public static void json(String str) {
        printLog(7, null, str);
    }

    public static void json(String str, String str2) {
        printLog(7, str, str2);
    }

    public static void xml(String str) {
        printLog(8, null, str);
    }

    public static void xml(String str, String str2) {
        printLog(8, str, str2);
    }

    public static void file(File file, Object obj) {
        printFile(null, file, null, obj);
    }

    public static void file(String str, File file, Object obj) {
        printFile(str, file, null, obj);
    }

    public static void file(String str, File file, String str2, Object obj) {
        printFile(str, file, str2, obj);
    }

    public static void debug() {
        printDebug(null, DEFAULT_MESSAGE);
    }

    public static void debug(Object obj) {
        printDebug(null, obj);
    }

    public static void debug(String str, Object... objArr) {
        printDebug(str, objArr);
    }

    public static void trace() {
        printStackTrace();
    }

    private static void printStackTrace() {
        if (IS_SHOW_LOG) {
            Throwable th = new Throwable();
            Writer stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            printWriter.flush();
            String[] split = stringWriter.toString().split("\\n\\t");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\n");
            for (String str : split) {
                if (!str.contains("at com.socks.library.KLog")) {
                    stringBuilder.append(str);
                    stringBuilder.append("\n");
                }
            }
            split = wrapperContent(4, null, stringBuilder.toString());
            String str2 = split[0];
            String str3 = split[1];
            String str4 = split[2];
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str4);
            stringBuilder2.append(str3);
            BaseLog.printDefault(2, str2, stringBuilder2.toString());
        }
    }

    private static void printLog(int i, String str, Object... objArr) {
        if (IS_SHOW_LOG) {
            str = wrapperContent(5, str, objArr);
            objArr = str[null];
            String str2 = str[1];
            str = str[2];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append(str2);
                    BaseLog.printDefault(i, objArr, stringBuilder.toString());
                    break;
                case 7:
                    JsonLog.printJson(objArr, str2, str);
                    break;
                case 8:
                    XmlLog.printXml(objArr, str2, str);
                    break;
                default:
                    break;
            }
        }
    }

    private static void printDebug(String str, Object... objArr) {
        str = wrapperContent(5, str, objArr);
        objArr = str[null];
        String str2 = str[1];
        str = str[2];
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(str2);
        BaseLog.printDefault(2, objArr, stringBuilder.toString());
    }

    private static void printFile(String str, File file, String str2, Object obj) {
        if (IS_SHOW_LOG) {
            str = wrapperContent(5, str, obj);
            FileLog.printFile(str[0], file, str2, str[2], str[1]);
        }
    }

    private static String[] wrapperContent(int i, String str, Object... objArr) {
        i = Thread.currentThread().getStackTrace()[i];
        String className = i.getClassName();
        String[] split = className.split("\\.");
        if (split.length > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(split[split.length - 1]);
            stringBuilder.append(SUFFIX);
            className = stringBuilder.toString();
        }
        if (className.contains("$")) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(className.split("\\$")[0]);
            stringBuilder2.append(SUFFIX);
            className = stringBuilder2.toString();
        }
        String methodName = i.getMethodName();
        i = i.getLineNumber();
        if (i < 0) {
            i = 0;
        }
        if (str == null) {
            str = className;
        }
        if (mIsGlobalTagEmpty && TextUtils.isEmpty(r7)) {
            str = TAG_DEFAULT;
        } else if (!mIsGlobalTagEmpty) {
            str = mGlobalTag;
        }
        if (objArr == null) {
            objArr = NULL_TIPS;
        } else {
            objArr = getObjectsString(objArr);
        }
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("[ (");
        stringBuilder3.append(className);
        stringBuilder3.append(":");
        stringBuilder3.append(i);
        stringBuilder3.append(")#");
        stringBuilder3.append(methodName);
        stringBuilder3.append(" ] ");
        i = stringBuilder3.toString();
        return new String[]{str, objArr, i};
    }

    private static String getObjectsString(Object... objArr) {
        int i = 0;
        if (objArr.length > 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\n");
            while (i < objArr.length) {
                Object obj = objArr[i];
                if (obj == null) {
                    stringBuilder.append(PARAM);
                    stringBuilder.append("[");
                    stringBuilder.append(i);
                    stringBuilder.append("]");
                    stringBuilder.append(" = ");
                    stringBuilder.append(NULL);
                    stringBuilder.append("\n");
                } else {
                    stringBuilder.append(PARAM);
                    stringBuilder.append("[");
                    stringBuilder.append(i);
                    stringBuilder.append("]");
                    stringBuilder.append(" = ");
                    stringBuilder.append(obj.toString());
                    stringBuilder.append("\n");
                }
                i++;
            }
            return stringBuilder.toString();
        }
        objArr = objArr[0];
        if (objArr == null) {
            objArr = NULL;
        } else {
            objArr = objArr.toString();
        }
        return objArr;
    }
}
