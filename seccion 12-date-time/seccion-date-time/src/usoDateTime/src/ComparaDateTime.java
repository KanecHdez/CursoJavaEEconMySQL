
import java.time.LocalDate;
import java.time.Month;


public class ComparaDateTime {
    //REGRESA TRUE SI LA FECHA O TIEMPO ESTAN ANTES DE LA OTRA FECHA
    //DE LO CONTRARIO REGRESA FALSO
    public void isBefore(){
        LocalDate fecha1= LocalDate.now();
        LocalDate fecha2= LocalDate.of(2010, Month.OCTOBER, 31);
        if(fecha1.isBefore(fecha2)){
            System.out.println("El día " + fecha1 + " SI esta ANTES DE " + fecha2);
        }
        else{
            System.out.println("El día " + fecha1 + " NO esta ANTES DE " + fecha2);
        }
    }
    //REGRESA TRUE SI LA FECHA O TIEMPO ESTAN DESPUES DE LA OTRA FECHA ESPECIFICADA
    //DE LO CONTRARIO REGRESA FALSO
    public void isAfter(){
        LocalDate fecha1= LocalDate.now();
        LocalDate fecha2= LocalDate.of(2010, Month.OCTOBER, 31);
        if(fecha1.isAfter(fecha2)){
            System.out.println("El día " + fecha1 + " SI esta DESPUES DE " + fecha2);
        }
        else{
            System.out.println("El día " + fecha1 + " NO esta DESPUES DE " + fecha2);
        }
    }
    
    //REGRESA UN VALOR NEGATIVO SI LA PRIMER FECHA ESTA ANTES QUE LA OTRA
    //Y UN VALOR POSITIVO SI ESTA DESPUES DE LA OTRA, REGRESARA CERO SI ESTA IGUAL
    public void compareTo(){
        LocalDate fecha1= LocalDate.now();
        LocalDate fecha2= LocalDate.of(2017, Month.JULY, 2);
        
        if(fecha1.compareTo(fecha2)<0){
            System.out.println("la fecha "+ fecha1 + " esta antes de la fecha: " + fecha2);
        }else if(fecha1.compareTo(fecha2)>0){
            System.out.println("la fecha "+ fecha1 + " esta después de la fecha: " + fecha2);
        }else{
            System.out.println("la fecha "+ fecha1 + " es IGUAL a la  fecha: " + fecha2);
        }  
    }  
}
