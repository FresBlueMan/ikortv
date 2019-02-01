package tv.danmaku.ijk.media.player.misc;

import android.annotation.TargetApi;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import tv.danmaku.ijk.media.player.IjkMediaMeta.IjkStreamMeta;

public class IjkMediaFormat implements IMediaFormat {
    public static final String CODEC_NAME_H264 = "h264";
    public static final String KEY_IJK_BIT_RATE_UI = "ijk-bit-rate-ui";
    public static final String KEY_IJK_CHANNEL_UI = "ijk-channel-ui";
    public static final String KEY_IJK_CODEC_LONG_NAME_UI = "ijk-codec-long-name-ui";
    public static final String KEY_IJK_CODEC_NAME_UI = "ijk-codec-name-ui";
    public static final String KEY_IJK_CODEC_PIXEL_FORMAT_UI = "ijk-pixel-format-ui";
    public static final String KEY_IJK_CODEC_PROFILE_LEVEL_UI = "ijk-profile-level-ui";
    public static final String KEY_IJK_FRAME_RATE_UI = "ijk-frame-rate-ui";
    public static final String KEY_IJK_RESOLUTION_UI = "ijk-resolution-ui";
    public static final String KEY_IJK_SAMPLE_RATE_UI = "ijk-sample-rate-ui";
    private static final Map<String, Formatter> sFormatterMap = new HashMap();
    public final IjkStreamMeta mMediaFormat;

    private static abstract class Formatter {
        protected abstract String doFormat(IjkMediaFormat ijkMediaFormat);

        protected String getDefaultString() {
            return "N/A";
        }

        private Formatter() {
        }

        public String format(IjkMediaFormat ijkMediaFormat) {
            ijkMediaFormat = doFormat(ijkMediaFormat);
            return TextUtils.isEmpty(ijkMediaFormat) ? getDefaultString() : ijkMediaFormat;
        }
    }

    /* renamed from: tv.danmaku.ijk.media.player.misc.IjkMediaFormat$1 */
    class C12251 extends Formatter {
        C12251() {
            super();
        }

        public String doFormat(IjkMediaFormat ijkMediaFormat) {
            return IjkMediaFormat.this.mMediaFormat.getString(IjkMediaMeta.IJKM_KEY_CODEC_LONG_NAME);
        }
    }

    /* renamed from: tv.danmaku.ijk.media.player.misc.IjkMediaFormat$2 */
    class C12262 extends Formatter {
        C12262() {
            super();
        }

        public String doFormat(IjkMediaFormat ijkMediaFormat) {
            return IjkMediaFormat.this.mMediaFormat.getString(IjkMediaMeta.IJKM_KEY_CODEC_NAME);
        }
    }

    /* renamed from: tv.danmaku.ijk.media.player.misc.IjkMediaFormat$3 */
    class C12273 extends Formatter {
        C12273() {
            super();
        }

        protected String doFormat(IjkMediaFormat ijkMediaFormat) {
            ijkMediaFormat = ijkMediaFormat.getInteger(IjkMediaMeta.IJKM_KEY_BITRATE);
            if (ijkMediaFormat <= null) {
                return null;
            }
            if (ijkMediaFormat < 1000) {
                return String.format(Locale.US, "%d bit/s", new Object[]{Integer.valueOf(ijkMediaFormat)});
            }
            return String.format(Locale.US, "%d kb/s", new Object[]{Integer.valueOf(ijkMediaFormat / 1000)});
        }
    }

    /* renamed from: tv.danmaku.ijk.media.player.misc.IjkMediaFormat$4 */
    class C12284 extends Formatter {
        C12284() {
            super();
        }

        protected String doFormat(IjkMediaFormat ijkMediaFormat) {
            String str;
            switch (ijkMediaFormat.getInteger(IjkMediaMeta.IJKM_KEY_CODEC_PROFILE_ID)) {
                case 44:
                    str = "CAVLC 4:4:4";
                    break;
                case 66:
                    str = "Baseline";
                    break;
                case 77:
                    str = "Main";
                    break;
                case 88:
                    str = "Extended";
                    break;
                case 100:
                    str = "High";
                    break;
                case 110:
                    str = "High 10";
                    break;
                case IjkMediaMeta.FF_PROFILE_H264_HIGH_422 /*122*/:
                    str = "High 4:2:2";
                    break;
                case IjkMediaMeta.FF_PROFILE_H264_HIGH_444 /*144*/:
                    str = "High 4:4:4";
                    break;
                case IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE /*244*/:
                    str = "High 4:4:4 Predictive";
                    break;
                case IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED_BASELINE /*578*/:
                    str = "Constrained Baseline";
                    break;
                case IjkMediaMeta.FF_PROFILE_H264_HIGH_10_INTRA /*2158*/:
                    str = "High 10 Intra";
                    break;
                case IjkMediaMeta.FF_PROFILE_H264_HIGH_422_INTRA /*2170*/:
                    str = "High 4:2:2 Intra";
                    break;
                case IjkMediaMeta.FF_PROFILE_H264_HIGH_444_INTRA /*2292*/:
                    str = "High 4:4:4 Intra";
                    break;
                default:
                    return null;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            Object string = ijkMediaFormat.getString(IjkMediaMeta.IJKM_KEY_CODEC_NAME);
            if (!TextUtils.isEmpty(string) && string.equalsIgnoreCase(IjkMediaFormat.CODEC_NAME_H264)) {
                ijkMediaFormat = ijkMediaFormat.getInteger(IjkMediaMeta.IJKM_KEY_CODEC_LEVEL);
                if (ijkMediaFormat < 10) {
                    return stringBuilder.toString();
                }
                stringBuilder.append(" Profile Level ");
                stringBuilder.append((ijkMediaFormat / 10) % 10);
                ijkMediaFormat %= 10;
                if (ijkMediaFormat != null) {
                    stringBuilder.append(".");
                    stringBuilder.append(ijkMediaFormat);
                }
            }
            return stringBuilder.toString();
        }
    }

    /* renamed from: tv.danmaku.ijk.media.player.misc.IjkMediaFormat$5 */
    class C12295 extends Formatter {
        C12295() {
            super();
        }

        protected String doFormat(IjkMediaFormat ijkMediaFormat) {
            return ijkMediaFormat.getString(IjkMediaMeta.IJKM_KEY_CODEC_PIXEL_FORMAT);
        }
    }

    /* renamed from: tv.danmaku.ijk.media.player.misc.IjkMediaFormat$6 */
    class C12306 extends Formatter {
        C12306() {
            super();
        }

        protected String doFormat(IjkMediaFormat ijkMediaFormat) {
            int integer = ijkMediaFormat.getInteger("width");
            int integer2 = ijkMediaFormat.getInteger("height");
            int integer3 = ijkMediaFormat.getInteger(IjkMediaMeta.IJKM_KEY_SAR_NUM);
            ijkMediaFormat = ijkMediaFormat.getInteger(IjkMediaMeta.IJKM_KEY_SAR_DEN);
            if (integer > 0) {
                if (integer2 > 0) {
                    if (integer3 > 0) {
                        if (ijkMediaFormat > null) {
                            return String.format(Locale.US, "%d x %d [SAR %d:%d]", new Object[]{Integer.valueOf(integer), Integer.valueOf(integer2), Integer.valueOf(integer3), Integer.valueOf(ijkMediaFormat)});
                        }
                    }
                    return String.format(Locale.US, "%d x %d", new Object[]{Integer.valueOf(integer), Integer.valueOf(integer2)});
                }
            }
            return null;
        }
    }

    /* renamed from: tv.danmaku.ijk.media.player.misc.IjkMediaFormat$7 */
    class C12317 extends Formatter {
        C12317() {
            super();
        }

        protected String doFormat(IjkMediaFormat ijkMediaFormat) {
            int integer = ijkMediaFormat.getInteger(IjkMediaMeta.IJKM_KEY_FPS_NUM);
            ijkMediaFormat = ijkMediaFormat.getInteger(IjkMediaMeta.IJKM_KEY_FPS_DEN);
            if (integer > 0) {
                if (ijkMediaFormat > null) {
                    return String.valueOf(((float) integer) / ((float) ijkMediaFormat));
                }
            }
            return null;
        }
    }

    /* renamed from: tv.danmaku.ijk.media.player.misc.IjkMediaFormat$8 */
    class C12328 extends Formatter {
        C12328() {
            super();
        }

        protected String doFormat(IjkMediaFormat ijkMediaFormat) {
            if (ijkMediaFormat.getInteger(IjkMediaMeta.IJKM_KEY_SAMPLE_RATE) <= null) {
                return null;
            }
            return String.format(Locale.US, "%d Hz", new Object[]{Integer.valueOf(ijkMediaFormat.getInteger(IjkMediaMeta.IJKM_KEY_SAMPLE_RATE))});
        }
    }

    /* renamed from: tv.danmaku.ijk.media.player.misc.IjkMediaFormat$9 */
    class C12339 extends Formatter {
        C12339() {
            super();
        }

        protected String doFormat(IjkMediaFormat ijkMediaFormat) {
            ijkMediaFormat = ijkMediaFormat.getInteger(IjkMediaMeta.IJKM_KEY_CHANNEL_LAYOUT);
            if (ijkMediaFormat <= null) {
                return null;
            }
            long j = (long) ijkMediaFormat;
            if (j == 4) {
                return "mono";
            }
            if (j == 3) {
                return "stereo";
            }
            return String.format(Locale.US, "%x", new Object[]{Integer.valueOf(ijkMediaFormat)});
        }
    }

    public IjkMediaFormat(IjkStreamMeta ijkStreamMeta) {
        sFormatterMap.put(KEY_IJK_CODEC_LONG_NAME_UI, new C12251());
        sFormatterMap.put(KEY_IJK_CODEC_NAME_UI, new C12262());
        sFormatterMap.put(KEY_IJK_BIT_RATE_UI, new C12273());
        sFormatterMap.put(KEY_IJK_CODEC_PROFILE_LEVEL_UI, new C12284());
        sFormatterMap.put(KEY_IJK_CODEC_PIXEL_FORMAT_UI, new C12295());
        sFormatterMap.put(KEY_IJK_RESOLUTION_UI, new C12306());
        sFormatterMap.put(KEY_IJK_FRAME_RATE_UI, new C12317());
        sFormatterMap.put(KEY_IJK_SAMPLE_RATE_UI, new C12328());
        sFormatterMap.put(KEY_IJK_CHANNEL_UI, new C12339());
        this.mMediaFormat = ijkStreamMeta;
    }

    @TargetApi(16)
    public int getInteger(String str) {
        if (this.mMediaFormat == null) {
            return null;
        }
        return this.mMediaFormat.getInt(str);
    }

    public String getString(String str) {
        if (this.mMediaFormat == null) {
            return null;
        }
        if (sFormatterMap.containsKey(str)) {
            return ((Formatter) sFormatterMap.get(str)).format(this);
        }
        return this.mMediaFormat.getString(str);
    }
}
