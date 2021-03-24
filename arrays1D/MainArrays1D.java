package arrays1D;

public class MainArrays1D {
    public static void main(String[] args){
        //declare
        int [] a1;
        int a2 [];

        //instantiate
        a1 = new int[5];
        a2 = new int[5];

        for (int x: a1) System.out.println(x); //all initialized to default value (0 in this case)

        Integer [] a3 = new Integer[5];
        for (Integer x: a3) System.out.println(x); //all nulls

        //declare and instantiate
        int [] z1 = new int[]{1,2,3,4};

        Integer [] z2 = {1,2,3,4}; //wouldn't be supported with any other wrapper
        for(int i=0; i<z2.length; i++) System.out.println(z2[i]);
    }
}
