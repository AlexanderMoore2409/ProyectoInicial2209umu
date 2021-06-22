/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.cosas;

/**
 *
 * @author Alexander Moore
 */
public class Reloj {
        private int hora;
    private int minutos;
    private int segundos;
    private boolean manecillas; //false = es digital
    private String marca;
    private int []alarma;
    private int[]fecha;

    public Reloj() { // Constructor por defecto
    }

    public Reloj(int hora, int minutos, int segundos, boolean manecillas, String marca, int[] alarma, int[] fecha) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
        this.manecillas = manecillas;
        this.marca = marca;
        this.alarma = alarma;
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public boolean isManecillas() {
        return manecillas;
    }

    public void setManecillas(boolean manecillas) {
        this.manecillas = manecillas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int[] getAlarma() {
        return alarma;
    }

    public void setAlarma(int[] alarma) {
        this.alarma = alarma;
    }

    public int[] getFecha() {
        return fecha;
    }

    public void setFecha(int[] fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Reloj{" + "hora=" + hora + ", minutos=" + minutos + ", segundos=" + segundos + ", manecillas=" + manecillas + ", marca=" + marca + ", alarma=" + alarma + ", fecha=" + fecha + '}';
    }
    
    public void mostrarHoraActual (){
    
    System.out.println(this.hora + ":" + this.minutos + ":" + this.segundos);

}
    public void incrementarSegundo(){
     
        if(this.segundos < 59){
            
            this.segundos ++;
        } else{
            this.incrementaMinuto();
            this.segundos=0;
        }
        
          try {
            Thread.sleep(1000);
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }
   

    public void incrementaMinuto(){
        if(this.minutos <59){
            this.minutos ++;
        }else{
            this.incrementarHora();
            this.minutos=0;
        }
    }
    public void incrementarHora(){
        if(this.hora < 23){
            this.hora++;
        }else{
            //incrementardia
            this.hora = 0;
        }
    }
 }


