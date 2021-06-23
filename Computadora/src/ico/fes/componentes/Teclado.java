/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author Calanda
 */
public class Teclado {
    private String marca;
    private String modelo;
    private int numeroDeTeclas;
    private int multimadia;

    public Teclado() {
    }

    public Teclado(String marca, String modelo, int numeroDeTeclas, int multimadia) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroDeTeclas = numeroDeTeclas;
        this.multimadia = multimadia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroDeTeclas() {
        return numeroDeTeclas;
    }

    public void setNumeroDeTeclas(int numeroDeTeclas) {
        this.numeroDeTeclas = numeroDeTeclas;
    }

    public int getMultimadia() {
        return multimadia;
    }

    public void setMultimadia(int multimadia) {
        this.multimadia = multimadia;
    }

    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + ", modelo=" + modelo + ", numeroDeTeclas=" + numeroDeTeclas + ", multimadia=" + multimadia + '}';
    }
    
    
}
