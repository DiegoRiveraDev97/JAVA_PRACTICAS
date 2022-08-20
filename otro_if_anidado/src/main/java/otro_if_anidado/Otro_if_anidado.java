/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package otro_if_anidado;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Otro_if_anidado {

    public static void main(String[] args) {
        int valor;
        
        valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un dia de la semana en numero del 1 al 7"));
        if(valor==1){   
           JOptionPane.showMessageDialog(null,"El dia 1 es el Domingo"); 
        }else{
            if(valor==2){
             JOptionPane.showMessageDialog(null,"El dia 2 es el Lunes");   
            }else{
               if(valor==3){
               JOptionPane.showMessageDialog(null,"El dia 3 es el Martes");    
               }else{
                  if(valor==4){
                    JOptionPane.showMessageDialog(null,"El dia 4 es el Miercoles");  
                  }else{
                     if(valor==5){
                       JOptionPane.showMessageDialog(null,"El dia 5 es el Jueves");  
                     }else{
                         if(valor==6){
                             JOptionPane.showMessageDialog(null,"El dia 6 es el Vierneesss");
                         }else if(valor==7){
                            JOptionPane.showMessageDialog(null,"El dia 7 es el Sabadoooooo"); 
                         }else{
                             JOptionPane.showMessageDialog(null,"El dia es desconocido");
                         }
                     }
                  } 
               }
            }
        }
    
    
}
}