
package domain.principal;

import domain.clases.BucleThread;
import domain.clases.LeerArchivoThread;

public class Principal {
     public static void main(String args[]){
         //Thread t0 = new LeerArchivoThread("C:/controlArchivos/archivo1.txt","HILO #0");
         
         //Thread t1 = new BucleThread("HILO #1");
         //t1.start();
         BucleThread obj1 = new BucleThread("HILO #1");
         Thread  hilo1 = new Thread(obj1);
         hilo1.start();
         
         BucleThread obj2 = new BucleThread("HILO #2");
         Thread  hilo2 = new Thread(obj2);
         hilo2.start();
         
         
         LeerArchivoThread obj3 = new LeerArchivoThread("C:/controlArchivos/archivo1.txt","HILO #0");
         Thread  hilo3 = new Thread(obj3);
         hilo3.start();
         
         
         //Thread t2 = new BucleThread("HILO #2");
         //t0.start();
         
         //t2.start();
         
         
     }    
}
