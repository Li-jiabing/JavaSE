package Number;

import java.text.DecimalFormat;

/**
 * 关于数字的格式化
 */
public class DecimalFormatTest01 {
    public static void main(String[] args) {
        //java.text.DecimalFormat专门负责数字格式化的
        //DecimalFormat decimalFormat = new DecimalFormat("数字格式");

        /**
         * 数字格式有哪些
         *  #表示任意数字
         *  ,表示千分位
         *  .表示小数点
         *  0代表不够时补0的意思
         */
        DecimalFormat decimalFormat = new DecimalFormat("###,###.###");
        String s = decimalFormat.format(1234.57676576);//格式化后变成了1,234.577
        System.out.println(s);
    }
}
