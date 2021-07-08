package com.company.day12.test003;

public class FinalTest03 {
    public static void main(String[] args) {
        //创建User对象
        User u = new User(100);

        //又创建了一个新的User对象
        //程序执行到此处表示以上兑现已经变成垃圾数据，等待垃圾回收器的回收。
        u = new User(200);

        //创建用户对象
        //final修饰的引用一旦他指向了某个对象之后不会再指向其他对象，那么被指向的对象无法被垃圾回收器回收。
        final User user = new User(30);
        System.out.println(user.getId());
//        i = 20;
        user.setId(100);//final修饰的引用虽然指向某个对象之后不能指向其他对象，但是所指向的对象内部的内存是可以被修改的。
        System.out.println(user.getId());

    }
}
