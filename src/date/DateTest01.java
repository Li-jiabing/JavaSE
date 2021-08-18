package date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java中对日期的处理
 */
public class DateTest01 {
    public static void main(String[] args) throws ParseException {
        //获取当前时间(精确到毫秒的系统当前时间)
        //直接调用无参构造方法就行
        Date date = new Date();

        //java.util.Date类的toString()方法已经被重写了
        //输出的应该不是一个对象的内存地址，应该是一个日期字符串
        System.out.println(date);

        //日期可以格式化吗
        //将日期类型Date，按照制定的格式进行转换，Date--->转换成具有一定格式的日期字符串-->String
        //SimpleDateFormats是java.text包下的，专门负责日期格式化的
        /**
         * yyyy 年
         * MM 月
         * dd 日
         * HH 时
         * mm 分
         * ss 秒
         * sss 毫秒
         *
         * 注意：在日期格式中除了yMdHmsS不能随便写之外，剩下的符号格式自己随意组织
         */
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:sss");

        String nowTime = simpleDateFormat.format(date);
        System.out.println(nowTime);

        //假设现在有一个日期字符串String，怎么转换成Date类型
        String time = "2008-08-08 08:08:888";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:sss");
        //注意：字符串的日期格式和SimpleDateFormat对象制定的日期格式要一致，不然会出现异常：java.text.ParseException
        Date date1 = simpleDateFormat1.parse(time);
        System.out.println(date1);
    }
}
