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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        
        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine();
       int length = frase.length();
        
         if (length == 8){
             System.out.println("Su frase es correcta");
    } else {
             System.out.println("Su frase es incorrecta");
         }
     }   
}



