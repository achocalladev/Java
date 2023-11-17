/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p7radicalpotencia;

/**
 *
 * @author achocalla.dev
 */
public class CRadicalPotencia {
    
    private int a;
    private int b;
    private int c;
    
    // Metodo constructor
    public CRadicalPotencia(){
        a = 0;
        b = 1;
        c = 1;
    }
    
    public void ponerBase(int base){
        a = base;
    }
    public void ponerNumExp(){
        b = 1;
    }
    public void ponerDenExp(int den){
        c = den;
    }
    
    public int sacarBase(){
        return (a);
    }
    public int sacarNumExp(){
        return (b);
    }
    public int sacarDenExp(){
        return (c);
    }
    
}
