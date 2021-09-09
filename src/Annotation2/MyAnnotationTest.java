package Annotation2;

public class MyAnnotationTest {

    //报错的原因：如果一个注解当中有属性，那么必须给属性赋值，除非该属性使用了default指定了默认值
    //指定name属性的值就可以了
    //@MyAnnotation(属性名 = 属性值)
    @MyAnnotation(name = "zhangsan",color = "红色")
    public void doSome(){

    }
}
