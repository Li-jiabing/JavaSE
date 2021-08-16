package Array;

/**
 * 模拟一个系统，假设这个系统要使用，必须输入用户名和密码
 */
public class ArrayTest06 {

    //用户名和密码输入到Stirng[] args数组当中
    public static void main(String[] args) {
        if (args.length != 2){
            System.out.println("使用该系统时请输入程序参数，参数中包括用户名和密码信息，例如：zhangsan 123");
            return;
        }

        //程序执行到此处说明用户确实提供了用户名和密码。
        //接下来你应该判断用户名和密码是否正确
        //取出用户名
        String username = args[0];
        //取出密码
        String password = args[1];

        //假设用户名是arming，密码是123的时候表示登陆成功，其他一律失效
        //判断两个字符串是否相等，需要使用equals方法
//        if (username.equals("admin") && password.equals("123")){
        //通过下面这种编码方式，即使后面username和passwrod有一个为null，程序也不会报空指针异常。编程经验
        if ("username".equals(username) && "123".equals(password)){
            System.out.println("登陆成功，"+username+"，欢迎回来");
            System.out.println("你可以继续使用此系统...");
        }else {
            System.out.println("验证失败，用户名或者密码存在错误！");
        }
    }
}