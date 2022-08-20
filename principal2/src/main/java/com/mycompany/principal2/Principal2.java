/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.principal2;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Principal2 {

    public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor uno"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor dos"));
        
        Operacion2 op= new Operacion2();
        int suma =op.sumar(n1,n2); 
        int resta =op.restar(n1,n2);
        int multi =op.multiplicar(n1,n2);
        int div =op.dividir(n1,n2);
        int resi =op.residuo(n1,n2);
        op.mostrarDatos(suma, resta, div, multi, resi);
        
        
    }
}
