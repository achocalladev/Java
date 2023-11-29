/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proycnumero;

import javax.swing.JOptionPane;

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
    
//    Avanze clase 21 de Nov
    
    public int PrimerDigito(){
        int aux = n;
        int res = 0;
        while (aux != 0){
            res = aux%10;
            aux = aux/10;
        }
        return res;
    }
    
    public int UltimoDigito(){
        int aux = n;
        int res = aux%10;
        return res;
    }
    
    public void Intertir(){
        int aux = n;
        int res = 0;
        int NewNum = 0;
        
        while(aux != 0){
            res = aux%10;
            NewNum =  NewNum * 10 + res;
            aux = aux/10;
        }
        n = NewNum;
//      this.SetNumero(NewNum);
        
    }
    
    public void Insertar (int posi, int valor){
        this.Intertir();
        int aux = this.GetNumero();
        int NewNum = 0;
        int res = 0;
        int i = 1;
        while (i < posi){
            res = aux%10;
            NewNum = NewNum * 10 +res;
            aux = aux / 10;
            i++;
        }
        
        NewNum = NewNum * 10 + res;
        
        while (aux != 0){
            res = aux % 10;
            NewNum = NewNum * 10 + res;
            aux = aux / 10;
        }
        this.SetNumero(NewNum);
//        n = NewNum;
    }    
    
//    Elimina un digito pasandole el valor
    public void EliminarDigito(int val){
        
        this.Intertir();
        
        int aux = n;
        int res;
        int aux2 = 0;
        
        while(aux != 0){
            res = aux%10;
            
            if(res != val){
                aux2 = (aux2 * 10) + res;
            }
            aux = aux/10;
        }
        
        this.SetNumero(aux2);
    }
    
//    Elimina un digito pasandole la posicion
    public void Eliminar(int posi){
        this.Intertir();
        int aux = n;
        int NewNum, res;
        NewNum = 0;
        int i = 1;
        
        while (i<posi){
            res = aux%10;
            NewNum = NewNum * 10 + res;
            aux = aux / 10;
            i++;
        }
        
        aux = aux / 10;
        
        while (aux != 0){
            res = aux % 10;
            NewNum = NewNum * 10 + res;
            aux = aux / 10;
        }
        this.SetNumero(NewNum);
    }
    
    public void VerificarCapicua(){
        int aux = n;
        this.Intertir();
        if (aux == n){
            JOptionPane.showMessageDialog(null, "CAPICUA");
        } else {
            JOptionPane.showMessageDialog(null, "NO ES CAPICUA");
        }
        this.Intertir();
    }

}
