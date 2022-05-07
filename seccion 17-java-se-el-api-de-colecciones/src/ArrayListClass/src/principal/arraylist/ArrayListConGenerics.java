package principal.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayListConGenerics {

    public static void usoArrayListSimple() {
        List<String> meses = new ArrayList<String>();
        //agregando elementos a nuestra lista
        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");

        //obtener el ultimo elemento
        int ultimoElemento = meses.size() - 1;
        String ultimoMes = meses.get(ultimoElemento);
        //System.out.println("IMPRIMIENDO EL ULTIMO ELEMENTO");
        //System.out.println(ultimoElemento + " elemento "+ ultimoMes );

        // imprimir todos los elementos para modo debug
        //System.out.println("IMPRIMIENDO EN MODO DEBUG");
        //System.out.println(meses);
        //agregando un elemento en la posicion 0
        meses.add(0, "abril");
        meses.add("abril");

        //System.out.println(meses);
        //llamar nuestro metodo qeu imprime la coleccion
        //imprimeCollection(meses);
        //VALIDANDO SI UN ELEMENTO ESTA DENTRO DE NUESTRO ARRAYLIST
        String objetoBuscado = "abril";
        if (meses.contains(objetoBuscado)) {
            System.out.println("En esta lista existe: " + objetoBuscado);
            System.out.println("Se encuentra en la posición: " + meses.indexOf(objetoBuscado));
            meses.remove(meses.indexOf(objetoBuscado));
            imprimeCollection(meses);
            meses.set(0, "Diciembre");
            imprimeCollection(meses);
            meses.clear();
            imprimeCollection(meses);
        } else {
            System.out.println("En esta lista NO existe: " + objetoBuscado);
        }

    }

    static void imprimeCollection(Collection<String> col) {
        //Iterator iter = col.iterator();
        System.out.println();
        System.out.println();
        System.out.println();
        //while( iter.hasNext() ){
        //    String mes = (String) iter.next();
        //    System.out.println(mes);
        //}
        if (!col.isEmpty()) {
            for (String str : col) {
                System.out.println(str);
            }
        }else{
           System.out.println("La colección se encuentra vacia");
        }
    }

}
