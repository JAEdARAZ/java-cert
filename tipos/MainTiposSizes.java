package tipos;

/*
    EN BITS:
    byte, short, int, long (8, 16, 32, 64)
                 double, float (32, 64)
          char (16 - unicode)
 */
public class MainTiposSizes {
    public static void main(String[] args){
        //same size, from integer to decimal (decimal to integer not allowed - can be done with cast)
        long l = 15L;
        float f = l;
        System.out.println("f: " + f);

        float f2 = 15L;
        //long l2 = f2; //compilation error
        long l2 = (long) f2;
        System.out.println("f2: " + f2);

        //char to number (same size or bigger is ok. number to char no - can be done with cast)
        char c = 'j';
        int i = c;
        System.out.println("i: " + i);

        int x = 106;
        //char z = int x; //compilation error
        char z = (char) x;
        System.out.println("z: " + z);

        byte bb = 2;
        short ss = bb;
        System.out.println("ss: " + ss);

        //everything can be converted explicitely, aside from boolean or primitive to object
        long ll = 555555L;
        byte bbb = (byte) ll;
        char cc = (char) ll;
        System.out.println("bbb: " + bbb);
        System.out.println("cc: " + cc);
    }
}
