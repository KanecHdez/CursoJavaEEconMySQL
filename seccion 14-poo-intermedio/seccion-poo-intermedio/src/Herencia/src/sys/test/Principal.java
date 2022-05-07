package sys.test;
import sys.domain.*;
public class Principal {
    public static void main(String args[]){
        Persona.setNombreEscuela("ESCUELA BENITO JUAREZ");
        //Alumno alumnoUno = new Alumno(1000, "JORGE GAYGOZA",34, "MASCULINO");
        //alumnoUno.muestraInfoAlumno();
        
        //Director directorUno=new Director("1111", "DANIEL DELGADO",45, "MASCULINO");
        //directorUno.muestraInfoDirector();
        
        //Intendente intendenteUno = new Intendente("PATIOS","RAMIRO RANGEL", 50, "MASCULINO");
        //intendenteUno.muestraInfoIntendente();
        
        Profesor profesorUno = new Profesor("0989089080", "MATEMATICAS","RAFAEL MONCIVAIS",48, "MASCULINO");
        profesorUno.muestraInfoProfesor();
    }
}
