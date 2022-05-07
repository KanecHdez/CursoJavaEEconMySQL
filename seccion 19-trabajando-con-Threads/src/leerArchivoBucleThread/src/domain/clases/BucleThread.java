package domain.clases;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BucleThread implements Runnable {
    private String nombre;
    public BucleThread(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            if (nombre == "HILO #1") {
                System.out.println("Ciclo en la posición" + i * 100
                        + " PROCESO: " + nombre);
            } else {
                System.out.println("Ciclo en la posición" + i
                        + " PROCESO: " + nombre);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Proceso: "+ nombre +" Terminado");
    }
}
