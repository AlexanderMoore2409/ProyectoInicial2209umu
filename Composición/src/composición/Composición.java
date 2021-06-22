package composición;

import ico.fes.objetos.Muro;
import ico.fes.objetos.Puerta;
import ico.fes.objetos.Ventana;
import java.awt.Color;


/**
 *
 * @author Admin
 */
public class Composición {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Muro m1 = new Muro(2.5f , 4.5f , 3.5f , Color.gray , null ,new Puerta("Madera" , Color.white, false) );
    
         System.out.println( m1.getAlto() + "mts. de alto");          
         System.out.println( m1.getPuerta().getMaterial());   
         System.out.println(m1);
         
        

    }
    
}
