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
public class Ejer26_Dossier2 {
/*
Práctica 26: Escribe un programa que pida por teclado un día de la semana ( ún número
entero del 1 al 5 que representa de lunes a viernes ) y que diga qué asignatura toca a primera
hora ese día.
    */  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un dia de la semana entre el lunes y el viernes (en numero)");
        int dia = sc.nextInt();
        
        switch(dia){
            case 1 : System.out.println("La primera asignatura de este dia es Sistemas Informaticos");break;
            case 2 : System.out.println("La primera asignatura de este dia es Base de Datos");break;
            case 3 : System.out.println("La primera asignatura de este dia es Base de Datos");break;
            case 4 : System.out.println("La primera asignatura de este dia es Ingles");break;
            case 5 : System.out.println("La primera asignatura de este dia es Lenguaje de Marcas");break;
            default: System.out.println("No se contemla ese dia");break;
                    
        }
    }
}
