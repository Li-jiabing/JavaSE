package Collection;

import java.util.TreeSet;

/**
 * 先按照年龄升序，如果年龄一样的再按照姓名升序。
 */
public class TreeSetTest04 {
    public static void main(String[] args) {
        TreeSet<Vip> vips = new TreeSet<>();
        vips.add(new Vip("zhangsi",20));
        vips.add(new Vip("zhangsan",20));
        vips.add(new Vip("king",18));
        vips.add(new Vip("soft",17));
        for (Vip vip : vips
             ) {
            System.out.println(vip);
        }

    }
}

/**
 * compareTo()方法的返回值很重要：
 *      返回0表示相同，value会覆盖
 *      返回>0，会继续在右子树上找。[10-9=1，1>0,说明左边这个数字比较大。所以在右子树上找]
 *      返回<0，会继续在左子树上找。
 */
class Vip implements Comparable<Vip>{
    String name;
    int age;

    public Vip(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Vip v) {
        //年龄相同时按照名字排序
        //姓名时String类型，可以直接比，调用compareTo方法来完成比较
        if (this.age == v.age){
            return this.name.compareTo(v.name);
        }else {
            return this.age-v.age;
        }
    }
}