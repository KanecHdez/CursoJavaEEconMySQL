
package com.test;

import com.domain.*;

public class Pruebas {
     public static void main(String args[]){
         Rectangulo r= new Rectangulo();
         r.setAlto(10);
         r.setAncho(20);
         r.mostrarDatos();
         System.out.println("El area de un rectangulo es: " + r.getArea() );
         System.err.println("---------");
         Triangulo t= new Triangulo(20, 10);
         t.mostrarDatos();
         System.out.println("El area de un triangulo es: " + t.getArea() );
         
     }    
}
