/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package amortentia;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Amortentia {

    public static void main(String[] args) {
        String nombre,apellido;
        
        JOptionPane.showMessageDialog(null,"Este programa descubre quien te gusta verdaderamente");
        nombre= JOptionPane.showInputDialog("Escriba el nombre de la chica que te gusta: ");
        apellido= JOptionPane.showInputDialog("Escriba el apellido de la chica que te gusta: ");
        
        if(!"alejandra".equals(nombre) && !"aragon".equals(apellido)){
            JOptionPane.showMessageDialog(null,"Ese nombre y ese apellido no son los de la chica que te gusta");
            JOptionPane.showInputDialog("Escriba el nombre de la chica que te gusta: ");
            JOptionPane.showInputDialog("Escriba el apellido de la chica que te gusta: ");
        }else{
            if("alejandra".equals(nombre) && !"aragon".equals(apellido)){
               JOptionPane.showMessageDialog(null,"Ese nombre si se aproxima pero el apellido no"); 
               JOptionPane.showInputDialog("Escriba el nombre de la chica que te gusta: ");
               JOptionPane.showInputDialog("Escriba el apellido de la chica que te gusta: ");
            }else{
                if(!"alejandra".equals(nombre) && "aragon".equals(apellido)){
                      JOptionPane.showMessageDialog(null,"El nombre es incorrecto pero el appellido si es de la chica que te gusta");
                      JOptionPane.showInputDialog("Escriba el nombre de la chica que te gusta: ");
                      JOptionPane.showInputDialog("Escriba el apellido de la chica que te gusta: ");  
                }else{
                    if("alejandra".equals(nombre) && "aragon".equals(apellido)){
                  JOptionPane.showMessageDialog(null,"Ese si es el nombre y el apellido de la chica que te gusta");
                  JOptionPane.showMessageDialog(null,"Ve a conquistarla");
                    }
                          
                }
               
                
            }
        }
    }
}
