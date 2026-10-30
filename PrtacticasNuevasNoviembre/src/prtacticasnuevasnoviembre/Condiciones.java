/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prtacticasnuevasnoviembre;

import java.util.Scanner;

/**
 *
 * @author alumno
 */

/*Si es menor de 18 escribir "eres menor"
Si está entre 18 y 67 es un adulto
y si es mayor de 67 "eres un jubilado"
*/
public class Condiciones {
  
    public static void main(String[] args) {
        
        System.out.println("Dime tu edad");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        
        String respuesta = "";
        
        if (age < 18){
            respuesta = "Eres menor de edad";       
        }else{
            if (age < 67){
                respuesta = "Eres un adulto";
            }else{
                respuesta = "Eres un jubilado";
            }
        }
        System.out.println(respuesta);
    }
} 
