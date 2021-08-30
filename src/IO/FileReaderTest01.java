package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * FileReader：
 *      文件字符输入流，只能读取普通文本。
 *      读取文本内容时，比较方便，快捷
 */
public class FileReaderTest01 {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            //创建文件字符输入流
            fileReader = new FileReader("file");
            //开始读
            char[] chars = new char[4];//一次读取4个字符
            int readCount = 0;
            while ((readCount = fileReader.read(chars)) != -1){
                //对字符数组进行遍历
                System.out.print(new String(chars,0,readCount));
            }

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
        }
    }
}
