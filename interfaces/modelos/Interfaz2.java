package interfaces.modelos;

public interface Interfaz2 {
    String hi2 = "hello from Interfaz2";
    void methodInterfaz2();
    default void printFromInterfaz2(){ //accessed with this from methods that implement the interface
        System.out.println("printing from a method implemented in Interfaz2");
    }
}
