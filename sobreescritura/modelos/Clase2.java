package sobreescritura.modelos;

public class Clase2 extends Clase1 {
    @Override
    public Integer methodToOverride(){ //Integer inherits from Object (defined return type in Clase1)
       return 10;
    }

    public int thisWontBeOverriden(int num){
        return num;
    }
}
