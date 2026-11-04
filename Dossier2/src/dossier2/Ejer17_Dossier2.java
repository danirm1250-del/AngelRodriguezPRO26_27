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
public class Ejer17_Dossier2 {
/*
    Práctica 17: Crea un programa que calcule el IGIC (7%) de un producto dado su precio de
venta sin IGIC que introduzca el usuario por teclado.
    */   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio de tu producto");
        double price = sc.nextDouble();
        
        double priceIGIC = price * 0.07;
        System.out.println("El precio que se le anniadira a los " + price + " € que cuesta tu producto, es de: " + priceIGIC + " €");
    }
}
