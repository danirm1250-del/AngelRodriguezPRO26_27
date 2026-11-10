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
public class Ejer39_Dossier2 {
/*
Práctica 39: Hacer un programa que recibe un número entero mayor o igual a 10 y menor
o igual a 99 ( si el usuario introduce un número no válido se le pedirá que repita hasta que
lo haga bien ) , y se le muestre el número con las cifras invertidas. Por ej. si 34 se mostraría
en pantalla 43
    */    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean numValido = false;
        System.out.println("Introduce un número entero entre 10 y 99 (estos incluidos)");
            int numUser = sc.nextInt();
        do{    
            if (numUser >= 10 && numUser <= 99){
                numValido = true;
            }else{
                System.out.println("Numero invalido. Recuerda que debe estar entre 10 y 99");
                System.out.println("Prueba de nuevo");
                numUser = sc.nextInt();
            }
        }while (!numValido);
        int decenaInvert = (numUser % 10) *10;
        int unidadInvert = numUser / 10;
        int numInvertido = decenaInvert + unidadInvert;
        System.out.println("Tu numero al reves es: " + numInvertido);
    }
}
