package Integer;

import com.company.day12.test003.D;

/**
 * 关于Integer类的构造方法，有两个：
 *  Integer（int）
 *  Integer（String）
 */
public class IntegerTest03 {
    public static void main(String[] args) {

        //jdk 9之后不建议使用这个方法了
        //将数字100转换曾呢包装类Integer类型(int --->  Integer)
        Integer x = new Integer(100);

        //将String类型的数字，转换成Integer包装类型(String ---> Integer)
        Integer y = new Integer("123");

        //double--->Double
        Double d = new Double(3.23);
        System.out.println(d);

        //String---->Double
        Double e = new Double("3.14");
        System.out.println(e);
    }
}
