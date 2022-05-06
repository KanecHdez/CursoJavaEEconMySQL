
public class CompararCadenas {

    public void comparandoStrings() {
        String nombre="Juan";
        if(nombre.equals("JUAN")){
            System.out.println("Si corresponde al nombre");
        }
        
        nombre="";
        if(nombre.isEmpty()){
            System.out.println("La cadena esta vacia");
        }
        
        nombre="JUAN MANUEL PEREZ ARELLANO";
        
        if(nombre.startsWith("MANUEL")){
            System.out.println("el nombre de la persona comienza con la palabra JUAN");
        }
        
        if(nombre.endsWith("ARELLANO")){
            System.out.println("el APELLIDO de la persona TERMINA con la palabra ARELLANO");
        }
        //tamaño de una cadena
        String miCadena="este es mi primer curso de java";
        int lenght=miCadena.length();
        System.out.println("El tamaño de mi cadena es:" +lenght);
        miCadena="";
        if(miCadena.length()==0){
            System.out.println("Cadena vacia");
        }
        miCadena="este es mi primer curso de java";
        String cadenaBuscada="es";
        int indice =miCadena.indexOf(cadenaBuscada);
        System.out.println("La posicion donde se encontro mi cadena fue:" + indice);
        
        char caracter=miCadena.charAt(2);
        System.out.println("El caracter en la posicion 2 es:" + caracter);
        
        //limpiar cadenas con espacios
        String cadenaConEspacios="   esta es una cadena con espacios   ";
        System.out.println(cadenaConEspacios.trim());
      
        //extraer subcadena
        String numCta="7987 6466 6546 6566";
        String cuatroUltimoCaracteres=numCta.substring(5, 9);
        System.out.println(cuatroUltimoCaracteres);
    }
}
