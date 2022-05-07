package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejecutar {

    static int miArreglo[] = new int[3];

    public static void main(String args[]) {
        llenarArreglo();
        sumaArreglo();
    }

    public static void llenarArreglo() {
        Scanner entrada = new Scanner(System.in);
        try {
            int numero;
            for (int i = 0; i <= 3; i++) {
                System.out.println("Introduce número posición " + i);
                numero = entrada.nextInt();
                miArreglo[i] = numero;
            }
        } catch (Exception ime) {
            System.out.println("Se ha producido un error");
        }
    }

    public static void sumaArreglo() {
        int suma = 0;
        for (int i = 0; i <= 2; i++) {
            suma = suma + miArreglo[i];
        }
        System.out.println("La suma de los números es: " + suma);
    }
}
