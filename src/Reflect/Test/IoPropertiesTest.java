package Reflect.Test;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class IoPropertiesTest {
    public static void main(String[] args) throws Exception {

        //获取一个文件的绝对路径了！！！
//        String path = Thread.currentThread().getContextClassLoader().getResource("classinfo.properties").getPath();

        InputStream reader = Thread.currentThread().getContextClassLoader().getResourceAsStream("classinfo.properties");
        Properties properties = new Properties();
        properties.load(reader);
        reader.close();
        //通过key获取value
        String className = properties.getProperty("classPath");
        System.out.println(className);
    }
}
