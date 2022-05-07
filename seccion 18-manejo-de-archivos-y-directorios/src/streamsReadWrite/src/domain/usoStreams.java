
package domain;

import java.io.*;
import java.nio.file.*;
public class usoStreams {
    static Path variablePath= Paths.get("c:/java/miArchivo.txt");
    static File variableFile=variablePath.toFile();
    
    public static void main(String args[]){
        escribeLineaEnArchivo("Primer linea de texto");
        escribeLineaEnArchivo("Segunda linea de texto");
        leeElArchivo();
    }
    
    
    static void escribeLineaEnArchivo(String linea){
        //try-with-resources
        try( PrintWriter outputStream = new PrintWriter(
                                        new BufferedWriter (
                                        new FileWriter (variableFile,true)))){
            
            outputStream.println(linea);
        }catch(IOException e){
            
        }
    }
    
    static void leeElArchivo(){
        if(Files.exists(variablePath)){
            try( BufferedReader inputStream = new BufferedReader(
                                              new FileReader(variableFile))){
                String linea =inputStream.readLine();
                while(linea!=null){  // prevenir un error EOFException
                    System.out.println(linea);
                    linea =inputStream.readLine();
                }
                
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}

