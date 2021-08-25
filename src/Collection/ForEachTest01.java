package Collection;

/**
 * jdk5.0之后推出了一个新特性：叫做增强for循环 ，或者叫做foreach
 */
public class ForEachTest01 {
    public static void main(String[] args) {

        //int类型数组
        int[] arr = {1,4,56,7,8,5,4,34,434};

        //增强for循环遍历数组
        //语法：
//            for(元素类型 变量名 : 数组或集合){
//              System.out.println(变量名);
//            }

        //foreach又一个缺点：没有下标，在需要使用下标的循环中，不建议使用增强for循环
        for (int data : arr) {
            //data就是数组中的元素（数组中的每一个元素）
            System.out.println(data);
        }
    }
}
