
public class SentenciasSwitch {

    public static void main(String args[]) {
        SentenciasSwitch objeto = new SentenciasSwitch();
        //objeto.imprimeProducto();
        //objeto.imprimeClave();
        objeto.diaDeLaSemana();
    }
    
    public void diaDeLaSemana(){
        int dia=3;
        switch (dia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: System.out.println("Este dia pertenece a un dia de la semana y no es fin de semana");
                   break;
            case 6: 
            case 7: System.out.println("Este dia pertenece fin de semana");
                   break;   
        }        
    }
    
    public void imprimeClave(){
         String nombreProducto="guayaba";
         
         switch (nombreProducto) {
            case "sandia":
                System.out.println("La clave de la sandia es = 001");
                break;
                
            case "melón":
                System.out.println("La clave del melón es = 002");
                break;
            default : System.out.println("El producto indicado no existe");    
                
         }       
    }
    
    
    public void imprimeProducto() {
        int podutoId = 5;

        switch (podutoId) {
            case 1:
                System.out.println("El producto tiene el id 1");
                break;
            case 2:
                System.out.println("El producto tiene el id 2");
                break;
            case 3:
                System.out.println("El producto tiene el id 3");
                break;
            default:
                System.out.println("El producto tiene un id invalido");
                break;
        }
    }
}
