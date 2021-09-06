package IO;

import IO.bean.User;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * 反序列化集合
 */
public class ObjectInputStreamTest02 {
    public static void main(String[] args) throws Exception {

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("users"));
        List<User> user = (List<User>)objectInputStream.readObject();
        for (User u : user
             ) {
            System.out.println(u);
        }
        objectInputStream.close();
    }
}
