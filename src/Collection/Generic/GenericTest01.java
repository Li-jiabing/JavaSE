package Collection.Generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * jdk5.0之后推出的新特性：泛型
 *
 * 泛型这种语法机制，只在程序编译阶段起作用，是写给编译器看的，运行阶段意义不大
 *
 * 使用了泛型，有什么好处？
 *      集合中存储的元素类型统一了
 *      从集合中取出的元素类型是泛型指定的类型，不需要进行大量的"向下转型"！
 *
 * 泛型的缺点是什么？
 *      导致集合中存储的元素缺乏多样性！
 *      大多数业务中，集合中元素的类型还是统一的，所以这种泛型特性被大家认可
 */
public class GenericTest01 {
    public static void main(String[] args) {
        /*
        //不实用泛型极致，分析程序存在的缺点
        List myList =  new ArrayList();
        //准备对象
        Cat c = new Cat();
        Bird b = new Bird();

        //把对象添加到集合中
        myList.add(c);
        myList.add(b);

        //遍历集合，取出Cat让他抓老鼠，取出Bird让他飞
        Iterator iterator = myList.iterator();
        while (iterator.hasNext()){
            //没有这个语法，通过迭代器取出的就是Object
//            Animal a = iterator.next();
            Object obj = iterator.next();
            //obj中没有move方法，无法调用，需要向下转型
            if (obj instanceof Animal){
                Animal animal = (Animal) obj;
                animal.move();
            }
        }
        */

        //使用泛型List<Animal>之后，表示list集合中只允许存储Animal类型的数据
        //用泛型来指定集合中存储的数据类型
        List<Animal> myList = new ArrayList<Animal>();

//        指定list集合中只能存储Animal，那么存储别的类型数据就编译报错了
//        这样用了泛型之后集合中的元素更加统一了
//        myList.add(1);
        //准备对象
        Cat cat = new Cat();
        Bird bird = new Bird();

        myList.add(cat);
        myList.add(bird);

        //获取迭代器
        //这个表示迭代器迭代的是Animal类型
        Iterator<Animal> iterator = myList.iterator();
        while (iterator.hasNext()){
            //使用泛型之后每一次迭代返回的数据都是Animal类型
            Animal a = iterator.next();
            //这里就不需要强转了，直接调用
            a.move();
        }
    }

}


class Animal{
    //父类自带方法
    public void move(){
        System.out.println("动物在移动");
    }
}

class Cat extends Animal{
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}

class Bird extends Animal{
    public void fly(){
        System.out.println("鸟儿在飞翔");
    }
}