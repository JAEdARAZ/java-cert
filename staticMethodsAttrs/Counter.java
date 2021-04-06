package staticMethodsAttrs;

public class Counter {
    public static int instances = 0;

    public Counter(){
        instances++;
    }

    //when the first instance is created, this will be executed first thing (even before constructor)
    static{
        System.out.println("just once");
        printThis();
    }

    public static void printThis(){
        System.out.println("printing from static method bro");
    }
}
