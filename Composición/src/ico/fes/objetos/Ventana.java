/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.objetos;

import java.awt.Color;

/**
 *
 * @author Alexander
 */
public class Ventana {
    Color color;
    float alto;
    float ancho;

    public Ventana() {
    }

    public Ventana(Color color, float alto, float ancho) {
        this.color = color;
        this.alto = alto;
        this.ancho = ancho;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }
    
   

    @Override
    public String toString() {
        return "Ventana{" + "color=" + color + ", alto=" + alto + ", ancho=" + ancho + '}';
    }
     public void cerrar() {
        System.out.println("Cerrando Ventana");
    }
    public void abrir () {
        System.out.println("Abriendo Ventana");
    
}
    
    
}
