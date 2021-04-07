package constructores;

public class Persona {
    private String name;
    private String surname1;
    private String surname2;

    public Persona(String name, String surname1){
        this.name = name;
        this.surname1 = surname1;
    }

    public Persona(String surname2){
        this("Gianluca", "Pelaez");
        this.surname2 = surname2;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", surname1='" + surname1 + '\'' +
                ", surname2='" + surname2 + '\'' +
                '}';
    }
}
