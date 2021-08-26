package Collection;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * TreeSet集合中元素可排序的第二种方式：使用比较器排序。
 * 最终的结论：
 *      放到TreeSet或者TreeMap集合key部分的元素要想做到排序，包括两种方式：
 *          第一种：放在集合中的元素实现java.lang.Comparable接口。
 *          第二种：在构造TreeSet或者TreeMap集合的时候给他传一个比较器对象。
 *
 *      Comparable和Comparator怎么选择呢?
 *      如果比较规则是一成不变的，选择实现Comparable接口，如果比较规则是多变得，则用Comparator比较器接口。
 *      Comparator接口的设计符合OCP原则。
 *
 */
public class TreeSetTest05 {
    public static void main(String[] args) {


        //创建TreeSet集合的时候需要使用这个比较器
//        TreeSet<WuGui> wuGuis = new TreeSet<>();//这样不行，没有通过构造方法传递一个比较器进去
//        TreeSet<WuGui> wuGuis = new TreeSet<> (new WuGuiComparator());

        //大家可以使用匿名内部类的方式
        TreeSet<WuGui> wuGuis = new TreeSet<>(new Comparator<WuGui>() {
            @Override
            public int compare(WuGui o1, WuGui o2) {
                return o1.age-o2.age;
            }
        });
        wuGuis.add(new WuGui(1000));
        wuGuis.add(new WuGui(800));
        wuGuis.add(new WuGui(810));
        for (WuGui wugui : wuGuis
             ) {
            System.out.println(wugui);
        }



    }
}

//乌龟
class WuGui{

    int age;

    public WuGui(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "乌龟{" +
                "age=" + age +
                '}';
    }
}

//单独在这里编写一个比较器
//比较实现java.util.Comparator接口。（Comparator是java.lang包下的，Comparator是java.util包下的）
//class WuGuiComparator implements Comparator<WuGui>{
//
//    @Override
//    public int compare(WuGui o1, WuGui o2) {
//        //指定比较规则
//        //按照年龄排序
//        return o1.age- o2.age;
//    }
//}