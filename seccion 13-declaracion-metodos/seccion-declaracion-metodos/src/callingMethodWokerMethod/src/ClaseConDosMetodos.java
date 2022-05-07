
public class ClaseConDosMetodos {
    
    //calling method
    public void calcula(){
        int x = 4, y=5;
        int z= multiplicacion(x,y);
        System.out.println(x +" X " + y + " es igual a " +  z);
    }
    
    //worker method
    public int multiplicacion(int num1, int num2){
        return num1*num2;
    }
}
