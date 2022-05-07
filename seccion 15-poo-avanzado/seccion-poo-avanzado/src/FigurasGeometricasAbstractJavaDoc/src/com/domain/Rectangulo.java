
package com.domain;
/**
 * 
 * @author Tinajero
 */
public class Rectangulo extends Figura {
    //@Override
    /**
     * este método regresa un float que representa el area de un rectangulo
     * @return regresa un float
     */
    public float getArea() {
        return this.getAlto()*this.getAncho();
    }

}
