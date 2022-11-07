/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

import java.util.Scanner;

/**
 *
 * @author lauty
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double gradoC, gradoF;
        System.out.println("Ingrese grados centigrados");
        gradoC = leer.nextDouble();
        gradoF = 32 + (9*gradoC/5);
        System.out.println("El valor en Fahrnheit es: " + gradoF); 
    }
    
}
