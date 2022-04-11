package pers.wujn.javase.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * @author wujunnan
 * @date 2021/12/16
 */
public class Array2List {
    public static void main(String[] args) {
        String[] strings = {"1","2","3"};
        ArrayList<String> arrayList = new ArrayList<>();
        boolean b = Collections.addAll(arrayList, strings);
        arrayList.remove(0);
        System.out.println(arrayList);



        List<String> collect = Arrays.asList(strings);
        System.out.println(Arrays.toString(collect.toArray()));
        collect.remove(0);
    }
}
