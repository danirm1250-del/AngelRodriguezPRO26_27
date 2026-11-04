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
public class Ejer24_Dossier2 {
/*
Práctica 24: Hacer un programa que le pregunte al usuario su idioma preferido. Donde la
letra ‘c’ será castellano, ‘i’ inglés, ‘f’ francés. Según la opción que haya elegido se le
mostrará respectivamente: “Buenos días”, “Good morning”, “Bonjour” y termina. Si el
usuario escribe cualquier otra cosa el programa mostrara: “no entiendo tu idioma” y termina
Tener en cuenta que Scanner no tiene un método nextChar() en su defecto usar:
next().charAt(0) que va a tomar el primer carácter de la línea de texto introducida
Ej.
Scanner cin = new Scanner(System.in);
char c = cin.next().charAt(0);
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige un idioma: c (castellano), f (frances) o i (ingles)");
        char opcion = sc.next().charAt(0);
        
        switch (opcion){
            case 'c': System.out.println("Buenos dias!");break;
            case 'f': System.out.println("Bonjour!");break;
            case 'i': System.out.println("Good morning!");break;
            default: System.out.println("No entiendo tu idioma");break;
            
        }
    }
}
