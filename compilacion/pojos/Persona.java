package compilacion.pojos;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private String apellido;
    List<Persona> hermanos;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Persona> getHermanos() {
        if(hermanos==null)
            hermanos = new ArrayList<>();
        return hermanos;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", hermanos=" + hermanos +
                '}';
    }

    public String metodoLocal(){
        return "Desde el metodoLocal de Persona";
    }
}
