package herenciaReferencias.modelos;

public class ClaseHija extends ClasePadre{
    public void writesSentence(){
        System.out.println("clase hija");
    }

    public void hijaMetodo(){
        System.out.println("not overriden method");
    }
}
