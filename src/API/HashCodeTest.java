package API;

/**
 * hashcode()方法：
 *      在Object的hashCode方法是怎么样的？
 *      public native int hashCode();
 *      这个方法不是抽象方法，带有native关键字，底层调用c++程序。
 *
 *  hashCode()方法返回的是哈希码或者哈希值：
 *      实际上就是一个java对象的内存地址，经过哈希算法，得出的一个值。
 *      所以hashCode()方法的执行结果可以等同看作一个java对象的内存地址。
 */
public class HashCodeTest {
    public static void main(String[] args) {
        Object o = new Object();
        int hashCodeValue  = o.hashCode();

        //对象内存地址经过哈希算法转换的一个数字。可以等同看作内存地址。
        System.out.println(hashCodeValue);

        MyClass myClass = new MyClass();
        int hashCodeValue2 = myClass.hashCode();

        System.out.println(hashCodeValue2);//哈希值和对象存储空间地址有关。
    }
}

class MyClass{

}
