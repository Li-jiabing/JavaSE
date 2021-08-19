package exception;

/**
 *   1.什么是异常，异常机制有什么用
 *   以下程序执行过程中发生了不正常的情况，而这种不正常的情况叫做：异常
 *   java语言是很完善的语言，提供了异常的处理方式，以下程序执行过程中出现了不正常情况，
 *   java把该异常信息打印输出到了控制台，供程序员看到异常信息之后，可以对程序进行修改，
 *   让程序更加健壮
 *
 *   2.以下程序执行，控制台出现了：
 *    Exception in thread "main" java.lang.ArithmeticException: / by zero
 * 	  at exception.ExceptionTest01.main(ExceptionTest01.java:17)
 * 	  这个信息我们称为：异常信息。这个信息是jvm打印的
 *
 */
public class ExceptionTest01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        if (b != 0) {
            int c = a/b;//实际上jvm执行到此处的时候会new一个异常对象:ArithmeticException("/by zero")
            System.out.println(a + "/" + b + "=" + c);
        }else {
            System.out.println("除数不能为0");
            return;
        }
    }
}
