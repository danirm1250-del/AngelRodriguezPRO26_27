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
public class Ejer46_Dossier2 {

    /*
Práctica 46: Convertir un número a binario. El usuario introduce un número entero
decimal y el programa muestra en pantalla como es su forma en binario
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numUser = sc.nextInt();

        int cociente = numUser;
        String strResto = "";

        while (cociente > 0) {
            strResto = (cociente % 2) + strResto;
            cociente = cociente / 2;
        }

        System.out.println("El numero " + numUser + " en binario es: " + strResto);
    }
}
