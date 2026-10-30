/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prtacticasnuevasnoviembre;

import java.util.Scanner;

/**
 *
 * @author Ángel Daniel Rodríguez Reyes
 * 
 * Este programa me permite tomar informacióñ de lo que me da el usuario y veo sio es mayor de 100 o es menor
 */
public class PrtacticasNuevasNoviembre {


    public static void main(String[] args) {

        boolean comparacion =    5 <= 9;
        
        System.out.println("daem un número");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        
        comparacion = numero < 100; // 
        String respuesta = comparacion? "es menor de 100" : "es mayor";
        System.out.println(respuesta);
        // esto en un comentario de linea

    }
    
}
