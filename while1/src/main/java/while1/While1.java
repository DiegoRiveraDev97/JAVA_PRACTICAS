/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package while1;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class While1 {

    public static void main(String[] args) {
        int i=1, contador;
        String nombre;
        nombre = JOptionPane.showInputDialog("digite un nombre");
        
        contador = Integer.parseInt(JOptionPane.showInputDialog("cuantos numeros deseas ver"));
        
        while(i<=contador){
            JOptionPane.showMessageDialog(null, "number"+i);
            i++;
        }
            
       
    }
}
