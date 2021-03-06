package meiju;

//采用枚举的方式改造程序

/**
 * 总结：
 *      1.枚举是一种引用数据类型
 *      2.枚举类型怎么定义？语法是？
 *      enum 枚举类型名{
 *          枚举值1，枚举值2
 *      }
 *
 *      3.结果只有两种情况的，建议使用boolean类型
 *      结果超过两种并且还是可以一一列举出来的，建议使用枚举类型
 *      例如：颜色、四季、星期等都可以使用枚举类型
 *
 */
public class EnumTest02 {
    public static void main(String[] args) {
        Result r = divide(10,2);
        System.out.println(r == Result.SUCCESS?"计算成功":"计算失败");
    }

    public static Result divide(int a, int b){
        try {
            int c = a/b;
            return Result.SUCCESS;
        }catch (Exception e){
            return Result.FAIL;
        }
    }
}
//枚举：一枚一枚可以列举出来的，才建议使用枚举类型。
//枚举编译之后也是生成class文件
//枚举也是一种引用数据类型
//枚举中的每一个值可以看作是常量
enum Result{
    //SUCCESS是枚举result类型中的一个值
    //FAIL是枚举Result类型中的一个值
    //枚举中的每一个值，可以看作是"常量"
    SUCCESS,FAIL
}