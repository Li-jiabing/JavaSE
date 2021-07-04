package com.company.day11.test03;

/**
 * "this."什么时候不能省略？
 *          用来区分局部变量和实例变量的时候，"this."不能省略。
 */
//用户类
public class User {

    //属性
    private int id;
    private String name;

    //构造方法
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
