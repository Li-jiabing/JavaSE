package StringBuffer;

/**
 * 如果以后需要进行大量字符串的拼接操作，建议使用jdk中自带的：
 *      java.lang.StringBuffer
 *      java.lang.StringBuilder
 *
 *      如何优化StringBuffer的性能？
 *      在创建StringBuffer的时候，尽可能给定一个初始化容量，最好减少底层数组的扩容次数，预估计一下，给一个大一点的初始化容量。
 *      关键点：给一个合适的初始化容量，可以提高程序的执行效率
 */
public class StringBufferTest02 {
    public static void main(String[] args) {

        //创建一个初始化容量为16的byte[]数组（字符串缓冲区对象）
        StringBuffer stringBuffer = new StringBuffer();

        //拼接字符串，以后拼接字符串统一调用append()方法。
        //append是追加的意思。
        stringBuffer.append("a");
        stringBuffer.append("b");
        stringBuffer.append("d");
        stringBuffer.append(3.14);
        stringBuffer.append(true);
        stringBuffer.append(100L);
        //append方法底层在进行追加的时候如果byte数组满了会自动扩容
        System.out.println(stringBuffer);

        StringBuffer sb = new StringBuffer(100);//制定初始化容量的StringBuffer对象（字符串缓冲区对象）
        sb.append("hello");
        sb.append("world");
        sb.append("hello");
        sb.append("kitty");
        System.out.println(sb);
    }
}
