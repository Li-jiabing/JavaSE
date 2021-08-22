package exception;

/**
 * finally语句
 */
public class ExceptionTest11 {
    public static void main(String[] args) {
        /*
        try 和finally，没有catch可以吗？
        可以的,但是try不能单独使用，和finally可以联用
        以下代码的执行顺序：
            先执行try...
            在执行finally...
            最后执行return（return语句只要执行方法必然结束）
         */
        try {
            System.out.println("try...");
            return;
        }finally {
            System.out.println("finally...");
        }

        //这里不能写语句，因为这个代码是无法执行到的
//        System.out.println("2sdfafdsfasfdsa");
    }
}
