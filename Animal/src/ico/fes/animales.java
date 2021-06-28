/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes;

/**
 *
 * @author Alex
 */
public class animales {
   
    private int NumeroPatas;
    private String Tipo;
    private int NumeroOrejas;

    public animales() {
    }

    public animales(int NumeroPatas, String Tipo, int NumeroOrejas) {
        this.NumeroPatas = NumeroPatas;
        this.Tipo = Tipo;
        this.NumeroOrejas = NumeroOrejas;
    }

    public int getNumeroPatas() {
        return NumeroPatas;
    }

    public void setNumeroPatas(int NumeroPatas) {
        this.NumeroPatas = NumeroPatas;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getNumeroOrejas() {
        return NumeroOrejas;
    }

    public void setNumeroOrejas(int NumeroOrejas) {
        this.NumeroOrejas = NumeroOrejas;
    }

    @Override
    public String toString() {
        return "animales{" + "NumeroPatas=" + NumeroPatas + ", Tipo=" + Tipo + ", NumeroOrejas=" + NumeroOrejas + '}';
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         animales a1 = new animales(4, "Domesticos", 2);
        System.out.println(a1);
        
        Perro p1 = new Perro ("Frenchpoodle","No","6 kilos", 6);
        System.out.println(p1);
        
        Gato g1 = new Gato ("Siames","No","15 kilos",7);
        System.out.println(g1);
        
        
    }
    
}
