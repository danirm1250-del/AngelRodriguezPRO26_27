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
public class Ejer22_Dossier2 {
/*
Práctica 22: Hacer un programa que haga uso de estructuras if else if para que dado un
número entero x muestre en pantalla:
- x es menor de 0
- x es igual a 0
- x es mayor que 0 y menor que 10
- x es igual a 10
- x es mayor que 10 y menor que 20
- x es mayor o igual a 20
    */    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero entero");
        int num = sc.nextInt();
        
        if (num < 0){
            System.out.println(num + "es menor que 0");
        }else if (num == 0){
            System.out.println(num + "es igual a 0");
        }else if (num < 10){
            System.out.println("es mayot que 0 y menor que 10");
        }else if (num == 10){
            System.out.println(num + "es igual a 10");
        }else if (num < 20){
            System.out.println(num + "es mayor que 10 y menor que 20");
        }else
            System.out.println(num + "es mayor o igual a 20");
    }   
}
