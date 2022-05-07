
import java.util.Arrays;

public class HabilidadesConArreglos {
    //int[] cantidades=new int[5];
    int[] cantidades={5,4,2,3,1};
    public static void main(String args[]){
        HabilidadesConArreglos objeto = new HabilidadesConArreglos();
        //objeto.rellenarValores();
        //objeto.leerArreglo();
        //System.out.println("---------");
        //objeto.ordenarValores();
        //objeto.leerArreglo();
        objeto.buscarValor();
    }
    
    //buscar valores en un arreglo ordenado
    public void buscarValor(){
        String[] nombresEmpleados={"pedro","maria","juan"};
        Arrays.sort(nombresEmpleados);
        int index = Arrays.binarySearch(nombresEmpleados,"pedro");
        System.out.println("La palabra pedro la encontre en la posicion o indice = " + index);
    }
    
    //ordenar los valores de un arreglo
    public void ordenarValores(){
        Arrays.sort(cantidades);
    }
    
    //rellenar con valores un arreglo
    public void rellenarValores(){
        Arrays.fill(cantidades, 100);
    }
    
    //leer un arreglo
    public void leerArreglo(){
        for(int valor:cantidades){
            System.out.println(valor);
        }
    }
    
}
