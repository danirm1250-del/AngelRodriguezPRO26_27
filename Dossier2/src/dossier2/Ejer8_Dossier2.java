/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier2;

/**
 *
 * @author Ángel Daniel Rodríguez Reyes
 */
public class Ejer8_Dossier2 {
/*Práctica 8: Introducir en un código java de NetBeans las siguientes líneas:
int entero;
double real = 3.5;
entero = (int)real;
System.out.println(entero);
¿ genera algún error ? ¿ qué número muestra ?
*/
    public static void main(String[] args) {
        int entero;
        double real = 3.5;
        entero = (int)real;
        System.out.println(entero); 
        //No genera ningún error. Muestra el double truncado, es decir, 3
    }
}
