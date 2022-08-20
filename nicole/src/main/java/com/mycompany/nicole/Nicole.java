/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.nicole;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Nicole {

    public static void main(String[] args) {
        
    String nombre=JOptionPane.showInputDialog("Ingrese su nombre");
    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
    
    
    cumpleaños cumple=new cumpleaños();
    String mensaj=cumple.mensaje(nombre);
    int numers=cumple.numero(edad);
    cumple.mostrarDatos(mensaj,numers);
    
        
        
    }
}
