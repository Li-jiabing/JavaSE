package com.company.day14.Test07;

/**
 * 在父类和子类中有同名的属性，或者说有相同的方法，
 * 如果此时想在子类中访问父类的数据，必须使用"super."加以区分。
 *
 * super.属性名        [访问父类的属性]
 * super.方法名(实参)   [访问父类的方法]
 * super(实参)         [调用父类的构造方法]
 */
public class SuperTest07 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.yiDong();
        //输出结果
        //catmov、catmove、animalmove
    }
}

class Animal{
    public void move(){
        System.out.println("Animal move!");
    }
}

class Cat extends Animal{
    //对move方法进行重写

    /**
     * 如果把重写move方法注释掉，结果就是三个animal move
     */
    public void move(){
        System.out.println("Cat Move");
    }

    //单独写一个子类特有的方法
    public void yiDong(){
        this.move();
        move();
        //super.不仅可以访问属性，也可以访问方法。
        super.move();
    }
}
