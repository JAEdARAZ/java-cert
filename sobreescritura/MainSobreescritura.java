package sobreescritura;

import sobreescritura.modelos.Clase1;
import sobreescritura.modelos.Clase2;

public class MainSobreescritura {
    public static void main(String[] args) {
        Clase1 c1 = new Clase1();
        System.out.println(c1.methodToOverride()); //returns "hello boy"

        Clase2 c2 = new Clase2();
        System.out.println(c2.methodToOverride()); //returns 10
        System.out.println(c2.thisWontBeOverriden()); //Clase1
        System.out.println(c2.thisWontBeOverriden(5)); //Clase2
    }
}
