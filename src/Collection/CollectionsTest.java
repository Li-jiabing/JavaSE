package Collection;

import com.company.day12.test003.A;

import java.util.*;

/*
java.util.Collection 集合接口
java.util.Collections 集合工具类，方便集合的操作
 */
public class CollectionsTest {
    public static void main(String[] args) {
        //ArrayList集合不是线程安全的
        List<String> list = new ArrayList<>();

        //变成线程安全的,调用synchronized方法把list传进去
        Collections.synchronizedList(list);

        //排序
        list.add("abc");
        list.add("def");
        list.add("xyz");
        list.add("abe");
        Collections.sort(list);
        for (String s : list
             ) {
            System.out.println(s);
        }

        List<WuGui2> wuGuis = new ArrayList<>();
        wuGuis.add(new WuGui2(4000));
        wuGuis.add(new WuGui2(1000));
        wuGuis.add(new WuGui2(8000));

        //注意：对list集合中元素进行排序，需要保证list集合中的元素实现了：Comparable接口。
        Collections.sort(wuGuis);
        for (WuGui2 w : wuGuis
             ) {
            System.out.println(w);
        }

        Set<String> set = new HashSet<>();
        set.add("king");
        set.add("lijiabing");
        set.add("cuihaoyang");
        set.add("king1");
        set.add("king3");
//      这里只能传list集合进行排序。
//      Collections.sort();

        //我们把set集合转换成list集合之后再调用collections.sort方法
        List<String> myList = new ArrayList<>(set);
        for (String  s : myList
             ) {
            System.out.println(s);
        }
    }
}

class WuGui2 implements Comparable<WuGui2>{
    int age;

    public WuGui2(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "乌龟2{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(WuGui2 o) {
        return this.age-o.age;
    }
}