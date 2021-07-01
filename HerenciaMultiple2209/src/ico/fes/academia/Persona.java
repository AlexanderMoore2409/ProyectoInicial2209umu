/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.academia;

/**
 *
 * @author Calanda
 */
public class Persona {
    String Nombre;
    int Edad;
    private String comer;
    private String nombre;

    public Persona() {
    }

    public Persona(String Nombre, int Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Edad=" + Edad + '}';
    }
    
    public void dormir(){
        System.out.println(this.nombre +"Esta durmiendo");
    
    }
    
     public void comer(){
        System.out.println(this.comer +"Esta comiendo");
    
    }
    
}
