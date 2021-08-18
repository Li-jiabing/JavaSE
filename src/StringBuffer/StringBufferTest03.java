package StringBuffer;

/**
 * 面试题：
 *      1.String为什么是不可变的？
 *          我看过源代码，String[]类中有一个char[]数组,这个char[]数组采用了final修饰，因为数组一旦创建长度不可变。
 *          并且被final修饰的引用一旦指向某个对象之后，不可再指向其他对象，所以String是不可变的！"abc"无法变成"abcd"
 *
 *      2.StringBuilder/StringBuffer为什么是可变的呢？
 *          我看过源码，StringBuffer/StringBuilder内部实际上是一个char[]数组，这个char[]数组没有被final修饰，
 *          StringBuilder/StringBuffer的初始化容量我记得应该是16，当存满之后会进行扩容，底层调用了数组的拷贝方法
 *          System.arraycopy()...是这样的扩容的。所以StringBuilder/StringBuffer适用于使用字符串的频繁拼接操作。
 *
 */
public class StringBufferTest03 {
    public static void main(String[] args) {

        //字符串不可变是什么意思？
        //是说双引号里面的字符串对象一旦创建不可变
        //你的s变量没有被final修饰，s变量是可以指向其他对象的
        //字符串不可变不是说以上变量s不可变，说的是"abc"这个对象不可变
        String s = "abc";//abc放到了字符串常量池当中
        s = "xyz";//xyz放到了字符串常量池当中
    }
}
