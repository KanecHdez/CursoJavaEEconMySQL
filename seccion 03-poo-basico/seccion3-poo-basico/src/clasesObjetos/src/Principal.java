
public class Principal {
    public static void main(String args[]){
        Persona p1= new Persona("Juan","Perez",22,"Masculino");
        Persona p2= new Persona("María","Perez",30,"Femenino");
        
        p1=p2;
        
        p2.asignaNombre("Lucia");
        System.out.println(p1.regresaNombre());
        System.out.println(p1.regresaEdad());
        System.out.println(p1.regresaGenero());
        System.out.println(p1.regresaApellido());
        
        
        System.out.println(p2.regresaNombre());
        System.out.println(p2.regresaEdad());
        System.out.println(p2.regresaGenero());
        System.out.println(p2.regresaApellido());
     
        String var1="hola";
        String var2="hola";
        String var3=new String("hola");
    }
}
