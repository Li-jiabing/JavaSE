package meiju;

/**
 * 分析一下程序在设计方面有什么缺陷
 *  以下代码可以编译，也可以运行，这些都没问题
 *  就是设计上你觉得有什么却下面
 */
public class EnumTest01 {
    public static void main(String[] args) {
//        System.out.println(10/0);//Exception in thread "main" java.lang.ArithmeticException: / by zero
//        System.out.println(divide(10, 2));

//        int returnValue = divide(10,0);
//        System.out.println(returnValue);
        boolean success = divide(10,0);
        System.out.println(success?"执行成功":"执行失败");
    }

    /**
     * 以下程序计算两个int类型的商，计算成功返回1，计算失败返回0
     * @param a int类型的数据
     * @param b int类型的数据
     * @return 返回1表示成功，return0表示失败
     */

    //设计缺陷？在这个方法的返回值类型上，返回一个int不恰当
    //既然最后的结果只是成功和失败，最好使用boolean类型，因为boolean类型true和false正好可以表示两种不同的状态。

    public static boolean divide(int a,int b){
        try {
            int c = a/b;
            //程序执行到此处表示以上代码没有发生异常，表示程序成功返回1
            return true;
        }catch (Exception e){
            return false;
        }
    }

//    public static int divide(int a,int b){
//        try {
//            int c = a/b;
//            //程序执行到此处表示以上代码没有发生异常，表示程序成功返回1
//            return 1;
//        }catch (Exception e){
//            return 0;
//        }
//    }


    //思考：以上的这个方法设计没毛病，挺好，返回true和false表示两种情况
    //但是在以后的开发中，有可能遇到一个方法的执行结果可能包括三种情况，
    //四种情况，五种情况不等，但是每一个都是可以数清楚的，一枚一枚都是可以列举
    //出来的，这个boolean类型就无法满足需求了，此时需要使用java语言中的枚举类型
}