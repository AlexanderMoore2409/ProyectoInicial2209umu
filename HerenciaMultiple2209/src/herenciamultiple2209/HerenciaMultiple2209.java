/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciamultiple2209;

import ico.fes.academia.ProfesorDeProgramacion;
import ico.fes.iu.MiVentana;

/**
 *
 * @author Calanda
 */
public class HerenciaMultiple2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ProfesorDeProgramacion profe= new ProfesorDeProgramacion(20,"Java","Ico",17,"Jesus",44);
        profe.dormir();
        profe.comer();
        profe.asistir();
        profe.dictarClase();
        profe.programar();
        profe.probarCodigo();
        System.out.println(profe); 
        
       MiVentana win1= new MiVentana();
    }
    
}
