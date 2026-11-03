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
public class PruebaWhile3 {
    public static void main(String[] args) {
    /*el usuario te da dos números, el menor y el mayor
    nosotros vamos a mostrar los múltiplos de 3 entre
    los dos números que nos ha dado
    */
    Scanner sc = new Scanner(System.in);
    System.out.println("Dame el numero menor");
    int numMenor = sc.nextInt();
    System.out.println("Dame el numero mayor");
    int numMayor = sc.nextInt();
    
    int i = numMenor;
    while (i <= numMayor){
        if (i%3 == 0){
            System.out.println(i);
        }
            i++;
        }
    }
}

