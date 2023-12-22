package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivos {
    
    public static String leerArchivo(String file) throws IOException{ //Para leer la informacion en los archivos.
        File f = new File(file);
        if (f.exists()){
            BufferedReader BR = new BufferedReader(new FileReader(file));
            String linea, s;
            linea = BR.readLine();
            s = linea;
            while((linea = BR.readLine())!=null){
                s += "\n" + linea;
            }
            return s;
        }
        return null;
    }
    
    public static void escribirArchivo(String s, String file) throws IOException{ //Para actualizar/crear archivos
        FileWriter archivo = null;
        PrintWriter escritor = null;

        try {
            archivo = new FileWriter(file);
            escritor = new PrintWriter(archivo);

            escritor.println(s);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            archivo.close();

        }
    }
}
