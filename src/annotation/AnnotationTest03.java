package annotation;

//这个注解表示这个类已过时
//这个注解主要是告诉程序员这个注解已过时
@Deprecated
public class AnnotationTest03 {
    public static void main(String[] args) {
        AnnotationTest03 annotationTest03 = new AnnotationTest03();
        annotationTest03.doSome();
    }

    @Deprecated
    public void doSome(){
        System.out.println("do something");
    }

    public void doOther(){
        System.out.println("do other");
    }
}

class T{
    public static void main(String[] args) {
        AnnotationTest03 annotationTest03 = new AnnotationTest03();
        annotationTest03.doSome();
    }
}