package Annotation4;

public @interface MyAnnotation {

    /**
     * 注解当中的属性可以是哪一种类型呢
     */

    int value();
    String value1();
    int[] value2();
    Season value3();
    String[] value4();
    Season[] value5();
    Class values6();
    Class[] values7();
}
