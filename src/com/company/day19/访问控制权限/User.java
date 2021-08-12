package com.company.day19.访问控制权限;

/**
 * 访问控制权限
 *  1.访问控制权限都有哪些？
 *      4个。
 *      private   私有的
 *      protected 受保护的
 *      public    公开
 *                默认的
 *
 *   2.以上的4个访问控制权限，控制的范围是什么？
 *      private 表示私有的，只能在本类中访问。
 *      public 表示公开的，在任何位置都可以访问。
 *      "默认"表示只能在本类，以及同包下访问。
 *      protected表示只能在本类，同包，子类中访问。
 *
 *
 *      访问修饰符                本类                 同包                      子类                          任意位置
 *      ----------------------------------------------------------------------------------------------------------
 *      public                   可以                 可以                     可以                             可以
 *      protected                可以                 可以                     可以                              不行
 *      默认                      可以                 可以                      不行                            不行
 *      private                   可以                 不行                     不行                             不行
 *
 *      这个范围不要死记硬背，自己下去写代码自己测试
 *      范围从大到小陪许：public>protected>默认的>private
 *
 *
 *      访问控制权限可以修饰什么？
 *      属性（四个都能用）
 *      方法（四个都能用）
 *      类（public和默认都能用，其他不行）
 *      接口（public和默认都能用，其他不行）
 *      .....
 *
 */
public class User{
    //给一些属性
    //私有的
    private int id;
    //受保护的
    protected int age;
    //公开的
    public int weight;
    //默认的
    String name;
}
