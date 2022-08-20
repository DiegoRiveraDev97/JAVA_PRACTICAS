/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.trycatch;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Trycatch {

    public static void main(String[] args) {

        try {
            int valor1, valor2, resultado;

            Scanner entrada = new Scanner(System.in);

            System.out.println("Ingrese el primer numero: ");
            valor1 = entrada.nextInt();

            System.out.println("Ingrese el segundo numero: ");
            valor2 = entrada.nextInt();

            resultado = valor1 / valor2;

            System.out.println("El resultado de la diviSion es: " + resultado);

        } catch (Exception e) {
            System.out.println("error!!!!!!"+ e);

        }finally{
            System.out.println("Gracias");
        }

    }
}
