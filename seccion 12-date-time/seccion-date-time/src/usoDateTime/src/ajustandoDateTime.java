
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ajustandoDateTime {
    public void ajustaDateTime(){
        LocalDate fecha1 = LocalDate.of(2017, 10, 16);
        System.out.println("Fecha actual: " + fecha1);
        fecha1=fecha1.withDayOfMonth(31);
        System.out.println("Fecha cambiando el día: " + fecha1);
        
        fecha1=fecha1.withMonth(2);
        System.out.println("Cambiando el mes: " + fecha1);
        
        fecha1=fecha1.withDayOfYear(365);
        System.out.println("Alterando el día del año: " +fecha1);
        
        
        LocalTime horaActual = LocalTime.now();
        System.out.println("La hora actual es: " + horaActual);
        
        horaActual= horaActual.withHour(10);
        System.out.println("La hora modificada es: " + horaActual);
        
        horaActual=horaActual.withMinute(59);
        System.out.println("El minuto modificado es: " + horaActual);
    }
    
    public void modificarTiempo(){
        LocalDateTime fechaActual =LocalDateTime.now();
        System.out.println("Fecha y hora actual: "+ fechaActual);
        
        fechaActual=fechaActual.plus(3, ChronoUnit.WEEKS);
        System.out.println("Fecha modificada sumandole 3 semanas: " +fechaActual);
        
        fechaActual=fechaActual.minus(3, ChronoUnit.WEEKS);
        System.out.println("Fecha modificada restandole 3 semanas: " +fechaActual);
        
        LocalDateTime fechaNueva = LocalDateTime.now();
        System.out.println("La fecha actual: "+fechaNueva);
        
        fechaNueva=fechaNueva.minusDays(15);
        System.out.println("La fecha modificada más 15 días es:" + fechaNueva);
        
    }
}
