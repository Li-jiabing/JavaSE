package StringBuffer;

/**
 * java.lang.StringBuilder
 * StringBuffer和StringBuilder的区别？
 *      StringBuffer中的方法都有：synchronized关键字修饰，这个关键字表示StringBuffer在多线程环境下运行是线程安全的
 *      StringBuilder中的方法都没有：synchronized关键字修饰，表示StringBuilder在多行程运行环境下是非线程安全的
 *
 *      总结：
 *          StringBuffer是线程安全的
 *          StringBuilder是非线程安全的
 */
public class StringBuilderTest01{
    public static void main(String[] args) {

        //使用StringBuilder也是可以完成字符串拼接的
        StringBuilder builder = new StringBuilder();
        builder.append("hello");
        builder.append(100);
        builder.append(true);
        System.out.println(builder);
    }
}
