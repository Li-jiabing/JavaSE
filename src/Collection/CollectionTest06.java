package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 关于集合元素的remove()
 *     重点：当集合的结构发生改变时，迭代器必须重新获取，如果还是用以前老得迭代器，会出现异常
 *
 *     重点：在迭代集合元素的过程中，不能调用集合对象的remove方法删除元素
 *          c1.remove(obj),迭代过程中不能这样。
 *
 *
 *     重点：在迭代元素的过程中，一定要使用迭代器Iterator的remove方法删除元素，不要使用集合自带的remove
 */
public class CollectionTest06 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        //如果迭代器在没有添加数据的时候获取，指向的是那时集合中没有元素状态下的迭代器，会报错
        //java.util.ConcurrentModificationException
        //集合结构发生改变，迭代器一定要重新获取
//        //获取迭代器
//        Iterator iterator = c.iterator();

        c.add(1);
        c.add(2);
        c.add(3);

        //获取迭代器
        Iterator iterator = c.iterator();


        while (iterator.hasNext()){
            //编写代码时next()方法返回值类型必须时Object
            Object obj = iterator.next();
            System.out.println(obj);
        }

        Collection c1 = new ArrayList();
        c1.add("abc");
        c1.add("def");
        c1.add("xyz");

        Iterator iterator1 = c1.iterator();
        while (iterator1.hasNext()){
            Object obj = iterator1.next();
            //删除元素
            //删除元素之后，集合的结构发生了变化，应该重新去获取迭代器
            //但是，循环下一次的时候并没有重新获取迭代器，所以会出现异常
//            c1.remove(obj);   直接通过集合去删除元素，没有通知迭代器（导致迭代器的快照和愿集合状态不同）

            //使用迭代器来删除可以吗
            iterator1.remove();//删除的一定是迭代器指向的当前元素

            /**
             * Iterator it = c.iterator();
             *
             * 获取的迭代器对象，迭代器用来遍历集合，此时相当于对当前集合的状态拍了一个快照
             *
             * 迭代器迭代的时候会参照这个快照进行迭代
             *
             * 迭代器去删除时，迭代器会自动更新迭代器，并自动更新集合。
             */
            System.out.println(obj);
        }
        System.out.println(c1.size());
    }
}
