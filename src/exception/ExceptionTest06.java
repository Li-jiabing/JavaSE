package exception;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 处理异常的第一种方式：在方法声明的位置上使用throws关键字抛出，谁调用我这个方法，我就抛给谁。抛给调用者。
 */
public class ExceptionTest06 {
    public static void main(String[] args) {
        /*
        一般不建议在main方法上使用throws，因为这个异常如果真正的发生了，一定会抛给jvm，jvm只有终止。
        异常处理机制的作用就是增强程序的健壮性。怎么能做到，异常发生了也不影响程序的执行，所以一般main方法中的异常建议使用try/catch捕获，main就不要继续上抛了
         */
        System.out.println("main begin");
        m1();
        System.out.println("main over");
    }

    private static void m1() {
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");
    }

    private static void m2() {
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 over");
    }

    private static void m3() {
        //调用sun jdk中某个类的构造方法
        //这个类还没有接触过，后期io流就知道了
        //我们只是借助这个类学习以下异常处理机制
        //创建一个输入流对象，该流指向一个文件
        /**
         * 编译报错的原因是什么？
         *  第一：这里调用了一个构造方法：FileInputStream(String name)
         *  第二：这个构造方法的声明位置上有：throws FileNotFoundException
         *  第三：通过类的继承结构看到：FileNotFoundException父类是IOException，最终得知，FileNotFoundException是编译时异常
         *
         *  错误原因：编译时异常要求程序员编写程序阶段必须对他进行处理，不处理编译器就报错。
         */
        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/lijiabing/Desktop/笔记/面向对象.md");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
