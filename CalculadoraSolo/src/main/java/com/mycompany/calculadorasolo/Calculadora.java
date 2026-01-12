/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorasolo;

/**
 *
 * @author bofil
 */
public class Calculadora {
     public static void main(String[] args) {
        
     }
    public static double sumar(double a, double b) {
    return a + b;
}

public static double restar(double a, double b) {
    return a - b;
}
    public static double multiplicar(double a, double b) {
    return a * b;
}

public static double dividir(double a, double b) {
    if (b == 0) {
        System.out.println("Error");
        return 0;
    }
    return a / b;
}
}
