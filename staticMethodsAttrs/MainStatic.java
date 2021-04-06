package staticMethodsAttrs;

public class MainStatic {
    public static void main(String[] args) {
        new Counter();
        System.out.println("instances: " + Counter.instances);
        Counter c = new Counter();
        System.out.println("instances: " + c.instances); //can be accessed with the instance too
    }
}
