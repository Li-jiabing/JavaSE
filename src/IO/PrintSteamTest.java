package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * java.io.PrintStream:标准的字节输出流。默认输出到控制台
 */
public class PrintSteamTest {
    public static void main(String[] args) throws Exception {
        System.out.println("hello world");

        PrintStream ps = System.out;
        ps.println("hello zhangsan");
        ps.println("hello lisi");


        //标准输出流不需要手动close()关闭
        //可以改变标准输出流的输出方向吗？可以
        //标准输出流不再指向控制台，而是指向一个log文件
        PrintStream printStream = new PrintStream(new FileOutputStream("log"));
        //修改输出方向，将输出方向修改到"log"文件
        System.setOut(printStream);
        //再输出
        System.out.println("hello world");
        System.out.println("hello kitty");
        System.out.println("hello lisi");

        //这些是之间System类使用过的方法和属性
//        System.gc();
//        System.currentTimeMillis();
//        System.exit(0);
    }
}
