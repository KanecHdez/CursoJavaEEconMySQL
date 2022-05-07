

public class EjemploArreglosBidimensionales {
    //SINTAXIS tipo[][] nombreArreglo=new tipo[renglon][columna]
    //int [][] matrizDeEnteros= new int[3][4];
    //esta asignacion es valida
    int [][] matrizDeEnteros={{1,3,5,7},{5,4,1,16},{7,9,61,13} };
    
    //SINTAXIS PARA ASIGNAR VALORES    nombreArreglo[renglon][columna]=valor;
    
    public static void main(String args[]){
        EjemploArreglosBidimensionales objeto = new EjemploArreglosBidimensionales();
        //objeto.asignaValores();
        objeto.leerArregloBidimensional();
    }
    
    
    
    public void asignaValores(){
        
        //primer fila
        matrizDeEnteros[0][0]=1;
        matrizDeEnteros[0][1]=3;
        matrizDeEnteros[0][2]=5;
        matrizDeEnteros[0][3]=7;
       
        //seguda fila
        matrizDeEnteros[1][0]=5;
        matrizDeEnteros[1][1]=4;
        matrizDeEnteros[1][2]=1;
        matrizDeEnteros[1][3]=16;
        
        //tercer fila
        matrizDeEnteros[2][0]=7;
        matrizDeEnteros[2][1]=9;
        matrizDeEnteros[2][2]=61;
        matrizDeEnteros[2][3]=13;
        
    }
    
    //LEER INFORMACION ARREGLO
    
    public void leerArregloBidimensional(){
        for (int[] renglon:matrizDeEnteros){
            for (int columna:renglon){
                System.out.print(columna + " ");
            }
            System.out.print("\n");
        }
    }
    
    
}
