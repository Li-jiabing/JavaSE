package com.company.day11.test008;

/**
 * 信用账户类
 */
public class CreditAccount extends Account{

    private double credit;

    public CreditAccount() {
        super();
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}
