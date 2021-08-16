package Array;

/**
 *   当一个方法的参数是数组的时候，我们还可以采用这种方式传。
 */
public class ArrayTest04 {
    public static void main(String[] args) {
        //静态初始化一组数据
        int[] a = {1,2,3};
        printArray(a);

        //动态初始化一堆数组
        int[] b = new int[5];
        printArray(b);

        System.out.println("=============================");
        printArray(new int[4]);
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
