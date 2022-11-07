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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        
        System.out.println("Ingrese un numero valor limite positivo ");
        int numero = leer.nextInt();
       int suma=0;
         do {
             System.out.println("Ingrese un nuevo numero a sumar");
             int nuevo = leer.nextInt();
             suma = nuevo + suma;
             // suma += nuevo hace los mismo (suma = suma+nuevo
             
         } while (suma <= numero);
         System.out.println("El resultado de la suma es: " + suma);
}
}

