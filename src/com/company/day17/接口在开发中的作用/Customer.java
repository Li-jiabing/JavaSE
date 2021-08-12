package com.company.day17.接口在开发中的作用;


/**
 * 顾客类
 *      总结一句话：面向接口编程，可以降低程序的耦合度，提高程序的扩展力，符合OCP开发原则。
 * 接口为什么离不开多态呢？
 *      接口的使用离不开多态机制（接口+多态  才可以达到解耦合）
 */
public class Customer {
        //顾客手里有一个菜单
        //Customer has a FoodMenu!
        //记住：以后凡是能够使用has a来描述的统一以属性的方式存在
        //面向抽象编程，面向接口编程，降低程序的耦合度，提高程序的可扩展力。

        /*
        Cat is a Animal，但凡满足is a的表示都可以设置成继承
        Customer has aFoodMenu，但凡是满足has a的表示都以属性的形式存在
         */
    private FoodMenu foodMenu;

    //提供无参构造、有参构造和set、get方法

    //提供一个点菜的方法
    public void Order(){
        //调用get方法拿菜单
        FoodMenu fm = this.getFoodMenu();
        foodMenu.shiZiChaoJiDan();
        foodMenu.YuXiangRouSi();
    }

    public Customer() {
    }

    public Customer(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    public FoodMenu getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }
    //为什么这里不能写中餐厨师或者西餐厨师
    //因为单独写某个厨师，那顾客就只能吃中餐或者西餐厨师做的菜，耦合度上去了
    //这样把菜单提取出来，顾客要吃中餐或者西餐厨师做的菜，只需要用FoodMenu.Cook就可以了，解耦合了。
//    ChinaCook cc = new ChinaCook();
}

/*
//"自己"类
//MySelf has a friend
class MySelf{
    //你这个对象，应该有一个朋友对象的电话号码
    //电话号码就是一个对象的内存地址，联系你朋友的时候，打电话
    //f是一个引用，f默认是null，是null表示，你没有朋友。
    Friend f;

    public MySelf(){

    }

    //通过构造方法能不能给你一个朋友对象
    public MySelf(Friend f){
        this.f = f;
    }

    public static void main(String[] args){

        //创建对象的同时交朋友
        Friend f =  new Friend();//朋友对象有了

        //创建朋友对象
        Friend f = new Friend();//朋友对象就有了
        //创建自己对象
        //目前还没有交朋友
        MySelf ms = new MySelf();//自己对象
        //交朋友
        mf.f = f;//把朋友的地址给了你。
    }
}
 */
/*
    is a:
        Cat is a Animal(猫是一个动物)
        凡是能够满足is a的表示"继承关系"
        A extends B

    has a：
        I has a Pen(我有一支笔)
        凡是能够满足has a关系的表示"关联关系"
        关联关系通常以"属性"的形式存在
        A{
            B b;
        }

    like a:
        Cooker like a FoodMenu(厨师像一个菜单一样)
        凡是能够满足like a关系的表示"实现关系"
        实现关系通常是：类实现接口。
        A implements B
 */