
public class HabilidadesBaasicasString {

    public void mostrarCadenas() {
        String mensaje1 = "Entrada de datos o cadena válida";
        String mensaje2 = "";
        String mensaje3 = null;
        mensaje1 += " esta es una concatenación";

        //uniendo strings
        String nombre = "Juan";
        String apellido = "Perez";
        String nombreCompleto = nombre + " " + apellido;

        //concatenación de cadenas y números
        double precio = 100.60;
        String mensaje = "Precio: " + precio;
        
        
        /*Caracteres especiales en Strings 
         \n   nueva linea
         \t   tabulación
         \r   retorno de carro
         \n   nueva linea
         \"   dobles comillas
         \\   backslash
         */
         String caracterEspecial;
         caracterEspecial="CODIGO: JSP\nPrecio: $50.00 "; 
         
         caracterEspecial="CODIGO:\tJSP\r\nPrecio:\t$50.00";
         
         // caracterEspecial="presionar la letra "x" para salir ";        esto genera un error
         caracterEspecial="presionar la letra \"x\" para salir ";
         
         caracterEspecial="c:\\java\\ejercicios";
         
         System.out.println(caracterEspecial);    

    }
}
