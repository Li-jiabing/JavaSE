package Array;

public class ArrayTest03 {
    //main方式的编写方式，还可以采用c++的语法格式哦
    public static void main(String args[]) {

        int[] a1 = new int[3];

        //这种是c++的方式创建数组
        int a2[] = new int[4];

        //调用方法时传一个数组
        int[] x = {1,2,3,4};
        printArray(x);

        //创建String数组
        String[] strs = {"abc","def","ghi"};
        printArray(strs);

    }


    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void printArray(String[] args){
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}

