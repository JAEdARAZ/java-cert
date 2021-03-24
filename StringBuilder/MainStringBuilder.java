package StringBuilder;

public class MainStringBuilder {
    public static void main(String[] args){
        StringBuilder s1 = new StringBuilder("hello");
        StringBuilder s2 = new StringBuilder("hello");
        if(s1.equals(s2)){
            System.out.println("This is not printed");
        } else{
            System.out.println("StringBuilder doesn't override equals. Equals compares references");
        }

        StringBuilder s3 = s2;
        if(s2.equals(s3)) System.out.println("This works, it compares references");
        if(s2 == s3) System.out.println("Same here lad");
    }
}
