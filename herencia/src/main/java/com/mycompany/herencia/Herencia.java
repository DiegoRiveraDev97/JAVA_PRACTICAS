/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.herencia;

/**
 *
 * @author Diego
 */
public class Herencia {

    public static void main(String[] args) {
        
        Planta planta1 = new Planta();
        planta1.alimentarse();
        
        AnimalCarnivoro ac1 = new AnimalCarnivoro();
        ac1.alimentarse();
        
        AnimalHerviboro ah1 = new AnimalHerviboro();
        ah1.alimentarse();
        
        
        System.out.println("Hello World!");
    }
}
