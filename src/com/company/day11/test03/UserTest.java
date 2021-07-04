package com.company.day11.test03;

public class UserTest {
    public static void main(String[] args) {
        User u1 = new User(100,"zhangsan");
        System.out.println(u1.getId());
        System.out.println(u1.getName());

        //想修改名字
        u1.setName("lisi");
        System.out.println(u1.getId());
        System.out.println(u1.getName());
    }
}
