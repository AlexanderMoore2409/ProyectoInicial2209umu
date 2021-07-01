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
public class ProfesorDeProgramacion extends Profesor implements Programador {
    int aniosexperiancia;
    String lnguajeDeProgramacion;

    public ProfesorDeProgramacion() {
    }

    public ProfesorDeProgramacion(int aniosexperiancia, String lnguajeDeProgramacion) {
        this.aniosexperiancia = aniosexperiancia;
        this.lnguajeDeProgramacion = lnguajeDeProgramacion;
    }

    public ProfesorDeProgramacion(int aniosexperiancia, String lnguajeDeProgramacion, String carrera, int antiguedad) {
        super(carrera, antiguedad);
        this.aniosexperiancia = aniosexperiancia;
        this.lnguajeDeProgramacion = lnguajeDeProgramacion;
    }

    public ProfesorDeProgramacion(int aniosexperiancia, String lnguajeDeProgramacion, String carrera, int antiguedad, String Nombre, int Edad) {
        super(carrera, antiguedad, Nombre, Edad);
        this.aniosexperiancia = aniosexperiancia;
        this.lnguajeDeProgramacion = lnguajeDeProgramacion;
    }

    public int getAniosexperiancia() {
        return aniosexperiancia;
    }

    public void setAniosexperiancia(int aniosexperiancia) {
        this.aniosexperiancia = aniosexperiancia;
    }

    public String getLnguajeDeProgramacion() {
        return lnguajeDeProgramacion;
    }

    public void setLnguajeDeProgramacion(String lnguajeDeProgramacion) {
        this.lnguajeDeProgramacion = lnguajeDeProgramacion;
    }

    @Override
    public String toString() {
        return super.toString()+ "ProfesorDeProgramacion{" + "aniosexperiancia=" + aniosexperiancia + ", lnguajeDeProgramacion=" + lnguajeDeProgramacion + '}';
    }

    @Override
    public int programar() {
        System.out.println("Programando en lenguaje"+ this.lnguajeDeProgramacion);
        return 1;
   }

    @Override
    public void probarCodigo() {
        System.out.println("Probando el codigo recien escrito...");
    }
    
    
}
