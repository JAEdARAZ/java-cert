package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MainPredicate {
    public static void main(String[] args) {
        List<String> theList = new ArrayList<>();
        theList.add("aloha");
        theList.add("casita");
        theList.add("miniHouse");
        theList.add("casita");
        theList.add("miniHouse");

        basicUseOfPredicate(theList);
        System.out.println("---------");
        checkForMiniHouse(theList, s -> s.equals("miniHouse"));
    }

    private static void basicUseOfPredicate(List<String> theList) {
        Predicate<String> predicadoString = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.equals("casita");
            }
        };

        //print casita with stream
        theList.stream().filter(predicadoString).forEach(s -> System.out.println("from stream: " + s));

        //print casita with loop
        for (String s: theList) {
            if(predicadoString.test(s)){
                System.out.println("from loop: " + s);
            }
        }
    }

    private static void checkForMiniHouse(List<String> theList, Predicate<String> thePredicate){
        for (String s: theList) {
            if(thePredicate.test(s)){
                System.out.println("from method! " + s);
            }
        }
    }
}
