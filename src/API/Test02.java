package API;

/**
 * 关于Object类中的equals()方法
 * 1.equals方法中的源代码
 *      public boolean equals(Object obj){
 *          return(this == obj);
 *      }
 *      以上这个方法就是Object类的默认实现。
 *
 *  2.SUN公司设计equals方法的目的是什么？
 *      以后编程的过程中，都要通过equals方法来判断两个对象是否相等。
 *      equals方法是判断两个对象是否相等。
 *
 *  3.我们需要研究一下Object类的这个默认的equals方法够不够用！！！
 *    在object类中的equals方法中，默认你采用的是"=="判断两个java对象是否相等。
 *    而"=="判断的是两个对象的内存地址，我们应该判断两个java对象的内容是否相等。
 *    所以老祖宗的equals方法不够用，需要重写equals方法。
 *
 *  4.判断连个java对象相等吗不能使用"=="，因为"=="比较的是两个对象的内存地址
 */
public class Test02 {
    public static void main(String[] args) {
        //判断两个基本数据类型的数据是否相等直接使用"=="就行
        int a = 100;
        int b = 100;
        System.out.println(a == b);

        //判断两个java对象是否相等，我们怎么办？
        MyTime1 m1 = new MyTime1(2008,8,8);
        MyTime1 m2=  new MyTime1(2008,8,2);
        System.out.println(m1.equals(m2));

        //我们这个程序有bug吗?没问题，可以运行，但是运行效率较低
        MyTime1 m3 = null;
        System.out.println(m1.equals(m3));
    }
}

class MyTime1{
    int year;
    int month;
    int day;

    public MyTime1() {
    }

    public MyTime1(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //重写Object类的equals方法
    //怎么重写。相同的返回值类型，相同的方法名，相同的形式参数列表。
//    @Override
//    public boolean equals(Object obj) {
//        int year1 = year;
//        int month1 = month;
//        int day1 = day;
//        if (obj instanceof MyTime1){
//            MyTime1 t= (MyTime1) obj;
//            int year2 = t.year;
//            int month2 = t.month;
//            int day2 = t.day;
//            if (year1 == year2 && month1 == month2 && day1 == day2){
//                return true;
//            }
//        }
//        //程序能够执行到此处，表示此处日期不相等。
//        return false;
//    }

    //改良equals方法
    @Override
    public boolean equals(Object obj){
        //如果obj是空，直接返回false
        //如果obj不是一个MyTime，没必要比较了，直接返回false
        if (obj == null || !(obj instanceof MyTime1)){
            return false;
        }
        //如果this和obj保存的内存地址相同，没必要比较了，直接返回true。
        //内存地址相同的时候指向的堆内存的对象肯定是同一个。
        if (this == obj){
            return true;
        }
        //程序能够执行到此处，说明obj不是null，obj是MyTime类型。
        MyTime1 t = (MyTime1) obj;
        return this.year == t.year && this.month == t.month && this.day == day;
    }
}