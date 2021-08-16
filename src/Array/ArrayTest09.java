package Array;

/**
 * 关于java中的二维数组
 *      1.二维数组其实是一个特殊的一维数组，特殊在这个以为数组当中的每一个元素是一个一维数组。
 *      2.三维数组是什么？
 *          三维数组是一个特殊的二维数组，特殊在这个二维数组中每一个元素是一个一维数组
 *          实际开发中，用的最多的就是一维数组，二维数组很少用，三维数组几乎不用
 *      3.二维数组静态初始化
 *          int[][] array = {{1,1,1},{2,2,2},{3,3,3}}
 */
public class ArrayTest09 {
    public static void main(String[] args) {
        //一维数组
        int[] array = {100,200,300};
        System.out.println(array.length);//3

        //二维数组
        //里面是四个一维数组
        int[][] a = {{100,200,300},{1,2,3},{22,22,22}};
        System.out.println(a.length);//3

        //思考一下三维数组
    }
}
