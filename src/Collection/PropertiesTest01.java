package Collection;

import java.util.Properties;

/**
 * 目前只需要掌握Properties属性类对象的相关方法即可。
 * Properties是一个Map集合，继承HashTable，Properties的key和value都是String类型
 * Properties被成为属性类对象
 * Properties是线程安全的
 * 需要掌握Properties两个方法，一个存，一个取
 */
public class PropertiesTest01 {
    public static void main(String[] args) {
        //创建一个Properties对象
        Properties properties = new Properties();
        properties.put("url","jdbc:mysql://localhost:3306/bjpowernode");
        properties.put("driver","com.mysql.jdbc.Driver");
        properties.put("username","root");
        properties.put("password","123456");

        //通过key获取value
        String getValue = properties.getProperty("password");
        System.out.println(getValue);
    }
}
