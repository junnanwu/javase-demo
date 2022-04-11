package pers.wujn.javase.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @author wujunnan
 * @date 2021/12/16
 */
public class Remove {
    public static void main(String[] args) {
        HashSet<String> set1 = new LinkedHashSet<String>(){{
            add("wujunnan");
            //add("houyaqian");
            //add("liuxiao");
        }};
        HashSet<String> set2 = new LinkedHashSet<String>(){{
            add("wujunnan");
            add("houyaqian");
            add("limeichen");
        }};
        set1.removeAll(set2);
        //set1.retainAll(set2);
        System.out.println(Arrays.toString(set1.toArray()));
        System.out.println(Arrays.toString(set2.toArray()));
    }
}
