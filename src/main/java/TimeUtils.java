public class TimeUtils {

    public static int timeToSec(String time) {
        String[] part = time.split(":");
        int hh = Integer.parseInt(part[0]);
        int mm = Integer.parseInt(part[1]);
        int ss = Integer.parseInt(part[2]);

        return 3600 * hh + 60 * mm + ss;
    }

    public static String secToTime(double a) {
        int hh, mm, ss;

        int val = (int) Math.round(a);

        if (val < 0 || val >= 32000) {
            return "-1";
        }

        hh = val / 3600;
            val = val - (3600 * hh);
            mm = val / 60;
            ss = val - (60 * mm);

            String res = hh + ":";
            if (mm <= 10) {
                res = res + "0" + mm + ":";
            } else {
                res = res + mm + ":";
            }
            if (ss <= 10) {
                res = res + "0" + ss;
            } else {
                res = res + ss;
            }

            return res;
    }
}
