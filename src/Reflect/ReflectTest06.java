package Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

//通过反射机制，反编译一个类的属性Field
public class ReflectTest06 {
    public static void main(String[] args) throws Exception{

        //创建这个是为了拼接字符串
        StringBuffer s = new StringBuffer();

//        Class studentClass = Class.forName("Reflect.bean.Student");
        Class studentClass = Class.forName("java.lang.String");

        s.append( Modifier.toString(studentClass.getModifiers()) +" class "+studentClass.getSimpleName()+"{"+"\n");

        Field[] fields = studentClass.getDeclaredFields();
        for (Field field : fields
             ) {
            s.append("\t");
            s.append(Modifier.toString(field.getModifiers()));
            s.append(" ");
            s.append(field.getType().getSimpleName());
            s.append(" ");
            s.append(field.getName());
            s.append(";");
            s.append("\n");
        }

        s.append("}");
        System.out.println(s);
    }
}
