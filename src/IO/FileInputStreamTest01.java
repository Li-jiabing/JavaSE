package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * java.io.FileInputStream
 *    1.文件字节输入流，万能的，任何类型的文件都可以采用这个流来读
 *    2.字节的方式，完成输入的操作，完成读的操作（从硬盘到内存）
 */
public class FileInputStreamTest01 {
    public static void main(String[] args) {

        FileInputStream fileInputStream = null;
        try {
            //创建文件字节输入流对象
            fileInputStream = new FileInputStream("/Users/lijiabing/Desktop/temp.txt");
            //开始读
            int readData;
            readData = fileInputStream.read();
            System.out.println(readData);

            //当文件读完之后，没数据了的话返回-1
            readData = fileInputStream.read();
            System.out.println(readData);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //在finally语句块中确保流一定关闭
            if (fileInputStream == null) {
                //关闭流的前提是流不是空的时候，流是null的时候没必要关闭，避免空指针异常
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
