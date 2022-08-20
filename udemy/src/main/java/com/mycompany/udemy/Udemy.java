/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.udemy;

import static java.lang.Math.pow;

/**
 *
 * @author Diego
 */
public class Udemy {

    public static void main(String[] args) {
        String saludo = "Hola soy programador java";
        int edad = 25;
        float altura = 1.70f;
        double valorPI = 3.14151632;
        long distanciaSol = 123456789l;
        int longitud = saludo.length();
        char caracter = saludo.charAt(3);
        boolean vacio = saludo.isEmpty();
        boolean palabra = saludo.contains("Hola");
        String substring = saludo.substring(0, 7);
        // System.out.println(saludo+" "+longitud+" "+caracter+" "+vacio+" "+palabra+" "+substring);

        //System.out.println(String.format("Mi edad es %d",edad));
        //System.out.println(String.format("Mi altura es de: %f",altura , valorPI));
        /**
         * int edad=25; System.out.println("mi edad es: "+edad);
         *
         * float altura=1.70f; System.out.println("Mi altura es de: "+altura);
         *
         * double valorPI=3.14151632; System.out.println("El valor de PI es:
         * "+valorPI);
         *
         * long distanciaSol= 123456789l; System.out.println("La distncia al sol
         * es: "+distanciaSol);
         *
         * char inicial='j'; System.out.println("La inicial de mi nombre es:
         * "+inicial);
         *
         */
                        //ACTIVIDAD 1
        //Ejercicio 1 
        /**
         * int largo =15; int ancho = 23; int alto =12;
         *
         * int volumen = largo * ancho * alto;
         * System.out.println(String.format("El volumen del cubo es
         * %d",volumen));
         */
        //EJERCICIO 2
        /**
         * int m =12; int v = 3;
         *
         * double ec = (m * pow(v,2))/0.5;
         *
         * System.out.println(String.format("La energia sinetica es: %.2f",ec));
         */
        //EJERCICIO 3
        /**
         * char a = 'R'; long b = 1495970197; float c = 12.5f; boolean d = true;
         * int e = 90; String f = "No tengo trono ni reina, ni nadie que me
         * comprenda, pero sigo siendo el rey"; double g = 6.626070040;
         */
        //EJERCICIO 4
        /**
        double subtotal = (60 * 0.30) + (100 * 0.25) + (20 * 80);
        double iva = subtotal * 0.16;
        double total = subtotal + iva;
        System.out.println(String.format("Total a pagar $%.2f",total));
        */

      
      
    }
}
