package com.socks.library.klog;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Random;

public class FileLog {
    private static final String FILE_FORMAT = ".log";
    private static final String FILE_PREFIX = "KLog_";

    public static void printFile(String str, File file, @Nullable String str2, String str3, String str4) {
        if (str2 == null) {
            str2 = getFileName();
        }
        if (save(file, str2, str4) != null) {
            str4 = new StringBuilder();
            str4.append(str3);
            str4.append(" save log success ! location is >>>");
            str4.append(file.getAbsolutePath());
            str4.append("/");
            str4.append(str2);
            Log.d(str, str4.toString());
            return;
        }
        file = new StringBuilder();
        file.append(str3);
        file.append("save log fails !");
        Log.e(str, file.toString());
    }

    private static boolean save(File file, @NonNull String str, String str2) {
        try {
            str = new FileOutputStream(new File(file, str));
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(str, AsyncHttpResponseHandler.DEFAULT_CHARSET);
            outputStreamWriter.write(str2);
            outputStreamWriter.flush();
            str.close();
            return true;
        } catch (String str3) {
            str3.printStackTrace();
            return false;
        } catch (String str32) {
            str32.printStackTrace();
            return false;
        } catch (String str322) {
            str322.printStackTrace();
            return false;
        } catch (String str3222) {
            str3222.printStackTrace();
            return false;
        }
    }

    private static String getFileName() {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(FILE_PREFIX);
        stringBuilder.append(Long.toString(System.currentTimeMillis() + ((long) random.nextInt(AsyncHttpClient.DEFAULT_SOCKET_TIMEOUT))).substring(4));
        stringBuilder.append(FILE_FORMAT);
        return stringBuilder.toString();
    }
}
