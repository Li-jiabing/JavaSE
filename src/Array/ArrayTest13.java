package Array;

/**
 * Object[] 这是一个万能的口袋，这个口袋中可以装任何引用类型的数据
 */
public class ArrayTest13 {
    public static void main(String[] args) {

        //注意："abc"这是一个字符串对象，字符串在java中有优待，不需要new，也是个对象
        Object[] arr = {new Husband(),new Wife(),"abc"};
    }
}

class Husband{

}

class Wife{

}
