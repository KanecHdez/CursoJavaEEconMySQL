package domain.clases;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BucleThread extends Thread {

    public BucleThread(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            if (this.getName() == "HILO #1") {
                System.out.println("Ciclo en la posición" + i * 100
                        + " PROCESO: " + this.getName());
            } else {
                System.out.println("Ciclo en la posición" + i
                        + " PROCESO: " + this.getName());
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Proceso: "+ this.getName()+" Terminado");
    }
}
