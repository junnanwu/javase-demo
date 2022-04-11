package pers.wujn.javase.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author wujunnan
 * @date 2021/11/18
 */
public class Yesterday {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");

        //方法一
        Date yesterday = new Date(System.currentTimeMillis() - 24 * 60 * 60 * 1000);
        String yesterdayString = simpleDateFormat.format(yesterday);
        System.out.println("方法一：昨天日期字符串为：");
        System.out.println(yesterdayString);

        Date previousWeek = new Date(System.currentTimeMillis() - 7 * 24 * 60 * 60 * 1000);
        String previousWeekString = simpleDateFormat.format(previousWeek);
        System.out.println("上周的字符串为：");
        System.out.println(previousWeekString);

        //方法二
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1);
        yesterdayString = simpleDateFormat.format(calendar.getTime());
        System.out.println("方法二：昨天日期字符串为：");
        System.out.println(yesterdayString);


    }
}
