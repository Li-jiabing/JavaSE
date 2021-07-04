package com.company.day11.Test004;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * 自定义日期类型
 *
 *      this可以用在哪：
 *          1.可以使用在实例方法中，代表当前对象[语法格式：this.]
 *          2.可以使用在构造方法中，[语法格式：this(实参);]
 *
 *
 */
public class Date {


    //日期相关属性
    private int year;
    private int month;
    private int day;

    /**
     * 需求：当程序员调用一下无参数构造方法的时候，默认创建日期是"1970-01-01"
     */

    public Date() {
//        this.year = 1970;
//        this.month = 01;
//        this.day = 01;

        //以上代码可以通过调用另一个构造方法来完成
        //但前提是不能创建新的对象，以下代码表示创建了一个全新的对象
        //需要采用以下的语法来完成构造方法的调用
        //这种方式不会创建新的java对象，但同时又可以达到调用其他的构造方法\

        //通过this调用构造方法，this语句只能出现在方法中的第一行，否则报错
        this(1970,01,01);

    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    //对外提供一个方法，可以将日期打印输出控制台
    public void datePrint(){
        System.out.println(this.year+"年"+this.month+"月"+this.day+"日");
    }
}
