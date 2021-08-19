package random;

import java.util.Random;

/**
 * 随机数
 */
public class RandomTest01 {
    public static void main(String[] args) {

        Random random = new Random();
        //随机产生一个int类型取值范围内的数字
        int num = random.nextInt();
        System.out.println(num);

        int num1 = random.nextInt(100);//传餐给了取值范围0-100 左闭右开
        System.out.println(num1);
    }
}
