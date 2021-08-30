package IO;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * BufferedReader：
 *      带有缓冲区的字符输入流。
 *      使用这个流的时候不需要自定义char数组，或者说不需要自定义byte数组。自带缓冲。
 *
 */
public class BufferedReaderTest01 {
    public static void main(String[] args) throws Exception{
        //注意：当一个流的构造方法中需要一个流的时候，这个被传进来的流叫做：节点流
        //外部负责包装的这个流叫做包装流，还有一个名字叫做：处理流
        //像当前这个程序来说：fileReader就是一个节点流
        //而BufferedReader：就是一个包装流或者处理流
        FileReader fileReader = new FileReader("src/IO/myfile2");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        //读一行
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
        String s = null;
        while ((s = bufferedReader.readLine()) != null){
            System.out.println(s);
        }

        //关闭流
        //对于包装流来说，只需要关闭最外层流就行，里面的节点流会自动关闭（可以看源代码）
        bufferedReader.close();
    }
}
