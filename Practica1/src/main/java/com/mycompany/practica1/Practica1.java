/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica1;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Practica1 {

    public static void main(String[] args) {
        
       String name;
       int age;
       double cash;
       
       
       name = JOptionPane.showInputDialog("Write your name! ");
       
       age = Integer.parseInt(JOptionPane.showInputDialog("Write your age! "));
       
       cash =Double.parseDouble(JOptionPane.showInputDialog("Write your total cash! "));
       
       JOptionPane.showMessageDialog(null,"Your name is: "+name);
       JOptionPane.showMessageDialog(null,"Your age is: "+age);
       JOptionPane.showMessageDialog(null,"Your total cash is: "+cash);
       
        
        
        
       
    }
}
