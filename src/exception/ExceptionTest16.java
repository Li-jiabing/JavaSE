package exception;

/**
 * 之前在讲解方法覆盖的时候，当时遗留了一个问题？
 *      重写之后的方法不能比重写执之前的方法抛出更多更宽泛的异常，可以更少
 *
 *      总结：异常中的关键字
 *      异常捕捉：
 *      try
 *      catch
 *      finally
 *
 *      throws  在方法声明位置上使用，表示上报异常信息给调用者
 *      throw   手动抛出异常
 *
 *      父类不抛异常，子类在重写父类方法的时候可以抛RunTimeException
 */
public class ExceptionTest16 {
}

class Animal{
    public void doSome(){

    }

    public void doOther() throws Exception{

    }
}

class Cat extends Animal{

    //编译报错
//    @Override
//    public void doSome() throws Exception{
//        super.doSome();
//    }

//    //
//    public void doOther(){
//
//    }

    //编译正常
    public void doOther() throws Exception{

    }
}