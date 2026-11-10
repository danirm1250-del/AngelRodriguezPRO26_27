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
public class Ejer39_Variante_Dossier2 {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        //boolean numValido = false;
        System.out.println("Introduce un número entero");
        int numUser = sc.nextInt();
        /*do {
            if (numUser >= 10 && numUser <= 999) {
                numValido = true;
            } else {
                System.out.println("Numero invalido. Recuerda que debe estar entre 10 y 99");
                System.out.println("Prueba de nuevo");
                numUser = sc.nextInt();
            }
        } while (!numValido);*/
        int inverso = 0;
        
        do{
            int cifra = numUser % 10;
            numUser /= 10;
            
            inverso = inverso * 10 + cifra;
        }while (numUser > 0);
        System.out.println("Tu numero a la inversa es: " + inverso);
       

    }
}
