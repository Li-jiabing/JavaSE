package Array;

import com.company.day12.test003.A;

/**
 * 一堆数组的深入，数组中存储的类型为：引用数据类型
 */
public class ArrayTest07 {
    public static void main(String[] args) {
        //创建一个Animal类型数组
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal[] animals = {a1,a2};


        //对Animal数组进行遍历
        for (int i = 0; i < animals.length; i++) {
//            Animal animal = animals[i];
//            animal.move();
            animals[i].move();
        }
    }
}

class Animal{
    public void move(){
        System.out.println("Animal move...");
    }
}