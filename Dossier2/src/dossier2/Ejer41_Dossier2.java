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
public class Ejer41_Dossier2 {
/*
Práctica 41: Escribir un programa que el usuario escriba una cadena de texto y se le
muestre el texto al revés. Ej “cabello” mostraría: “ollebac”
Nota: “cabello”.substring(2,3) devuelve: “b” que es la tercera letra de ese texto.
    */  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un texto");
        String textUser = sc.nextLine();
        
        String textoInvertido = "";

        for (int i = textUser.length() - 1; i >= 0; i--) {
        textoInvertido = textoInvertido + textUser.substring(i, i + 1);
    }

        System.out.println("Tu texto al reves es: " + textoInvertido);
    }
}
