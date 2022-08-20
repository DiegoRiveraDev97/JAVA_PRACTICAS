/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package colores1;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego, Nicolle, David
 */
public class Colores1 extends colortable {
    
    //CLASE PRINCIPAL PARA EJECUTAR EL PROGRAMA POR MEDIO DE LA HERENCIA

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Disfruta esta aplicacion de colores");
        JOptionPane.showMessageDialog(null,"Desarrollada por : Diego Rivera, Nicole cardozo, David Tapiero");
        
        
        
        
        //METODO QUE INICIA EL PROGRAMA
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new colortable().setVisible(true);
            }
        });
    }
}
