package pers.wujn.javase.set;

import java.util.HashSet;

/**
 * @author wujunnan
 * @date 2021/12/16
 */
public class Equal {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<String>(){{
            add("wujunnan");
            add("liuxiao");
            add("houyaqian");
        }};
        HashSet<String> set2 = new HashSet<String>(){{
            add("wujunnan");
            add("houyaqian");
            add("liuxiao");
        }};
        System.out.println(set1.equals(set2));
    }
}
