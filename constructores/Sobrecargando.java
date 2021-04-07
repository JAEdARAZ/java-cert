package constructores;

public class Sobrecargando {
    private Long num;

    public Sobrecargando(Long num){
        this.num = num;
    }

    @Override
    public String toString() {
        return "Sobrecargando{" +
                "num=" + num +
                '}';
    }
}
