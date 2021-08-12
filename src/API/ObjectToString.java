package API;

/**
 * 关于Object类中的toString()方法
 *      1.源代码长什么样？
 *      public String toString(){
 *          return getClass().getName()+"@"+Integer.toHexString(hashCode());
 *      }
 *      源代码上toString()方法的默认实现是：
 *          类名@对象的内存地址转换为十六进制的形式
 *
 *      2.SUN公司设计toString()方法的目的是什么？
 *         toString()方法的作用是什么？
 *              toString()方法的设计目的是：通过调用这个方法可以将一个"java对象"转换成"字符串表示形式"
 *
 *      3.其实Sun公司开发java语言的时候，建议所有的子类都去重写toString()方法。
 *      toString()方法应该是一个简洁的，详实的，易阅读的。
 */
public class ObjectToString {
    public static void main(String[] args) {
        //一个日期对象转换成字符串形式的话，我可能还是希望能看到具体的日期信息。而不是一个十六进制的内存地址
        MyTime t1 = new MyTime(1970,1,1);

        //MyTime类重写toString()方法之前
        String s1 = t1.toString();
        System.out.println(s1);//API.MyTime@4554617c
        //重写后调用toString()方法输出1970年1月1日
    }
}

class MyTime{
    int year;
    int month;
    int day;

    public MyTime() {
    }

    public MyTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    //重写toString()方法
    //这个toString()方法怎么重写呢？
    //越简介越好，可读性越强越好。
    //向简介的，详实的，易阅读的方向发展

    @Override
    public String toString() {
        return this.year+"年"+this.month+"月"+this.day+"日";
    }
}

