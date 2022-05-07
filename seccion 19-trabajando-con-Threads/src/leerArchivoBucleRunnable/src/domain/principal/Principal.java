
package domain.principal;

import domain.clases.BucleThread;
import domain.clases.LeerArchivoThread;

public class Principal {
     public static void main(String args[]){
         Thread t0 = new LeerArchivoThread("C:/controlArchivos/archivo1.txt","HILO #0");
         Thread t1 = new BucleThread("HILO #1");
         Thread t2 = new BucleThread("HILO #2");
         t0.start();
         t1.start();
         t2.start();
         
         
     }    
}
