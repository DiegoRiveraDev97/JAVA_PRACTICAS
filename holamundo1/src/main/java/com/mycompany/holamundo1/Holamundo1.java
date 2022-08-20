/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.holamundo1;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Holamundo1 {

    public static void main(String[] args) {
        Scanner messag = new Scanner(System.in);
        Scanner message= new Scanner(System.in);
        
        int num;
        String name;
        System.out.println("Write your name: " );
        name = messag.nextLine();
        System.out.println("Your name is: "+name );
        System.out.println("LOGING PASS" );
        num = message.nextInt();
        System.out.println("Your pass is: "+num );
        
        
              
        
        int luck_num = 22;
        String country = "I am colombian";
        
        System.out.println("your luck number is: "+luck_num);
        System.out.println("What is your luck number! "+luck_num+"And where are you from? "+country);
        System.out.println("Hello World of ING.Juan Diego Rivera!");
        /*
        Esta es la manera de crear un comentario
        con varias lineas de texto
        las cuales permiten explicar alguna condicion
        del sistema
        */
        
        System.out.println("Hello World of ING.Juan Diego Rivera!");
        
        // este es un comentario de una sola linea
        System.out.println("Hello World of ING.Juan Diego Rivera!");
    }
}
