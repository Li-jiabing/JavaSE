package Integer;

/**
 * 1.8种基本数据类型对应的包装类型名是什么？
 *      基本数据类型        包装类型
 *      -------------------------
 *      byte            java.lang.Byte            父类：number
 *      short           java.lang.Short           父类：number
 *      int             java.lang.Integer         父类：number
 *      long            java.lang.Long            父类：number
 *      float           java.lang.Float           父类：number
 *      double          java.lang.Double          父类：number
 *      boolean         java.lang.Boolean         父类：object
 *      char            java.lang.Character       父类：object
 *
 *  2.以上8种包装类种，重点以Integer为代表进行学习，其他的类型依葫芦画瓢就行。
 *
 *  3.八种包装类总其中6个都是数字对应的包装类，他们的父类都是number，可以研究一下number种公共的方法
 *      number是一个抽象类，无法实例话对象
 */
public class IntegerTest02 {
    public static void main(String[] args) {
        //123这个基本数据类型，进行构造方法的包装达到了：基本数据类型向引用数据类型的转换
        //基本数据类型-(转换为)->引用数据类型(装箱)
        Integer i = new Integer(123);

        //将引用数据类型-(转换为)->基本数据类型
        float v = i.floatValue();
        System.out.println(v);

        //将引用数据类型-(转换为)->基本数据类型(拆箱)
        int retValue = i.intValue();
        System.out.println(retValue);
    }
}
