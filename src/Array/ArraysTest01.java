package Array;

import java.util.Arrays;

/**
 * 使用一下sun公司通过的数组工具类：java.util.Arrays
 */
public class ArraysTest01 {
    public static void main(String[] args) {
        int[] arr = {2,33,4,5,23,999,665};
        //工具类当中的方法大部分都是静态的
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
