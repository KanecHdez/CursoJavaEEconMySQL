package sys.domain;

public class Persona {
    private static String nombreEscuela;
    private int edad;
    private String nombre;
    private String sexo;

    public static String getNombreEscuela() {
        return nombreEscuela;
    }

    public static void setNombreEscuela(String nombreEscuela) {
        Persona.nombreEscuela = nombreEscuela;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
}
