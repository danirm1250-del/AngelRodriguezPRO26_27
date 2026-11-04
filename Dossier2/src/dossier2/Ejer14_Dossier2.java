/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier2;

/**
 *
 * @author Ángel Daniel Rodríguez Reyes
 */
public class Ejer14_Dossier2 {
/*Práctica 14: Si tenemos las líneas de código:
int x=3, y=4;
int z = !(x<=y)?x:y ;
System.out.println(z);
¿qué valor nos va a mostrar en pantalla ?
Escribe ahora
System.out.println( 5 > 3 );
¿ qué muestra en pantalla ?
y ahora escribe:
System.out.println( 5 < 3 );
¿ qué muestra la pantalla ?
*/
    public static void main(String[] args) {
        int x=3, y=4;
        int z = !(x<=y)?x:y ;
        System.out.println(z);
       //El valor que muestra es un 4
        System.out.println( 5 > 3 );
        //Ahora muestra la expresión "true"
        System.out.println( 5 < 3 );
        //Ahora muestra la expresión "false"
    }
}
