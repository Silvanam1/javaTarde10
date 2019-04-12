package lecturaarchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Init {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("C:\\clase10\\Clase10\\archivoLectura.txt");
        // System.out.println(f.exists());
        
        FileReader lector = new FileReader(f);
        InputStreamReader lectorTeclado = new InputStreamReader(System.in);
        
        LectorPorLinea lectorPorLinea = new LectorPorLinea(lectorTeclado);
        
        
        int z = 1;
        for (String s = lectorPorLinea.obtenerLinea(); s != null; s = lectorPorLinea.obtenerLinea()) {
            System.out.println(z + ") " + s);
            z++;
        }
                
        lector.close();
    }
}
