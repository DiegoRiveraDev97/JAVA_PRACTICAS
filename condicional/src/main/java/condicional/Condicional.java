/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package condicional;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Condicional {

    public static void main(String[] args) {
        
        int num,valor=9;
        
       num= Integer.parseInt(JOptionPane.showInputDialog("Digite su numero"));
       
       if (num == valor){
           JOptionPane.showMessageDialog(null,"El numero ingresado es el 9");
       }
       else{
          JOptionPane.showMessageDialog(null,"El numero ingresado es diferente de 9"); 
       }
    }
}
