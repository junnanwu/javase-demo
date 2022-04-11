package pers.wujn.javase.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * @author wujunnan
 * @date 2022/02/26
 */
public class MapOrder {
    /**
     * 使用HashMap并不能保证插入的顺序，得到的set是HashMap内部的keySet
     * 使用LinkedHashMap能保证插入的顺序，得到的set是LinkedHashMap内部的LinkedKeySet
     */
    public static void main(String[] args) {
        HashMap<Object, Object> map = new LinkedHashMap<>();
        map.put("aa1",1);
        map.put("aa3",1);
        map.put("aa2",1);
        map.put("d",1);
        map.put("f",1);
        Set<Object> keys = map.keySet();
        for (Object key : keys) {
            System.out.println(key);
        }
    }
}
