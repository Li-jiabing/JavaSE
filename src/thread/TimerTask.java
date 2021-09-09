package thread;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

/**
 * 使用定时器指定定时任务
 */
public class TimerTask {
    public static void main(String[] args) throws ParseException {
        //创建定时器对象
        Timer timer = new Timer();

        //Timer timer = new Timer(true);//守护线程的方式

        //指定定时任务
//        timer.schedule(定时任务，第一次执行时间，间隔多久执行一次);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstTime = sdf.parse("2021-09-06 16:55:00");
        timer.schedule(new java.util.TimerTask() {
            @Override
            public void run() {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String strTime = sdf.format(new Date());
                System.out.println(strTime+":成功完成了一次数据备份！");
            }
        }, firstTime,1000*10);
    }
}

////编写一个定时任务类
//class LogTimerTask extends TimerTask{
//    public void run(){
//        //编写你需要执行的任务
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String strTime = sdf.format(new Date());
//        System.out.println(strTime+":成功完成了一次数据备份！");
//    }
//}