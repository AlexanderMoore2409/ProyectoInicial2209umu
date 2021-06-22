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
public class Muro {
    float alto;
    float ancho;
    float largo;
    Color color;
    private Ventana[] ventanas;
    private Puerta puerta;

    public Muro() {
    }

    public Muro(float alto, float ancho, float largo, Color color, Ventana[] ventanas, Puerta puerta) {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
        this.color = color;
        this.ventanas = ventanas;
        this.puerta = puerta;
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

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Ventana[] getVentanas() {
        return ventanas;
    }

    public void setVentanas(Ventana[] ventanas) {
        this.ventanas = ventanas;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    @Override
    public String toString() {
        return "Muro{" + "alto=" + alto + ", ancho=" + ancho + ", largo=" + largo + ", color=" + color + ", ventanas=" + ventanas + ", puerta=" + puerta + '}';
    }
    
    public void tirar(){
        System.out.println("Tirando el Muro");
}
    
    }


    
