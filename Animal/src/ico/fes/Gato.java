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
public class Gato extends animales{
private String Raza;    
private String Habla;
private String Pesa;
private int Edad;

    public Gato() {
    }

    public Gato(String Raza, String Habla, String Pesa, int Edad) {
        this.Raza = Raza;
        this.Habla = Habla;
        this.Pesa = Pesa;
        this.Edad = Edad;
    }

    public Gato(String Raza, String Habla, String Pesa, int Edad, int NumeroPatas, String Tipo, int NumeroOrejas) {
        super(NumeroPatas, Tipo, NumeroOrejas);
        this.Raza = Raza;
        this.Habla = Habla;
        this.Pesa = Pesa;
        this.Edad = Edad;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getHabla() {
        return Habla;
    }

    public void setHabla(String Habla) {
        this.Habla = Habla;
    }

    public String getPesa() {
        return Pesa;
    }

    public void setPesa(String Pesa) {
        this.Pesa = Pesa;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "Gato{" + "Raza=" + Raza + ", Habla=" + Habla + ", Pesa=" + Pesa + ", Edad=" + Edad + '}';
    }

   
}
