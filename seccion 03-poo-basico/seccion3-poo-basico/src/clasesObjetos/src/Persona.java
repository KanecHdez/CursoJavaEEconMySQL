
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String genero;

    public Persona(String nombreP, String apellidoP, int edadP, String generoP) {
        nombre = nombreP;
        apellido = apellidoP;
        edad = edadP;
        genero = generoP;
    }

    public void asignaNombre(String nombreP) {
        nombre = nombreP;
    }

    public String regresaNombre() {
        return nombre;
    }
    
    public void asignaApellido(String apellidoP) {
        apellido = apellidoP;
    }

    public String regresaApellido() {
        return apellido;
    }
    
    public void asignaEdad(int edadP) {
        edad = edadP;
    }

    public int regresaEdad() {
        return edad;
    }
    public void asignaGenero(String generoP) {
        genero = generoP;
    }

    public String regresaGenero() {
        return genero;
    }
    
}
