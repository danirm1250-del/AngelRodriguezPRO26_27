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
public class Ejer45_Dossier2 {

    /*
Práctica 45: Crear un programa que reciba un número entero y que muestre su
descomposición en números primos:
300 = 2*2*3*5*5
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero para descomponerlo");
        int num = sc.nextInt();
        //int num = 120;
        
        
        int cociente = num;
        int divisor = 2;
        String resultado = "";
        String strOperador = "";
        while (cociente > 1) {
            while (cociente % divisor == 0) {
                resultado =  resultado + strOperador + divisor  ;
                strOperador = "*";
                cociente /= divisor;
                              
            }
            divisor++;
        }
        
        System.out.println("El numero " + num + " se descompone en: " + resultado);
    }
}
