/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso2209;

import ico.fes.cosas. Reloj;

/**
 *
 * @author Alexander Moore
 */
public class Repaso2209{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Reloj wacho = new Reloj(); // Clase, Objeto --> Constructor
        wacho.setHora(23);
        wacho.setMinutos(55);
        wacho.setSegundos(33);
        
     
        
        while(true){
        wacho.incrementarSegundo();
        wacho.mostrarHoraActual();
    }
        
    }
   
}
