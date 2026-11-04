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
public class Ejer16_Dossier2 {
/*
Práctica 16: Cálculo del área de una Finca. La finca es rectangular así que el usuario
introducirá el número de metros de cada lado y se le mostrará el área calculada tanto en
metros cuadrados como en centímetros cuadrados
    */    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la longitud de un lado de la Finca (en metros)");
        int base = sc.nextInt();
        System.out.println("Instroduce el otro lado (en metros)");
        int altura = sc.nextInt();
        
        int areaEnM = base * altura;
        int areaEnCm = areaEnM * 10000;
        
        System.out.println("El area de tu finca en m2 es de: " + areaEnM + " m2 y en cm2 es de: " + areaEnCm + " cm2");
    }
}
