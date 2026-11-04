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
public class Ejer25_Dossier2 {
/*
Práctica 25: Hacer un programa que le pida al usuario que introduzca una letra y por
medio de una estructura switch, evitando el mayor número de sentencias break posibles ,
muestre en pantalla el mensaje: “es una vocal” cuando el usuario haya introducido una
vocal ( ya sea minúscula o mayúscula ) y el mensaje: “no es una vocal” si no lo fuera.
    */    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Instroduce una letra");
        char letra = sc.next().charAt(0);
        
        switch (letra){
            case 'a','e','i','o','u': System.out.println("Es una vocal");break;
            default: System.out.println("No es una vocal");
        }
        
    }
}
