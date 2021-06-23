
import ico.fes.componentes.CPU;
import ico.fes.componentes.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Calanda
 */
public class Computador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CPU cpu1 = new CPU("HP","Notebook",250);
        Computadora computadora1 = new Computadora("HP","Notebook","HP","LED","Atheris","Omen","Acer","LED",7, (int) 2.5,"alambrico",17,6);
        Monitor monitor1 = new Monitor("Acer","LED",14);
        Mouse mouse1= new Mouse("Atheris","Omen","Alambrico");
        Teclado teclado1 = new Teclado("HP","TM",15,17);
        System.out.println("Marca de CPU es:"+cpu1.getMarca());
        System.out.println("Modelo de CPU es:"+cpu1.getModelo());
        System.out.println("velocidad de CPU es:"+cpu1.getVelocidadProcesador());
        
        System.out.println("Marca de Computadora es:"+computadora1.getMarca());
        System.out.println("Modelo de Computadora es:"+computadora1.getMarca());
        System.out.println("Marca de teclado de Computadora es:"+computadora1.getMarcaTeclado());
        System.out.println("Modelo de teclado de Computadora es:"+computadora1.getModeloTeclado());
        System.out.println("Marca de mouse de Computadora es:"+computadora1.getMarcaMouse());
        System.out.println("Modelo de mouse de Computadora es:"+computadora1.getModeloMouse());
        System.out.println("Marca de monitor de Computadora es:"+computadora1.getMarcaMmonitor());
        System.out.println("Modelo de monitor de Computadora es:"+computadora1.getModeloMonitor());
        System.out.println("Pulgadas de monitor de Computadora es:"+computadora1.getPulgadasMonitor());
        System.out.println("Velocidad de procesador de Computadora es:"+computadora1.getVelocidadProcesador());
        System.out.println("Tipo de mouse de Computadora es:"+computadora1.getTipoMouse());
        System.out.println("Numero de teclas de Computadora es:"+computadora1.getNumeroTeclas());
        System.out.println("Multimedia de Computadora es:"+computadora1.getMultimedia());
        
        System.out.println("Marca de Monitor es:"+monitor1.getMarca());
        System.out.println("Modelo de Monitor es:"+monitor1.getModelo());
        System.out.println("pulgadas de Monitor es:"+monitor1.getPulgadas());
        
        System.out.println("Marca de Mouse es:"+mouse1.getMarca());
        System.out.println("Modelo de Mouse es:"+mouse1.getModelo());
        System.out.println("Tipo de Mouse es:"+mouse1.getTipo());
        
        System.out.println("Marca de Teclado es:"+teclado1.getMarca());
        System.out.println("Modelo de Teclado es:"+teclado1.getModelo());
        System.out.println("numero de teclas de Teclado es:"+teclado1.getNumeroDeTeclas());
        System.out.println("Multimedia de Teclado es:"+teclado1.getMultimadia());
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
