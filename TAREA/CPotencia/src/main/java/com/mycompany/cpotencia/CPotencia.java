/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cpotencia;

public class CPotencia {
    
    private int base;
    private int expo;
    
public CPotencia(){
    base=0;
    expo=1;
}

public void PonerBase (int x){
    base=x;
}
public void ponerExpo (int y){
   expo=y; 
}

public int sacarBase(){
    return base;
}
public int sacarExpo(){
    return expo;    
}

public double resolver (int x, int y) {
    return Math.pow(x, y);
}

}
