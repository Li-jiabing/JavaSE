package com.company.day09.test003.ConstructorTest01;

/**
 * 账户类
 */
public class Account {

    //账号
    private String actno;

    //余额
    private double balance;

    //无参数构造器
    public Account(){

    }

    //有参数构造器
    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
