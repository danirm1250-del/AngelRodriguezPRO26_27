/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier2;

/**
 *
 * @author Ángel Daniel Rodríguez Reyes
 */
public class Ejer10_Dossier2 {
/*Introducir en un código java de NetBeans las siguientes líneas:
int x,y;
x=3;
y=++x;
System.out.println(“Resultado con prefijo: x = “ + x + “ y = “ + y);
x=3;
y=x++;
System.out.println(“Resultado con postfijo: x = “ + x + “ y = “ + y);
¿ qué resultado sale para los valores x e y ?
*/
    public static void main(String[] args) {
       int x,y;
        x=3;
        y=++x;
        System.out.println("Resultado con prefijo: x  = " + x + " y = " + y);
        x=3;
        y=x++;
        System.out.println("Resultado con postfijo: x = " + x + " y = " + y); 
        // Los resultados con prefijo son: x = 4, y = 4
    }   //Los resultados con postfijo son: x = 4, y = 3
}
