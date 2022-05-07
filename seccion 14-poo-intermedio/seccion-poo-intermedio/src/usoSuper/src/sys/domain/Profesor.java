package sys.domain;

public class Profesor extends Persona {

    private String especialidad;
    private String cedulaProfesional;

    public Profesor(String especialidad, String cedulaProfesional, String nombre) {
         super(nombre);
         this.especialidad=especialidad;
         this.cedulaProfesional= cedulaProfesional;       
    }
    
    public Profesor(String especialidad, String cedulaProfesional, String nombre,int edad) {
         super(edad,nombre);
         this.especialidad=especialidad;
         this.cedulaProfesional= cedulaProfesional;       
    }
    

    public Profesor(String cedulaProfesional, String especialidad, String nombre, int edad, String sexo) {
        super(edad,nombre,sexo);
        this.setCedulaProfesional(cedulaProfesional);
        this.setEspecialidad(especialidad);
    }

    public void muestraInfoProfesor(){
        System.out.println();
        System.out.println("----INFORMACION DEL PROFESOR----");
        System.out.println("Escuela a la que pertenece: " + Persona.getNombreEscuela());
        System.out.println("Cedula profesional " + this.cedulaProfesional);
        System.out.println("Especialidad " + this.especialidad);
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Sexo: " + this.getSexo());
    }
    
    
    
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCedulaProfesional() {
        return cedulaProfesional;
    }

    public void setCedulaProfesional(String cedulaProfesional) {
        this.cedulaProfesional = cedulaProfesional;
    }

}
