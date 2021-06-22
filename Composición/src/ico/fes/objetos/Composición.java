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
public class Composición {
    public static void main (String [] args){
        Muro ml = new Muro (2.5f, 4.5f, 3.5f, Color.gray, new Ventana[0], new Puerta("Madera",Color.white, false));
        System.out.println(ml.getAlto()+"mts. de alto");
        System.out.println(ml.getPuerta().getMaterial());
        System.out.println(ml);
          
        
    
    }
    
}
