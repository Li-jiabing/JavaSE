package Array.homework;

public class MyStackTest {
    public static void main(String[] args) {

        //创建一个栈对象，初始化容量是10个
        MyStack myStack = new MyStack();

        //调用方法压栈
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());//最后压入的，应该最先弹出来(这个才符合我们的数据结构)
        //压这个元素失败了。
        myStack.push(new Object());


        //弹栈
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
    }
}
