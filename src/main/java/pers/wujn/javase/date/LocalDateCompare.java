package pers.wujn.javase.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author wujunnan
 * @date 2022/01/14
 */
public class LocalDateCompare {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate yesterday = today.minusDays(1);
        LocalDate oneDay= LocalDate.parse("2022-03-29");
        System.out.println(oneDay);
        System.out.println(today.compareTo(yesterday));
        System.out.println(today.compareTo(oneDay));
        System.out.println(" today.isBefore(yesterday) -- "+today.isBefore(yesterday));
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.getHour());
    }
}
