package MyPractice.TencentC;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calender {

    public static void main(String[] args){
        String a = "2019-10-1"; // 时间字符串
        String b = "2019-11-1";

        Long between_dayInteger = between_days(a, b);

        System.out.println(between_dayInteger);
    }

    public static Long between_days(String a, String b) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Calendar calendar_a = Calendar.getInstance();
        Calendar calendar_b = Calendar.getInstance();

        Date date_a = null;
        Date date_b = null;

        try {
            date_a = simpleDateFormat.parse(a);
            date_b = simpleDateFormat.parse(b);
            calendar_a.setTime(date_a);
            calendar_b.setTime(date_b);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        long time_a = calendar_a.getTimeInMillis();
        long time_b = calendar_b.getTimeInMillis();

        long between_days = (time_b - time_a) / (1000 * 3600 * 24);

        return between_days;
    }
}
