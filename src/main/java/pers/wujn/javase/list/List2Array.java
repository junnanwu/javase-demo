package pers.wujn.javase.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wujunnan
 * @date 2021/11/10
 */
public class List2Array {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(){{
            add("1");
            add("2");
            add("3");
            add("4");
        }};
        System.out.println(list);
        System.out.println(Arrays.toString(list.toArray(new String[]{})));
    }
}
