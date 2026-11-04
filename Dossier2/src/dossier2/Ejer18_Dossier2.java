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
public class Ejer18_Dossier2 {
/*
Práctica 18: Escribe un programa que calcule el salario semanal de un empleado en base
a las horas trabajadas, a razón de 18 euros la hora
    */    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantas horas trabajaste esta semana?");
        int horas = sc.nextInt();
        
        int salario = horas * 18;
        System.out.println("Tu salario de esta semana sera de " + salario + " euros");
    }
}
