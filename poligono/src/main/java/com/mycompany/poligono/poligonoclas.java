/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poligono;

/**
 *
 * @author Diego
 */
public abstract class poligonoclas {

    protected int nrolados;

    public poligonoclas(int nrolados) {
        this.nrolados = nrolados;
    }

    public int getNrolados() {
        return nrolados;
    }

    @Override
    public String toString() {
        return "poligonoclas{" + "nrolados=" + nrolados + '}';
    }

    public abstract double area();

}
