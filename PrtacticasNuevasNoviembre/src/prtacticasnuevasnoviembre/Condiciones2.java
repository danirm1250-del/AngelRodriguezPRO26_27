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

/* un programa qye ek ysyarui introduzca dos números: num1 y num2
si los dos son menores de 100, mostrar: "tanto num1 como num2 son menores de 100
si num1 es menor que 100 y num2 es mayor que 100: num1 es menor que 100 y num2 es mayor que 100
si num1 es mayor que 100 y num2 es menor que 100: num1 es mayor que 100 y num2 es menor que 100
si num1 y num2 son mayores que 100, mostrar: los dos son mayores que 100
*/
public class Condiciones2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero");
        int num1 = sc.nextInt();
        System.out.println("Dame otro numero");
        int num2 = sc.nextInt();
        
        String respuesta = "";
        if (num1 > 100 && num2 > 100){
            respuesta = "Tanto " + num1 + " como " + num2 + " son mayores que 100";
        }else if(num1 < 100 && num2 < 100){   //aquí alguno de los dos números es menor que 100
           respuesta = "Tanto " + num1 + " como " + num2 + " son menores que 100";
        }else if (num2 < 100 ){
            respuesta = num1 + " es mayor que 100 y " + num2 + " es menor que 100";
        }else{
            respuesta = num1 + " es menor que 100 y " + num2 + " es mayor que 100";
        }
        System.out.println(respuesta);
    }
}
