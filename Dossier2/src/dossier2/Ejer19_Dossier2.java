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
public class Ejer19_Dossier2 {
/*
Práctica 19: Realizar un programa que sirva para convertir grados Farenheit en centígrados
El usuario introducirá los grados Farenheit y se le mostrará la equivalencia en centígrados.
La fórmula es:.
C = ( F – 32 ) * 5/9
donde C es grados centígrados y F es Farenheit
    */    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Grados Farenheit a convertir en Celsius");
        int gradosF = sc.nextInt();
        
        int gradosC = (gradosF - 32) * 5/9;
        System.out.println("El equivalente en Celsius es de " + gradosC + " ºC");
    }
}
