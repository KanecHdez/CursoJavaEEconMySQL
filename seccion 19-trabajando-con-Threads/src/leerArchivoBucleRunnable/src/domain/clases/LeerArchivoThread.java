package domain.clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LeerArchivoThread extends Thread {

    static Path variablePath;
    static File variableFile;

    public LeerArchivoThread(String ruta,String nombre) {
        super(nombre);
        Path variablePath = Paths.get(ruta);
        variableFile = variablePath.toFile();
    }

    @Override
    public void run() {
        try (BufferedReader inputStream = new BufferedReader(
                new FileReader(variableFile))) {
            String linea = inputStream.readLine();
            while (linea != null) {
                System.out.println(linea + " PROCESO: " + this.getName());
                linea = inputStream.readLine();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            System.out.println("Proceso: " + this.getName() + " Terminado");

        } catch (IOException e) {

        }
    }
}
