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
public class Ejer23_Dossier2 {
/*
Práctica 23: Hacer un programa que resuelva ecuaciones de segundo grado. El usuario
introduce los valores de a,b,c de la fórmula: aX^2+bX+c = 0
Se debe mostrar las dos posibles soluciones, salvo que haya una raiz negativa en cuyo caso
se mostrará el mensaje: “no hay solución real”
Nota. Para resolver podemos hacer uso de: Math.sqrt() para obtener la raíz cuadrada
    */    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Dame a");
        int a = sc.nextInt();
        System.out.println("Dame b");
        int b = sc.nextInt();
        System.out.println("Dame c");
        int c = sc.nextInt();
        
        double raiz = (b * b) - (4 * a * c);
        
        if (raiz < 0){
           System.out.println("No hay solucion real");
        }else{
            double x1 = (-b + Math.sqrt(raiz)) /(2 * a);
            double x2 = (-b - Math.sqrt(raiz)) /(2 * a);
            
            System.out.println("Solucion 1: " + x1);
            System.out.println("Solucion 2: " + x2);
        }
    }
}
