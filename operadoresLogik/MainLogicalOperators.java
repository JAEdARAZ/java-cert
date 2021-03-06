package operadoresLogik;

import java.util.ArrayList;
import java.util.List;

public class MainLogicalOperators {
    public static void main(String[] args){
        //all primitive types can be compared to each other. Exception: boolean
        int a = 10;
        char b = 'b'; //char is converted to int and then compared (b = 98)
        if(b>a) System.out.println("compatibles");

        byte c = 10;
        float d = 9;
        if(c>d) System.out.println("compatibles");

        //&& and || cortocircuito
        List<String> theList = null;
        //if(theList.size()==0 || theList == null) would give runtime exc
        if(theList == null || theList.size()==0){
            System.out.println("it worked");
        }

        // '==' can be used in primitive types. With objects compares references
        int e = 98;
        char f = 'b';
        if(e==f) System.out.println("b in ASCII equals 98");

        String s1 = new String("hola"); //using new the pool is not used
        String s2 = "hola";
        String s3 = "hola";
        if(s1 == s2){
            System.out.println("this will not be printed");
        } else{
            System.out.println("s1 and s2 are references to different objects (not using the pool)");
        }

        if(s1.equals(s2)) System.out.println("Comparing the String now, not the references");

        if(s2 == s3) System.out.println("Same reference, using the pool now!");

        //equals will always be false if the types are different
        Integer x = 10;
        Long y = 10L;
        if(x.equals(y)){
            System.out.println("This won't be printed, different types");
        } else{
            System.out.println("Different types!!");
        }

        Integer z1 = 10;
        int z2 = 10;
        if(z1.equals(z2)) System.out.println("only works with its wrapper. If z2 was long, it wouldn't work");

        Long l1 = 10L;
        long l2 = 10;
        if(l1.equals(l2)) System.out.println("Works too");
    }
}
