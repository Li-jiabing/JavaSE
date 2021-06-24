package com.company.day05;

/**
 * 打印棱形
 *          *
 *         ***
 *        *****
 *       *******
 *      *********
 */
public class ForTest09 {
    public static void main(String[] args) {
//        for (int i = 1; i < 6 ; i++) {
//            for (int j = 1; j <= i ; j++) {
//                    System.out.print("*"+"\t");
//            }
//            for (int k = 1; k <=i; k++) {
//                System.out.print(" ");
//            }
//            System.out.print("\n");
//        }



/**
 *    1234 * 6789                       1234 5 6789
 *    123 *** 789                       123 456 789
 *    12 ***** 89                       12 34567 89
 *    1 ******* 9
 */

/**
 *      for 1
 *          for  4 ""
 *          for  1 *
 *          for  4 ""
 *
 *      for 2
 *          for  3 ""
 *          for `3*
 *          for `3 ""
 *
 *      for 3
 *          for  2 ""
 *          for  5 *
 *          for  2 ""
 *
 *      for 4
 *          for  1 ""
 *          for  7 *
 *          for  1 ""
 *
 */

//        for (int i = 1; i < 5; i++) {
//            System.out.print(" ");
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println("\n");
//        }

        /**
         *    1234     *     6789
         *    234     ***    123
         *    34     *****    12
         *    4     *******   1
         *
         */

        /**
         * 输出图形
         *      *
         *
         *     ***
         *
         *    *****
         *
         *   *******
         *
         *  *********
         */
        for (int i = 1; i <= 5; i++) {
            System.out.print(" ");
            for (int j = i+1; j <= 5 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }
            System.out.println("\n");
        }
    }
}

/**
 *         *    *******
 *        ***   *****
 *       *****  ***
 *      *******  *
 */