
public class UsoAndOrNot {

    public static void main(String args[]) {
        String sexo = "hombre";
        int edad = 18;
        //USO DE OPERADOR && (AND)

        if (sexo.equalsIgnoreCase("Hombre") && edad==20 ) {
            System.out.println("La persona es un hombre y tiene 18 años");
        } else {
            System.out.println("La persona no es un hombre o no tiene 18 años");
        }
       
        //USO DE OPERADOR || OR
        if (sexo.equalsIgnoreCase("mujer") || edad==20 ) {
            System.out.println("La persona es un hombre O tiene 20 años");
        } else {
            System.out.println("La persona no es un hombre o no tiene 20 años");
        }
        
        //uso de operador !
        
        if(! sexo.equals("hombre")){
            System.out.println("El personaje es un hombre"); 
        }
    }
}
