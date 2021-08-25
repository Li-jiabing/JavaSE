package Collection.Generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * jdk之后引入了：自动类型推断机制（又称为钻石表达式）
 */
public class GenericTest02 {
    public static void main(String[] args) {

        //ArrayList<这里的类型会自动推断>,在jdk8之后
        //自动类型推断，钻石表达式
        List<Animal> myList = new ArrayList<>();
        myList.add(new Cat());
        myList.add(new Animal());
        myList.add(new Bird());

        Iterator iterator = myList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
