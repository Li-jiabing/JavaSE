package com.company.day01_02_03;

/**
 * 关于布尔型数据类型：
 * boolean
 * 在java语言当中boolean类型只有两个值：true和false，没有其他值
 * 不像c语言中，0和1可以表示假和真
 * <p>
 * 在底层存储的时候boolean类型占用一个字节，因为实际存储的时候false底层是0；true的底层是1
 * <p>
 * 布尔类型在实际开发当中，非常重要，经常使用在逻辑运算和条件控制语句当中
 */
public class DateTypeTest07 {

    //    编译错误：不兼容的类型
//    boolean flag = 1;
    public static void main(String[] args) {


        boolean loginSuccess = true;

        if (loginSuccess){
            System.out.println("恭喜你，登陆成功");
        }else {
            System.out.println("对不起，登陆失败");
        }
    }
}