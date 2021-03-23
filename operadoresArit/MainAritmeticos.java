package operadoresArit;

public class MainAritmeticos {
    public static void main(String[] args){
        //operators integers, result will be integer
        int a = 5;
        int b = 2;
        double c = a/b;
        System.out.println("c: " + c);

        //with a decimal value, it will be decimal
        double d = 5;
        int e = 2;
        double f = d/e;
        System.out.println("f: " + f);

        //++, --, +=, -= they cast the result
        byte g = 5;
        g += 4; // g = (byte) g + 5;
        //if we do g = g + 4 it gives a compilation error since 4 is an int
        System.out.println("g: " + g);
    }
}
