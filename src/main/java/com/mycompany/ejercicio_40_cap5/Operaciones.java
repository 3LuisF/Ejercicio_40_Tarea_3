/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_40_cap5;

/**
 *
 * @author Luis F Montoya
 */
public class Operaciones {
     double Numero;
    
    public Operaciones(double Numero){
        this.Numero = Numero;
    }
    public boolean VerificarNum(){
        return Numero >=0;
    }
    public double Cuadrado(){
        return Math.pow(Numero,2);
    }
    public double Cubo(){
        return Math.pow(Numero,3);
    }
    public double Raiz(){
        return Math.sqrt(Numero);
    }
    
    
}
