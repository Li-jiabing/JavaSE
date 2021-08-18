package Integer;

/**
 * 好消息：在jdk5之后，引入了一种新特性，自动装箱和自动拆箱
 *  自动装箱：基本数据类型自动装换成包装类
 *  自动拆箱：包装类自动转换成基本数据类型
 *
 *  有了自动拆箱之后，number类中的方法就用不着了
 *
 *  自动装箱和自动拆箱的好处
 */
public class IntegerTest05 {
    public static void main(String[] args) {

        //900是基本数据类型，而x是包装类型，这个过程叫基本数据类型自动装换成包装类型
        //这个过程我们叫自动装箱
        Integer x = 900;
        System.out.println(x);

        //x是包装类型
        //y是基本类型
        //这个过程我们叫自动拆箱，
        int y = x;
        System.out.println(y);


        //z是一个引用，z是一个变量，z还是保存了一个对象的内存地址，等同于Integer z = new Integer(1000);
        //分析：这里为什么没有报错
        //+两边要求是基本数据类型的字，z是包装类，不属于基本数据类型，这里会进行自动拆箱，将z装换成基本数据类型
        //在java5之前是不能够这么编写的
        Integer z = 1000;
        System.out.println(z+1);

        Integer a = 1000;//Integer a = new Integer(1000);a是个引用，保存内存地址指向对象
        Integer b = 1000;//Integer b = new Integer(1000);b是个引用，保存内存地址指向对象
        // == 比较的是对象的内存地址  a和b两个引用中保存的对象内存地址不同
        // == 运算符不会出发自动拆箱机制（只有+-*/等运算的时候才会）
        System.out.println(a == b);//false
    }
}
