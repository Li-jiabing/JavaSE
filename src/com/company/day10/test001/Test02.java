package com.company.day10.test001;

/**
 * 方法调用的时候，涉及到参数传递的问题，传递的时候，java只遵循一种语法机制
 * 就是将变量中保存的"值"传递过去了，只不过有的时候这个值是一个字面值10，有的时候这个值是
 * 另一个java对象的内存地址0x1234
 *
 *
 *      参数的传递？
 *      主要研究和学习的是方法在调用的时候，涉及到参数传递传递的问题，到底是怎么传递数据的呢？
 *      值传递
 *      int i = 10;
 *      int j = i;//i传递给j，实际上只是将i变量中保存的10传递给j了，j实际上是一块全新的内存空间
 *
 *      User u = 0x1234;
 *      User u2 = u;//u传递给u2，实际上是将0x1234这个值赋给了u2，u和u2实际上是两个不同的局部变量，但是他们这两个变量指向堆内存中同一个java对象
 *      user u2 = 0x1234
 */
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