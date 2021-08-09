package com.company.day15;

/**
 * final修饰的变量，如果这个变量是一个"引用"会怎样？
 *   重点：final修饰的变量只能赋一次值
 *   "引用"是不是一个变量？
 *      是一个变量
 *
 *   final修饰的引用：
 *      该引用只能指向一个对象，并且他只能永远指向该对象，无法再指向其他对象。
 */
public class FinalTest02 {
    public static void main(String[] args) {
        Person p1 = new Person(20);
        System.out.println(p1.age);

        System.out.println("=============================================");

        //代码不管怎么变化p2也是一个变量。（只不过这里他有一个特殊的名字：引用）
        //final修饰的变量只能赋一次值，所以这里编译错误
        final Person p2 = new Person(30);
//        p2 = new Person(32);

    }
}

class Person{
    int age;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}