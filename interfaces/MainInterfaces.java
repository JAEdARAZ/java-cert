package interfaces;

import interfaces.modelos.AbstractImplementing;
import interfaces.modelos.ClassExtendsAbstract;
import interfaces.modelos.Interfaz1;

public class MainInterfaces {
    public static void main(String[] args) {
        ClassExtendsAbstract c = new ClassExtendsAbstract();
        System.out.println(c.hi1);
        System.out.println(c.hi2);

        Interfaz1.printFromInterfaz1();

        //those two print same thing
        c.printFromInterfaz2();
        c.callInAbstractClassInterfaceImplementedMethod();
    }
}
