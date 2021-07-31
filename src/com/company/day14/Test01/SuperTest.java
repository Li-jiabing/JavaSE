package com.company.day14.Test01;


/**
 * 1.举个例子：在恰当的时间使用super(实际参数列表)；
 * 2.注意：虽然调用构造方法，在构造方法执行过程中一连串调用了父类的构造方法，
 *        父类的构造方法又继续向下调用他的父类的构造方法。但是实际上对象只创建了一个。
 * 3.思考："super(实参)"到底是干啥的？
 *      super(实参)得作用是初始化当前对象的父类型特征。
 *      并不是创建新对象，实际上对象只创建了一个。
 * 4.super()关键字代表什么呀？
 *   super关键字代表的就是"当前对象"的那部分父类型特征。
 *   我继承了我父亲的一部分特征：
 *      例如：眼睛、皮肤等
 *      super代表的就是"眼睛、皮肤等"。
 *      眼睛、皮肤等虽然是继承了父亲的，但这部分是在我身上的。
 * 测试程序
 */
public class SuperTest {
    public static void main(String[] args) {
        CreditAccount creditAccount = new CreditAccount();
        System.out.println(creditAccount.getActno());
        System.out.println(creditAccount.getCredit());
        System.out.println(creditAccount.getBalance());

        System.out.println("==============================================================");

        CreditAccount creditAccount1 = new CreditAccount("1111",10000,0.999);
        System.out.println(creditAccount1.getActno());
        System.out.println(creditAccount1.getBalance());
        System.out.println(creditAccount1.getCredit());
    }
}

class Account1{
    //属性
    private String actno;
    private double balance;

    //构造方法
    public Account1(){

    }

    public Account1(String actno,double balance){
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

//信用账户
class CreditAccount extends Account1{//子类

    //属性：信誉度
    //子类特有的一个特征，父类没有
    private double credit;

    //构造方法
    public CreditAccount(){

    }

    public CreditAccount(String actno, double balance ,double credit){
//        this.actno() = actno;    私有的属性只能在本类中访问

        //以上两行代码在你恰当的位置，正好可以使用：super(actno,balance)；
        //通过子类的构造方法调用父类的构造方法
        super(actno,balance);
        this.credit = credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getCredit(){
        return credit;
    }

}
