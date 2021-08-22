package exception;

/**
 * finally面试题
 */
public class ExceptionTest13 {
    public static void main(String[] args) {
        int result = m();
        System.out.println(result);
    }

    /**
     *java语法规则，有一些规则是不能被破坏的，一旦这么说了，必须这么做
     *      java中有一条这样的规则：
     *          方法中的代码必须遵循自上而下的顺序依次逐行执行（亘古不变的语法！）
     *      java中还有一条语法规则：
     *          return语句一旦执行，整个方法必须结束（亘古不变的语法）
     * @return
     */
    public static int m(){
        int i = 100;
        try {
            //这行代码出现在int i = 100;下面，所以最终结果必须返回是100
            //注意：return语句必须保证是最后执行的。一旦执行，整个方法结束
            return i;
        }finally {
            i++;
        }
    }
}

/*
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package exception;

public class ExceptionTest13 {
    public ExceptionTest13() {
    }

    public static void main(String[] args) {
        int result = m();
        System.out.println(result);
    }

    public static int m() {
        byte i = 100;

        byte var1;
        try {
            var1 = i;
        } finally {
            int var5 = i + 1;
        }

        return var1;
    }
}
*/