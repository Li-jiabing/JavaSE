package com.company.day11.Test004;


public class DateTest {
    public static void main(String[] args) {
        //创建日期对象1
        Date date1 = new Date();
        date1.datePrint();

        //创建日期对象2
        Date date2 = new Date(2021,07,03);
        date2.datePrint();
    }
}
