package Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectTest05 {
    public static void main(String[] args) throws Exception {
        //获取整个类
        Class classStudent = Class.forName("Reflect.bean.Student");
        //获取类中所有的field
        Field[] fields = classStudent.getFields();
        System.out.println(fields.length);
        System.out.println(fields[0].getName());

        System.out.println("============================================");

        Field[] fields1 = classStudent.getDeclaredFields();
        for (Field f : fields1
        ) {
            System.out.println(f.getName());
        }

        System.out.println("=============================================");
        for (Field f : fields1
        ) {
            System.out.println(f.getType());
            int i = f.getModifiers();
            String modifierString = Modifier.toString(i);
            System.out.println(modifierString);
        }
    }
}
