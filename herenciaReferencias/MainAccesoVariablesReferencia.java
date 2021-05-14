package herenciaReferencias;

class Parent{
    int x = 10;
    public int getX(){
        return x;
    }
}
class Child extends Parent {
    int x = 20;
    public int getX(){
        return x;
    }
}

public class MainAccesoVariablesReferencia {
    public static void main(String[] args) {
        Parent var = new Child();
        System.out.println(var.x); //10
        System.out.println(var.getX()); //20
    }
}

