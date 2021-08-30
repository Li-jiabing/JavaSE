package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 最终版，需要掌握
 */
public class FileInputStreamTest04 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("src/file");
            //准备一个byte数组
            byte[] bytes = new byte[4];
/*            while (true){
                int readCount = fileInputStream.read(bytes);
                if (readCount == -1){
                    break;
                }
                //把byte数组转换成字符串，读到读少个转换多少个。
                System.out.print(new String(bytes,0,readCount));
            }*/
            int readCount = 0;
            while ((readCount = fileInputStream.read(bytes)) != -1){
                System.out.print(new String(bytes,0,readCount));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
