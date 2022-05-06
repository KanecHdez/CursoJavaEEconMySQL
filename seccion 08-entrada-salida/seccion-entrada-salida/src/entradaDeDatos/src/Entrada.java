
import java.util.*;
public class Entrada {
    public static void main(String Args[]){
        Scanner entrada= new Scanner(System.in);
        String nombre;
        int edad;
        double sueldo;
        
        System.out.println("¿Como te llamas?");
        nombre=entrada.nextLine();
        
        System.out.println("¿Que edad tienes?");
        edad=entrada.nextInt();
        
        System.out.println("¿Cual es tu sueldo actual?");
        sueldo=entrada.nextDouble();
        
        
        System.out.println("-------------------------");
        System.out.println("Nombre=" + nombre);
        System.out.println("Edad actual=" + edad);
        System.out.println("El proximo año tu edad sera=" + (edad+1));
        System.out.println("Tu sueldo actual=" + (sueldo));
        System.out.println("El proximo año sera un 5% más=" + (sueldo * 1.05));
        
        
    }
}
