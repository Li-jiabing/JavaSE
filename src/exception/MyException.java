package exception;

/**
 * 1.sun提供的jdk内置的异常肯定是不够用的，在实际开发中，有很多业务，这些业务出现异常之后，jdk中都是没有的，和业务挂钩的
 * 那么异常我们自己可以定义吗？   可以的
 *
 * 2.java中怎么定义异常呢？
 *     两步：
 *          第一步：编写一个类继承Exception或者RuntimeException
 *          第二步：提供两个构造方法，一个无参数的，一个带有String参数的。
 */
public class MyException extends Exception{//编译时异常

    public MyException() {
    }

    public MyException(String s) {
        super(s);
    }
}


//public class MyException extends RunTimeException{//运行时异常
//}
