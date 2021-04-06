package sobrecarga;

public class Sumador {
    public int suma(int a, int b){
        System.out.println("int suma(int a, int b)");
        return a+b;
    }

    protected Integer suma(Integer a, Integer b){
        System.out.println("Integer suma(Integer a, Integer b)");
        return a+b;
    }
}
