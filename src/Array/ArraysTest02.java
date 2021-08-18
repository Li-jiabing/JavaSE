package Array;

import java.util.Arrays;

/**
 * sun公司已经为我们程序员写好了一个数组工具类
 *      java.util.Arrays
 */
public class ArraysTest02 {
    public static void main(String[] args) {

        int[] arr = {1,4,32,2,5,55,23,44,3};
        //Arrays是一个工具类，工具类中的方法都是静态的，直接用类名调用即可，主要是用的是二分法查找(binarySearch)和排序(sort)
        Arrays.sort(arr);
        //排序
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //二分法查找
        int index = Arrays.binarySearch(arr,23);
        System.err.println(index == -1 ? "该元素不存在":"该元素下标是:"+index);
    }
}
