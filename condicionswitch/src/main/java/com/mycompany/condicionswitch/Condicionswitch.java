/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.condicionswitch;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego 
 */
public class Condicionswitch {

    public static void main(String[] args) {
        
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero del 1 hasta 5"));
        // EL SWITCH PERMITE ALMACENAR N CONDICIONES
        switch(num){
            case 1: JOptionPane.showMessageDialog(null,"Es el numero 1");
            break; //BREAK PERMITE DETENER LA LECTURA DEL SISTEMA
            case 2: JOptionPane.showMessageDialog(null,"Es el numero 2");
            break;
            case 3: JOptionPane.showMessageDialog(null,"Es el numero 3");
            break;
            case 4: JOptionPane.showMessageDialog(null,"Es el numero 4");
            break;
            case 5: JOptionPane.showMessageDialog(null,"Es el numero 5");
            break;
            default: JOptionPane.showMessageDialog(null,"Esta fuera del rango");
            //DEFAULT ES EL OPUESTO DE CASE =ELSE
            
            
        }
        
    }
}
