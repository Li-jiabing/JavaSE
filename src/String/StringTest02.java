package String;


public class StringTest02 {
    public static void main(String[] args) {
        String s1 = "hello";
        //"hello"是存储在方法区的字符串常量池当中
        //所以这个"hello"不会新建
        String s2 = "hello";
        //分析结果是true还是false
        //==双等号比较的是不是变量中保存的内存地址？是的
        System.out.println(s1 == s2);//true

        String x = new String("xyz");
        String y = new String("xyz");
        System.out.println(x == y);//false

        //String已经重写了equals方法，以下的equals方法调用的是String重写之后的equals方法
        System.out.println(x.equals(y));//true

        //为什么testString后面可以加.呢
        //因为"testString"是一个String字符串对象。只要是对象就都能调用方法
        String k = new String("testString");//建议使用这种方式，因为这种方式可以避免空指针异常
        System.out.println("testString".equals(k));
        System.out.println(k.equals("testString"));//当k是空的时候，会报空指针异常
    }
}
