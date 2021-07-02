package com.company.day10.test001;

public class Test02 {
    public static void main(String[] args) {
        User u = new User(20);

        //User u = 0x1234;
        //传递u给add方法的时候，实际上传递的是u变量中保存的值，只不过这个值是一个java对象的内存地址
        add(u);//等同于add(0x12345);
        System.out.println("main-->"+u.age);//21
    }

    public static void add(User u) {
        u.age++;
        System.out.println("add-->"+u.age);//21
    }
}

class User{
    //实例方法
    int age;
    //构造方法
    public User(int i){
        age = i;
    }
}