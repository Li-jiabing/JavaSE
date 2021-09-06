package IO.bean;

import java.io.Serializable;

public class Student implements Serializable {


    //建议将序列化版本号手动写出来，不建议自动生成
    private static final long serialVersionUID = 385723485923475L;//java虚拟机识别一个列的时候先通过类名，如果类名一致，再通过序列化版本号

    private int no;


    private String name;

    public Student() {
    }

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
