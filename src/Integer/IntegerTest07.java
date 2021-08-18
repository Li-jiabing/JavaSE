package Integer;

/**
 * 总计一下之前所学的经典异常：
 *  空指针异常：NullPointException
 *  类型转换异常:ClassCastException
 *  数组下标越界异常:ArrayIndexOutOfBoundsException
 *  数字格式化异常：NumberFormatException
 *
 * Integer类中有哪些常用的方法呢
 */
public class IntegerTest07 {
    public static void main(String[] args) {

        //手动装箱
        Integer x = new Integer(1000);

        //手动拆箱
        int y = x.intValue();
        System.out.println(y);

        //编译的时候没问题，符合java语法，运行时有问题，报错：java.lang.NumberFormatException
//        Integer a = new Integer("中文");
        Integer a1 = new Integer("134");

        //重点： static int parseInt(String s)
        //静态方法，传参String，返回int
        int parseInt = Integer.parseInt("123");
        System.out.println(parseInt);

        //依葫芦画瓢
        Double d =Double.parseDouble("3.14");
        int value = 1;
        System.out.println(d+value);//4.140000000000001  精度问题

        Float f = Float.parseFloat("344");
        System.out.println(f+1);//345.0

        //static String toBinaryString(int i)
        //静态的：将十进制转换成二进制字符串
        String binaryString = Integer.toBinaryString(3);
        System.out.println(binaryString);//0000 0011    (11)

        //static String toHexString(int i)
        //静态的，将十进制转换成十六进制字符串
        //十六进制：1 2 3 4 5 6 7 8 9 a b c d e f 10 11 12 13 14 15 16 17 18 19 1a
        String hexString = Integer.toHexString(26);
        System.out.println(hexString);//1a
        System.out.println(new Object());//java.lang.Object@4554617c
        System.out.println(new Object());//java.lang.Object@74a14482


        //static String toOctalString(int i)
        //静态的，将十进制转换成八进制字符串
        String OctalString =  Integer.toOctalString(8);
        System.out.println(OctalString);//10


        //valueOf方法作为了解
        //static Integer valueOf(int i)
        //静态的：int --> Integer
        Integer integer = Integer.valueOf(3);
        System.out.println(integer);

        int i = 100;
        String s = i + "";
        String s1 = String.valueOf(i);
    }
}
