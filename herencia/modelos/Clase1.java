package herencia.modelos;

public class Clase1 {
    private String varClase1;
    public String hello = "hello!";

    public Clase1(){
        //theres an implicit super() here to Object
        this.varClase1 = "pajarito";
    }

    public Clase1(String varClase1){
        this.varClase1 = varClase1;
        System.out.println("Constructor Clase1");
    }

    public String getVarClase1() {
        return varClase1;
    }
}
