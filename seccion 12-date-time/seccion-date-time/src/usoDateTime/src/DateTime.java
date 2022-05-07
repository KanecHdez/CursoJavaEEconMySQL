
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTime {
    public static void main(String args[]){
        DateTime objeto = new DateTime();
        /*objeto.usarNow();
        System.out.println("---------------------");
        objeto.usarOf();
        System.out.println("---------------------");
        objeto.usarParse();
        objeto.regresaPartesDateTime();
        */
        //ComparaDateTime objeto1 = new ComparaDateTime();
        //objeto1.isBefore();
        //cisAfter();
        //objeto1.compareTo();
        ajustandoDateTime objetoFecha = new ajustandoDateTime();
        //objetoFecha.ajustaDateTime();
        objetoFecha.modificarTiempo();
    }
    
    public void regresaPartesDateTime(){
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        System.out.println("LA FECHA Y HORA ACTUAL ES: " + fechaHoraActual);
        System.out.println("El método getYear() regresa un entero (año actual): " + fechaHoraActual.getYear() );
        System.out.println("El método getMonth() regresa un objeto (mes actual): " + fechaHoraActual.getMonth() );
        System.out.println("El método getMonthValue() regresa un entero entre 1-12 (mes actual): " + fechaHoraActual.getMonthValue() );
        System.out.println("El método getDayOfMonth() regresa un entero (día actual): " + fechaHoraActual.getDayOfMonth() );
        System.out.println("El método getDayOfYear() regresa un entero (día del año): " + fechaHoraActual.getDayOfYear() );
        System.out.println("El método getDayOfWeek() regresa un objeto (día de la semana): " + fechaHoraActual.getDayOfWeek() );
        
        Month mes = fechaHoraActual.getMonth();
        System.out.println(mes);
        DayOfWeek dia =fechaHoraActual.getDayOfWeek();
        
        System.out.println("El método getHour() regresa un entero (Hora del dia en formato 24hrs): " + fechaHoraActual.getHour());
        System.out.println("El método getMinute() regresa un entero (Minuto actual): " + fechaHoraActual.getMinute());
        System.out.println("El método getSecond() regresa un entero (Segundo actual): " + fechaHoraActual.getSecond());
        System.out.println("El método getNano() regresa un entero (Nanosegundo actual): " + fechaHoraActual.getNano());
        
    }
    
    public void usarParse(){
        LocalDate fecha = LocalDate.parse("2015-10-31");
        System.out.println("haciendo uso de LocalDate.parse: "+ fecha);
        LocalTime tiempo1 = LocalTime.parse("02:32:45");
        System.out.println("haciendo uso de LocalTime.parse:" +tiempo1);
        LocalDateTime fechaTiempo = LocalDateTime.parse("2015-10-31T02:32:45.123456789");
        System.out.println("Haciendo uso de la clase LocalDateTime.parse:" +fechaTiempo);
    }
    
    public void usarOf(){
        LocalDate fecha1 = LocalDate.of(2015, Month.OCTOBER, 31);
        System.out.println("Haciendo uso de LocalDate.of:" + fecha1);
        LocalDate fecha2 = LocalDate.of(2015, 10, 31);
        System.out.println("Haciendo uso de LocalDate.of:" + fecha2);
        
        LocalTime tiempo1 = LocalTime.of(14, 32);
        System.out.println("Haciendo uso de LocalTime:" + tiempo1);
        LocalTime tiempo2 = LocalTime.of(14, 32,45);
        System.out.println("Haciendo uso de LocalTime:" + tiempo2);
        LocalTime tiempo3 = LocalTime.of(14, 32,45,123456789);
        System.out.println("Haciendo uso de LocalTime:" + tiempo3);
        
        LocalDateTime fechaYHora = LocalDateTime.of(1981,10,16,14,32);
        System.out.println("Haciendo uso de LocalDateTime:" +fechaYHora );
        
        
    }
    
    public void usarNow(){
        LocalDate fechaActual = LocalDate.now();
        LocalTime tiempoActual = LocalTime.now();
        LocalDateTime fechaYTiempoActul = LocalDateTime.now();
        
        System.out.println("Utilizando LocalDate:" + fechaActual);
        System.out.println("Utilizando LocalTime:" + tiempoActual);
        System.out.println("Utilizando LocalDateTime:" + fechaYTiempoActul);
        
    }
}
