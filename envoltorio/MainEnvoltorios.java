package envoltorio;

public class MainEnvoltorios {
    public static void main(String[]args){
        Integer a = 5; //autoboxing
        Integer b = 5;
        if(a==b){
            System.out.println("from Integer pool");
        }

        Integer c = new Integer(5);
        Integer d = new Integer(5);
        if(c==d){
            System.out.println("this won't be printed, we are comparing references");
        } else{
            System.out.println("they are different objects, pool not used (instantiated with new)");
        }

        if(c.equals(d)){
            System.out.println("!= objects need to be compared with equals");
        }

        int e = d; //autoboxing
        System.out.println("e: " + e);

        double x = e; //autoboxing and implicit conversion
        System.out.println("x: " + x);

    }
}
