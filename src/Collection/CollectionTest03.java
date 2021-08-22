package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 关于集合的迭代/遍历
 */
public class CollectionTest03 {
    public static void main(String[] args) {

        //创建集合对象
        Collection collection = new ArrayList();//ArrayList集合有序可重复
        //添加元素对象
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.add(1);

        //迭代集合
        Iterator iterator = collection.iterator();

        //调用while循环
//        while (iterator.hasNext()){
//            //存进去是什么类型，取出来还是什么类型
//            Object obj = iterator.next();
//            if (obj instanceof Integer) {
//                System.out.println("Integer类型");
//            }
//            //只不过在输出的时候会转换为字符串。因为这里println会调用toString()方法
//            System.out.println(obj);
//        }

        //HashSet集合："无序不可重复"
        //无序：指的是存进去和取出的顺序不一定相同。
        //不可重复：存储100之后，不能再存储一个100。
        Collection collection1 = new HashSet();
        collection1.add(100);
        collection1.add(1);
        collection1.add(45);
        collection1.add(32);
        collection1.add(2);
        collection1.add(1);
        Iterator iterator1 = collection1.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
