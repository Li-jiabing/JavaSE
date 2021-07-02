package com.company.day08;

public class OOTest04 {

    public static void main(String[] args) {

        //创建一个丈夫对象
        Husband huangxiaoming = new Husband();
        huangxiaoming.name = "黄晓明";

        //创建一个妻子对象
        Wife baby = new Wife();
        baby.name = "baby";

        //结婚[通过丈夫找到妻子，通过妻子也可以找到丈夫]
        huangxiaoming.w = baby;
        baby.h = huangxiaoming;

        //得到以上"黄晓明的妻子名称"
        System.out.println(huangxiaoming.w.name);
    }
}
