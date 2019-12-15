/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.contocorrante;

import java.util.ArrayList;

/**
 *
 * @author Fatimatou Diallo
 */
public class AppMainGestCC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ContoCorrente mioConto = new ContoCorrente(100.0F);
        ArrayList<Float> ultimiMovimenti;
        
        mioConto.versa(1200);
        mioConto.preleva(300);
        mioConto.preleva(50);
        
        ultimiMovimenti = mioConto.dammiUltimiMovimenti(5);
        
        System.out.println("Il saldo è " + mioConto.getSaldo() + " Euro");
       
        for (Float movimento:ultimiMovimenti) {
            System.out.println("Movimento: " + movimento + " Euro"); 
        }
        
        mioConto.versa(500);
        mioConto.preleva(250);
        mioConto.preleva(80);
        mioConto.preleva(40);
        mioConto.preleva(20);
        mioConto.preleva(60);
        
        ultimiMovimenti = mioConto.dammiUltimiMovimenti(6);
        
        System.out.println("Il saldo è " + mioConto.getSaldo() + " Euro");
       
        for (int i = 0; i < ultimiMovimenti.size(); i++)
        {
           Float movimento = ultimiMovimenti.get(i);
           
           System.out.println("Movimento: " + movimento + " Euro"); 
        }
        
        /*
        for (Float movimento:ultimiMovimenti) {
            System.out.println("Movimento: " + movimento + " Euro"); 
        }
        */
           
    }

}

class ContoCorrente {

    public static final int NUMERO_MASSIMO_DI_MOVIMENTI = 100;

    private float saldo;
    private ArrayList<Float> listaMovimenti;

    public ContoCorrente(float sommaIniziale) {
        saldo = sommaIniziale;
        listaMovimenti = new ArrayList<Float>();
    }

    //prelievo
    public boolean preleva(float sommaDaPrelevare) {

        if (saldo >= sommaDaPrelevare) {
            saldo = saldo - sommaDaPrelevare;
            if (listaMovimenti.size() >= NUMERO_MASSIMO_DI_MOVIMENTI) {
                listaMovimenti.remove(0);
            }
            listaMovimenti.add(-sommaDaPrelevare);

            return true;
        }

        return false;
    }

    //versamento
    public void versa(float sommaDaVersare) {
        saldo = saldo + sommaDaVersare;
        if (listaMovimenti.size() >= NUMERO_MASSIMO_DI_MOVIMENTI) {
            listaMovimenti.remove(0);
        }
        listaMovimenti.add(sommaDaVersare);
    }

    /**
     * Restituisce la lista degli ultimi movimenti .
     *
     * @param numeroMovimenti
     * @return
     */
    public ArrayList<Float> dammiUltimiMovimenti(int numeroMovimenti) {

        ArrayList<Float> listaUltimiMovimenti = new ArrayList<Float>();

        int primoMovimento = listaMovimenti.size() - numeroMovimenti;

        if (primoMovimento < 0) {
            primoMovimento = 0;
        }

        for (int i = primoMovimento; i < listaMovimenti.size(); i++) {
            
            listaUltimiMovimenti.add( listaMovimenti.get(i) );
        }

        return listaUltimiMovimenti;
    }

    public float getSaldo() {
        return saldo;
    }

}
