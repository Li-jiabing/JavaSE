package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * *****！！！重要！！！
 * 关于集合遍历/迭代专题
 */
public class CollectionTest02 {
    public static void main(String[] args) {
        //注意：以下讲解的遍历/迭代方式，是所有Collection通用的一种方式
        //在Map集合中不能用，在所有的Collection以及子类中使用。
        Collection collection = new ArrayList();//后面的集合无所谓，主要是看前面的接口怎么遍历/迭代
        collection.add("abc");
        collection.add("def");
        collection.add(100);
        collection.add(new Object());

        //对集合Collection进行遍历/迭代
        //第一步：获取集合对象的迭代器iterator对象
        Iterator iterator = collection.iterator();
        //第二步：通过以上获取的迭代器对象开始迭代/遍历集合。

        /*
         以下两个方法是迭代器对象Iterator中的方法
             boolean hasNext()如果仍有元素可以迭代，则返回true
             Object next() 返回迭代的下一个元素
         */
        for (int i = 0; i < collection.size(); i++) {
            if (iterator.hasNext() == true) {
                System.out.println(iterator.next());
            }
        }

        //或者用这种方法，同上面一样
        //while(true)一直取，不判断，会出现异常：java.util.NoSuchElementException
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
