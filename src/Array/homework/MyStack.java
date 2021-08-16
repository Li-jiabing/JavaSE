package Array.homework;

/**
 * 第一题：
 *      编写程序：使用一维数组，模拟栈数据结构
 *      要求：
 *          这个栈可以存储java中的任何引用类型的数据
 *          在栈中提供push方法模拟压栈（栈满了，要有提示信息）
 *          在栈中提供pop方法模拟弹栈（栈空了，也要有提示信息）
 *          编写测试程序，new栈对象，调用pop push方法来模拟压栈弹栈的动作
 *          假设栈的默认初始化容量是10，请注意无参数构造方法的编写方式
 *
 *          public class MyStack{//栈类
 *              //提供一个数组来存取数组中的元素
 *              Object[] elements;
 *
 *              //栈帧（永远指向栈顶部的元素）
 *              int index = 0;
 *
 *              //构造方法
 *
 *              //push方法(push方法压栈)
 *              //压栈表示栈中多一个元素
 *              //但是栈如果已满，压栈失败。
 *              //这个方法的参数以及返回值类型自己定义
 *
 *              //pop方法(pop方法弹栈)
 *              //弹栈表示栈中少一个元素
 *              //但是栈如果已空，弹栈失败。
 *              //这个方法的参数以及返回值类型自己定义
 *          }
 */
public class MyStack{

    //向栈中存储元素，我们这里使用一维数组模拟。存到栈中，就表示存储到数组中
    //因为数组是我们学习java的第一个容器。
    //为什么选择Object类型数组，因为这个栈可以存储java中任何引用类型的数据
    //new animal()对象可以放进去，new Person()对象也可以放进去。因为Animal和Person的超级父类就是Object。
    //包括String也可以存储进去。因为String父类也是Object
    private Object[] elements;

    //栈帧永远指向栈顶部元素
    //那么这个默认初始值应该是多少，注意：最初的栈是空的，一个元素都没有
//    private int index = 0;//如果index采用0，表示栈帧指向了顶部元素的上方。
    private int index = -1;//如果index采用了-1，表示栈帧指向了顶部元素


    public MyStack() {
        //一维数组动态初始化
        //默认初始化容量是10
        this.elements = new Object[10];
        //给index初始化
//        this.index = -1;
    }

    /**
     * 压栈的方法
     * @param obj 被压入的元素
     */
    public void push(Object obj){
        if(index >= elements.length - 1){
            System.out.println("压栈失败，栈已满");
            return;
        }
        //程序能够走到这里，说明栈没满
        //向栈中加1个元素，栈帧向上移动一个位置
        index++;
        elements[index] = obj;
        //再声明一次：所有的System.out.println()方法执行时，如果输出引用的话，自动调用引用的toString()方法。
        System.out.println("压栈"+obj+"元素成功，栈帧指向："+index);
    }


    /**
     * 弹栈的方法，从数组中往外取元素，每取出一个元素，栈帧向下移动一位
     * @return
     */
    public void pop() {
        if (index < 0 ){
            System.out.println("栈已空，弹栈失败！");
            return;
        }
        //程序能够执行到此处说明栈没有空。
        System.out.print("弹栈"+elements[index]+"元素成功,");
        index--;
        System.out.println("栈帧指向"+index);
    }

    //set和get也许用不上，但是你必须写上，这是规矩
    //封装第一步：属性私有化，对外提供set和get方法
    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

}
