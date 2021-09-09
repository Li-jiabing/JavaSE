package Reflect;

/**
 * 可变长度参数
 *   int... args这就是可变长参数
 *  语法是：类型... 注意：一定是3个.
 *
 *  1.可变长度参数要求的参数个数是：0-N个
 *  2.可变长度参数在参数列表上必须在最后一个位置上，而且可变长度参数只能又1个
 */
public class ArgsTest {
    public static void main(String[] args) {
        m();
        m(10);
        m(10,20);
        m(10,20,30);

        m2(1,"aaaa");
        m2(1,"aaaa","bbbb");
        m3("ab","ce","ff");
    }

    public static void m(int... args){

    }


//    public static void m2(String... args,int... args){
//
//    }

    public static void m2(int a,String... args1){

    }

    public static void m3(String... args){
        //args又length属性，说明args是一个数组
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
