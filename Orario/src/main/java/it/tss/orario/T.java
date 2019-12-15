package it.tss.orario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fatimatou Diallo
 */
public class T {

    private int h, m, s;

    public T(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public boolean validaOra() {

        if (h < 0 || h > 23) {
            return false;
        }
        
        if (m < 0 || m > 59) {
            return false;
        }
        
        if (s < 0 || s > 59) {
            return false;
        }

        return true;
    }
    
    public T aggiungi(int ore, int minuti, int secondi){
        
        int ticks;
        T risultato = new T(0, 0, 0);
        
        ticks = this.s + (this.m * 60) + (this.h * 3600);
        
        ticks = ticks + ((ore * 3600) + (minuti * 60) + secondi);
        
        risultato.s = ticks % 60;
        risultato.m = (ticks / 60) % 60;
        risultato.h = (ticks / 3600) % 24;
        
        return risultato;
    }
    
    public T aggiungi(T other){
        
        int ticks;
        T risultato = new T(0, 0, 0);
        
        ticks = this.s + (this.m * 60) + (this.h * 3600);
        
        ticks = ticks + ((other.h * 3600) + (other.m * 60) + other.s);
        
        risultato.s = ticks % 60;
        risultato.m = (ticks / 60) % 60;
        risultato.h = (ticks / 3600) % 24;
        
        return risultato;
    }
    
    public T sostrai(int ore, int minuti, int secondi)
    {
        int ticks;
        T risultato = new T(0, 0, 0);
        
        ticks = this.s + (this.m * 60) + (this.h * 3600);
        
        ticks = ticks - ((ore * 3600) + (minuti * 60) + secondi);
        
        risultato.s = ticks % 60;
        risultato.m = (ticks / 60) % 60;
        risultato.h = (ticks / 3600) % 24;
        
        return risultato;
    }
    
    public T sostrai(T other)
    {
        T risultato = new T(0, 0, 0);
        
        int thisTicks  = this.s  + (this.m  * 60) + (this.h * 3600);
        int otherTicks = other.s + (other.m * 60) + (other.h * 3600);
        
        int ticks = thisTicks - otherTicks;
        
        risultato.s = ticks % 60;
        risultato.m = (ticks / 60) % 60;
        risultato.h = (ticks / 3600) % 24;
        
        return risultato;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.h;
        hash = 17 * hash + this.m;
        hash = 17 * hash + this.s;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final T other = (T) obj;
        if (this.h != other.h) {
            return false;
        }
        if (this.m != other.m) {
            return false;
        }
        if (this.s != other.s) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return (h + ":" + m + ":" + s);
    }

}
