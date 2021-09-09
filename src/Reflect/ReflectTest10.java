package Reflect;

import Reflect.Service.UserService;

import java.lang.reflect.Method;

/**
 * 重点：必须掌握,通过反射机制怎么调用一个对象的方法
 *
 *      反射机制，让代码很具有通用性，可变化的内容都是写到配置文件当中
 *      将来修改配置文件之后，创建的对象不一样了，调用的方法也不同了
 *      但是java代码不需要做任何改动，这就是反射机制的魅力。
 */
public class ReflectTest10 {
    public static void main(String[] args) throws Exception{
        //不实用反射机制，怎么调用方法
        UserService userService = new UserService();
        boolean loginSuccess = userService.login("admin","123");
        System.out.println(loginSuccess ? "登陆成功":"登陆失败");

        //使用反射机制来调用一个对象的方法怎么做
        Class userServiceClass = Class.forName("Reflect.Service.UserService");
        //创建对象
        Object obj = userServiceClass.newInstance();
        //获取Method
        Method loginMethod = userServiceClass.getDeclaredMethod("login", String.class, String.class);
        //调用方法
        Object retValue = loginMethod.invoke(obj,"admin","123");
        System.out.println(retValue);
    }
}
