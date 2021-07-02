package com.company.day08.example09;

public class Test {
    public static void main(String[] args) {
        Ren ren = new Ren();
        ren.id  = "234134";
        ren.name = "李佳冰";
        ren.age = 23;
        ren.sex = true;

        BieShu bieShu = new BieShu();
        bieShu.mianJi = 500.0;
        bieShu.zhuRen = ren;

        System.out.println(bieShu.zhuRen.name);
    }
}
