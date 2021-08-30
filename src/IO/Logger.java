package IO;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日志工具
 */
public class Logger {
    /**
     * 记录日志的方法
     * @param msg
     */
    public static void log(String msg){
        try {
            //指向一个日志文件
            PrintStream out = new PrintStream(new FileOutputStream("log.txt",true));
            //改变输出方向
            System.setOut(out);
            //日期当前时间
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
            String strTime = simpleDateFormat.format(date);
            System.out.println(strTime+":"+msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
