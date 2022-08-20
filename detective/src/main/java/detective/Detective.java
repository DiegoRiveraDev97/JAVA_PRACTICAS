/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package detective;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Detective {

    public static void main(String[] args) {
        String nombre,apellido;
        
        nombre= JOptionPane.showInputDialog("Ingrese su nombre");
        apellido= JOptionPane.showInputDialog("Ingrese su apellido");
        
        if("adriana".equals(nombre) && !"rincon".equals(apellido)){
            JOptionPane.showMessageDialog(null,"El nombre es correcto pero el apellido es incorrecto");
        }else{ 
            if("adriana".equals(nombre) && !"rincon".equals(apellido)){
            JOptionPane.showMessageDialog(null,"El nombre es correcto pero el apellido es incorrecto");
        }else{
            if(!"adriana".equals(nombre) && "rincon".equals(apellido)){
                JOptionPane.showMessageDialog(null,"El nombre es incorrecto pero el apellido es correcto");
                
            }else{
                if("adriana".equals(nombre) && "rincon".equals(apellido)){
                   JOptionPane.showMessageDialog(null,"El nombre y apellido es correcto "); 
                }else if(!"adriana".equals(nombre) && !"rincon".equals(apellido)){
                    JOptionPane.showMessageDialog(null,"ni nombre ni apellido brutos ");    
                    
                }else{
                    JOptionPane.showMessageDialog(null,"no tiene acceso ");
                }
                
            }
            
        }
        
    }
}
}