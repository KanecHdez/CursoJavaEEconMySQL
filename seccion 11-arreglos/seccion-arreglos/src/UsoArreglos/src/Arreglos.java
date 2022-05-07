
import java.util.Scanner;

public class Arreglos {
     private final int BIMESTRES=6;
     private final int CALIFICACION_APROBATORIA;
     private double calificaciones[]=new double[6];
    
    public static void main(String args[]){
         Arreglos objeto = new Arreglos(70);
         objeto.solicitaCalificaciones();
         objeto.imprimeCalificacionBimestre();
         System.out.println("el promedio semestral es: "+ objeto.calculaPromedio());
     }
     
    public double calculaPromedio(){
        double suma=0;
        for(double calificacion:calificaciones){
            suma+=calificacion;
            
        }
        return suma/BIMESTRES;
    }
    
     public Arreglos(int calificacionAprobatoria){
         CALIFICACION_APROBATORIA=calificacionAprobatoria;
     }
     
     public void imprimeCalificacionBimestre(){
         for(int i=0 ; i < calificaciones.length; i++){
             if(calificaciones[i]<CALIFICACION_APROBATORIA){
                 System.out.println("CON UN "+calificaciones[i] + " REPRUEBAS EL BIMESTRE" );
             }
             else
             {
                 System.out.println("CON UN "+calificaciones[i] + " APRUEBAS EL BIMESTRE" );
             }
         }
     }
     
     public void solicitaCalificaciones(){
         Scanner entrada = new Scanner (System.in);
         double calificacion;
         
         for(int i=0 ; i < calificaciones.length; i++){
             System.out.println("Calificación para el bimestre "+(i+1) );
             calificacion=entrada.nextDouble();
             calificaciones[i]=calificacion;
         }
         
     }
}
