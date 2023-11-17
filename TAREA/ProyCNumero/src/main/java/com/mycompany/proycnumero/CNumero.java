/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proycnumero;

/**
 *
 * @author achocalla.dev
 */
public class CNumero {
    
    private int n;
    
    public CNumero(){
        n = 0;
    }
    
    public void SetNumero(int val){
        n = val;
    }
    
    public int GetNumero(){
        return n;
    }
    
    public int CantidadDigitos(){
        int aux = n;
        int c=0;
        while (aux != 0) {
        aux=aux/10;
        c=c+1;
    }
        return c;
    }
    
    public int SumarDigitos(){
        int aux = n;
        int s = 0;
        int res;
        while(aux != 0){
            res = aux%10;
            s = s+res;
            aux=aux/10;
        }
        return s;
    }
    
    public int SumarPares(){
        int res;
        int s = 0;
        int aux = n;
        while(aux != 0){
            res = aux%10;
            
            if (res%2 == 0){
               s = s+res;
            }
            aux=aux/10;
        }
        return s;
    }
    
    
//    Tarea de la clase 16 de Nov
    public int SumarImpares(){
        int res;
        int s = 0;
        int aux = n;
        while(aux != 0){
            res = aux%10;
            
            if (res%2 != 0){
                s = s+res;
            }
            aux = aux/10;
        }
        return s;
    }
    
    public int SumarM3(){
        int res;
        int s = 0;
        int aux = n;
        while(aux != 0){
            res = aux%10;
            
            if (res%3 == 0){
                s = s+res;
            }
            aux = aux/10;
        }
        return s;
    }
    
    public int CantidadDigitosPares(){
        int res;
        int c = 0;
        int aux = n;
        
        while(aux != 0){
            res = aux%10;
            
            if (res%2 == 0){
                c = c+1;
            }
            aux = aux/10;
        }
        return c;
    }
    
    public int CantidadDigitosImpares(){
        int res;
        int c = 0;
        int aux = n;
        
        while(aux != 0){
            res = aux % 10;
            
            if (res%2 != 0){
                c = c+1;
            }
            aux = aux/10;
        }
        return c;
    }
    
    public int CantidadDigitosM3(){
        int res;
        int c = 0;
        int aux = n;
        
        while(aux != 0){
            res = aux%10;
            
            if (res%3 == 0){
                c = c+1;
            }
            aux = aux/10;
        }
        return c;
    }
    
    
    
}
