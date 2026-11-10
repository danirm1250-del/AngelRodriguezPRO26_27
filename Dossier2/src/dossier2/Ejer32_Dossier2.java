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
public class Ejer32_Dossier2 {

    /*
Práctica 32: Hacer un programa que reciba dos números enteros positivos del usuario y
muestre la suma de todos los números que hay entre esos dos números.
Ej. Usuario introduce: 10, 5 entonces la secuencia de números es:
5,6,7,8,9,10
y la suma de esos números es:
45
Hacer uso de un bucle for para este programa
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero entero positivo");
        int num1 = sc.nextInt();
        System.out.println("Dame otro numero positivo entero");
        int num2 = sc.nextInt();
           System.out.println("--------------------------------");
        if (num1 > num2) {
            int auxiliar = num1;
            num1 = num2;
            num2 = auxiliar;
        }
        
        int contador = 0;
        
        for (int i = num1 ; i <=num2 ; i++){
            System.out.println(i);
            contador += i;
        }
        System.out.println("---Resultado---");
        System.out.println(contador);
    }
}
