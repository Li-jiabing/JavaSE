package Array;

/**
 * 什么时候采用静态初始化方式，什么时候采用动态初始化方式
 *  当你创建数组的时候，确定数组中存储哪些具体数据时，采用静态初始化方式。
 *  当你创建数组的时候，不确定将来数组中存储哪些数据，采用动态初始化方式。
 */
public class ArrayTest02 {
    public static void main(String[] args) {
        //声明/定义一个数组，采用动态初始化的方式创建
        int[] a = new int[4];//创建长度为4的int数组，数组中每个元素的默认都是0

        //遍历数组
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        //初始化一个Object类型的数组，采用动态初始化的方式
        Object[] objs = new Object[3];//5个长度，动态初始化，所以每个元素默认值是null
        for (int i = 0; i < objs.length; i++) {
            System.out.println(objs[i]);
        }

        System.out.println("---------------------------------------------------");

        //初始化一个String类型的数字，采用动态初始化方式
        String[] strs = new String[4];
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }

        //采用静态初始化的方式
        String[] args1 = {"agc","wwe","wf2"};
        for (int i = 0; i < args1.length; i++) {
            System.out.println(args1[i]);
        }

        System.out.println("====================================================");
        //存储Object，采用静态初始化呢?
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        Object[] objects = {o1,o2,o3};
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }
}
