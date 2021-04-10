package herenciaReferencias;

import herenciaReferencias.modelos.ClaseHija;
import herenciaReferencias.modelos.ClasePadre;

public class MainHerenciaRef {
    public static void main(String[] args) {
        ClasePadre p1 = new ClaseHija();
        p1.writesSentence(); //writes ClaseHija sentence

        ClaseHija h1 = (ClaseHija) new ClasePadre(); //ClassCastException, ClaseHija cannot contain ClasePadre

        ClasePadre p2 = new ClaseHija();
        p2.writesSentence(); //writes ClaseHija sentence

        ClaseHija h2 = (ClaseHija) p2;
        h2.writesSentence(); //writes ClaseHija sentence
    }
}
