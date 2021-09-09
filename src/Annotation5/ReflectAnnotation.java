package Annotation5;

public class ReflectAnnotation {
    public static void main(String[] args) throws Exception{
        //获取这个类
        Class c = Class.forName("Annotation5.MyAnnotationTest");

        //判断类上面是否有注解
        System.out.println(c.isAnnotationPresent(MyAnnotation.class));

        //判断String类上是否存在这个注解
        System.out.println(Class.forName("java.lang.String").isAnnotationPresent(MyAnnotation.class));

        //如果有这个类型，怎么获取这个注解
        if (c.isAnnotationPresent(MyAnnotation.class)){
            //获取该注解对象
            MyAnnotation myAnnotation = (MyAnnotation) c.getAnnotation(MyAnnotation.class);
            System.out.println("类上面的注解对象"+myAnnotation);

            //获取注解对象的属性怎么办？和调接口没区别
            System.out.println(myAnnotation.value());
        }
    }
}
