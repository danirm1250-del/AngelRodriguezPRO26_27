/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier2;

/**
 *
 * @author Ángel Daniel Rodríguez Reyes
 */
public class Ejer11_Dossier2 {
/*Práctica 11: Introducir en un código java de NetBeans las siguientes líneas:
int x,y;
x= 3;
y= 4;
y *= ++x;
System.out.println("x=" + x +" y=" + y);
¿ qué resultado sale para los valores x e y ? Escribe las líneas de código equivalentes si no
usáramos el operador incremento: ++ ni el operador de asignación combinado: *=
*/
    public static void main(String[] args) {
       int x,y;
        x= 3;
        y= 4;
        x = x + 1; //Equivale a: ++x;
        y = y * x; //Equivale a y*= x
        System.out.println("x=" + x +" y=" + y); 
        //Los resultados son x=4, y=16
    }
}
