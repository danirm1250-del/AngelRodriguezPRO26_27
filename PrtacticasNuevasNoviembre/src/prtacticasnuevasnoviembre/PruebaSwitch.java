/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prtacticasnuevasnoviembre;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class PruebaSwitch {
    public static void main(String[] args) {
    //Práctica 25. Hacer un programa que le pida al usuario que introduzca una letra
    //y por medio de una estructura switch, evitando el mayor número de sentencias
    //break posibles, muestre en pantalla el mensaje "es una vocal" cuando el usuario
    //haya introducido una vocal (ya sea minúscula o mayúscula) y el mensaje 
    //"no es una vocal" si no lo fuera
    Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una letra");
        String texto = sc.nextLine();
        char letra = texto.charAt(0);
        
        switch (letra){         
            case 'u', 'e', 'i', 'o' ,'a' -> System.out.println("Es una vocal");
            default -> System.out.println("No es una vocal");
        }
    }
}
