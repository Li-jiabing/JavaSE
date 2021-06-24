package com.company.day07;

/**
 *      其实JavaSE类库中自带的类，例如：string.class system.class，这些类的类名也是标识符
 *      只要是类名就一定是标识符
 *
 *      重点：方法调用的时候，在参数传递的时候，实际上传递的是变量中保存的那个"值"传过去了
 */
public class MethodTest01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int retValue = sumInt(a,b);
        System.out.println("retValue:"+retValue);
    }

    public static int sumInt(int i,int j){
        int result = i+j;
        int num = 3;
        int retValue = divide(result,num);
        return retValue;
    }

    public static int divide(int x,int y){
        int z = x/y;
        return z;
    }

    /**
     *    画图依据：
     *       1.只要涉及到参数传递的问题，传递的是变量中保存的值
     *       2.画图的时候，必须遵循"方法自上而下的顺序"这个执行原则。
     *
     */
}
