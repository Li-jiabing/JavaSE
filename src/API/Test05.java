package API;

public class Test05 {
    public static void main(String[] args) {

        //这里是多态，父类型引用指向子类对象，下面的obj就是这个意思
        Object o1 = new String("HelloWorld");
        Object o2 = new User();
        Object o3 = new Address();

        User user = new User(null,new Address("北京","大兴区","111111"));
        User user1 = new User("zhangSan",new Address("北京","大兴区","111111"));
        User user2 = new User("zhangSan",new Address("北京","大兴区","111111"));
        System.out.println(user1.equals(user2));

        User user3 = new User("zhangSan",new Address("北京","朝阳区","111111"));
        System.out.println(user1.equals(user3));
    }
}

class User{
    //用户名
    String name;//保存的是字符串里面的内存地址
    //用户的住址
    Address addr;

    public User() {
    }

    public User(String name, Address addr) {
        this.name = name;
        this.addr = addr;
    }

    //重写equals方法
    //重写规则，当一个用户的用户名和家庭住址都相同，表示同一个用户
    //这个equals判断的是User对象和User对象是否相等
    @Override
    public boolean equals(Object obj){
        //用户名和用户名相同，住址和住址相同的时候认定是同一个用户
        if (obj == null || !(obj instanceof User)) return false;
        if (this == obj) return true;
        User u = (User) obj;
        if (this.name.equals(u.name) && this.addr.equals(u.addr)){
            return true;
        }
        return false;
    }
}

class Address{
    //城市
    String city;
    //街道
    String street;
    //邮编
    String zipcode;

    public Address() {
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

    //这里并没有重写equals()方法
    //这里的equals()方法判断的是：Address对象和Address对象是否相等
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Address)) return false;
        if (this == obj) return true;
        //怎么算是家庭住址相同呢？
        //城市相同，街道相同，邮编相同，表示相同
        Address address = (Address) obj;
        if (this.city.equals(address.city) &&
            this.street.equals(address.street) &&
            this.zipcode.equals(address.zipcode)){
            return true;
        }
        return false;
    }
}