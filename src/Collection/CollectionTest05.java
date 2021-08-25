package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest05 {
    public static void main(String[] args) {
        //创建集合对象
        Collection collection = new ArrayList();
        //创建用户对象
        User u1 = new User("jack");
        User u2 = new User("jack");
        collection.add(u1);

        //判断集合中是否包含u2
        //没有重写equals方法之前，这个结果是false
        System.out.println(collection.contains(u2));


        //Integer类的equals方法重写了，所以结果是true
        Integer x = new Integer(10000);
        collection.add(x);

        Integer y = new Integer(10000);
        System.out.println(collection.contains(y));//true

        //创建集合对象
        Collection cc = new ArrayList();
        //创建字符串对象
        String s1 = new String("hello");
        //把字符串对象添加到集合
        cc.add(s1);

        String s2 = new String("hello");
        //删除s2
        cc.remove(s2);
        //集合中元素个数？
        System.out.println(cc.size());//0
    }
}

class User{
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    //没有重写equals()方法
    //我们手动重写equals()方法
    //将来调用equals方法的时候，一定是调用这个重写的equals方法。
    //这个equals方法的比较原理是：只要姓名一样就表示同一个用户
    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof User)) return false;
        if (o == this)return true;
        User user = (User) o;
        //如果名字一样就是表示同一个人，不再比较内存地址了
        return user.name.equals(this.name);
    }
}