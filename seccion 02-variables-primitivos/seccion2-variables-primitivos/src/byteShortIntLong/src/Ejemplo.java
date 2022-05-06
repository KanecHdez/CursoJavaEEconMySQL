
public class Ejemplo {
   byte miByteValorMin=-128;               //un byte utiliza 8 bits
   byte miByteValorMax=127;
   
   short miShortValorMin=-32768;           //un short utiliza 16 bits  
   short miShortValorMax=32767;
   
   int miIntValorMin=-2147483648;         //un int utiliza 32 bits  
   int miIntValorMax=2147483647;
   
   long myLongValorMin=-9223372036854775808L;    //un long utiliza 64 bits
   long myLongValorMax=9223372036854775807L;
   
   
   public static void main(String args[]){
       Ejemplo ejem = new Ejemplo();
       ejem.mostrarInformacion();
   }
   
   
   public void mostrarInformacion(){
       System.out.println("Valor minimo de un byte :" + miByteValorMin + " valor maximo ="+ miByteValorMax + " y utiliza 8 bits");
       System.out.println("Valor minimo de un short :" + miShortValorMin + " valor maximo ="+ miShortValorMax + " y utiliza 16 bits");
       System.out.println("Valor minimo de un int :" + miIntValorMin + " valor maximo ="+ miIntValorMax + " y utiliza 32 bits");
       System.out.println("Valor minimo de un long :" + myLongValorMin + " valor maximo ="+ myLongValorMax + " y utiliza 64 bits");
       
   }
   
}
