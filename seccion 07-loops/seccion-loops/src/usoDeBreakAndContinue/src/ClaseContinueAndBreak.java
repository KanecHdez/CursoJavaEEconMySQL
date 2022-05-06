
public class ClaseContinueAndBreak {

    public static void main(String args[]) {
        ClaseContinueAndBreak objeto = new ClaseContinueAndBreak();
        objeto.utilizaContinue();
    }

    public void utilizaContinue(){
        String frase = "Anita lava la tina";
        for(int i=0 ; i<frase.length() ; i++){
            char caracter =frase.charAt(i);
            
            if(caracter=='a' || caracter=='A' ){
                continue;
            }
            
            System.out.println(caracter);
        }
    }
    
    public void utilizaBreak() {

        //break utilizando for
        /*String frase = "Anita lava la tina";
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            System.out.println(caracter);
            if (caracter == 'v') {
                System.out.println("Si existe la letra t (utilizando un ciclo for)");
                break;
            }
        }
        */
        //break utilizando for
        String frase1 = "Anita lava la tina";
        int i = 0;
        while (i < frase1.length()) {
             char caracter = frase1.charAt(i);
             System.out.println(caracter);
             
             if (caracter == 't') {
                System.out.println("Si existe la letra t (utilizando un ciclo while)");
                break;
            }
            i++; 
             
        }
    }
}

