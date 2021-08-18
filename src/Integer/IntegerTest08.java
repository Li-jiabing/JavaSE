package Integer;

/**
 * String int Integer 之间互相转换
 */
public class IntegerTest08 {
    public static void main(String[] args) {
        //String --> int
        String s1 = "100";
        int i1 = Integer.parseInt(s1);
        System.out.println(i1+1);//101

        //int -----> String
        String s2 = s1+"";
        System.out.println(s2+1);//1001

        //int --->Integer
        //自动拆箱
        Integer x = 1000;

        //String--->Integer
        Integer k = Integer.valueOf("123");

        //Integer ---> String
        String e = String.valueOf(k);
    }
}
