package com.company.day09.test003.ConstructorTest01;

public class User {

    public User(){
        System.out.println("Users Default Constructor Invoke");
    }

    //定义一个有参数的构造方法
    public User(int i){
        System.out.println("带有int类型的构造器");
    }

    public User(String name){
        System.out.println("带有String类型的构造器");
    }

    public User(int i,String name){
        System.out.println("带有int类型和String类i给你的的构构造器");
    }


}
