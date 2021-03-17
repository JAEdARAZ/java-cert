package compilacion.main;

import compilacion.pojos.Persona;

import static compilacion.paquete.UtilsEstaticos.*;

public class MainCompilacion {
    public static void main(String[]args){
        System.out.println("variable estática: " + variable);
        System.out.println("método estático random: " + numeroRandom());

        Persona p1 = new Persona("Carlos", "Aguado");
        Persona p2 = p1;

        p2.setNombre("Carmelo");
        System.out.println(p1.toString());
    }

    public static void prueba(int a){
        a = 10;
    }
}
