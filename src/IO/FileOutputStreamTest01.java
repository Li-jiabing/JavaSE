package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件字节输出流，负责写
 * 从内存到硬盘
 */
public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        try {
            //文件不存在的时候会自动新建
            //这种方式谨慎使用，这种方式会将源文件清空，然后再写入
            //以追加的方式在文件末尾写入，不会清空源文件内容
            fileOutputStream = new FileOutputStream("src/file",true);
            //开始写
            byte[] bytes= {97,98,99,100};
            //将byte数组全部写出
            fileOutputStream.write(bytes);
            //将byte数组的一部分写出
            fileOutputStream.write(bytes,0,2);//再写出ab

            //字符串
            String s = "我是一个中国人，我骄傲";
            byte[] bytes1 = s.getBytes();
            fileOutputStream.write(bytes1);
            //写完之后一定要刷行
            fileOutputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
