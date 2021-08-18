package Integer;

/**
 * 这个题目是Integer非常重要的面试题
 */

public class IntegerTest06 {
    public static void main(String[] args) {

        //byte取值范围是 -128到127

        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b);//false

        //java中为了提高程序的执行效率，将[-128到127]之间所有的包装对象提前创建好了，放到了一个方法去"整数型常量池"中了
        //目的是只要用这个区间的数据不需要再new了，直接从整数型常量池当中取出来。

        //原理：x变量中保存的对象的内存地址和y变量中保存的对象的内存地址是一样的
        Integer x = 127;
        Integer y = 127;
        //"=="永远判断的都是两个对象的内存地址
        System.out.println(x == y);//true

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
    }
}
