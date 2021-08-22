package exception;

/**
 * finally
 */
public class ExceptionTest12 {
    public static void main(String[] args) {
        try {
            System.out.println("try...");
            System.exit(0);//退出jvm之后，finally语句就不执行了
        }finally {
            System.out.println("finally...");
        }
    }
}
