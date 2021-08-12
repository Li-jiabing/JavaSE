package API;

/**
 * java语言中的字符串String有没有重写toString方法，有没有重写equals方法。
 *  总结：
 *      1.String类已经重写了equals方法，比较两个字符串不能使用"=="，必须使用equals。equals是通用的
 *
 *      2.String类已经重写了toString()方法。
 *
 */
public class Test03 {
    public static void main(String[] args) {
        //大部分情况下，采用这样的方式创建字符串对象
        String s1 = "hello";
        String s2 = "abc";

        //实际上String也是一个类，不属于基本数据类型
        //既然String是一个类，那么一定存在构造方法。
        String s3 = new String("Test1");
        String s4 = new String("Test1");
        System.out.println(s3 == s4);//等号比较的是内存地址，这里面s3和s4分别new了两个对象，两个对象的内存地址不同，所以结果是false

        //所以，比较两个字符串，不能使用"=="号，必须调用equals方法
        System.out.println(s3.equals(s4));//true

        //String类有没有重写toString方法呢？
        String x = new String("动力节点");

        //如果String没有重写toString()方法，输出结果应该是：java.lang.String@十六进制的地址
        //经过测试，String类已经重写了toString()方法。
        System.out.println(x.toString());//输出结果：动力节点
        System.out.println(x.toString());
    }
}
