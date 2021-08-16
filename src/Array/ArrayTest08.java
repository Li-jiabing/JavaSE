package Array;

import sun.lwawt.macosx.CSystemTray;

/**
 * 关于一维数组的扩容。
 *      在java开发中，数组长度一旦确定不可变，那么数组满了怎么办？
 *          数组满了，需要扩容
 *          java中对数组的扩容是：
 *              先新建一个大容量的数组，然后将小容量数组中的数据一个一个拷贝到大数组中
 *
 *    结论：数组扩容效率较低。因为涉及到拷贝的问题，所以在以后的开发中请注意：尽可能少的进行数组的拷贝。
 *    可以在创建数组对象的时候预估下多长合适，最好预估准确，这样可以减少数组的扩容次数。提高效率
 */
public class ArrayTest08 {
    public static void main(String[] args) {
        //java中的数组是怎么进行拷贝的呢？
//        System.arraycopy(5个参数);

        int[] src = {1,11,22,3,4};//拷贝源

        //动态话初始化一个长度为20的数组，每一个元素都默认值0
        int[] dest = new int[20];//拷贝目标(拷贝到这个数组上)
        System.arraycopy(src,1,dest,3,2);
        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }

        //数组中存储的元素是引用，可以拷贝吗？当然可以
        String[] strs = {"abc","def","ghi","xyz"};
        String[] newStrs = new String[10];
        System.arraycopy(strs,1,newStrs,5,2);

        for (int i = 0; i < newStrs.length; i++) {
            System.out.println(newStrs[i]);
        }

        Object[] obj = {new Object(),new Object(),new Object()};
        Object[] newObjs = new Object[10];
        //思考以下：这里拷贝的时候是拷贝的对象，还是拷贝的对象地址？
        System.arraycopy(obj,0,newObjs,0,obj.length);
        for (int i = 0; i < newObjs.length; i++) {
            System.out.println(newObjs[i]);
        }
    }
}
