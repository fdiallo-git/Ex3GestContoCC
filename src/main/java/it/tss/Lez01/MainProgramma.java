/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.Lez01;

/**
 *
 * @author tss
 */
public class MainProgramma {

    private int x = 10;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Dado dado = new Dado((byte)10);
        Dado dado = new Dado();

        Dado d1 = new Dado();

        Dado d2 = new Dado();
        
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println();

        for (int i = 0; i < 100; i++) {
            System.out.println("Risultato;" + d1.lancio() + " /" + d2.lancio());
        }

    }

}
