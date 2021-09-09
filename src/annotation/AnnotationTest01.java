package annotation;

/**
 * 注解/注释，英文单词：annotation
 * 注解是一种引用数据类类型，编译之后也是生成xxx.class文件
 * 怎么定义注解呢？语法格式
 *      [修饰符列表] @interface 注解类型名{
 *
 *
 *      }
 *
 *    注解可以出现在任意位置
 */
@MyAnnotation
public class AnnotationTest01 {

    @MyAnnotation
    private int no;

    @MyAnnotation
    public AnnotationTest01(){}

    @MyAnnotation
    public static void m1(@MyAnnotation int i,String b){

    }

    @MyAnnotation
    public void m2(){

    }
}

@MyAnnotation
interface MyInterface{

}

@MyAnnotation
enum Season{
    SPRING,SUMMER
}