/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.poo;

import java.util.ArrayList;
/**
 *
 * @author mandi
 */
public class Disciplina {
    private String name;
    private String ementa;
    private int ciclo;
    private double nota;
    
    public Disciplina(String name, String email, int ciclo, double nota){
        this.name = name;
        this.ementa = ementa;
        this.ciclo = ciclo;
        this.nota = nota;
    
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}


