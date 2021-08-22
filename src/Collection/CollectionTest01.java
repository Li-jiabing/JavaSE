package Collection;

import com.company.day08.Student;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 关于java.util.collection接口中的常用方法
 *      1.Collection中能使用什么元素
 *          没有使用"泛型"之前，Collection中可以存储Object的所有子类型
 *          使用了"泛型"之后，Collection中只能存储某个具体的类型
 *          集合后期我么会学习"泛型"语法，目前先不用管。Collection中什么都能存储
 *          只要是Object的子类型就行（集合中不能直接存储基本数据类型，也不能存储对象，只能存储java对象的内存地址）
 *
 *      2.Collection中的常用方法
 *          boolean add(Object e)
 */
public class CollectionTest01 {
    public static void main(String[] args) {
        //创建一个集合对象
//      Collection collection = new Collection();//接口是抽象的，无法实例化new对象

        Collection collection = new ArrayList();//多态

        //测试Collection方法中的常用方法
        //java 5 的新特性
        collection.add(100);//自动装箱，实际上是放了一个对象的内存地址进去。Integer x = new Integer(100)
        collection.add(3.14);//自动装箱
        collection.add(new Object());
        collection.add(new Student());
        collection.add(true);//自动装箱

        //size()，获取集合中元素个数的方法
        int a = collection.size();
        System.out.println(a);

        //clear() 移除collection中所有元素
        collection.clear();

        int ac = collection.size();
        System.out.println(ac);

        //再向集合中添加元素
        collection.add("hello");//实际上是"hello"对像的内存地址放到了集合中
        collection.add("world");
        collection.add("浩ke");
        collection.add("绿巨人");

        //contains(Object o)   查看集合中是否包含这个元素
        System.out.println(collection.contains("绿巨人"));
    }
}
