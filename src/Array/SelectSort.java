package Array;

import sun.net.www.protocol.http.ntlm.NTLMAuthentication;

/**
 * 选择排序比冒泡排序效率高
 * 高在交换位置的次数上
 * 选择排序的交换位置是有意义的
 *
 * 循环一次，然后找出参加比较的这对数据中最小的，拿着这个最小的值和最前面的数据交换位置
 *
 *
 * 选择排序：
 *      每一次从"这对参与比较的数据中"找出最小值
 *      拿着这个"最小值"和最前面的元素"交换位置"
 *
 *      选择排序比冒泡排序好在，每一次的交换位置都是有意义的
 *
 *      参与比较的数据：3，1，6，2，5
 *      第一次循环之后的结果是：
 *         1，3，6，2，5
 *      第二次参与比较的数据：3，6，2，5
 *         2，6，3，5
 *      第三次参与比较的数据：6，3，5
 *          3，6，5
 *      第四次参与比较的数据：6，5
 *          5，6
 *
 *          注意：5条数据，循环4次
 *
 *
 *   关键点：选择排序中的关键在于，你怎么找出一堆数据中最小的。
 *    3，1，6，2，5
 *      假设：3是最小的，
 *      3和1比较，发现1最小。所以此时1最小
 *      6和1比较，发现1最小。所以此时1最小
 *      2和1比较，发现1最小。所以此时1最小
 *      5和1比较，发现1最小。所以此时1最小
 *
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {3,1,6,2,5};
        int counts = 0;
        //选择排序
        //5条数据循环4次。（外层循环4次）
        for (int i = 0; i < arr.length-1; i++) {
            //i的值是0，1，2，3
            //i正好是"参加比较的这堆数据中"最左边的那个元素的下标
//            System.out.println(i);
            //i是一个参与比较的这堆数据中的起点下标
            //假设起点i下标位置上的元素是最小的
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                counts++;
                if (arr[j] < arr[min]){
                    min = j;//最小值的元素下标是j
                }
            }

            //当i和min相等时，表示最初猜测是对的
            //当i和min不相等时，表示最初猜测是错误的，有比这个元素更小的元素
            //需要拿着这个更小的元素和最左边的元素交换位置
            if (min != i){
                // 表示存在更小的数据
                //arr[min]最小的数据
                //arr[i] 最前面的数据
                int temp;
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }

        //排序之后遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("遍历了"+counts+"次");
    }
}