package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 深入try/catch
 */
public class ExceptionTest07 {
    public static void main(String[] args){
/*        try {
            FileInputStream fileInputStream = new FileInputStream("/User/lijiabing/Desktop/笔记/面向对象.md");
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
        }
        System.out.println("hello world");*/

/*        try {
            FileInputStream fileInputStream = new FileInputStream("/User/lijiabing/Desktop/笔记/面向对象.md");
        } catch (IOException e) {//为什么这里抛出IOException也可以，这里是多态：IoException e = new FileNotFoundException()
            System.out.println("文件不存在");
        }
        System.out.println("hello world");*/

/*        try {
            FileInputStream fileInputStream = new FileInputStream("/User/lijiabing/Desktop/笔记/面向对象.md");
            fileInputStream.read();

            //进行数学运算
            System.out.println(100/0);//这个异常是一个运行时异常，编写程序时可以处理可以可以不处理
        } catch (FileNotFoundException e) {//为什么这里抛出IOException也可以，这里是多态：IoException e = new FileNotFoundException()
            System.out.println("文件不存在");
        } catch (IOException e) {
            System.out.println("读文件报错了");
        }
        System.out.println("hello world");*/

        try {
            FileInputStream fileInputStream = new FileInputStream("/User/lijiabing/Desktop/笔记/面向对象.md");
            //进行数学运算
            System.out.println(100/0);//这个异常是一个运行时异常，编写程序时可以处理可以可以不处理
        } catch (FileNotFoundException | ArithmeticException e) {
            System.out.println("文件不存在？数学异常？都有可能！");
        }
        System.out.println("hello world");
    }
}
