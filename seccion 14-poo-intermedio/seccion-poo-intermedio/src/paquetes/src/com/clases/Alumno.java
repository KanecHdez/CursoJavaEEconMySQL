package com.clases;
public class Alumno {
    private double calificacion;
    private String nombre;
    private int edad;
    private static double coutaSemestral;

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static double getCoutaSemestral() {
        return coutaSemestral;
    }

    public static void setCoutaSemestral(double coutaSemestral) {
        Alumno.coutaSemestral = coutaSemestral;
    }
    
    
    
}
