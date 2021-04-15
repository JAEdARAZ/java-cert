package arrayList;

import java.util.ArrayList;

public class MainArrayList {
    public static void main(String[] args) {
        ArrayList<Object> theArray = new ArrayList<>();
        theArray.add(true);
        theArray.add(5);
        String s = new String("hola");
        theArray.add(s);
        theArray.add(1, 10.0);

        //true, 10.0, 5, hola
        for (Object o : theArray) {
            System.out.println(o.toString());
        }

        System.out.println("---------------------");

        //it will delete it because remove uses equals
        System.out.println("was it removed? - " + theArray.remove(new String("hola"))); //by index or object
        for (Object o : theArray) {
            System.out.println(o.toString());
        }

        System.out.println("---------------------");

        //what happens with StringBuilder though
        ArrayList<StringBuilder> stringBuilderArray = new ArrayList<>();
        stringBuilderArray.add(new StringBuilder("word1"));
        stringBuilderArray.add(new StringBuilder("word2"));
        stringBuilderArray.remove(new StringBuilder("word1"));

        //prints word1,word2 because StringBuilder doesn't implement equals
        for (Object o : stringBuilderArray) {
            System.out.println(o);
        }

        System.out.println("---------------------");

        //toArray
        StringBuilder[] convertToArray = new StringBuilder[2];
        StringBuilder[] convertToArrayBig = new StringBuilder[20];
        convertToArrayBig = stringBuilderArray.toArray(convertToArray);
        for (StringBuilder sb : convertToArray) {
            System.out.println("convertToArray: " + sb);
        }
        for (StringBuilder sb : convertToArrayBig) {
            System.out.println("convertToArrayBig: " + sb);
        }
    }
}
