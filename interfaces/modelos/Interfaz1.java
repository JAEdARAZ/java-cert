package interfaces.modelos;

public interface Interfaz1 {
    public static final String hi1 = "hello from Interfaz1"; //by default interface variables are public static final
    public abstract void metodoInterfaz1(); //by default interface methods are public abstract
    static void printFromInterfaz1(){
        System.out.println("printing from a method declared in Interfaz1");
    }
}
