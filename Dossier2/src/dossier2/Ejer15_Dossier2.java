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
public class Ejer15_Dossier2 {
/*
Práctica 15: Hacer un programa que lea una línea de texto entrada por teclado y la muestre
en pantalla
*/
    public static void main(String[] args) {
        System.out.println("Escribe un texto que quieras que se muestre por pantalla");
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        System.out.println(texto);
    }
}
