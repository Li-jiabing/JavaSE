package Reflect;

import java.io.FileNotFoundException;

/**
 * 研究一下路径问题
 *      怎么获取一个文件的绝对路径，以下讲解的这种方式是通用的。但前提是：文件需要在类路径下，才能用这种方式。
 */
public class AboutPath {
    public static void main(String[] args) throws FileNotFoundException {

        //这种方式的路径缺点是：移植性差，在idea中默认的当前路径是project的根
        //这个代码假设离开了idea，换到了其他位置，可能当前位置就不是project的根了，这时这个路径就无效了
//        FileReader reader = new FileReader("src/classinfo.properties");

        //接下来说一种比较通用的路径，即使代码移植了，这样编写仍然是通用的
        //注意：使用以下通用方式的前提是：这个文件必须在类路径下
        //什么是类路径下，凡事在src下的都是类路径下。【记住他】
        /*
        解释：Thread.currentThread()  当前线程对象
             getContextClassLoader()  是线程对象的方法，可以获取到当前线程的类加载器对象。
             getResource("") 是类加载器对象的方法，当前线程的类加载器默认从类的跟路径下加载资源
         */

        //采用以上的代码可以拿到一个文件的绝对路径
        ///Users/lijiabing/IdeaProjects/untitled/out/production/JavaSE/classinfo.properties
        String path = Thread.currentThread().getContextClassLoader().getResource("classinfo.properties").getPath();
        System.out.println(path);
    }
}
