package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachTest02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("C++");
        list.add("java");

        //使用迭代器遍历
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (String s : list) {//因为泛型是string类型
            System.out.println(s);
        }

        List<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);
        for (int num : list1
             ) {
            System.out.println(num);
        }

    }
}
