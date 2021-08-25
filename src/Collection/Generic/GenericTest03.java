package Collection.Generic;

/**
 * 自定义泛型
 *      自定义泛型的时候,<>中的是一个标识符，随便写
 *      Java源代码中经常出现的是： <E>   <T>
 *
 *          E是element单词首字母
 *          T是Type单词首字母
 */
public class GenericTest03<fsdfajbfasj> {
    public void doSome(fsdfajbfasj o){
        System.out.println(o);
    }

    public static void main(String[] args) {
        GenericTest03<String> gt = new GenericTest03<>();
        //new对象的时候指定了泛型是：String
        gt.doSome("string");

//        gt.doSome(22);


        System.out.println("===================");
        GenericTest03<Integer> gt2 = new GenericTest03<>();

        gt2.doSome(222);
//        gt2.doSome("str");

        //不用泛型的时候参数就是Object类型
    }

}
