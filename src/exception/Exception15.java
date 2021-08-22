package exception;

public class Exception15 {
    public static void main(String[] args) {

        //创建异常对象，并没有手动抛出
        MyException m = new MyException("用户名不能为空");

        //获取异常信息
        m.printStackTrace();

        //获取异常信息简单描述
        String msg = m.getMessage();
        System.out.println(msg);
    }
}
