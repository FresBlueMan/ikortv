package org.livestreamer;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.RouteInfo;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DnsServersDetector {
    private static final String[] FACTORY_DNS_SERVERS = new String[]{"8.8.8.8", "8.8.4.4"};
    private static final String METHOD_EXEC_PROP_DELIM = "]: [";
    private static final String TAG = "DnsServersDetector";
    private Context context;

    public DnsServersDetector(Context context) {
        this.context = context;
    }

    public String getBestIpv4DnsServer() {
        String[] servers = getServers();
        for (int i = 0; i < servers.length; i++) {
            if (servers[i].indexOf(":") < 0) {
                return servers[i];
            }
        }
        return "8.8.8.8";
    }

    public String[] getServers() {
        String[] serversMethodSystemProperties = getServersMethodSystemProperties();
        if (serversMethodSystemProperties != null && serversMethodSystemProperties.length > 0) {
            return serversMethodSystemProperties;
        }
        serversMethodSystemProperties = getServersMethodConnectivityManager();
        if (serversMethodSystemProperties != null && serversMethodSystemProperties.length > 0) {
            return serversMethodSystemProperties;
        }
        serversMethodSystemProperties = getServersMethodExec();
        if (serversMethodSystemProperties == null || serversMethodSystemProperties.length <= 0) {
            return FACTORY_DNS_SERVERS;
        }
        return serversMethodSystemProperties;
    }

    private String[] getServersMethodConnectivityManager() {
        if (VERSION.SDK_INT >= 21) {
            try {
                ArrayList arrayList = new ArrayList();
                Collection arrayList2 = new ArrayList();
                ConnectivityManager connectivityManager = (ConnectivityManager) this.context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    for (Network network : connectivityManager.getAllNetworks()) {
                        if (connectivityManager.getNetworkInfo(network).isConnected()) {
                            LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
                            List<InetAddress> dnsServers = linkProperties.getDnsServers();
                            if (linkPropertiesHasDefaultRoute(linkProperties)) {
                                for (InetAddress hostAddress : dnsServers) {
                                    arrayList.add(hostAddress.getHostAddress());
                                }
                            } else {
                                for (InetAddress hostAddress2 : dnsServers) {
                                    arrayList2.add(hostAddress2.getHostAddress());
                                }
                            }
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList.addAll(arrayList2);
                }
                if (arrayList.size() > 0) {
                    return (String[]) arrayList.toArray(new String[0]);
                }
            } catch (Throwable e) {
                Log.d(TAG, "Exception detecting DNS servers using ConnectivityManager method", e);
            }
        }
        return null;
    }

    private String[] getServersMethodSystemProperties() {
        if (VERSION.SDK_INT < 26) {
            ArrayList arrayList = new ArrayList();
            try {
                Method method = Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class});
                String[] strArr = new String[]{"net.dns1", "net.dns2", "net.dns3", "net.dns4"};
                for (int i = 0; i < strArr.length; i++) {
                    String str = (String) method.invoke(null, new Object[]{strArr[i]});
                    if (str != null && ((str.matches("^\\d+(\\.\\d+){3}$") || str.matches("^[0-9a-f]+(:[0-9a-f]*)+:[0-9a-f]+$")) && !arrayList.contains(str))) {
                        arrayList.add(str);
                    }
                }
                if (arrayList.size() > 0) {
                    return (String[]) arrayList.toArray(new String[0]);
                }
            } catch (Throwable e) {
                Log.d(TAG, "Exception detecting DNS servers using SystemProperties method", e);
            }
        }
        return null;
    }

    private String[] getServersMethodExec() {
        if (VERSION.SDK_INT >= 16) {
            try {
                Set methodExecParseProps = methodExecParseProps(new LineNumberReader(new InputStreamReader(Runtime.getRuntime().exec("getprop").getInputStream())));
                if (methodExecParseProps != null && methodExecParseProps.size() > 0) {
                    return (String[]) methodExecParseProps.toArray(new String[0]);
                }
            } catch (Throwable e) {
                Log.d(TAG, "Exception in getServersMethodExec", e);
            }
        }
        return null;
    }

    private Set<String> methodExecParseProps(BufferedReader bufferedReader) {
        Set<String> hashSet = new HashSet(10);
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return hashSet;
            }
            int indexOf = readLine.indexOf(METHOD_EXEC_PROP_DELIM);
            if (indexOf != -1) {
                String substring = readLine.substring(1, indexOf);
                indexOf += METHOD_EXEC_PROP_DELIM.length();
                int length = readLine.length() - 1;
                if (length < indexOf) {
                    String str = TAG;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Malformed property detected: \"");
                    stringBuilder.append(readLine);
                    stringBuilder.append('\"');
                    Log.d(str, stringBuilder.toString());
                } else {
                    readLine = readLine.substring(indexOf, length);
                    if (!readLine.isEmpty()) {
                        if (substring.endsWith(".dns") || substring.endsWith(".dns1") || substring.endsWith(".dns2") || substring.endsWith(".dns3") || substring.endsWith(".dns4")) {
                            InetAddress byName = InetAddress.getByName(readLine);
                            if (byName != null) {
                                readLine = byName.getHostAddress();
                                if (readLine != null) {
                                    if (readLine.length() != 0) {
                                        hashSet.add(readLine);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @TargetApi(21)
    private boolean linkPropertiesHasDefaultRoute(LinkProperties linkProperties) {
        for (RouteInfo isDefaultRoute : linkProperties.getRoutes()) {
            if (isDefaultRoute.isDefaultRoute()) {
                return true;
            }
        }
        return null;
    }
}
