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
public class Ejer38_Dossier2 {
/*
Práctica 38: Hacer un programa que recibe un número de horas, por ejemplo 135.25 y lo
convierte a un formato de: días, horas, minutos, segundos. Siguiendo el ejemplo anterior:
5días 15horas 15minutos 0segundos
    */  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el numero de horas");
        double horasUser = sc.nextDouble();
        long segundosDia = 86400;
       
        //cálculo de días
        double segundosTotales = horasUser * 3600;
        int dias = (int) segundosTotales / (int) segundosDia;
        double restoDias = segundosTotales % segundosDia;
        
        //cálculo de horas
        int horas = (int) restoDias / 3600;
        double restoHoras = restoDias % 3600;
        
        //cáculo minutos
        int minutos = (int) restoHoras / 60;
        double restoMinutos = restoHoras % 60;
        
        //cálculo segundos
        int segundos = (int) restoMinutos;
        
        System.out.println("Tu numero de horas son: " + dias +" dia(s) " + horas + " hora(s) " + minutos + " minuto(s) " + segundos + " segundo(s)");
        
    }
}
