package protectedAcceso.paquete2;

import protectedAcceso.paquete1.ClasePadre;

public class ClaseOtroPaquete extends ClasePadre {
    public void printClasePadreVars(){
        System.out.println(this.protectedVar); //not access to parent default variable since this is located in another package
    }

    //the access to superclass attribute needs to be done through inheritance context (this.protectedVar)
    public void wrongAccessNotUsingInheritanceContext(){
        ClasePadre clasePadre = new ClasePadre();
        //String protectedVar = clasePadre.protectedVar;
        //String defaultVar = clasePadre.defaultVar;
    }
}
