
public class Principal {
    public static void main(String args[]){
        try{
        int resultado = division(6,0);
        System.out.println("Resultado = " + resultado);
        } catch(Exception e){
            System.out.println("Ha ocurrido un error");
            e.printStackTrace();
        }
    }
    
    static int division(int numerador, int denominador) throws Exception{
        int resultado =numerador/denominador;
        return resultado;
    }
}
