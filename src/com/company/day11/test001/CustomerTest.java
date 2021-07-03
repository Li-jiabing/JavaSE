package com.company.day11.test001;

public class CustomerTest {
    public static void main(String[] args) {
        //创建Customer对象
        Customer customer = new Customer();
        customer.name = "张三";

        //c1购物
        customer.shopping();


        //再创建Customer对象
        Customer customer1 = new Customer();
        customer1.name = "李四";
        //c2购物
        customer1.shopping();

        //调用doSome方法(修饰符列表上有static)
        //采用"类名."的方式访问，显然这个方法在执行的时候不需要对象的参加
        Customer.doSome();

        //调用doOther方法
        Customer.doOther();
    }
}
