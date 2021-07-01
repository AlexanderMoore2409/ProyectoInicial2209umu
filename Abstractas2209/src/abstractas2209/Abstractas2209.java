/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abstractas2209;

import ico.fes.musica.Bateria;
import ico.fes.musica.Guitarra;
import ico.fes.musica.Instrumento;

/**
 *
 * @author Calanda
 */
public class Abstractas2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Guitarra g1 = new Guitarra(6, "Acústica", "Madera", Instrumento.GUITARRA );
        g1.limpiar();
        g1.sonar();
        g1.afinar();
        System.out.println(g1);

        Bateria b1 = new Bateria(5, "Negras", 4);
        b1.sonar();
        b1.limpiar();
        b1.afinar();
        System.out.println( b1 );
        
        if(g1.getInstrumento() == Instrumento.GUITARRA){
            System.out.println("Es una guitarra!!!!");
        }
        
        
        
        
    }

}