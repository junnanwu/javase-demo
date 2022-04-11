package pers.wujn.javase.math;

import java.text.DecimalFormat;

/**
 * @author wujunnan
 * @date 2021/12/21
 */
public class Round {
    public static void main(String[] args) {
        test01();
    }

    private static void test01() {
        int a = 1;
        int b = 3;
        System.out.println((double)(Math.round(a/b)/100.0));
        System.out.println( new DecimalFormat("0.00").format((double) a/b));
    }
}
