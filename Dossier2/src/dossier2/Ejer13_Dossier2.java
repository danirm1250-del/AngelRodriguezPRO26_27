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
public class Ejer13_Dossier2 {
/*Práctica 13: Sea el siguiente programa:
public static void main(String[] args) {
Scanner cin = new Scanner(System.in);
System.out.println("Introduzca un número mayor que 5 ");
int numero = cin.nextInt();
boolean comparaCon5;
comparaCon5 = numero > 5;
System.out.println("Es " + comparaCon5 + " que el número sea mayor que 5");
}
Ejecutarlo e introducir un número mayor que 5 ¿ qué mensaje muestra ? Ahora introduce un
número menor que 5 ¿ qué mensaje muestra ahora ?.
*/
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Introduzca un número mayor que 5 ");
        int numero = cin.nextInt();
        boolean comparaCon5;
        comparaCon5 = numero > 5;
        System.out.println("Es " + comparaCon5 + " que el número sea mayor que 5");
    //Cuando introduczo un valor mayor que 5 muestra el mensaje: 
    //"Es true que el número sea mayor que 5"
    //Cuando introduczo un valor menor que 5 muestra el mensaje: 
    //"Es false que el número sea mayor que 5"
    }       
    
}