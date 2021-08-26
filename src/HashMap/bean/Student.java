package HashMap.bean;

public class Student {

    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   /* //重写equals,如果学生名字一样，表示同一个学生
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Student)) return false;
        if (obj == this) return true;
        Student s = (Student) obj;
        if (this.name.equals(s.name))return true;
        return false;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
