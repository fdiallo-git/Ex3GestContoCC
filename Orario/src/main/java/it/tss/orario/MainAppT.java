package it.tss.orario;


import it.tss.orario.T;
import java.time.LocalTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fatimatou Diallo
 */
public class MainAppT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        T orario = new T(22, 03, 45);
        T ritardo = new T(3, 59, 45);
        
        T nuovoOrario = orario.aggiungi(ritardo);
        
        System.out.println("Nuovo orario: " + nuovoOrario);
        
    }
  
}
