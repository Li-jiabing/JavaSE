package com.company.day09.test003.ConstructorTest01;

public class ConstructorTest03 {
    public static void main(String[] args) {
        Account a = new Account();
        System.out.println(a.getActno());
        System.out.println(a.getBalance());

        Account a2 = new Account("1111",8723.3);
        System.out.println(a2.getActno());
        System.out.println(a2.getBalance());
    }
}
