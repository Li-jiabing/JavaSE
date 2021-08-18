package String;

import java.util.Locale;

public class StringTest05 {
    public static void main(String[] args) {
        //String类中的常用方法
        //1.char charAt(int index)（掌握）
        char c = "中国人".charAt(1);
        System.out.println(c);

        //2.int compareTo(String anotherString)
        int result = "abc".compareTo("abc");
        System.out.println(result);//0 前后一致

        int result1 = "abcd".compareTo("abce");
        System.out.println(result1);//-1 前小后大

        int result2 = "abce".compareTo("abcd");
        System.out.println(result2);//1 前大后小

        //拿着字符串第一个字母和后面自负擦婚的第一个字母进行比较，能分胜负就不再比较了
        System.out.println("xyz".compareTo("zyx"));

        //boolean contains(CharSequence s)
        //判断前面的字符串中是否包含后面的字符串
        System.out.println("HelloWorld".contains(".java"));

        //boolean endsWith(String suffix)
        //判断当前字符串是否以某个字符串结尾
        System.out.println("text.txt".endsWith(".java"));//false
        System.out.println("text.txt".endsWith(".txt"));//true
        System.out.println("iuafiahfaafsss".endsWith("ss"));//true

        //boolean equals(Object obj)
        //比较两个字符串必须使用equals方法，不能使用"=="
        //equals方法有没有调用compareTo方法？
        //equals方法只能看出相等不想等
        //compareTo方法可以看出是否相等，并且同时还可以看出谁大谁小
        System.out.println("abc".equals("abc"));

        //boolean equalsIgnoreCase(String anotherString)
        //判断两个字符串是否相等，并且同时忽略大小写
        System.out.println("Abc".equalsIgnoreCase("abc"));//true

        // byte[] getBytes()
        // 将字符串转换成字节数组
        byte[] bytes = "abcdef".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        //int  indexOf(String str)
        //判断某个子字符串在当前字符串中第一次出现处的索引
        System.out.println("fdsjhahfhjavafhsjkdhfasj".indexOf("java"));

        //isEmpty()
        //判断某个字符串是否为空
        String s = "null";
        System.out.println(s.isEmpty());//true

        //int length()
        //判断数组长度和字符串长度不一样
        //判断数组长度是length属性，判断字符串长度是length()方法
        System.out.println("abcDEF".length());

        System.out.println("".length());

        //int lastIndexOf(String str)
        //判断某个子字符串在当前字符串中最后一次出现的索引(下标)
        System.out.println("adcdksfah".lastIndexOf("sf"));

        //String replace(charSequence target,CharSequence replacement)
        //String的父接口就是：CharSequence
        System.out.println("http://www.baidu.com".replace("http://", "https://"));
        //把一下字符串中的=替换成：
        System.out.println("name=zhangsan&age=30&sex=nan".replace("=", ":"));

        //String[] split(String regex)
        String[] split = "1998-01-01".split("-");//将这个字符串以"-"符号进行拆分
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        String param = "name=zhangsan&age=30&sex=nan";
        String[] split1 = param.split("&");
        for (int i = 0; i < split1.length; i++) {
            System.out.println(split1[i]);
            //可以继续向下通过等号拆分
        }

        //boolean startWith(String prefix)
        //判断某个字符串是有以某个字符串开始
        System.out.println("adafsf".startsWith("d"));//false

        //String subString(int beginIndex)
        //截取字符串
        System.out.println("sfasdf".substring(2));

        //String subString(int beginIndex,int endIndex)
        //beginIndex起始位置（包括）  endIndex结束位置（不包括）
        System.out.println("http://www.baidu.com".substring(7,10));//截取到www，表示左闭右开

        //char[] toCharArray()
        //将字符串转换成数组
        char[] chars = "我是中国人".toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        //String toLowerCase()
        //转换为小写
        System.out.println("aVCFS".toLowerCase());
        //全部转换为大写
        System.out.println("sdf".toUpperCase());

        //String trim()
        //去除字符串前后空白
        System.out.println("           hello world        ".trim());

        //String中只有一个方法是静态的，不需要new对象
        //这个方法叫做valueOf
        //作用：将"非字符串"转换为"字符串"
        String s1 = String.valueOf(true);
        String s2 = String.valueOf(100);
        String s3 = String.valueOf(3.14);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //我们是否可以研究一下paintln方法的源代码了
        System.out.println(100);
        System.out.println(3.14);
        System.out.println(true);

        Object obj = new Object();
        //通过源码可以看出：为什么输出一个引用的时候，会调用toString()方法
        //本质上System.out.println()这个方法在输出任何数据的时候都是先转换成字符串，再输出
        System.out.println(obj);
    }
}
