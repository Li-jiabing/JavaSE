package exception;

import Array.homework.MyStack;

/**
 * 测试改良之后的MyStack
 */
public class ExceptionTest15 {
    public static void main(String[] args) {
        //创建对象
        MyStack myStack = new MyStack();

        //压栈
        try {
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            //这里栈满了
            myStack.push(new Object());
        } catch (MyStackOperationException e) {
            System.out.println(e.getMessage());
        }

        try {
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
            //弹栈失败
            myStack.pop();
        } catch (MyStackOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
