/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Calculadora extends calculador1{

    public static void main(String[] args) {
        //CLASE PRINCIPAL QUE EJECUTA EL PROGRAMA POR MEDIO DE LA HERENCIA
        // APLICANDO LO APRENDIDO EN CLASE
        
        JOptionPane.showMessageDialog(null,"Disfruta de esta calculadora desarrollada por los programadores Diego, david, nicole");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculador1().setVisible(true);
            }
        });
        
        
        
    }
}
