package com.company.day14.SuperTest04;

public class SuperTest04 {
    public static void main(String[] args) {
        Vip v = new Vip("张三");
        v.shopping();
    }
}

class Customer{
    String name;

    public Customer(){

    }
    public Customer(String name){
        super();
        this.name = name;
    }
}
class Vip extends Customer{
    public Vip(){}

    public Vip(String name){
        super(name);
    }

    //super和this都不能出现在静态方法中
    public void shopping(){
        //this表示当前的对象
        System.out.println(this.name+"正在购物！");
        //super表示的是但前对象的父类型特征（super是this指向那个对象中的一块空间。）
        System.out.println(super.name+"正在购物！");
        System.out.println(name+"正在购物！");
    }
}
