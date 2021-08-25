package Vector;


import java.util.*;

/**
 * Vector:
 *      1.底层也是一个数组。
 *      2.初始化容量：10
 *      3.怎么扩容的？
 *          扩容之后是原容量的2倍
 *          10--->20--->40--->80
 *
 *      4.ArrayList集合扩容的特点：
 *          ArrayList集合扩容是原容量的1.5倍
 *
 *      5.vector中所有的方法都是线程同步的，效率比较低，使用较少
 *
 *      6.怎么将一个线程不安全的ArrayList集合转换成线程安全的呢？
 *          使用集合接口：
 *              java.util.Collections;
 *
 *              java.util.Collection   是集合接口
 *              java.util.Collections   是集合工具类。
 */
public class VectorTest {
    public static void main(String[] args) {

        //创建一个vector集合
//        Vector vector = new Vector();
        List vector = new Vector();

        //添加元素
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10);

        //满了之后扩容（扩容之后容量是20）
        vector.add(11);

        Iterator iterator = vector.iterator();
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(iterator.next());
        }

        //这个可能以后要用！！！
        List myList = new ArrayList();//非线程安全的
        //变成线程安全的
        Collections.synchronizedList(myList);//这里没有办法看效果，因为多线程没学，先记住

        myList.add("111");
        myList.add("222");
        myList.add("333");
    }

}
