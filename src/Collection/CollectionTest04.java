package Collection;


import java.util.ArrayList;
import java.util.Collection;

/**
 * 深入Collection集合的contains()方法
 *      boolean contains(Object o):
 *          判断集合中是否包含某个对象o
 *          如果包含返回true，如果不包含返回false
 */
public class CollectionTest04 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();

        String s1 = new String("abc");
        collection.add(s1);

        String s2 = new String("def");
        collection.add(s2);

        //集合中元素的个数
        System.out.println(collection.size());

        String x = new String("abc");
        //collection集合中是否包含x
        System.out.println(x.equals(s1));//true
        System.out.println(collection.contains(x));//true
    }
}
