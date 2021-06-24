package com.company.day06;

/**
 *      在返回值类型是void的方法中，使用"return;"语句。
 *      "return;"语句出现在返回值void的方法中主要是为了用来结束当前方法
 */
public class MethodTest10 {
    public static void main(String[] args) {
        m();
        for (int i = 10; 1 > 0 ; i--){
            if (i == 2){
                return;
            }
            System.err.println("i---->"+i);
        }
//        上面的return结束的是main方法，所以return后面不输出了，所以编译报错
//        System.out.println("Execute Here!");
    }


    //Cannot return a value from a method with void result type
    //对于结果类型为空的方法，无法返回值
    //public static void m(){
    //return 10;
    //}

    public static void m(){
        for (int i = 0; i < 10; i++) {
            if(i == 5){
                return;  //这里的return不是中止for循环，而是中止了m方法
//              break；  //这里用break中止的是for循环
            }
            System.out.println("i---->"+i);
        }
        System.out.println("hello world");
    }
}
