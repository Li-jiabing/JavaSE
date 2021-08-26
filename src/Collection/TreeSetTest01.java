package Collection;

import java.util.TreeSet;

/**
 * TreeSet集合底层实际上是一个TreeMap
 * TreeSet集合底层是一个二叉树
 * 放到TreeSet集合中的元素等同于TreeMap集合key部分
 * TreeSet集合中的元素：无序不可重复，但是可以按照元素的大小顺序自动排序，称为：可排序集合
 */
public class TreeSetTest01 {
    public static void main(String[] args) {
        //创建一个TreeSet集合
        TreeSet<String> ts = new TreeSet();
        //添加String
        ts.add("zhangsan");
        ts.add("lisi");
        ts.add("wangwu");
        ts.add("zhangsi");
        ts.add("zhaoliu");
        for (String s: ts
             ) {
            //按照字典顺序升续
            System.out.println(s);
        }

        TreeSet<Integer> ts2 = new TreeSet<>();
        ts2.add(200);
        ts2.add(500);
        ts2.add(300);
        ts2.add(500);
        ts2.add(800);
        ts2.add(100);
        for (Integer i: ts2
             ) {
            System.out.println(i);

        }
    }
}
