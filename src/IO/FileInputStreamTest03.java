package IO;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * int read(byte[] b)
 *  一次最多读取b.length个字节
 *  减少硬盘和内存的交互，提高程序的执行效率
 *  往byte[]数组当中读。
 */
public class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            //idea默认的当前路径是当前project的根
            fileInputStream = new FileInputStream("src/file");
//            System.out.println(fileInputStream.read());

            //开始读，采用byte数组，一次读取多个字节，最多读取"数组.length" 个字节
            byte[] bytes = new byte[4];//准备一个4个长度的byte数组，一次最多读取4个字节
            //这个方法的返回值是：读取到的字节数量，[不是字节本身]
            int readCount = fileInputStream.read(bytes);
            System.out.println(readCount);//第一次读到了4个字节
            //将字节数组全部转换成字符串
//            System.out.println(new String(bytes));
            //但我们不应该全部转换，应该是读取了多少个转换多少个
            System.out.println(new String(bytes,0,readCount));

            readCount = fileInputStream.read(bytes);
            System.out.println(readCount);
            System.out.println(new String(bytes,0,readCount));

            readCount = fileInputStream.read(bytes);
            System.out.println(readCount);//-1

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream == null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
