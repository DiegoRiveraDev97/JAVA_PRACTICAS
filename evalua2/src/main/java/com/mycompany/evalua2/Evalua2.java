/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.evalua2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Evalua2 {

    public static void main(String[] args) {
        // array con su respectivo tamaño
        int [] valor = new int[5];
        // Variables
        int sumPo = 0, sumNeg = 0;
        int contPos = 0;
        int contNeg = 0;
        //Creacion de objeto Scanner para ingresar datos
        Scanner tecla = new Scanner(System.in);
        
        //Solicitud de datos por consola a usuario
        System.out.println("Ingrese 5 valores");
        
        //Inicializamos el iterador para que se sume hasta llegar al tamaño del arreglo
        for (int i = 0; i < valor.length; i++) {

            valor[i] = tecla.nextInt();//el arreglo almacena el numero tomado por consola
            
            if (valor[i] > 0) {
                sumPo = sumPo + valor[i];//cuando el numero es positivo se almacena aqui
                contPos++;//se almacenan solo los positivos
            } else {
                sumNeg = sumNeg + valor[i];//cuando negativos se almacenan aqui
                contNeg++;//se almacenan solo negativos
            }
             //se imprime el valor contenido en las variables
            System.out.println("El promedio de positivos es: " + sumPo /contPos);
            System.out.println("El promedio de negativos es: " + sumNeg / contNeg);
            System.out.println("La cantidad de positivos  es: " + contPos);
            System.out.println("La cantidad de negativos es: " + contPos);

        }

    }
}
