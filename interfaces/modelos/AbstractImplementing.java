package interfaces.modelos;

public abstract class AbstractImplementing implements Interfaz1, Interfaz2{
    public abstract void abstractClassMethod();
    public void callInAbstractClassInterfaceImplementedMethod(){
        this.printFromInterfaz2();
    }
}
