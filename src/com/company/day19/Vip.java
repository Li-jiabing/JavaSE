package com.company.day19;

import com.company.day19.访问控制权限.User;

/**
 * User在com.company.day19.访问控制权限.User下
 * Vip在com.company包下
 * User和Vip不再同一个包下
 * 但是Vip是User的子类
 */
public class Vip extends User {

    //实例方法
    public void shopping(){
        //this表示当前对象
        System.out.println(this.age);
//        System.out.println(this.name);
    }
}
