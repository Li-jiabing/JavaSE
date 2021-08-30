package IO;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * File类的常用方法
 */
public class FileTest02 {
    public static void main(String[] args) {
        File f1 = new File("copy");
        //获取文件名
        System.out.println(f1.getName());

        //判断是否是个目录
        System.out.println(f1.isDirectory());

        //判断是否是个文件
        System.out.println(f1.isFile());

        //获取文件最后一次修改时间
        long haoMiao = f1.lastModified();//返回的是一个毫秒，是从1970年到现在的总毫秒数
        //将总毫秒数转换成时间
        Date date = new Date(haoMiao);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime = simpleDateFormat.format(date);
        System.out.println(strTime);

        //获取文件大小
        System.out.println(f1.length());//23字节
    }
}
