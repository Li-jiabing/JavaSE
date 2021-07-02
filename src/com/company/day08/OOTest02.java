package com.company.day08;

/**
 * 测试类
 */
public class OOTest02 {
    public static void main(String[] args) {

        //创建User对象
        //u是局部变量
        //u是一个引用
        //u保存内存地址指向堆内存的User对象
        User user = new User();

        //输出User对象内部实例变量的值
        System.out.println(user.no);
        System.out.println(user.name);
        System.out.println(user.addr);

        //修改User对象内存实例变量的值
        user.no=110;
        user.name="李佳冰";
        user.addr = new Address();

        user.addr.city="大理";
        user.addr.street="下关";
        user.addr.zipcode="678281";

        //在main方法中目前只能看到一个引用"u"
        //一切都是只能通过u来进行访问
        System.out.println(user.name+"居住在哪个城市："+user.addr.city);
        System.out.println(user.name+"居住在哪个街道："+user.addr.street);
        System.out.println(user.name+"邮编："+user.addr.zipcode);
    }
}
