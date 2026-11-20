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
public class Ejer44_Dossier2 {
/*
Práctica 44: Programa generador de potencias. El usuario introduce un número entero de 1
a 20. Se le mostrará en pantalla las 5 primeras potencias de ese número.
Ej. número introducido 2
2^1 = 2
2^2 = 4
    */ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numUser = 0;
        do{
            System.out.println("Introduce un numero del 1 al 20");
            numUser = sc.nextInt();
            
        }while (numUser < 1 && numUser > 20);
        
        int base = 1;
        for (int exponente = 1 ; exponente <= 5; exponente++){
            int contadorExponente= exponente;
            while (contadorExponente >= 1){
                base = base * numUser;
                contadorExponente--; 
            }
            int resultado = base;
            System.out.println(numUser + " ^ " + exponente + " = " + resultado);
            base = 1;
        }
    }
}
