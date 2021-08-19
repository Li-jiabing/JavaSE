package exception;

public class ExceptionTest05 {
//    //第一种处理方式：在方法声明的位置上继续使用throws
//    上抛类似推卸责任，继续把异常抛给调用者
//    public static void main(String[] args) throws ClassNotFoundException {
//        doSome();
//    }

    /**
     * 第二种处理方式tru/catch进行捕捉
     * 捕捉等于把异常拦下了，异常真正的解决了（调用者是不知道的）
     * @param args
     */
    public static void main(String[]  args) {
    try {
        doSome();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
}

    private static void doSome() throws ClassNotFoundException{
        System.out.println("doSome()");
    }
}
