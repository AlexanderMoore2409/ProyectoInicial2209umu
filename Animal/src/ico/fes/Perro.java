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
public class Perro extends animales {
    
private String Raza;    
private String Habla;
private String Pesa;
private int edad;

    public Perro() {
    }

    public Perro(String Raza, String Habla, String Pesa, int edad) {
        this.Raza = Raza;
        this.Habla = Habla;
        this.Pesa = Pesa;
        this.edad = edad;
    }

    public Perro(String Raza, String Habla, String Pesa, int edad, int NumeroPatas, String Tipo, int NumeroOrejas) {
        super(NumeroPatas, Tipo, NumeroOrejas);
        this.Raza = Raza;
        this.Habla = Habla;
        this.Pesa = Pesa;
        this.edad = edad;
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
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Perro{" + "Raza=" + Raza + ", Habla=" + Habla + ", Pesa=" + Pesa + ", edad=" + edad + '}';
    }

    
    
    
    
}
