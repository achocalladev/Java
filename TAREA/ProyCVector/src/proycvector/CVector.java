/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proycvector;

import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author achocalla.dev
 */
public class CVector {
    
    private int V[] = new int[12];
    private int dim;
    
    public CVector() {
        dim = -1;
    }

    public void SetValor(int posi, int valor){
        V[posi] = valor;
    }
    
    public int GetValor(int posi){
        return (V[posi]);
    }
    
    public int Cantidad(){
        return (dim + 1);
    }
    
    public void SetDim(int CantElem){
        dim = CantElem - 1;
    }
    
    public int GetDim(){
        return dim;
    }
    
    public void CargarVector() {
        String cad = "";
        int valor;
        
        for (int i = 0; i <= dim; i++) {
            
            cad = JOptionPane.showInputDialog("Valor para posicion " + i);
            valor = Integer.parseInt(cad);
            V[i] = valor;
        }
    }
    
    public void MostrarVector(JTable jTableVector) {
        
        for (int i = 0; i <= dim; i++) {
            jTableVector.setValueAt(V[i], i, 0);
        }
    }
   
}
