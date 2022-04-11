package pers.wujn.javase.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author wujunnan
 * @date 2022/03/02
 */
public class DateInterval {
    public static void main(String[] args) {
        System.out.println((LocalDate.parse("2022-03-07").toEpochDay() - LocalDate.parse("2022-02-28").toEpochDay()));
        String string = "20220329";
        LocalDate localDate = LocalDate.parse(string, DateTimeFormatter.ofPattern("yyyyMMdd"));
        System.out.println(localDate);
    }
}
