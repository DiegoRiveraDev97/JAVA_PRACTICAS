/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mavenproject1;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Anidadoif {

    public static void main(String[] args) {
       int edad;
       String sexo;
       
       edad= Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
       sexo= JOptionPane.showInputDialog("Escriba su sexo Femenino o Masculino");
       
       if(edad>=18 && "masculino".equals(sexo)){
          JOptionPane.showMessageDialog(null,"Eres mayor de edad y puedes prestar servicio militar");
        }else if(edad>=18 && "femenino".equals(sexo)){
          JOptionPane.showMessageDialog(null,"Eres mujer y no Puedes prestar servicio militar");  
        }else{
            if(edad<18 && "masculino".equals(sexo)  || "femenino".equals(sexo)){
          JOptionPane.showMessageDialog(null,"Eres muy joven, ponte a estudiar mejor");  
            }
        }

    
}
} 

