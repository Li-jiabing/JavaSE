package Reflect;


import Reflect.bean.User;

/**
 * 获取到Class，能干什么？
 *  通过Class的newInstance()方法来实例话对象
 *  注意：newInstance()方法内部实际上调用了无参数构造方法，必须保证无参数构造才可以。
 */
public class ReflectTest02 {
    public static void main(String[] args) {

        //不实用反射机制创建对象
        User user = new User("abc");
        System.out.println(user);

        //以反射机制的方式创建代码
        try {
            //通过反射机制，获取Class,通过Class来实例话对象
            Class c = Class.forName("Reflect.bean.User");

            //newInstance()这个方法会调用User这个类的无参构造方法
            //重点是newInstance调用的是无参数构造方法，必须保证无参构造是存在的
            Object o = c.newInstance();

//          InstantiationException

            System.out.println(o);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
