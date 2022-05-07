/*
   aqui podemos escribir o varias lineas
   de código
*/

// esta es una linea para comentarios

package com.domain;

/**
 * clase abstracta que declara una figura en general
 * la cual contiene atritugos como ancho y alto
 * @author Felipe Robles
 * @version 1.1
 */
public abstract class Figura {
    private int ancho, alto;
     
    /**
     * este es el constructor principal e inicializa el alto y el ancho 
     * con valores fijos
     */
    public Figura(){
        this.alto=4;
        this.ancho=5;
    }
    
    /**
     * constructor que inicializa los atributos con los valores recibidos como parametros
     * @param ancho  este es el ancho de una figura
     * @param alto   este representa el alto de una figura
     */
    public Figura(int ancho, int alto){
        this.alto=alto;
        this.ancho=ancho;
    }
   
    /**
     * este metodo muestra la información de una figura como lo es ancho 
     * y alto
     */
    public void mostrarDatos(){
        System.out.println("El ancho capturado es: " + this.ancho);
        System.out.println("El alto capturado es: " + this.alto);
    }
    /**
     * regresa el ancho de una figura
     * @return este metodo regresa un int, el cual representa el ancho de
     * una figura
     * 
     */
    public int getAncho() {
        return ancho;
    }
    /**
     * asigna el ancho de una figura 
     * @param ancho parametro que representa el ancho de una figura
     */
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    /**
     * método que regresa un int, el cual representa el ancho de una figura
     * @return regresa el alto de una figura 
     */
    public int getAlto() {
        return alto;
    }
    /**
     * asigna el alto a una figura
     * @param alto representa el alto de una figura
     */
    public void setAlto(int alto) {
        this.alto = alto;
    }
    /**
     * metodo abstracto que regresa el area de una figura
     * el cual se implementara en las clases hijas
     * @return  regresa un float que representa el area de una figura
     */
    public abstract float getArea();
}
