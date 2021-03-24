package clausulaSwitch;

public class MainSwitch {
    public static void main(String[] args){
        int a = 9999;
        switch(a){
            case 9_999:
                System.out.println("this will be printed");
            case 2:
                System.out.println("this too!");
                break;
            case 3:
                System.out.println("this won't be printed lad");
                break;
        }

        //accepts String and int (and anything that can be implicitly converted to int - char,short,byte,float
        char b = 'b'; // b = 98
        switch(b){
            case 98:
                System.out.println("this works");
                break;
            default:
                System.out.println("this won't be printed my laddie");
                break;
        }

        //it will keep on going until it finds a break
        switch("aloha"){
            default:
                System.out.println("default message is printed!");
            case "whatever":
                System.out.println("Since default has no break, this is printed too! Careful young boy!");
        }
    }
}
