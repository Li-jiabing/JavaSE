package com.company.day08;

/**
 *
 */
public class OOTest03 {
    public static void main(String[] args) {

        //u是引用
        //u是局部变量，画到栈里面，实例变量，画到堆内存
        User u = new User();
        Address a = new Address();

        //a是引用
        //a是局部变量
        u.addr = a;

        System.out.println(u.addr.city);//null
        a.city = "天津";
        System.out.println(u.addr.city);//天津
    }
}
