package Array;

import static java.util.Arrays.binarySearch;

/*
数组工具类：自己写的，不是sun的
关于查找算法中的二分法查找
    10，11，12，13，14，15，16，17，18，19，20
  下标0                                 下标10
    通过二分法查找，找出18这个元素的下标：
     （0+10）/2 --->中间元素的下标：5

     拿着中间这个元素和目标要查找的元素进行对比：
        中间元素是：arr[5] --> 15
        15<18(被查找的元素)
        被查找的元素18在目前中间元素15的右边
        所以开始元素的下标从0变成5+1

     再重新计算一个中间元素的下标
     开始下标是：5+1
     结束下标是：10
    （6+10）/2  -->8
    8下标对应的元素arr[8] 就是18
    找到的中间元素正好和被找的元素18相等，表示找到了：下标为8

    二分法查找的中等条件：中间一直折半，直到中间的那个元素恰好是被查找的元素，程序结束

二分法查找算法是基于排序

 */
public class ArrayUtil {
    public static void main(String[] args) {
        int[] arr = {10,20,22,30,40,50,60,70,80,90,100,120};

        int index1 = binarySearch(arr,100);//sun公司提供的二分法查找方法

        int index = searchNum(arr,10);
        System.out.println(index == -1 ? "该元素不存在":"该元素下标为"+index);

    }

    /**
     * 从数组中查找目标元素下标
     * @param arr 被查找的数组（这个必须是已经排序的）
     * @param num 目标元素
     * @return -1表示该目标不存子啊，其他表示返回该元素下标
     */
    private static int searchNum(int[] arr, int num) {
        //开始下标
        int begin = 0;
        //结尾下标
        int end = arr.length-1;

        //只要开始在结束的左边，我们就可以一直往下循环
        while (begin <= end){
            //中间位置下标
            int mid = (begin + end) / 2;
            if (arr[mid] == num) {
                //如果中间元素等于我们要找的元素，那么我们直接返回这个下标就行了
                return mid;
            } else if (arr[mid] < num) {
                //目标在"中间数"的右边
                //开始元素的下标要发生变化(开始元素的下标需要重新赋值)
                begin = mid + 1;
            } else {
                //arr[mid]>num
                //目标在中间的左边
                //修改结束元素的下标
                end = mid - 1;
            }
        }
        return -1;
    }
}
