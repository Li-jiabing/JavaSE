package exception.homework;

/**
 * 编写程序模拟用户注册：
 *  1.程序开始执行时，提示用户输入"用户名"和"密码信息"。
 *  2.输入信息之后，后台java程序模拟用户注册
 *  3.注册时用户名要求长度在[6-14]之间，<或者>都表示异常。
 *
 *  注意：
 *      完成注册的方法放到一个单独的类中，
 *      异常类自定义即可
 */
public class Test {
    public static void main(String[] args) {

        //创建UserService方法
        UserService userService = new UserService();
        try {
            userService.register("jackaaa","123");
        } catch (IllegalArgsException e) {
            System.out.println(e.getMessage());
        }
    }

}


class UserService{

    /**
     * 用户注册
     * @param username  用户名
     * @param password  密码
     * @throws IllegalArgsException  当用户名为null时，或者用户名长度小于6大于14的时候，会出现该异常
     */
    public void register(String username,String password) throws IllegalArgsException {
        //这个方法中完成注册！
        /*
        引用等于null的这个判断最好放到所有条件的最前面
         */
//        if (username == null || username.length() < 6 || username.length() >14){
//
//        }

        /*
        在分享一个经验：username == null 不如写成null == username
         */
        if (null == username || username.length() < 6 || username.length() >14){
            throw new IllegalArgsException("用户名不合法，长度必须在[6-14]之间");
        }
        //程序能执行到这儿，说明用户名合法
        System.out.println("注册成功，欢迎"+username+"回家");
    }
}