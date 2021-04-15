package excepciones;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MainExcepcionesChecked {
    public static void main(String[] args) {
        try {
            readsFile("B:/myfile.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //the exception can be thrown but it needs to be caught in the calling method (its a checked one)
    public static void readsFile(String path) throws FileNotFoundException {
        FileInputStream fis = null;
        fis = new FileInputStream(path);
    }
}
