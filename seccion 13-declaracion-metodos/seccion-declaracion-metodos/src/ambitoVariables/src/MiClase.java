public class MiClase {
    private int edad;
    static String nacionalidad="mexicana";
    public int getEdad(){
        return edad  ;
    }
    public void setEdad(int ed){
       edad= ed;
    }
    
    public String mayorDeEdad(int ed){
        int faltante;
        faltante=0;
        System.out.println(edad);
        
        if(ed>=18){
            return "Eres Mayor de edad y tu nacionalidad es: " + nacionalidad ;
        }
        else{
            faltante=18 - ed;
            return "Te faltan " + faltante + " años para ser mayor y tu nacionalidad es: " + nacionalidad;
        }
        
    }
}
