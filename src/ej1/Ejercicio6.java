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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner (System.in);  
     int numero = leer.nextInt();
     
     if (numero % 2 == 0){
         System.out.println("Su numero es par");
     } else {
         System.out.println("Su numero es impar");
     }
    }
    
}
