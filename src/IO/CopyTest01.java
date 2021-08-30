package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用FileInputStream和FileOutputStream完成文件的拷贝。
 * 拷贝的过程应该是一边读一边写
 * 使用以上的字节流拷贝文件的时候，文件类型随意，万能的，什么样的文件都能拷贝
 */
public class CopyTest01 {
    public static void main(String[] args) {
    FileInputStream fileInputStream = null;
    FileOutputStream fileOutputStream = null;
        try {
            //创建一个输入流对象
            fileInputStream = new FileInputStream("/Users/lijiabing/Desktop/笔记/面向对象.md");
            //创建一个输出流对象
            fileOutputStream = new FileOutputStream("/Users/lijiabing/Library/Mobile Documents/com~apple~CloudDocs/Downloads/面向对象.md");

            //最核心的：一边读，一边写
            byte[] bytes = new byte[1024 * 1024];//1MB(一次最多拷贝1MB)
            int readCount = 0;
            while ((readCount = fileInputStream.read(bytes)) != -1){
                fileOutputStream.write(bytes,0,readCount);
            }

            //刷新，输出流最后要刷新
            fileOutputStream.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //分开try，不要一起try
            //一起try的时候，其中一个出现异常，可能会影响到另一个流的关闭。
            if (fileOutputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
