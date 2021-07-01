/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.musica;

/**
 *
 * @author Calanda
 */
public interface Instrumento {
    
    public static final int FLAUTA=1;
    public static final int GUITARRA=2;
     public static final int TROMPETA= 3; 
     
    public abstract void afinar();
    public abstract boolean limpiar();
    public abstract void sonar();
    
    
}
