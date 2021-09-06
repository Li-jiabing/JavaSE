package IO;

import IO.bean.Student;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * 对象的序列化和反序列化
 *  序列化：（Serialize）java对象存储到文件中，将java对象的状态保存下来的过程
 *  反序列化：（DeSerialize）将硬盘上的数据重新恢复到内存中，恢复成java对象。
 *
 *  1.java.io.NotSerializableException
 *  Student对象不支持序列化
 *
 *  2.参与序列化和反序列化的对象，必须实现Serializable接口
 *
 *  3.注意：通过源代码发现，Serializable接口只是一个标志性接口。接口中什么代码都没有。
 *  那么他起到一个什么作用呢？
 *      起到一个标志的作用，java虚拟机看到这个类实现了这个接口可能会对这个类进行特殊待遇。
 *      Serializable这个标志接口是给java虚拟机参考的，java虚拟机看到这个接口之后，会为该类自动生成
 *      一个序列化版本号
 *
 *  4.序列化版本号有什么用呢？
 *
 *  java语言中是采用什么机制进行区分的？
 *      第一：首先通过类名进行比对，如果类名不一样，肯定不是同一个类
 *      第二：如果类名一样，再怎么进行类的区别？靠序列化版本号进行区分。
 *
 *
 *      不同的人编写了同一个类：但"这两个类确实不是同一个类"。这个时候序列化本本就起上作用了。
 *      对于java虚拟机来说，java虚拟机是可以区分这两个类的，因为这两个类都实现了Serializable接口
 *      都有默认的序列化版本号，他们的序列化版本号不一样，所以区分开了（这就是自动生成序列化版本号的好处）
 *
 *      这种自动生成的序列化版本号有什么缺陷？
 *          这种自动生成的序列化版本号缺点是：一旦代码确定之后，不能进行后续的修改，
 *          因为只要修改，必然会重新编译，此时会生成全新的序列化版本号，这时候java虚拟机会认为这是一个全新的类
 *
 *          最终结论：
 *              凡是一个类实现了Serializable接口，建议给该类提供一个固定不变的序列化版本号。
 *              这样，以后这个类即使代码修改了，但序列化版本不变，这样java虚拟机就认为这是同一个类
 */
public class ObjectOutputStreamTest01 {
    public static void main(String[] args) throws Exception {

        //创建对象
        Student student = new Student(111,"zhangsan");
        //序列化
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("students"));

        //序列化对象
        objectOutputStream.writeObject(student);

        //刷新
        objectOutputStream.flush();

        //关闭流
        objectOutputStream.close();
    }
}
