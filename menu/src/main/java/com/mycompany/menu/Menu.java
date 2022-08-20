/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.menu;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Menu {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try{
            boolean salir = false;
        int opcion;

        do {
            System.out.println("1. CLASE");
            System.out.println("2. HERENCIA");
            System.out.println("3.ENCAPSULAMIENTO");
            System.out.println("4. Salir");

            System.out.println("Seleccione una opcion");
            opcion = entrada.nextInt();
            if (opcion==1){
                System.out.println("Una clase es la descripción de un conjunto de objetos similares; "
                        + "consta de métodos y de datos que resumen las características comunes de dicho conjunto.: ");
                break;
            }else{
                if(opcion ==2){
                    System.out.println("La herencia es un mecanismo que permite la definición de una clase a partir de la definición"
                            + " de otra ya existente. La herencia permite compartir automáticamente métodos y datos entre clases, subclases y objetos ");
                    break;
                }else{
                    if(opcion==3){
                        System.out.println("El término encapsulamiento en Java, consiste en ocultar atributos de un objeto de manera que solo se pueda cambiar mediante "
                                + "operaciones definidas en ese objeto. Está estrechamente relacionado con la visibilidad ");
                        break;
                    }else{
        break;
                    }
                }
            }
        }while(!salir);
            
        }catch(Exception e){
            System.out.println("ERROR!!!!!Digita un numero");
            
        }finally{
            System.out.println("Gracias por usar nuestro servicio");
        }
        
    }
}
