package HashMap.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * 注意：向map集合中存，以及从map集合中取，都是先调用key的hashCode()方法，然后再调用equals方法！
 * equals方法有可能调用，也有可能不调用。
 *      拿put(k,v)举例，什么时候equals不会调用？
 *          k.hashCode()方法返回哈希值，
 *          哈希值经过哈希算法转换成数组下标。
 *          数组下标位置上如果是null的话，equals不需要执行
 *      拿get(k)举例，什么时候equals不会调用？
 *          k.hashCode()方法返回哈希值，
 *          哈希值经过哈希算法转换成数组下标。
 *          数组下标位置上如果是null，equals不需要执行
 *
 *  注意：如果一个类的equals方法重写了，那么hashCode()方法必须重写。
 *  并且equals方法返回如果是true，hashCode（）方法返回值必须一样
 *      equals方法返回true表示两个对象相同，在同一个单向链表上比较。
 *      那么对于同一个单向链表上的节点来说，他们的哈希值都是相同的。
 *      所以hashCode方法的返回值应该相同。
 *
 *  hashCode()方法和equals()方法直接idea生成，但是需要重新生成
 *
 *  终结结论：
 *      放在hashMap集合key部分的，以及放在HashSet集合中的元素需要重写hashCode方法和equals方法
 *
 *     对于哈希表数据雷说，如果o1和o2的hash值相同，一定是放到同一个单向链表上。
 *     当然如果o1和o2的hash值不同，但由于哈希算法执行结束之后转换的数组下标可能相同，此时会产生"哈希碰撞"。
 *
 */
public class HashMapTest02 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan");
        Student s2 = new Student("zhangsan");
        //重写equals方法之前是false
        //重写之后是true
        System.out.println(s1.equals(s2));

        System.out.println("s1的hashCode="+s1.hashCode());//1163157884（重写hashcode之后是-1432604556）
        System.out.println("s2的hashCode="+s2.hashCode());//1956725890（重写hashcode之后是-1432604556）

        //s1.equals(s2)结果已经是true了，表示s1和s2是一样的，相同的，那么往HashSet集合中放的话，
        //按说只能放进去1个（HashSet集合特点：无序不可重复）
        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        System.out.println(students.size());//这个结果按说是1，实际上输出运行结果输出是2，这显然不符合HashSet集合存储特点。怎么办？


    }
}
