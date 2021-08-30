package IO;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * BufferedWirter：
 *  带有缓冲的字符输出流
 *
 *  OutputStreamWriter:转换流
 */
public class BufferedWriterTest {
    public static void main(String[] args) throws Exception{
//        BufferedWriter out = new BufferedWriter(new FileWriter("copy"));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("copy2",true)));
        out.write("Hello World");
        out.write("\n");
        out.write("Hello Kitty");
        out.flush();
        out.close();
    }
}
