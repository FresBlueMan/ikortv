package com.socks.library.klog;

import android.util.Log;
import com.socks.library.KLog;
import com.socks.library.KLogUtil;
import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XmlLog {
    public static void printXml(String str, String str2, String str3) {
        if (str2 != null) {
            str2 = formatXML(str2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str3);
            stringBuilder.append("\n");
            stringBuilder.append(str2);
            str2 = stringBuilder.toString();
        } else {
            str2 = new StringBuilder();
            str2.append(str3);
            str2.append(KLog.NULL_TIPS);
            str2 = str2.toString();
        }
        KLogUtil.printLine(str, true);
        for (String str4 : r6.split(KLog.LINE_SEPARATOR)) {
            if (!KLogUtil.isEmpty(str4)) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("║ ");
                stringBuilder2.append(str4);
                Log.d(str, stringBuilder2.toString());
            }
        }
        KLogUtil.printLine(str, false);
    }

    private static String formatXML(String str) {
        try {
            Source streamSource = new StreamSource(new StringReader(str));
            Object streamResult = new StreamResult(new StringWriter());
            Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
            newTransformer.setOutputProperty("indent", "yes");
            newTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            newTransformer.transform(streamSource, streamResult);
            return streamResult.getWriter().toString().replaceFirst(">", ">\n");
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }
}
