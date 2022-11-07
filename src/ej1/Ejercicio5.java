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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner (System.in);
     
         System.out.println("Ingrese un numero entero");
        int numero = leer.nextInt();
        
         System.out.println("Su numero al doble es: "+(numero*2));
        System.out.println("Su numero al triple es: "+(numero*3));
        System.out.println("La raiz cuadrada de su numero es: "+ Math.sqrt(numero));

    }
    
}
