package domain.clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LeerArchivoThread implements Runnable {

    static Path variablePath;
    static File variableFile;
    private String nombre;
    public LeerArchivoThread(String ruta,String nombre) {
        this.nombre=nombre;
        Path variablePath = Paths.get(ruta);
        variableFile = variablePath.toFile();
    }

    @Override
    public void run() {
        try (BufferedReader inputStream = new BufferedReader(
                new FileReader(variableFile))) {
            String linea = inputStream.readLine();
            while (linea != null) {
                System.out.println(linea + " PROCESO: " + this.nombre);
                linea = inputStream.readLine();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            System.out.println("Proceso: " + this.nombre + " Terminado");

        } catch (IOException e) {

        }
    }
}
