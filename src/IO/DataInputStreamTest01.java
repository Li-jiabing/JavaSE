package IO;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * DataInputStream：数据字节输入流
 * DataOutputStream写的文件，只能使用DataInputStream去读。并且读的时候你需要提前知道写入的顺序。
 * 读的顺序需要和写的顺序一致，才可以正常取出数据
 */
public class DataInputStreamTest01 {
    public static void main(String[] args) throws Exception {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("data"));
        byte b = dataInputStream.readByte();
        short s = dataInputStream.readShort();
        int i = dataInputStream.readInt();
        long l = dataInputStream.readLong();
        float f = dataInputStream.readFloat();
        double d = dataInputStream.readDouble();
        boolean sex = dataInputStream.readBoolean();
        char c = dataInputStream.readChar();

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(sex);
        System.out.println(c);
    }
}
