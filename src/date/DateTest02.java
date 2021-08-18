package date;

import com.company.day12.test003.D;

/**
 * 获取自1970年1月1日 00:00:00到当前系统时间的总毫秒数
 */
public class DateTest02 {
    public static void main(String[] args) {
        long nowTimeMillis = System.currentTimeMillis();
        System.out.println(nowTimeMillis);

        //统计一个方法耗时
        long methodsBegin = System.currentTimeMillis();
        print();
        long methodsEnd = System.currentTimeMillis();
        long time = methodsEnd-methodsBegin;
        System.out.println(time);//44
    }


    //统计一个方法执行所耗费的时长
    public static void print(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("i = "+i);
        }
    }
}
