package pers.wujn.javase.string;

import java.util.Arrays;

/**
 * @author wujunnan
 * @date 2021/11/29
 */
public class Split {
    public static void main(String[] args) {
        //test01();
        //test02();
        //test03();
        test04();
    }

    private static void test04() {
        String target = "abc";
        String[] res = target.split("a");
        System.out.println(Arrays.toString(res));
    }

    private static void test01() {
        String source = "a,1b/1c";
        String[] results = source.split("[,/]1");
        System.out.println(Arrays.toString(results));
    }

    private static void test02() {
        //根据\"进行分隔 \"
        String target = "a\\\"b";
        System.out.println(target);
        //正则引擎需要读到的是 \" -> 都是那么java需要传入正则引擎的是 \\" -> 那么需要传入正则引擎的是 \\\\\"
        String[] result = target.split("\\\\\"");
        System.out.println(Arrays.toString(result));
    }

    private static void test03() {
        //根据\"进行分隔 \"
        String target = "a\"b";
        System.out.println(target);
        String[] result = target.split("\"");
        System.out.println(Arrays.toString(result));
    }
}
