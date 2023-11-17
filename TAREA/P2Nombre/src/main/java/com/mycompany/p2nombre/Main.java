/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p2nombre;

import javax.swing.JOptionPane;

public class Main{

    public static void main(String[] args) {
        String nom = "";
        nom = JOptionPane.showInputDialog("Ingrese su nombre: ");
        
        String apell = "";
        apell = JOptionPane.showInputDialog("Ingrese su apellido: ");
        
        System.out.println("Hola, como estas: " + nom + " " + apell + ".");
        
        JOptionPane.showMessageDialog(null, "Hola, como estas: " + nom + " " + apell + ".");
    }
}
