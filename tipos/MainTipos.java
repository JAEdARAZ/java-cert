package tipos;

public class MainTipos {
    public static void main(String[] args){
        int a = 123_456; //more readable
        int b = 010; //octal. starts with 0. Digits {0..7}
        int c = 0xAF9; //hexa. Digits {0..9, A..F}
        int d = 0b10; //binary. Stats 0b
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
    }
}
