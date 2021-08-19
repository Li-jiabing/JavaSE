package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest03 {
    public static void main(String[] args) {
        //这个时间是什么时间？
        //1970-01-01 00：00：00 001
        Date date = new Date(1);//注意：参数是一个毫秒

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        //格林尼治天文台时间  北京是东8区，8小时时差，所以是八点整
        System.out.println(simpleDateFormat.format(date));//1970-01-01 08:00:00 001

        //获取昨天的此时的时间
        Date date1 = new Date(System.currentTimeMillis() - 24*60*60*1000);
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(simpleDateFormat1.format(date1));
    }
}
