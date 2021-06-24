package com.company.day04;

/**
 * 关于java语言中的if语句，属于选择结构，if语句又被称为分支语句/条件控制语句
 *      1.if语句的语法结构：四种编写方式
 *          1：
 *           if( boolean ){
 *               java语句；
 *               java语句；
 *               java语句；
 *               java语句；
 *               .....
 *           }
 *
 *          2:
 *            if( boolean ){
 *                java语句；
 *                java语句；
 *                .....
 *            }else{
 *                java语句；
 *                java语句；
 *                .....
 *            }
 *
 *          3:
 *            if(boolean){
 *                java语句;
 *                .....
 *            }else if(boolean){
 *                java语句；
 *                ....
 *            }else if(boolean){
 *                java语句；
 *                .....
 *            }......
 *
 *            重点：对于java中的if语句来说，只要有一个分支执行，整个if语句全部结束
 *
 *
 *          4:
 *            if( boolean ){
 *                java语句；
 *                ...
 *            }else if(boolean){
 *                java语句；
 *                ...
 *            }else{
 *                java语句；
 *                ...
 *            }
 *
 *            以上第二种和第四种方式带有else分支，这两种方式可以保证一定有一种分支执行
 *
 *            所有的控制语句都可以互相嵌套使用，只要合理嵌套就行
 *            if(){
 *                if(){
 *                    if(){
 *
 *                    }
 *                }
 *            }else{
 *                if(){
 *
 *                }if(){
 *
 *                }
 *            }
 *
 *            if语句的分支中只有一条java语句的话，大括号可以省略不写
 *            if（true/false）{一条java语句;}
 *            if(true/false) java语句；
 */
public class IfTest01 {
    public static void main(String[] args) {
        //需求：所在位置的5公里范围之内有kfc的话，去kfc吃午饭
        int kfc = 3;
        if(kfc < 5){
            System.out.println("去kfc吃午饭");
        }

        //假设系统给定考生成绩：成绩可能带有小数点，判断学生等级
        //  [90 - 100]      A
        //  [80 - 90]       B
        //  [70 - 80]       C
        //  [60 - 70]       D
        //  [0 - 60]        E
        double fraction = 45.0;
        if (fraction >0 && fraction<100) {
            if (fraction >= 90) {
                System.out.println("A");
            } else if (fraction >= 80) {
                System.out.println("B");
            } else if (fraction >= 70) {
                System.out.println("C");
            } else if (fraction >= 60) {
                System.out.println("D");
            } else if (fraction >= 0) {
                System.out.println("E");
            }
        }else {
            System.out.println("成绩输入有误");
        }
    }
}
