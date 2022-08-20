/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poligono;

/**
 *
 * @author Diego
 */
public class Rectangulo extends poligonoclas{
    
    private double lado1,lado2;

    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public int getNrolados() {
        return nrolados;
    }

    public void setNrolados(int nrolados) {
        this.nrolados = nrolados;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + super.toString()+"lado1=" + lado1 + ", lado2=" + lado2 + '}';
    }
                 
    @Override
    public double area() {
        return lado1*lado2;
        
    }
           
}
