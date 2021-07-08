package com.company.day12.test002;

/**
 * 主人类
 */
/**
 * 这种方法没有使用java语言当中的多态机制，存在的缺点：Master扩展力很差，因为只要加一个新的宠物，Master就需要添加新的方法。
 */
/*
public class Master {

    喂养宠物的方法
    public void feed(Cat c){
        c.eat();
    }

    public void feed(Dog d){
        d.eat();
    }
}
 */
//    Master合Cat、Dog这两个类型的关联程度很强，耦合度很高，扩展力差。

    //降低程序的耦合度【解耦合】，提高程序的扩展里[软件开发的最终目标]
public class Master {

    //喂养宠物的方法
    //Master主人类面向的是一个抽象的Pet，不再面向具体的宠物
    //提倡：面向抽象编程，不要再面向具体编程
    //面向抽象编程的好处是，耦合度低，扩展性强
   public void feed(Pet p){
       p.eat();
   }
}