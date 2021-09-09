package Annotation4;

public class OtherAnnotationTest {

    @OtherAnnotation(age=25,email = {"zhangsan@qq.com","lis@email.com"},season = Season.SPRING)
    public void doSome(){

    }

    //如果数组中只有一个元素，大括号可以省略
    @OtherAnnotation(age=25,email = "zhangsan@qq.com",season = Season.SUMMER)
    public void doOther(){

    }


}
