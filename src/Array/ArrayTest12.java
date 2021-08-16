package Array;

/**
 * 动态初始化二维数组
 */
public class ArrayTest12 {
    public static void main(String[] args) {
        //3行4列
        //3个一维数组，每一个一维数组当中4个元素
        int[][] array = new int[3][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("==============================");

        //静态初始化
        int[][] a = {
                {1,2,3,4},
                {4,5,6,7,8},
                {7,8,9,0}
        };
        printArray(a);

        //没有这种语法
//      System.out.println({1,2,3,4}, {4,5,6,7,8}, {7,8,9,0});

//        可以这样写
        System.out.println(new int[][]{{1,2,3,4}, {4,5,6,7,8}, {7,8,9,0}});
    }

    public static void printArray(int[][] array){
        //遍历二维数组
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
