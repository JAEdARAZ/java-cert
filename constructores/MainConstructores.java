package constructores;

public class MainConstructores {
    public static void main(String[] args) {
        Persona p = new Persona("LastSur");
        System.out.println(p.toString());

        //it needs the 'L' because the constructor expects a Long (wrapper)
        //it follows the same rules as the method overloading for type conversion
        Sobrecargando s = new Sobrecargando(5L);
        System.out.println(s.toString());
    }
}
