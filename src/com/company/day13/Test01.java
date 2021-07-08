package com.company.day13;

/**
 *      访问控制权限修饰符：
 *             1.访问控制权限修饰符来控制元素的访问范围
 *
 *             2.访问控制权限修饰符包括：
 *                  public     表示公开的，在任何位置都可以访问
 *                  protected
 *                  private    表示私有的，只能在本类访问
 *                  default
 *
 *             3.访问控制权限修饰符可以修饰类、变量、方法
 *
 *
 */
public class Test01 {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.i);
        System.out.println(user.j);

    }
}
