/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier2;

/**
 *
 * @author Ángel Daniel Rodríguez Reyes
 */
public class Ejer12_Dossier2 {
/*Práctica 12: Se tienen tres variables, a, b y c. Escribe las asignaciones necesarias para
intercambiar sus valores, sean cuales sean, de manera que:
b tome el valor de a
c tome el valor de b
a tome el valor de c
*/
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        char c = 'c';
        
        System.out.println("a es: " + a);
        System.out.println("b es: " + b);
        System.out.println("c es: " + c);
        
        char auxiliar = a;
        a = c;
        c = b;
        b = auxiliar;
        
        System.out.println("a es: " + a);
        System.out.println("b es: " + b);
        System.out.println("c es: " + c);
    }
}
