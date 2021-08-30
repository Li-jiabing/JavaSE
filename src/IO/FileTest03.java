package IO;

import java.io.File;

/*
File中的listFiles方法
 */
public class FileTest03 {
    public static void main(String[] args) {
        //File[] listFiles()
        //获取当前目录下的所有的子文件
        File file = new File("/Users/lijiabing/Desktop");
        File[] files = file.listFiles();
        for (File f : files
             ) {
            //获取文件绝对路径
            System.out.println(f.getAbsolutePath());
            System.out.println(f.getName());
        }
    }
}
