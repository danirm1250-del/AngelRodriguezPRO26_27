/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ángel Daniel Rodríguez Reyes
 */
public class Ejer43_Dossier2 {
/*
Práctica 43. Escribir un programa donde se genera un número secreto mayor o igual a 1 y
menor o igual a 99 El jugador intentará acertar el número si se equivoca el programa le
informa de si el número secreto es mayor o menor que el que él ha introducido. El
programa finaliza cuando el jugador acierte en cuyo caso se le mostrará el número de
intentos que ha necesitado para acertar.
Nota: se puede utilizar Random para el número aleatorio:
Random rnd = new Random();
rnd.nextInt(30); //genera un aleatorio desde 0 hasta 29
    */ 
    public static void main(String[] args) {
        Random rnd = new Random();
        int numAleatorio = rnd.nextInt(99) + 1;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Trata de adivinar el numero secreto (Entre 1 y 99)");
        int numUser = sc.nextInt();
        
        int intentos = 1;
        
        while (numUser != numAleatorio){
            if (numUser < numAleatorio){
                System.out.println("Mas alto");
            }else{
                System.out.println("Mas bajo");
            }
          intentos++;
          numUser = sc.nextInt();
        }
        System.out.println("Has acertado el numero secreto. La cantidad de intentos fue de: " + intentos);
    }
}
