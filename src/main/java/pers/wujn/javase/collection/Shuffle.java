package pers.wujn.javase.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author wujunnan
 * @date 2022/01/11
 */
public class Shuffle {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("shencheng", "limeichen", "yinkai", "zhangyubo", "houyaqian", "wangwei", "wujunnan", "diaozenan", "maoyibo");
        Collections.shuffle(list);
        System.out.println(list);
    }
}
