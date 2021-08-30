package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 使用FileReader FileWriter进行拷贝的话，只能拷贝"普通文本文件"
 */
public class CopyTest02 {
    public static void main(String[] args) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            //读
            fileReader = new FileReader("myfile1");
            //写
            fileWriter = new FileWriter("src/IO/myfile2");

            //一边读一边写
            char[] chars = new char[1024*512];//1MB
            int readCount = 0;
            while ((readCount = fileReader.read(chars)) != -1){
                fileWriter.write(chars,0,readCount);
            }
            //刷新
            fileWriter.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
