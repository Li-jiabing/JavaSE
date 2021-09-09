package Reflect;

import java.io.FileReader;
import java.util.Properties;

/**
 * 验证反射机制的灵活性
 *      java代码写一边，在不改变java源代码的基础之上，可以做到不同对象的实例话。
 *      非常之灵活。（符合OCP开闭原则：对扩展开放，对修改关闭）
 */
public class ReflectTest03 {
    public static void main(String[] args) throws Exception {

        //这种方式写死了，只能创建一个User类型的对象
        //User user = new User()

        //以下代码是灵活的，不需要改动代码，可以修改配置文件，配置文件修改之后，可以创建出不同类的实例对象
        //通过IO流读取classinfo.properties文件
        FileReader reader = new FileReader("src/classinfo.properties");
        //创建属性类对象map
        Properties pro = new Properties();
        //加载
        pro.load(reader);
        //关闭流
        reader.close();
        //通过key获取value
        String className = pro.getProperty("className");

        //通过反射机制实例话对象
        Class c = Class.forName(className);
        Object obj = c.newInstance();
        System.out.println(obj);
    }
}
