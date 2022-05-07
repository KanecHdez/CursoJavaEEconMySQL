package principal.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayListSimple {
    public static void usoArrayListSimple(){
        List meses = new ArrayList<>();
        //agregando elementos a nuestra lista
        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");
        
        //obtener el ultimo elemento
        int ultimoElemento=meses.size()-1;
        String ultimoMes= (String) meses.get(ultimoElemento);
        System.out.println("IMPRIMIENDO EL ULTIMO ELEMENTO");
        System.out.println(ultimoElemento + " elemento "+ ultimoMes );
        
        // imprimir todos los elementos para modo debug
        System.out.println("IMPRIMIENDO EN MODO DEBUG");
        System.out.println(meses);
        
        //agregando un elemento en la posicion 0
        meses.add(0, "abril");
        meses.add("abril");
        
        System.out.println(meses);
        
        //llamar nuestro metodo qeu imprime la coleccion
        imprimeCollection(meses);
    }
    
    static void imprimeCollection(Collection col){
        Iterator iter = col.iterator();
        System.out.println();
        System.out.println();
        System.out.println();
        while( iter.hasNext() ){
            String mes = (String) iter.next();
            System.out.println(mes);
        }
    }
    
}
