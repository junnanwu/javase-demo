package pers.wujn.javase.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author wujunnan
 * @date 2021/11/21
 */
public class Iterator {

    private static final List<Integer> LIST = new ArrayList<Integer>() {{
        add(1);
        add(2);
        add(3);
    }};

    public static void main(String[] args) {
        ListIterator<Integer> iterator = LIST.listIterator();
        while (iterator.hasNext()) {
            System.out.println("后一个元素index为：" + iterator.nextIndex());
            System.out.println(iterator.next());
            System.out.println("前一个一个元素index为：" + iterator.previousIndex());
        }

    }
}
