package List;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList集合：
 *  1.默认初始化容量10（底层先创建了一个长度为0的数组，当添加第一个元素的时候，初始化容量10）
 *  2.集合底层是一个Object[]数组
 *  3.构造方法：
 *      new ArrayList()
 *      new ArrayLIst(20)
 *  4.ArrayList集合的扩容是原集合的1.5倍
 *
 *      ArrayList集合底层是数组？怎么优化？
 *      尽可能少的扩容，因为数组扩容效率比较低，建议在使用ArrayList集合的时候预估计元素的个数，给定一个初始化容量。
 *
 *  5.数组的优点：
 *      检索效率比较高（每一个元素占用空间大小相同，内存地址是连续的，知道首元素内存地址，然后知道下标。通过
 *      数学表达式计算出元素的内存地址，所以检索效率更高）
 *
 *  6.数组缺点：
 *      随机增删元素效率比较低。
 *      另外数组无法存储大量数据（很难找到一块非常巨大的连续的内存空间）
 *
 *  7.向数组末尾添加元素，效率很高，不受影响
 *
 *  8.面试官经常问的一个问题
 *      这么多集合中，你用哪个集合最多？
 *          答：ArrayList集合。
 *          因为往数组末尾添加元素，效率不受影响
 *          另外，我们检索/查找某个元素的操作比较多
 *
 *  9.ArrayList集合是非线程安全的（不是线程安全的集合）
 */
public class ArrayListTest01 {
    public static void main(String[] args) {
        //默认初始化容量是10
        //数组的长度是10
        List list1 = new ArrayList<>();
        System.out.println(list1.size());

        //指定初始化额容量
        //数组的长度是20
        List list2 = new ArrayList(20);
        System.out.println(list2.size());//size()方法是获取当前集合的元素的个数，不是获取集合的容量

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(10);
        System.out.println(list1.size());
        list1.add(11);

        //100 二进制转换成十进制：0000 0100 右移一位 0000 0010 [4 / 2]
        System.out.println(list1.size());
        //原先是4，现在增长2：增长之后是6，增长之后的容量是之前容量的1.5倍
    }
}
