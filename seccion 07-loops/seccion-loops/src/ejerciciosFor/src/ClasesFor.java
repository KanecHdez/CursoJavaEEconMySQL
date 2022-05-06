
public class ClasesFor {
     public static void main(String args[]) {
        ClasesFor objeto = new ClasesFor();
        objeto.imprimeTablas();
    }

    //REALIZA LAS TABLAS DE MULTIPLICAR HASTA N NUMERO
     
    public void imprimeTablas(){
        int cuantasTablas=10;
        
        for (int i=1;i<=cuantasTablas; i++){
             for(int j=1;j<=10;j++){
               System.out.println(i + " * " + j +" = " + (i*j));
             }   
             System.out.println("----------");
             System.out.println("");
        }
        
        
    } 
     
    //0 1 2 3 4 5 ....
    public void concatenarNumeros() {
        String numeros = "";
        for (int i = 0; i < 5; i++) {
            numeros += i + " ";
            //numeros += " ";
        }
        System.out.println(numeros);
        
        //imprimir una tabla de multiplicar
        
        int numeroDeTabla=3;
        System.out.println("Tabla del " + numeroDeTabla);
        
        for(int j=1;j<=10;j++){
           System.out.println(numeroDeTabla + " * " + j +" = " + (numeroDeTabla*j));
        }
        
        
        
    }
}
