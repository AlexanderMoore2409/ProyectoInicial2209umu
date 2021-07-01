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
public class Guitarra implements Instrumento {
    int numeroCuerdas;
    String tipo;
    String material;
    private int Instrumento;

    public Guitarra() {
    }

    public Guitarra(int numeroCuerdas, String tipo, String material) {
        this.numeroCuerdas = numeroCuerdas;
        this.tipo = tipo;
        this.material = material;
    }

    public Guitarra(int numeroCuerdas, String tipo, String material, int Instrumento) {
        this.numeroCuerdas = numeroCuerdas;
        this.tipo = tipo;
        this.material = material;
        this.Instrumento = Instrumento;
    }
    
    
    
    @Override
    public void sonar(){
        System.out.println("Emitiendo un sonido...");
        System.out.println("tran tran...");
    }
    @Override
    public void afinar(){
        System.out.println("Afinando el instrumento...");
        System.out.println("Pisas traste 5 en cuerda 6 e igualas tonos...");
        System.out.println("Pisas traste 5 en cuerda 5 e igualas tonos...");
        System.out.println("Pisas traste 5 en cuerda 4 e igualas tonos...");
        System.out.println("Pisas traste 5 en cuerda 3 e igualas tonos...");
        System.out.println("Pisas traste 5 en cuerda 2 e igualas tonos...");
    }
    @Override
    public boolean limpiar(){
        System.out.println("Limpiando el instrumento...");
        System.out.println("Llimpindo brazo...");
        System.out.println("Llimpiando Cuerpo...");
        System.out.println("Limpiando caja de resonancia...");
        return true;
    }

    public int getNumeroCuerdas() {
        return numeroCuerdas;
    }

    public void setNumeroCuerdas(int numeroCuerdas) {
        this.numeroCuerdas = numeroCuerdas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getInstrumento() {
        return Instrumento;
    }

    public void setInstrumento(int Instrumento) {
        this.Instrumento = Instrumento;
    }

    @Override
    public String toString() {
        return "Guitarra{" + "numeroCuerdas=" + numeroCuerdas + ", tipo=" + tipo + ", material=" + material + ", Instrumento=" + Instrumento + '}';
    }

    
    
    
}
