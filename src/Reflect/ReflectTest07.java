package Reflect;

import Reflect.bean.Student;

import java.lang.reflect.Field;

/**
 *  必须掌握：
 *      怎么通过反射机制访问一个java对象的属性
 *      个属性复制set
 *      获取属性的值get
 */
public class ReflectTest07 {
    public static void main(String[] args) throws Exception {

        //我们不使用反射机制，怎么去访问一个对象的属性呢
        Student s = new Student();
        s.no = 1111;//三要素：给s对象的no属性复制1111
                    //要素1：对象s
                    //要素2：no属性
                    //要素3：1111

        System.out.println(s.no);
        //使用反射机制，怎么去访问一个对象的属性（set/get）
        Class studentClass = Class.forName("Reflect.bean.Student");
        Object obj = studentClass.newInstance();//Student对象（底层调用无参数构造方法实例话对象）

        //获取no属性(根据属性名称来获取Field)
        Field noField = studentClass.getDeclaredField("no");
        System.out.println(noField);

        /*
        虽然使用了反射机制，但是三要素还是缺一不可
         */
        //给obj对象的no属性赋值
        noField.set(obj,2222);//给obj对象的属性赋值2222

        //读取属性的值
        System.out.println(noField.get(obj));

        //可以访问私有的属性吗
        Field nameField = studentClass.getDeclaredField("name");

        //打破封装(反射机制的缺点，可能会给不法分子留下机会)
        //这样设置完之后，在外部也能访问属性
        nameField.setAccessible(true);

        //给name属性赋值
        nameField.set(obj,"jackson");
        //获取name属性的值
        System.out.println(nameField.get(obj));
    }
}
