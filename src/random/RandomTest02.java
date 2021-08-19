package random;

import java.util.Arrays;
import java.util.Random;

/**
 * 编写程序，生成5个不重复的随机数，重复的话重新生成
 * 最终生成的5个随机数放到数组中，要求数组中5个随机数不重复
 */
public class RandomTest02 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            num[i] = -1;
        }

        //循环生成随机数
        int index = 0;
        while (index < num.length){
            int a = random.nextInt(5);
            //判断num数组中有没有这个num
            //如果没有这个num就放进数组
            if (!contains(num,a)){
                num[index] = a;
                index++;
            }
        }

        //遍历以上数组
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

    /**
     *  单独编写一个方法，这个方法转么用来判断数组中是否包含某个元素
     * @param num  数组
     * @param a  元素
     * @return
     */
    public static boolean contains(int[] num,int a){
//        //对数组进行升序
//        Arrays.sort(num);
//
//        //二分法查找的时候，查找结果>=0说明元素找到了，找到说明存在
//        return Arrays.binarySearch(num, a) >= 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == a){
                //条件成立，表示包含
                return true;
            }
        }
        //表示不包含
        return false;
    }
}
