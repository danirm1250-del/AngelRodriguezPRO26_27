/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier2;

import java.util.Scanner;

/**
 *
 * @author Ángel Daniel Rodríguez Reyes
 */
public class Ejer21_Dossier2 {
/*
Práctica 21: Hacer un programa que se le pase un número entero y determine si es
múltiplo de 3 y de 5. Un módelo de mensajes a mostrar sería:
- x es multiplo de 3 pero no es múltiplo de 5
- x no es múltiplo de 3 pero sí es múltiplo de 5
- x no es múltiplo de 3 ni de 5
- x es múltiplo de 3 y de 5
    */    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero entero");
        int num = sc.nextInt();
        
        if (num%3 == 0 && num%5 ==0){
            System.out.println(num + " es multiplo de 3 y de 5");
        }else if (num%3 != 0 && num%5 !=0){
            System.out.println(num + " no es multiplo de 3 ni de 5");
        }else if (num%3 == 0){
            System.out.println(num + " es multiplo de 3 pero no de 5");
        }else
            System.out.println(num + " no es multiplo de 3 pero si de 5");
    }
}
