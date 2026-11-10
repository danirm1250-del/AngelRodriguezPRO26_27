/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ángel Daniel Rodríguez Reyes
 */
public class Ejer36_Dossier2 {

    /*
Práctica 36: Hacer un programa que se emule un juego de lanzar 3 dados. En cada
iteración se muestra el resultado sacado en cada uno de los dados y cuánto es el acumulado
de esa tirada de 3 dados. Cuando el usuario pulse en “f” o “F” el programa finaliza y
muestra el acumulado de puntos de sumar todas las tiradas y el número de tiradas
Nota: se puede utilizar Random para el número aleatorio:
Random rnd = new Random();
rnd.nextInt(6); //genera un aleatorio desde 0 hasta 5
     */
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int sumaTotal = 0;
        int sumaDados = 0;
        char respuesta = 'a';
        do {
            int dado1 = (rnd.nextInt(6) + 1);
            int dado2 = (rnd.nextInt(6) + 1);
            int dado3 = (rnd.nextInt(6) + 1);

            sumaDados = dado1 + dado2 + dado3;
            sumaTotal += sumaDados;
            System.out.println("Dado 1: " + dado1);
            System.out.println("Dado 2: " + dado2);
            System.out.println("Dado 3: " + dado3);
            System.out.println("El acumulado es: " + sumaDados);
            System.out.println("---------------------------------");
            System.out.println("Si quieres hacerlo de nuevo, introduce una 'f', sino, introduce cualquier otra cosa");
            respuesta = sc.next().charAt(0);
        } while (respuesta == 'f' || respuesta == 'F');
        System.out.println("La suma total de los resultados de las tiradas es: " + sumaTotal);
    }
}
