package Exercise12;

//Private interface methods
public interface Example1 {

    default void say(){
        saySomething();
    }

    private void saySomething(){  //Private method inside interface
        System.out.println("This is a private method");
    }
}


