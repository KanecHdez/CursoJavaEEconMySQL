public class Principal {
    public static void main(String args[]){
        Profesor objetoProfesor = new Profesor();
        objetoProfesor.setNombre("José Manuel");
        objetoProfesor.setSueldo(4000);
        objetoProfesor.setIdentificacion("001");
        
        System.out.println("Nombre:" + objetoProfesor.getNombre());
        System.out.println("Sueldo:" + objetoProfesor.getSueldo());
        System.out.println("Identificación:" + objetoProfesor.getIdentificacion());
        
        
    }
}
