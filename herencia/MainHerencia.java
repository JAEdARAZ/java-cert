package herencia;

import herencia.modelos.Clase2;
import herencia.modelos.Clase3;

public class MainHerencia {
    public static void main(String[] args) {
        Clase2 c2 = new Clase2("vc2");
        System.out.println(c2.getVarClase1()); //c2 needs getter to access variables from his superclass

        System.out.println("------------");
        Clase3 c3 = new Clase3();
    }
}
