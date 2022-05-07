package sys.domain;
public class Alumno extends Persona{
   private int numeroAlumno;

    public Alumno (int numeroAlumno,String nombre){
        super(nombre);
        this.numeroAlumno=numeroAlumno;
    }
   
    public Alumno (int numeroAlumno,int edad,String nombre){
        super(edad,nombre);
        this.numeroAlumno=numeroAlumno;
    }
    
    public Alumno(int numeroAlumno, String nombre, int edad, String sexo){
       super(edad,nombre,sexo);
       this.setNumeroAlumno(numeroAlumno);
    }
    
    public void muestraInfoAlumno(){
        System.out.println();
        System.out.println("----INFORMACION DEL ALUMNO----");
        System.out.println("Escuela a la que pertenece: " + Persona.getNombreEscuela());
        System.out.println("Numero de alumno: " + this.getNumeroAlumno());
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Sexo: " + this.getSexo());
    }
    
    public int getNumeroAlumno() {
        return numeroAlumno;
    }

    public void setNumeroAlumno(int numeroAlumno) {
        this.numeroAlumno = numeroAlumno;
    }
   
}
