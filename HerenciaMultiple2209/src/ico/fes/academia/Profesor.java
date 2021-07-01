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
public class Profesor extends Persona {
    String carrera;
    int antiguedad;

    public Profesor() {
    }

    public Profesor(String carrera, int antiguedad) {
        this.carrera = carrera;
        this.antiguedad = antiguedad;
    }

    public Profesor(String carrera, int antiguedad, String Nombre, int Edad) {
        super(Nombre, Edad);
        this.carrera = carrera;
        this.antiguedad = antiguedad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return super.toString()+"Profesor{" + "carrera=" + carrera + ", antiguedad=" + antiguedad + '}';
    }
    
    public void asistir(){
        System.out.println("Firmando entrada...");
    }
     public void dictarClase(){
        System.out.println("Dictando clase...");
    }
    
}
