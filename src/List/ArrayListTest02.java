package List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * 集合ArrayList的构造方法
 */
public class ArrayListTest02 {
    public static void main(String[] args) {
        //默认初始化容量10
        List myList = new ArrayList();

        //创建一个初始化容量为100的ArrayList集合
        List myList1 = new ArrayList(100);

        //创建一个HashSet集合
        Collection collection = new HashSet();
        collection.add(100);
        collection.add(200);
        collection.add(900);
        collection.add(50);

        //通过这个构造方法就可以将HashSet集合转换成List集合
        List myList2 = new ArrayList(collection);
        for (int i = 0; i < myList2.size(); i++) {
            System.out.println(myList2.get(i));
        }
    }
}
