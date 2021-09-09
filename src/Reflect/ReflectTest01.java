package Reflect;

import com.company.day11.Test004.Date;

/**
 * 反射机制
 *      要操作一个类的字节码，需要首先获取到这个类的字节码，怎么获取Java.lang.class实例
 *      三种方式
 *         第一种：Class c = Class.forName("完整类名带包名");
 *         第二种：Class c = 对象.getClass();
 *         第三种：Class c =
 */
public class ReflectTest01 {
    public static void main(String[] args) {
        /**
         * Class.forName()
         *      1.静态方法
         *      2.方法的参数是一个字符串
         *      3.字符串需要的是一个完整的类名
         *      4.完整类名必须带有完整类名，java.lang包也不能省略。
         */
        Class c1 = null;
        try {
            c1 = Class.forName("java.lang.String");//c1代表String.class文件，或者说c1代表String类型
            Class c2 = Class.forName("java.Util.Date");//c2代表Date类型
            Class c3 = Class.forName("java.lang.Integer");//c3代表Integer类型
            Class c4 = Class.forName("java.lang.System");//c4代表System类型
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //java中任何一个对象都有一个方法，叫做getClass()
        String s = "abc";
        Class x = s.getClass();
        System.out.println(x);//x代表String.class字节码文件，x代表String类型
        System.out.println(c1 == x);//true

        //第三种方式，java语言中任何一种类型，包括基本数据类型，他都有.class属性
        Class z = String.class;//z代表String类型
        Class k = Date.class;//k代表Date类型
        Class f = int.class;//f代表int类型
//        class e = double.class;//e代表double类型
        System.out.println(z == x);
    }
}
