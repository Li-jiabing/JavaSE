package com.company.day12.test002;

/**
 * 多态在实际开发中的作用，以下为主人喂养宠物为例，说明多态的作用：
 *  1.分析：主人喂养宠物这个场景要实现需要进行类型的抽象：
 *      - 主人[类]
 *      - 主任可以喂养宠物，所以主人有喂养的这个动作
 *      - 宠物[类]
 *      - 宠物可以吃东西，所有宠物有吃东西这个动作
 *
 *  2. 面向对象编程的核心：定义好类，然后将类实例化为对象，给一个环境驱使一下，让各个对象之间协作起来形成一个系统
 *
 *  3. 多态的作用是什么？
 *      降低程序的耦合度，提高程序的扩展力
 *      能使用多态尽量多使用多态
 *      父类型引用指向子类对象
 */
public class Test {

    public static void main(String[] args) {
        //创建主人对象
        Master zhangsan = new Master();

        //创建猫对象
        Cat tom = new Cat();

        //主人喂养猫
        zhangsan.feed(tom);

        //创建小狗对象
        Dog erHa = new Dog();
        zhangsan.feed(erHa);

        //创建蛇对象
        Snake s = new Snake();
        zhangsan.feed(s);
    }
}
