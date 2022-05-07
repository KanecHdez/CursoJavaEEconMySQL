package com.test;
import com.clases.*;
import java.util.Scanner;
public class Principal {
    public static void main(String args[]){
        Alumno.setCoutaSemestral(500);
        Alumno alumnoUno = new Alumno();
        solicitaInformacion(alumnoUno);
        muestraInformacion(alumnoUno);
    }
    
    public static void muestraInformacion(Alumno alumno){
        System.out.println();
        System.out.println("Nombre: " + alumno.getNombre());
        System.out.println("Edad: " + alumno.getEdad());
        System.out.println("Calificación: " + alumno.getCalificacion());
        System.out.println("Cuota semestral: " + Alumno.getCoutaSemestral());
        System.out.println();        
    }
    
    public static void solicitaInformacion(Alumno alumno){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre del alumno:");
        String nombre =entrada.nextLine();
        alumno.setNombre(nombre);
        
        System.out.print("Edad de " + alumno.getNombre()+":" );
        int edad =entrada.nextInt();
        alumno.setEdad(edad);
        
        System.out.print("Calificación de " + alumno.getNombre() + ": ");
        float cal =entrada.nextFloat();
        alumno.setCalificacion(cal);
        
    }
}
