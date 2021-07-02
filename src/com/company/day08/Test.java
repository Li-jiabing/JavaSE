package com.company.day08;

public class Test {
    public static void main(String[] args) {
        Stu stu = new Stu();
        stu.id = 1;
        stu.name = "李佳冰";
        stu.c = new Computer();

        Stu stu1 = new Stu();
        stu1.id = 2;
        stu1.name = "崔浩洋";
        stu1.c = new Computer();

        Computer computer = new Computer();
        stu.c.brand = "MacBookPro";
        stu.c.model = "13寸 M1芯片";
        stu.c.color = "深空灰";

        System.out.println(stu.name+"有一台"+stu.c.model+stu.c.brand+",是"+stu.c.color+"颜色");
    }
}
