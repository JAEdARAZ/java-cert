package staticMethodsAttrs;

public class Counter {
    public static int instances = 0;

    public Counter(){
        System.out.println("4. inside constructor");
        instances++;
    }

    //when the first instance is created, this will be executed first thing (even before constructor)
    static{
        System.out.println("1. just once");
        printThis();
    }

    //initialization block. Executed every instantiation
    {
        System.out.println("3. created instance");
    }

    public static void printThis(){
        System.out.println("2. printing from static method bro");
    }
}
