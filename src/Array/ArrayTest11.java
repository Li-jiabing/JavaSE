package Array;

/**
 * 二维数组的遍历
 */
public class ArrayTest11 {
    public static void main(String[] args) {
        String[][] array = {
                {"java","C++","Mysql"},
                {"zhangsan","lisi","wangwu"},
                {"one","two","three"}
        };

        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < array[i].length; i1++) {
                System.out.print(array[i][i1]+" ");
            }
            System.out.println();
        }
    }
}
