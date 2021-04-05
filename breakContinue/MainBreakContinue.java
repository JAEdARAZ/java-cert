package breakContinue;

public class MainBreakContinue {
    public static void main(String[] args){
        exteriorLoop:for (int i = 0; i < 10; i++) {
            interiorLoop:for (int j = 0; j < 2; j++) {
                if(i==5) break;
                System.out.println("i:j - " + i + ":" + j);
            }
            System.out.println("------------");
        }

        System.out.println("\n###########\n");

        //using tags it's possible to specify which loop breaks
        exteriorLoop:for (int i = 0; i < 10; i++) {
            interiorLoop:for (int j = 0; j < 2; j++) {
                if(i==5) break exteriorLoop;
                System.out.println("i:j - " + i + ":" + j);
            }
            System.out.println("------------");
        }

        //continue jumps to the next iteration
        System.out.println("\ncontinue example");
        for (int i = 0; i < 5; i++) {
            if(i==2) continue;
            System.out.println(i);
        }
    }
}
