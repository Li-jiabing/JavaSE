package Array;

/**
 * 关于二维数组中元素的：读和改
 *      a[0][0]:a[二维数组中的一维数组的下标][一维数组的下标]
 *      a[0][0]:表示第一个一维数组中的第一个元素
 *      a[3][100]:表示第四个一维数组中的第一百零一个元素
 *
 *      注意：对于a[3][100]来说，其中a[3]是一个整体，[100]是前面a[3]直接结束的结果然后再下标100
 */
public class ArrayTest10 {
    public static void main(String[] args) {
        //二维数组
        int[][] a = {{34,4,65},{100,200,3900,111},{0}};
        //请取出以上二维数组中的第一个一维数组
//        int[] a0 = a[0];
//        int a1 = a0[0];
//        System.out.println(a1);
        //合并以上三行代码
        System.out.println(a[0][0]);

        System.out.println("第二个一维数组中的第三个元素："+a[1][2]);

        System.out.println("第三个二维数组中的第一个元素"+a[2][0]);

        //改
        a[2][0] = 1111;
        System.out.println(a[2][0]);//注意下标别越界
    }
}
