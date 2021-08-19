package Number;

import java.math.BigDecimal;

/**
 * BigDecimal属于大数据，精度极高，不属于基本数据类型，属于java对象（引用类型）
 * sun提供的一个类，专门用在财务软件中
 *
 * 注意:财务软件中double是不够用的
 */
public class BigDecimalTest02 {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(100);
        BigDecimal bigDecimal1 = new BigDecimal(200);
        //求和
        //不能使用bigDecimal+bigDecimal1，因为这两个都是引用，不能直接使用+求和，要调方法求和
        BigDecimal b1 = bigDecimal.add(bigDecimal1);
        System.out.println(b1);
//        加法求和报错
//        System.out.println(bigDecimal+bigDecimal1);
    }
}
