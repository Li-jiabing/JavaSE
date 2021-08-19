package exception;

/**
 * 1.异常在java中以类和对象的形式存在，那么异常的继承机构是怎样的？
 *  我们可以使用UML图来描述以下继承机构。
 *  可以用Rational Rose(收费的) startUML等
 */
public class ExceptionTest03 {
    public static void main(String[] args) {

        /**
         * 程序执行到此处发生了ArithmeticException异常
         * 底层new可一个ArithmeticException异常对象，然后抛出了
         * 由于是main方法调用了100/0
         * 所以这个异常ArithmeticException抛给了main方法
         * main方法没有处理，将这个异常自动抛给了jvm，jvm最终终止程序的执行
         *
         * ArithmeticException继承runtimeException，属于运行时异常，在
         * 编写阶段不需要对这种异常进行预先的处理
         */
        System.out.println(100/0);
        /**
         *这里的hello world没有输出没有执行
         */
        System.out.println("hello world");
    }
}
