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
public class Ejer33_doWhile_Dossier2 {
/*
Práctica 33: Se pretende imitar el comportamiento de un sistema de control por pin. El
usuario tiene 3 intentos para acertar con el pin, cada vez de esos tres intentos que falle se le
informa y se le dice el número de intentos que le queda. Si acierta se le muestra un mensaje
que diga: “El código es correcto. Bienvenido” Si no acierta en los tres intentos el programa
termina
Hacer 3 versiones de este código una con while, otra con do while y finalmente for
    */ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int pin  = 1234;
        int intentosRestantes = 3;
        boolean acierto= false; 
        
        do{
            System.out.println("Trata de adivinar el pin de 4 digitos. Tienes " + intentosRestantes + " intentos");
            int intentoUser = sc.nextInt();
            
            if (intentoUser == pin){
                System.out.println("El codigo es correcto. Bienvenido");
                acierto = true;            
            }else{
                System.out.println("PIN incorrecto");
                intentosRestantes -= 1;
            }
        }while(intentosRestantes != 0 && !acierto);
        
        
    }
}
    
