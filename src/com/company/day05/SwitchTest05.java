package com.company.day05;

import java.util.Scanner;

/**
 * 假设系统给定考生成绩，判断该考生成绩等级
 *      1.有限成绩范围【0-100】
 *      2.考试成绩可能带有小数
 *      3.考试成绩和等级之间的对照关系：
 *          [90 - 100]  A
 *          [80 - 90)   B
 *          [70 - 80)   C
 *          [60 - 70)   D
 *          [0  - 60)   E
 *
 *      4.以上需求必须采用switch语句完成，不能采用if
 *
 *      解体窍门
 *          （int）(score/10)
 *          0
 *          1
 *          2
 *          3
 *          4
 *          5
 *          6
 *          7
 *          8
 *          9
 */
public class SwitchTest05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入考生成绩");
        //考生成绩
        double score= scanner.nextDouble();;

        //转换成int
        int grade = (int) (score/10);

        switch (grade){
            case 9: case 10:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("E");
        }
    }
}
