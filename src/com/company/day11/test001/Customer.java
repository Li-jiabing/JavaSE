package com.company.day11.test001;

/**
 * 顾客类
 *      关于java语言中的this关键字：
 *      1. this是一个关键字，翻译为：这个
 *      2. this是一个引用，this是一个变量，this变量中保存了内存地址指向了自身，this存储在jvm堆内存java对象内部
 *      3. 创建100个java对象，每一个对象都有this，也就是说有100个不同的this
 *      4.this可以出现在实例方法中，代表当前正在执行这个动作的对象(this代表当前对象)
 *      5.this在多数情况下可以省略不写
 *      6.this不能使用在带有static的方法中
 *      7.
 */
public class Customer {

    //姓名【堆内存的对象内部中存储，所以访问该数据的时候，必须先创建对象，通过引用方式访问】
    String name;//实例变量：必须采用"引用."的方式访问

    //无参构造方法
    public Customer(){

    }

    //不带有static关键字的方法
    //顾客购物的行为
    //每一个顾客的购物最终结果是不一样的
    //所以购物这个行为是属于对象界别的行为
    //由于每一个对象在执行购物这个动作的时候，最终结果不同，所以购物这个动作必须有对象的参与
    //重点：没有static的关键字的方法被称为"实例方法"，实例方法怎么访问？"引用."
    //重点：没有static关键字的变量被称为"实例变量"
    //注意：当一个行文，一个动作，在执行的过程当中，是需要对象参与的，那么这个方法一定要定义为"实例方法"，不要带static关键字，通过"引用."方式调用
    //以下方法定义为实例方法，因为每一个顾客在真正购物的时候，最终的结果是不同的，所以这个动作在完成的时候必须有对象的参与
    public void shopping(){
        //当张三在购物的时候，输出张三在购物
        //当李四在购物的时候，输出李四在购物
//        System.out.println(name+"在购物");

        //完整写法：
        System.out.println(this.name+"在购物");

        //由于name是一个实例变量，所以这个name访问的时候一定访问的是当前对象的name
        //所以这个this是可以省略的
        System.out.println(name+"在购物");
    }

    //带有static
    public static void doSome(){
        //这个执行过程中没有"当前对象"，因为带有static的方法是通过类名的方式访问的
        //或者说这个"上下文"当中没有"当前对象"，自然也不存在this（this代表的是当前正在执行这个动作的对象）

        //以下程序为什么编译错误，doSome方法dialing不是对象去调用，是一个类名去调用，执行过程中没有"当前对象"
        //name是一个实例变量，以下代码的含义是：访问当前对象的name，自然也不能访问当前对象的name
//        System.out.println(name);

//        访问不了，static的方法中调用不需要对象，直接使用类名，所以执行过程中没有当前对象，所以不能使用this
//        System.out.println(this.name);
    }

    public static void doOther(){
        //假设想访问name这个实例变量的话应该怎么做

        //可以采用以下方案，但是以下方案，绝对不是访问的当前对象的name
        //创建对象
        Customer customer = new Customer();
        System.out.println(customer.name);//这里访问的name是customer引用指向对象的name

    }

}