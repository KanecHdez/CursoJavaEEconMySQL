
package com.domain;
public abstract class Figura {
    private int ancho, alto;

    public Figura(){
        this.alto=4;
        this.ancho=5;
    }
    
    public Figura(int ancho, int alto){
        this.alto=alto;
        this.ancho=ancho;
    }
   
    public void mostrarDatos(){
        System.out.println("El ancho capturado es: " + this.ancho);
        System.out.println("El alto capturado es: " + this.alto);
    }
    
    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    public abstract float getArea();
}
