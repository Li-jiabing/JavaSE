package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 测试list接口中的常用方法
 *  1.list集合存储元素特点：有序可重复
 *      有序：list集合中的元素有下标
 *      从0开始，以1递增
 *      可重复：存储一个1，还可以再存储一个1
 *  2.list既然是Collection接口中的字接口，那么肯定list接口有自己的"特色"方法：
 *      以下只列出list接口特有的常用的方法
 *      void add(int index,E element)
 *      E get(int index)
 *      int indexOf(Object o)
 *      int lastIndexOf(Object o)
 *      E remove(int index)
 *      E set(int index，E element)
 *
 */
public class ListTest01 {
    public static void main(String[] args) {
        //创建list类型的集合。
        //List myList = new LinkedList();
        //List myList = new Vector();
        List list = new ArrayList();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        //在列表的指定位置插入指定元素（第一个参数是下标）
        //这个方法使用不多，因为对于ArrayList来说效率比较低
        list.add(1,"KING");// index是在指定下标的位置加一个元素


        //迭代
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object elt = iterator.next();
            System.out.println(elt);
        }

        //根据下标获取集合指定位置元素
        System.out.println(list.get(0));

        //根据元素获取下标
        int index = list.indexOf("KING");
        System.out.println(index);

        //获取指定元素最后一次出现的索引
        int lastIndex = list.lastIndexOf("A");
        System.out.println(lastIndex);

        //删除指定元素
        list.remove("A");
        for (int i = 0; i < list.size(); i++) {
            System.err.println(list.get(i));
        }

        //添加元素
        list.set(0,"lijiabing");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
