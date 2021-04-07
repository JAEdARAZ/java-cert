package modifikAcceso.paquete1;

import modifikAcceso.paquete2.PublicElements;

public class DefaultElements2 {
    String var = "from same package";

    public static void main(String[] args) {
        DefaultElements defaultElements = new DefaultElements();
        System.out.println(defaultElements.var);

        PublicElements publicElements = new PublicElements();
        System.out.println(publicElements.var);
    }
}
