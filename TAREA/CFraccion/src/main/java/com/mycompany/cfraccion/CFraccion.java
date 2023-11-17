/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cfraccion;

public class CFraccion {
    
    private int num;
    private int den;
    
    public CFraccion() {
        num = 0;
        den = 1;
    }
    
    public void ponerNumerador(int x) {
        num = x;
    }
    public void ponerDenominador(int y){
        den=y;
    }
    
    public int sacarNumerador(){
        return num;
    }
    public int sacarDenominador(){
        return den;
    }
    
}
