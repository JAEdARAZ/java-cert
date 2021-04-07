package modifikAcceso;

import modifikAcceso.paquete2.PublicElements;

public class MainModifikAcceso {
    public static void main(String[] args) {
        PublicElements publicElements = new PublicElements();
        System.out.println(publicElements.var);

        //this would be compilation error because DefaultElements is in a subpackage declared with default access
        /*
        DefaultElements defaultElements = new DefaultElements();
        System.out.println(defaultElements.var);
        */
    }
}
