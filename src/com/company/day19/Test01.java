package com.company.day19;

import com.company.day19.访问控制权限.User;

public class Test01 {
    public static void main(String[] args) {
        User user = new User();
//        System.out.println(user.id);// 报错        java: id 在 com.company.day19.访问控制权限.User 中是 private 访问控制
        System.out.println(user.weight);//只有weight能访问
//        System.out.println(user.age);
//        System.out.println(user.name);
    }
}
