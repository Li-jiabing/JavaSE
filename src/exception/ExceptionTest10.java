package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 关于try/catch中的finally子句：
 *    1.在finally子句中的代码是最后执行的，并且是一定会执行的，即使tru语句块中的代码出现了异常
 *      finally子句比u和try一起出现，不能单独编写
 *
 *    2.在finally语句通常使用在哪些情况下呢
 *    通常在finally语句块中完成资源的释放/关闭
 *    因为finally中的代码比较有保障。
 *    即使try语句中的代码出现异常，finally中代码也会正常执行
 */
public class ExceptionTest10 {
    public static void main(String[] args){
        
        FileInputStream fileInputStream = null;
        try {
            //创建输入流对象
            fileInputStream = new FileInputStream("/Users/lijiabing/Desktop/笔记/面向对象.md");

            String s = null;
            //这里一定会出现空指针异常
            s.toString();

            //流使用完需要关闭，因为会占用资源
            //但是上面程序除了异常，程序终止，流并没有关
            //所以即使以上程序出现异常，流也必须要关闭
            //放在这里有可能流关不了
//            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (NullPointerException e){
            e.printStackTrace();
        }finally {
            System.out.println("hello hoke");
            if (fileInputStream != null) {
                try {
                    //close()方法有异常，我们通过tuy/catch去捕捉
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("hello kitty");
    }
}
