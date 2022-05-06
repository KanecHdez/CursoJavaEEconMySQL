
public class EjerciciosMath {
    public static void main(String args[]){
        EjerciciosMath objeto = new EjerciciosMath();
        //objeto.numerosAleatorios();
        //objeto.maximoMinimo();
        objeto.raizCuadrada();
    } 
    
    public void raizCuadrada(){
        double a=5;
        System.out.println("la raiz cuadadrada de" +a +" es= "  + Math.sqrt(a));
        
    }
    
    public void potencia(){
        double a=2.0;
        double b=5.0;
        System.out.println("El resultado de elevar" +a +" a " + b + " es= " + Math.pow(a,b));
        
    }
    
    public void redondeo(){
        double a=5.8;
        double b=5.3;
        System.out.println("El redondeo del número es:" + Math.round(a));
        System.out.println("El redondeo del número es:" + Math.round(b));
    }
    
    public void mayorMenorPrametro(){
        double numero=5.1;
        
        System.out.println("El entero mayor del número es:" + Math.ceil(numero));
        System.out.println("El entero menor del número es:" + Math.floor(numero));
    }
    
    
    public void maximoMinimo(){
        int numero1=1000;
        int numero2=999;
        
        System.out.println("El mayor de los dos números es:" + Math.max(numero1, numero2) );
        System.out.println("El menor de los dos números es:" + Math.min(numero1, numero2) );
    }
    
    public void numerosAleatorios(){
        for(int i=0; i<10; i++){
            int aleatorio=(int)((Math.random()*10)+1);
            System.out.println(aleatorio);
        }
    }
}
