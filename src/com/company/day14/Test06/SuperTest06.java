package com.company.day14.Test06;

/**
 * 通过这个测试得出的结论：
 *      super不是引用，super也不保存内存地址，super也不指向任何对象
 *      super只是代表当前对象内部的哪一块父类型的特征。
 */
public class SuperTest06 {

    //实例方法
    public void doSome(){
        //SuperTest06@4554617c
        System.out.println(this);
        //输出"引用"的时候，会自动调用引用的toString方法
        System.out.println(super.toString());
    }


    /**
     * 编译报错
     *  原因：this和super不能使用在static静态方法中。
     */
    public static void doOther(){
//        System.out.println(this);
//        System.out.println(super.toString());
    }

    //静态方法，主方法
    public static void main(String[] args) {
        SuperTest06 superTest06 = new SuperTest06();
        superTest06.doSome();
        System.out.println(superTest06);

        /**
         * main方法也是静态方法，方法总有static
         */
//        System.out.println(this);
//        System.out.println(super);
    }
}
