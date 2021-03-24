package arrays1D;

public class MainMethod {
    public static void main(String[] args){
        int [] theArray = new int[]{1,2,3,4};
        changeArray(theArray); //passes the reference
        for(int x: theArray) System.out.println(x); //prints 2,3,4,5
    }

    public static void changeArray(int[] a){
        for(int i=0; i<a.length; i++){
            a[i]++;
        }
    }
}
