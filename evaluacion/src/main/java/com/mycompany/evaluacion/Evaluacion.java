/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.evaluacion;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego Rivera// 01-08-2022
 */
public class Evaluacion {

    public static void main(String[] args) {

        try {
            float [] valor = new float[6];// Se define un tamaño para el arreglo

            float sumaPos = 0, contPos = 0, sumaNeg = 0, contNeg = 0;

            Scanner entrada = new Scanner(System.in);// se crea un objeto para ingresar datos
            System.out.println("Ingrese los 6 numeros");
            //Double.parseDouble(JOptionPane.showInputDialog("Digite seis numeros"));

            for (int i = 0; i < valor.length; i++) {

                valor[i] = entrada.nextInt();

                if (valor[i] > 0) {
                    sumaPos = sumaPos + valor[i];
                    contPos++;
                } else {
                    sumaNeg = sumaNeg + valor[i];
                    contNeg++;

                }

            }
            //JOptionPane.showMessageDialog(null,"el promedio de los positivos es"+sumaPos/contPos);
            System.out.println("el promedio de los positivos es:  " + (sumaPos / contPos));
            System.out.println("el promedio de los negativos es:  " + (sumaNeg / contNeg));
            System.out.println("Cantidad de positivos es:  " + contPos);
            System.out.println("Cantidad de negativos es:  " + contNeg);

        } catch (Exception e) {
            System.out.println("Ha cometido un error!!!!!!" + e);
        } finally {
            System.out.println("Gracias por usar nuestro sistema");
        }

    }

}
