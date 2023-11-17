/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p3_suma;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String a = "";
        a = JOptionPane.showInputDialog("Ingrese el valor A:");
        int x = Integer.parseInt(a);
        
        String b = "";
        b = JOptionPane.showInputDialog("Ingrese el valor b:");
        int y = Integer.parseInt(b);
        
        int suma = x + y;
        System.out.println("La suma de a y b es: " + suma);
        JOptionPane.showMessageDialog(null, "La suma de a y b es: " + suma);
    }
}
