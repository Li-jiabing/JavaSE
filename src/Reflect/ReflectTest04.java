package Reflect;

/**
 * 研究以下class.forName()发生了什么
 *     记住：重点：
 *          如果你只是希望一个类的静态代码块执行，其他代码一律不执行
 *          你可以使用Class.forName("完整类名");
 *          这个方法的执行会导致类加载，类加载时，静态代码块执行。
 *
 *  提示：后面jdbc技术的时候我们还需要用到这项技术。
 */
public class ReflectTest04 {
    public static void main(String[] args) {
        try {
            Class.forName("Reflect.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class MyClass{
    //静态代码块在类加载时执行，并且只执行一次
    static {
        System.out.println("MyClass类的静态代码块执行了");
    }
}