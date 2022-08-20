/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Arreglos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int elementos;
        
        elementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos que desea"));
        
        char[] letras = new char[elementos];
        
        System.out.println("Digite los elementso del arreglo: ");
        for (int i=0;i<elementos;i++){
            System.out.println((i+1)+".Digite un caracter: ");
            letras[i] = entrada.next().charAt(0);
        }
        
        System.out.println("\nLos caracteres del arreglo son: ");
        
        for (int i=0;i<elementos;i++){
            System.out.print(letras[i]+" ");
        }
        
        
        
        
        
        
        
    }
}
