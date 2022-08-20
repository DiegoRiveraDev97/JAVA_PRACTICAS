/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejemplo2;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Ejemplo2 {
    public static void main(String[] args){
        
        int num1 , num2 ,multiplicacion ;
        
        
       num1 = Integer.parseInt(JOptionPane.showInputDialog("Write your number! "));
       num2 = Integer.parseInt(JOptionPane.showInputDialog("Write your number! "));
       multiplicacion = num1*num2;
     
       
       JOptionPane.showMessageDialog(null,"la multiplicacion es :"+multiplicacion);
       
       
    }      
}