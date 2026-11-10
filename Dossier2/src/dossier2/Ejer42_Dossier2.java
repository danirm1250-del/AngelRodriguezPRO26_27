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
public class Ejer42_Dossier2 {

    /*
Práctica 42: Hay una cuadrilla de trabajadores que aceptar encargos. Pongamos por
ejemplo que tienen un encargo por 10000€. Al finalizar el trabajo observan que han
participado 5 componentes de la cuadrilla dedicando cada uno de ellos respectivamente el
siguiente número de horas:
10, 100, 100, 20, 20
Así que en total han invertido 250horas para un trabajo de 10000€ saliendo la hora
trabajada a: 40€
Hacer un programa que les permita calcular lo que sale cada hora trabajada. Como datos de
entrada recibirá el dinero total que se pagará por el encargo. El número de participantes de
la cuadrilla y el número de horas que haya realizado cada uno de los participantes
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el dinero total del encargo:");
        double dinero = sc.nextDouble();

        System.out.println("Introduce el numero de trabajadores:");
        int trabajadores = sc.nextInt();

        int totalHoras = 0;

        for (int i = 1; i <= trabajadores; i++) {
            System.out.println("Introduce las horas del trabajador " + i + ":");
            int horas = sc.nextInt();

            totalHoras += horas;
        }

        double precioHora = dinero / totalHoras;

        System.out.println("El precio de cada hora trabajada es: " + precioHora + " euros");
    }

}
