package com.google.gson.internal.bind.p041a;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* compiled from: ISO8601Utils */
/* renamed from: com.google.gson.internal.bind.a.a */
public class C0462a {
    /* renamed from: a */
    private static final TimeZone f422a = TimeZone.getTimeZone("UTC");

    /* renamed from: a */
    public static Date m691a(String str, ParsePosition parsePosition) {
        Throwable e;
        String message;
        StringBuilder stringBuilder;
        ParseException parseException;
        String str2 = str;
        ParsePosition parsePosition2 = parsePosition;
        StringBuilder stringBuilder2;
        try {
            int index = parsePosition.getIndex();
            int i = index + 4;
            index = C0462a.m690a(str2, index, i);
            if (C0462a.m692a(str2, i, '-')) {
                i++;
            }
            int i2 = i + 2;
            i = C0462a.m690a(str2, i, i2);
            if (C0462a.m692a(str2, i2, '-')) {
                i2++;
            }
            int i3 = i2 + 2;
            i2 = C0462a.m690a(str2, i2, i3);
            boolean a = C0462a.m692a(str2, i3, 'T');
            if (a || str.length() > i3) {
                int i4;
                int i5;
                int i6;
                int i7;
                char charAt;
                TimeZone timeZone;
                String substring;
                StringBuilder stringBuilder3;
                TimeZone timeZone2;
                String id;
                Calendar gregorianCalendar;
                if (a) {
                    i3++;
                    i4 = i3 + 2;
                    i3 = C0462a.m690a(str2, i3, i4);
                    if (C0462a.m692a(str2, i4, ':')) {
                        i4++;
                    }
                    i5 = i4 + 2;
                    i4 = C0462a.m690a(str2, i4, i5);
                    if (C0462a.m692a(str2, i5, ':')) {
                        i5++;
                    }
                    if (str.length() > i5) {
                        char charAt2 = str2.charAt(i5);
                        if (!(charAt2 == 'Z' || charAt2 == '+' || charAt2 == '-')) {
                            i6 = i5 + 2;
                            i5 = C0462a.m690a(str2, i5, i6);
                            i7 = 59;
                            if (i5 <= 59 || i5 >= 63) {
                                i7 = i5;
                            }
                            if (C0462a.m692a(str2, i6, '.')) {
                                i6++;
                                i5 = C0462a.m689a(str2, i6 + 1);
                                int min = Math.min(i5, i6 + 3);
                                int a2 = C0462a.m690a(str2, i6, min);
                                switch (min - i6) {
                                    case 1:
                                        a2 *= 100;
                                        break;
                                    case 2:
                                        a2 *= 10;
                                        break;
                                    default:
                                        break;
                                }
                                i6 = a2;
                            } else {
                                i5 = i6;
                                i6 = 0;
                            }
                            if (str.length() <= i5) {
                                charAt = str2.charAt(i5);
                                if (charAt != 'Z') {
                                    timeZone = f422a;
                                    i5++;
                                } else {
                                    if (charAt != '+') {
                                        if (charAt == '-') {
                                            stringBuilder2 = new StringBuilder();
                                            stringBuilder2.append("Invalid time zone indicator '");
                                            stringBuilder2.append(charAt);
                                            stringBuilder2.append("'");
                                            throw new IndexOutOfBoundsException(stringBuilder2.toString());
                                        }
                                    }
                                    substring = str2.substring(i5);
                                    if (substring.length() >= 5) {
                                        stringBuilder3 = new StringBuilder();
                                        stringBuilder3.append(substring);
                                        stringBuilder3.append("00");
                                        substring = stringBuilder3.toString();
                                    }
                                    i5 += substring.length();
                                    if (!"+0000".equals(substring)) {
                                        if ("+00:00".equals(substring)) {
                                            stringBuilder3 = new StringBuilder();
                                            stringBuilder3.append("GMT");
                                            stringBuilder3.append(substring);
                                            substring = stringBuilder3.toString();
                                            timeZone2 = TimeZone.getTimeZone(substring);
                                            id = timeZone2.getID();
                                            if (!id.equals(substring)) {
                                                if (id.replace(":", "").equals(substring)) {
                                                    stringBuilder2 = new StringBuilder();
                                                    stringBuilder2.append("Mismatching time zone indicator: ");
                                                    stringBuilder2.append(substring);
                                                    stringBuilder2.append(" given, resolves to ");
                                                    stringBuilder2.append(timeZone2.getID());
                                                    throw new IndexOutOfBoundsException(stringBuilder2.toString());
                                                }
                                            }
                                            timeZone = timeZone2;
                                        }
                                    }
                                    timeZone = f422a;
                                }
                                gregorianCalendar = new GregorianCalendar(timeZone);
                                gregorianCalendar.setLenient(false);
                                gregorianCalendar.set(1, index);
                                gregorianCalendar.set(2, i - 1);
                                gregorianCalendar.set(5, i2);
                                gregorianCalendar.set(11, i3);
                                gregorianCalendar.set(12, i4);
                                gregorianCalendar.set(13, i7);
                                gregorianCalendar.set(14, i6);
                                parsePosition2.setIndex(i5);
                                return gregorianCalendar.getTime();
                            }
                            throw new IllegalArgumentException("No time zone indicator");
                        }
                    }
                }
                i5 = i3;
                i3 = 0;
                i4 = 0;
                i6 = 0;
                i7 = 0;
                if (str.length() <= i5) {
                    throw new IllegalArgumentException("No time zone indicator");
                }
                charAt = str2.charAt(i5);
                if (charAt != 'Z') {
                    if (charAt != '+') {
                        if (charAt == '-') {
                            stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("Invalid time zone indicator '");
                            stringBuilder2.append(charAt);
                            stringBuilder2.append("'");
                            throw new IndexOutOfBoundsException(stringBuilder2.toString());
                        }
                    }
                    substring = str2.substring(i5);
                    if (substring.length() >= 5) {
                        stringBuilder3 = new StringBuilder();
                        stringBuilder3.append(substring);
                        stringBuilder3.append("00");
                        substring = stringBuilder3.toString();
                    }
                    i5 += substring.length();
                    if ("+0000".equals(substring)) {
                        if ("+00:00".equals(substring)) {
                            stringBuilder3 = new StringBuilder();
                            stringBuilder3.append("GMT");
                            stringBuilder3.append(substring);
                            substring = stringBuilder3.toString();
                            timeZone2 = TimeZone.getTimeZone(substring);
                            id = timeZone2.getID();
                            if (id.equals(substring)) {
                                if (id.replace(":", "").equals(substring)) {
                                    stringBuilder2 = new StringBuilder();
                                    stringBuilder2.append("Mismatching time zone indicator: ");
                                    stringBuilder2.append(substring);
                                    stringBuilder2.append(" given, resolves to ");
                                    stringBuilder2.append(timeZone2.getID());
                                    throw new IndexOutOfBoundsException(stringBuilder2.toString());
                                }
                            }
                            timeZone = timeZone2;
                        }
                    }
                    timeZone = f422a;
                } else {
                    timeZone = f422a;
                    i5++;
                }
                gregorianCalendar = new GregorianCalendar(timeZone);
                gregorianCalendar.setLenient(false);
                gregorianCalendar.set(1, index);
                gregorianCalendar.set(2, i - 1);
                gregorianCalendar.set(5, i2);
                gregorianCalendar.set(11, i3);
                gregorianCalendar.set(12, i4);
                gregorianCalendar.set(13, i7);
                gregorianCalendar.set(14, i6);
                parsePosition2.setIndex(i5);
                return gregorianCalendar.getTime();
            }
            Calendar gregorianCalendar2 = new GregorianCalendar(index, i - 1, i2);
            parsePosition2.setIndex(i3);
            return gregorianCalendar2.getTime();
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            if (str2 == null) {
                str2 = null;
            } else {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append('\"');
                stringBuilder2.append(str2);
                stringBuilder2.append("'");
                str2 = stringBuilder2.toString();
            }
            message = e.getMessage();
            if (message == null || message.isEmpty()) {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("(");
                stringBuilder2.append(e.getClass().getName());
                stringBuilder2.append(")");
                message = stringBuilder2.toString();
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to parse date [");
            stringBuilder.append(str2);
            stringBuilder.append("]: ");
            stringBuilder.append(message);
            parseException = new ParseException(stringBuilder.toString(), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (NumberFormatException e3) {
            e = e3;
            if (str2 == null) {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append('\"');
                stringBuilder2.append(str2);
                stringBuilder2.append("'");
                str2 = stringBuilder2.toString();
            } else {
                str2 = null;
            }
            message = e.getMessage();
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("(");
            stringBuilder2.append(e.getClass().getName());
            stringBuilder2.append(")");
            message = stringBuilder2.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to parse date [");
            stringBuilder.append(str2);
            stringBuilder.append("]: ");
            stringBuilder.append(message);
            parseException = new ParseException(stringBuilder.toString(), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IllegalArgumentException e4) {
            e = e4;
            if (str2 == null) {
                str2 = null;
            } else {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append('\"');
                stringBuilder2.append(str2);
                stringBuilder2.append("'");
                str2 = stringBuilder2.toString();
            }
            message = e.getMessage();
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("(");
            stringBuilder2.append(e.getClass().getName());
            stringBuilder2.append(")");
            message = stringBuilder2.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to parse date [");
            stringBuilder.append(str2);
            stringBuilder.append("]: ");
            stringBuilder.append(message);
            parseException = new ParseException(stringBuilder.toString(), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        }
    }

    /* renamed from: a */
    private static boolean m692a(String str, int i, char c) {
        return (i >= str.length() || str.charAt(i) != c) ? null : true;
    }

    /* renamed from: a */
    private static int m690a(String str, int i, int i2) {
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        int digit;
        if (i < i2) {
            int i3 = i + 1;
            digit = Character.digit(str.charAt(i), 10);
            if (digit >= 0) {
                digit = -digit;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid number: ");
                stringBuilder.append(str.substring(i, i2));
                throw new NumberFormatException(stringBuilder.toString());
            }
        }
        i3 = i;
        digit = 0;
        while (i3 < i2) {
            int i4 = i3 + 1;
            i3 = Character.digit(str.charAt(i3), 10);
            if (i3 >= 0) {
                digit = (digit * 10) - i3;
                i3 = i4;
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid number: ");
                stringBuilder.append(str.substring(i, i2));
                throw new NumberFormatException(stringBuilder.toString());
            }
        }
        return -digit;
    }

    /* renamed from: a */
    private static int m689a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt >= '0') {
                if (charAt <= '9') {
                    i++;
                }
            }
            return i;
        }
        return str.length();
    }
}
