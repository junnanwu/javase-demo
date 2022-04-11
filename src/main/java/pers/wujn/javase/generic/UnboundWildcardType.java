package pers.wujn.javase.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 无界定范型
 *
 * @author wujunnan
 * @date 2022/03/29
 */
public class UnboundWildcardType {
    public static void main(String[] args) {
        List<?> list1 = new ArrayList<>();
        list1.add(null);

        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");

        List list3 = new ArrayList();
        list3.add(1);
        list3.add("1");
        print(list2);
        print(list3);
    }

    public static void unsafeAdd(List strings, Object o){
        strings.add(o);
    }

    public static void print(List<?> strings){
        for (Object string : strings) {
            System.out.println(string);
        }
    }
}
