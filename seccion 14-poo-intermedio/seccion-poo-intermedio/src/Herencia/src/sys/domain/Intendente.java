package sys.domain;
public class Intendente extends Persona {
    private String areaLipieza;

    public Intendente(){
        
    }
   
    public Intendente(String areaLipieza,String nombre, int edad, String sexo){
        this.setAreaLipieza(areaLipieza);
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setSexo(sexo);
    }
   
    
    public void muestraInfoIntendente(){
        System.out.println();
        System.out.println("----INFORMACION DEL INTENDENTE----");
        System.out.println("Escuela a la que pertenece: " + Persona.getNombreEscuela());
        System.out.println("Area de limpieza " + this.areaLipieza);
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Sexo: " + this.getSexo());
    }
    
    
    
    public String getAreaLipieza() {
        return areaLipieza;
    }

    public void setAreaLipieza(String areaLipieza) {
        this.areaLipieza = areaLipieza;
    }
    
}
