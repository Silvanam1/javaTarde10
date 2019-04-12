package lecturaarchivos;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class LectorPorLinea {
    private Reader lectorStream;

    public LectorPorLinea(Reader lectorStream) {
        this.lectorStream = lectorStream;
    }
    
    public String obtenerLinea() throws IOException {
        // se debe ir leyendo del stream lector
        // cuando se llega al final de linea:
        // mostrar la linea completa
        // cuando aperece un -1 devuelvo null
        String acumulador = "";
        
        int c = lectorStream.read();
        
        if (c == -1) {
            return null;
        }
        
        for (; ; c = lectorStream.read()) {
            if (c == -1) {
                return acumulador;
            }
            if (c == 13) {
                lectorStream.read();
                return acumulador;
            }
            acumulador += String.valueOf((char)c);
        }
    }
}
