package StringBuilder;

public class MainStringBuilder {
    public static void main(String[] args){
        //stringBuilderDoesntOverrideEquals();
        stringBuilderMethods();
    }

    public static void stringBuilderDoesntOverrideEquals(){
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

    public static void stringBuilderMethods(){
        StringBuilder s1 = new StringBuilder("hello world");
        s1.append(" this is Jaime");
        StringBuilder s2 = s1;
        s2.append( " same reference");
        System.out.println(s1); //hello world this is Jaime same reference

        StringBuilder s3 = new StringBuilder("012345");
        s3.insert(2, "hola");
        System.out.println(s3); //01hola2345

        s3 = new StringBuilder("012345");
        s3.replace(1,3, "hola");
        System.out.println(s3); //0hola345

        s3 = new StringBuilder("012345");
        s3.delete(1, 3);
        System.out.println(s3); //0345
    }
}
