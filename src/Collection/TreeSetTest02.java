package Collection;

import java.util.TreeSet;

/**
 * 对自定义的类型来说，TreeSet可以排序吗
 * 不行,因为没有指定person之间的比较规则。
 *
 * 以下程序运行的时候出现了异常：java.lang.ClassCastException
 */
public class TreeSetTest02 {
    public static void main(String[] args) {
        Person p1 = new Person(32);
        Person p2 = new Person(20);
        Person p3 = new Person(30);
        Person p4 = new Person(25);

        TreeSet<Person> treeSet = new TreeSet<>();
        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);
        treeSet.add(p4);
        for (Person p : treeSet
             ) {
            //此处出现异常：java.lang.ClassCastException
            //出现这个异常的原因是没有实现"java.lang.Comparable"这个接口
            System.out.println(p);
        }
    }
}

class Person implements Comparable{
    int age;

    public Person(int age) {
        this.age = age;
    }

    //重写toString方法

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}