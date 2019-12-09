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
public class App {

    public static void main(String[] args) {
        Dado d1 = new Dado();

        Object d2 = new Dado();

        System.out.println(d1.getClass());

        System.out.println(d2.getClass());

        if (d2.getClass().getSimpleName().equals("Dado")) {

            System.out.println(((Dado) d2).lancio());

        }

    }

}
