package IO;

import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWriter:
 *     文件字符输出流：写。
 *     只能输出普通文本
 */
public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            //创建文件字符输出流对象
            fileWriter = new FileWriter("myfile1");

            //开始写
            char[] chars = {'我','是','中','国','人'};
            fileWriter.write(chars);
            fileWriter.write(chars,2,3);
            fileWriter.write("我是一名java软件工程师");

            //刷新
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
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
