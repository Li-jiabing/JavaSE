package Collection.Generic;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet集合：
 *  无序不可重复
 */
public class HashSetTest01 {
    public static void main(String[] args) {
        //演示一下HashSet集合特点
        Set<String> strs = new HashSet<>();
        strs.add("hello1");
        strs.add("hello2");
        strs.add("hello3");
        strs.add("hello4");
        strs.add("hello5");
        strs.add("hello6");
        /*
        hello1
        hello4
        hello5
        hello2
        hello3
        hello6
        无序不可重复
         */
        for (String s : strs
             ) {
            System.out.println(s);
        }
    }
}
