package protectedAcceso;

import protectedAcceso.paquete1.ClaseMismoPaquete;
import protectedAcceso.paquete2.ClaseOtroPaquete;

public class MainProtected {
    public static void main(String[] args) {
        ClaseMismoPaquete c1 = new ClaseMismoPaquete();
        c1.accessibleBecauseSamePackage();
        c1.printClasePadreVars();

        ClaseOtroPaquete c2 = new ClaseOtroPaquete();
        c2.printClasePadreVars();
    }
}
