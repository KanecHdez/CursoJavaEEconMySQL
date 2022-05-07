
public class Principal {

    public static void main(String args[]) {
        try {
            int resultado = division(6, 0);
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException ae) {
            System.out.println("Error ");
            ae.printStackTrace();
        }

    }

    static int division(int numerador, int denominador) throws ArithmeticException {
        if (denominador == 0) {
            throw new ArithmeticException("tienes un error de division por cero");
        }
        int resultado = (numerador / denominador);
        return resultado;
    }
}
