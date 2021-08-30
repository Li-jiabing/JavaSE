package IO;

import java.io.File;
import java.io.IOException;

/**
 * File
 *      1.File类和四大家族没有关系，所以File类不能完成文件的读写
 *      2.File对象代表什么？
 *          文件和目录路径的抽象表示形式。
 *          file：一个file对象有可能对应的是目录，也可能是文件，
 *          file只是一个路径名的抽象表示形式
 *      3.需要掌握File类中常用的方法
 *
 */
public class FileTest01 {
    public static void main(String[] args) throws IOException {
        //创建一个file对象
        File f1 = new File("/Users/lijiabing/Desktop/file");
        //exists()方法用来判断这个文件存不存在
//        System.out.println(f1.exists());

        /*//如果"/Users/lijiabing/Desktop/file"不存在，则以文件的形式创建出来
        if (!(f1.exists())){
            f1.createNewFile();
        }*/

        //如果"/Users/lijiabing/Desktop/file"不存在，则以文件的形式创建出来
//        if (!(f1.exists())){
//            f1.mkdir();
//        }

        //可以创建多层目录吗
        File f2 = new File("/Users/lijiabing/Desktop/a/b/c/d/f");
        if (!f2.exists()){

            //多重目录创建
            f2.mkdirs();
        }

        File f3 = new File("/Users/lijiabing/Desktop/file/笔记/面向对象.md");
        String parentPath = f3.getParent();
        System.out.println(parentPath);
        File parentFile = f3.getParentFile();
        System.out.println("获取绝对路径："+parentFile.getAbsoluteFile());

        File f4 = new File("file");
        System.out.println("绝对路径："+f4.getAbsoluteFile());
    }
}
