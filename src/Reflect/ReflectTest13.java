package Reflect;

/**
 * 重点：给你一个类，怎么获取这个类的父类，以及实现了哪些接口
 */
public class ReflectTest13 {
    public static void main(String[] args) throws Exception{
        //String举例
        Class stringClass = Class.forName("java.lang.String");

        //获取String的父类
        System.out.println(stringClass.getSuperclass().getName());

        //获取String类实现的所有接口（一个类可以实现多个接口）
        Class[] interfaces = stringClass.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface.getName());
        }
    }
}
