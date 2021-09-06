package IO;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * IO+properties联合应用
 *
 * 非常好的一个设计理念，：
 *   经常改变的数据，可以单独写到一个文件中，使用程序动态读取
 *   将来只需要修改这个文件的内容，java代码不需要改动，不需要重新编译，服务器也不需要
 *   重启，就能拿到动态的信息。
 *
 *   类似于以上机制的文件被成为配置文件：
 *      并且当配置文件中的内容是：
 *          key = value
 *          的时候，我们把这种配置文件叫做属性配置文件
 *
 *
 *     java中有规范要求：属性配置文件以.properties结尾，但这不是必须的。
 */
public class IoPropertiesTest01 {
    public static void main(String[] args) throws Exception {
        /*
        Properties是一个Map集合，key和value都是String类型
        想将userInfo文件中的数据加载到Properties对象当中
         */

        //新建一个输入流对象
        FileInputStream fl = new FileInputStream("userInfo");

        //新建一个map集合
        Properties properties = new Properties();

        //调用那个Properties对象load方法将文件中的数据加载到map集合中
        properties.load(fl);//文件中的额数据顺着管道加载到map集合中，其中等号=左边做key，等号右边做value

        //通过keu来获取value
        System.out.println(properties.getProperty("username"));

        System.out.println(properties.getProperty("password"));
    }
}
