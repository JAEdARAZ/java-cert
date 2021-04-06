package sobrecarga;

public class MainSobrecarga {
    public static void main(String[] args){
        Sumador sum = new Sumador();
        sum.suma(1,1);
        sum.suma(new Integer(1), new Integer(1));
        /*
        sum.suma(1, new Integer(1)); //wouldn't work (ambigous)
        */
    }
}
