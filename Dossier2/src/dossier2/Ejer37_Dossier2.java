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
public class Ejer37_Dossier2 {
/*
Práctica 37: Crear un programa que le pregunte al usuario la cantidad de billetes que tiene
de 500, luego le pregunte por la cantidad de billetes que tiene de 200, después pregunte por
los de 100, 50, 20, 10, 5. Finalmente se le dirá al usuario la cantidad de dinero acumulado
que tiene en billetes.
    */ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cuantos billetes de 500 tienes?");
        int b500 = sc.nextInt();
        System.out.println("Cuantos billetes de 200 tienes?");
        int b200 = sc.nextInt();
         System.out.println("Cuantos billetes de 100 tienes?");
        int b100 = sc.nextInt();
        System.out.println("Cuantos billetes de 50 tienes?");
        int b50 = sc.nextInt();
        System.out.println("Cuantos billetes de 20 tienes?");
        int b20 = sc.nextInt();
        System.out.println("Cuantos billetes de 10 tienes?");
        int b10 = sc.nextInt();
         System.out.println("Cuantos billetes de 5 tienes?");
        int b5 = sc.nextInt();
        int acumulador = (b500*500) + (b200*200) + (b100*100) + (b50*50) + (b20*20) + (b10*10) + (b5*5);
        System.out.println("----Resultado----");
        System.out.println("Cantidad de dinero total en billetes: " + acumulador + " euros");
    }
}
