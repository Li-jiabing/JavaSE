package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream类的其他常用方法：
 *      int available();  //返回流当中剩余的没有读到的字节数量
 *      long skip(long n);  //跳过几个字节不读
 */
public class FileInputStreamTest05 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("temp");
/*            System.out.println("总字节数量："+fileInputStream.available());
            //读一个字节
//            int readByte = fileInputStream.read();
            //还剩下可以读的字节数量是：5
            System.out.println("剩下多少个字节没有读："+fileInputStream.available());
            //这个方法有什么用
            //可以通过这个方法知道文件里有多少字节，然后指定一个有长度的数组
            byte[] bytes = new byte[fileInputStream.available()];
            //这样就不用循环了，直接读一次就可以了
            int readCount = fileInputStream.read(bytes);
            System.out.println(new String(bytes));//abcdef*/
            fileInputStream.skip(3);
            System.out.println(fileInputStream.read());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
