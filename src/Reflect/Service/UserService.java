package Reflect.Service;

/*
用户业务类
 */
public class UserService {

    /**
     * 登陆方法
     * @param username  用户名
     * @param password  登陆密码
     * @return true表示登陆成功，false表示登陆失败
     */
    public boolean login(String username,String password){
        if ("admin".equals(username) && "123".equals(password)){
            return true;
        }
        return false;
    }

    /**
     * 退出系统的方法
     */
    public void logout(){
        System.out.println("系统已经安全退出！");
    }
}
