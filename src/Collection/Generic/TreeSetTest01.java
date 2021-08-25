package Collection.Generic;

import java.util.TreeSet;

/**
 * TreeSet集合存储元素特点：
 *      1.无序不可重复的，但是存储的元素可以自动按照大小顺序排序
 *      称为：可排序集合
 *
 *      2.无序指的是存进去的顺序和取出来的顺序不同，并且没有下标
 */
public class TreeSetTest01 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("hello1");
        treeSet.add("hello3");
        treeSet.add("hello5");
        treeSet.add("hello3");
        treeSet.add("hello4");
//        hello1
//        hello3
//        hello4
//        hello5
//        从小到大自动排序
        for (String s : treeSet
             ) {
            System.out.println(s);
        }

        System.out.println(8000/60/2
        );
    }
}
