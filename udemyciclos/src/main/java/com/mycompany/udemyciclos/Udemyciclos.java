/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.udemyciclos;

/**
 *
 * @author Diego
 */
public class Udemyciclos {

    public static void main(String[] args) {
        
     int totalEpisodes = 1;
                      //CONDICIONAL IF-ELSE
           System.out.println("--------condicional if-else--------");
           
     if (totalEpisodes >1 && totalEpisodes <=10){
         System.out.println("Es una miniserie");
     }else if(totalEpisodes >10){
         System.out.println("Es una serie");
     }else if(totalEpisodes == 1){
         System.out.println("Es una pelicula");
     }else{
         System.out.println("Debe tener al menos un episodio");
     }
        System.out.println("--------ciclo while---------");
        
        
                          //CICLO WHILE
        int i = 0;
        int duration = 10;
        
        while( i <= duration){
            if(i <= 3){
                System.out.println("Reproduciendo intro, segundo "+ i);
            }else if(i <= 7){
                System.out.println("Reproduciendo pelicula, segundo "+i);
            }else{
                System.out.println("Reproduciendo credito, segundo "+i);
            }
            i++;
        }
        System.out.println("---------ciclo for------------------");
        
                               //ciclo for
        
        for(int j = 0; j<=duration; j++){
            if(j <= 3){
                System.out.println("Reproduciendo intro, segundo "+ j);
            }else if(j <= 7){
                System.out.println("Reproduciendo pelicula, segundo "+j);
            }else{
                System.out.println("Reproduciendo credito, segundo "+j);
            }
        }
        System.out.println("-------ciclo DO while");
        
                            //CICLO DO WHILE
                            
        int k = 0;       
        
        do{
            if(k <= 3){
                System.out.println("Reproduciendo intro, segundo "+ k);
            }else if(k <= 7){
                System.out.println("Reproduciendo pelicula, segundo "+k);
            }else{
                System.out.println("Reproduciendo credito, segundo "+k);
            }    
            
        }while(k <= duration);
        
        
        
        
    }
}
