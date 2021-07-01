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
public class Bateria implements Instrumento{
    
    int numeroPlatillos;
    String colorBaquetas;
    int numeroTambores;

    public Bateria() {
    }

    public Bateria(int numeroPlatillos, String colorBaquetas, int numeroTambores) {
        this.numeroPlatillos = numeroPlatillos;
        this.colorBaquetas = colorBaquetas;
        this.numeroTambores = numeroTambores;
    }

    public int getNumeroPlatillos() {
        return numeroPlatillos;
    }

    public void setNumeroPlatillos(int numeroPlatillos) {
        this.numeroPlatillos = numeroPlatillos;
    }

    public String getColorBaquetas() {
        return colorBaquetas;
    }

    public void setColorBaquetas(String colorBaquetas) {
        this.colorBaquetas = colorBaquetas;
    }

    public int getNumeroTambores() {
        return numeroTambores;
    }

    public void setNumeroTambores(int numeroTambores) {
        this.numeroTambores = numeroTambores;
    }

    @Override
    public String toString() {
        return "Bateria{" + "numeroPlatillos=" + numeroPlatillos + ", colorBaquetas=" + colorBaquetas + ", numeroTambores=" + numeroTambores + '}';
    }

    @Override
    public void afinar() {
        System.out.println("Afinando bateria...");
        System.out.println("Afinando como se haga...");
       
        
    }

    @Override
    public boolean limpiar() {
        System.out.println("Limpiando Bateria...");
         System.out.println("Llimpiando platillos...");
         System.out.println("Limpiando bombos...");
         return true;
        
    }

    @Override
    public void sonar() {
        System.out.println("Sonando los tambores...");
       
    }

    
    
    

    
    
}
