package protectedAcceso.paquete1;

public class ClaseMismoPaquete extends ClasePadre {
    public void printClasePadreVars(){
        System.out.println(this.protectedVar + ", " + this.defaultVar);
    }

    public void accessibleBecauseSamePackage(){ //not using inheritance context (it could)
        ClasePadre clasePadre = new ClasePadre();
        String protectedVar = clasePadre.protectedVar;
        String defaultVar = clasePadre.defaultVar;
        System.out.println(protectedVar + ", " + defaultVar);
    }
}
