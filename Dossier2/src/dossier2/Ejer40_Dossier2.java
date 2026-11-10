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
public class Ejer40_Dossier2 {

    /*
Práctica 40: Escribir un programa que reciba un número entero mayor o igual a 0 y menor
o igual a 999 y muestre cuántas cifras tiene
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero entero entre 0 y 999");
        int numUser = sc.nextInt();
        boolean numValido = false;

        do {
            if (numUser >= 0 && numUser <= 999) {
                numValido = true;
            } else {
                System.out.println("Numero invalido. Prueba de nuevo");
                numUser = sc.nextInt();
            }
        } while (!numValido);

        int contador = 0;
        if (numUser == 0) {
            contador = 1;
        } else {
            while (numUser > 0) {
                numUser /= 10;
                contador++;
            }
            
        }
        System.out.println("El numero tiene " + contador + " cifras");

    }
}
