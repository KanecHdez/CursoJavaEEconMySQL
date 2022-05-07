package sys.domain;
public class Intendente extends Persona {
    private String areaLipieza;

    public Intendente(String areaLimpieza, String nombre){
        super(nombre);
        this.areaLipieza=areaLimpieza;
    }
   
    public Intendente(String areaLimpieza,int edad ,String nombre){
        super(edad,nombre);
        this.areaLipieza=areaLimpieza;
    }
    
    public Intendente(String areaLipieza,String nombre, int edad, String sexo){
        super(edad,nombre,sexo);
        this.setAreaLipieza(areaLipieza);
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
