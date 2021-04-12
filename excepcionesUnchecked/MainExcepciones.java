package excepcionesUnchecked;

import java.util.Locale;

public class MainExcepciones {
    public static void main(String[] args) {
        int[] anArray = {1,2,3};
        try{
            int a = anArray[3]; //IndexOutOfBoundsException

            String s = null;
            String s2 = s.toUpperCase(); //NullPointerException

            Object o = 5;
            String x = (String) o; //ClassCastException, caught by RuntimeException
        } catch(NullPointerException e){
            System.out.println("caught NullPointerException");
        } catch(IndexOutOfBoundsException e){
            System.out.println("caught IndexOutOfBoundsException");
        } catch(RuntimeException e){
            System.out.println("caught RuntimeException");
        }

        System.out.println("if caught this will be printed");

        String nullPointer = null;
        try{
            nullPointer.toUpperCase();
        } catch(NullPointerException | IndexOutOfBoundsException e){
            throw e;
        } finally {
            System.out.println("this will always be printed lad");
        }
    }
}
