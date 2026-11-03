/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prtacticasnuevasnoviembre;

/**
 *
 * @author alumno
 */
public class PruebasWhile {
    public static void main(String[] args) {
       // mostrar la tabla del 2
       //2*1 = 2
        System.out.println("De qué número quieres la tabla?");
        Scanner sc = new Scanner(System.in);
        int tabla = sc.nextInt();
        
        int i = 1;
        
        
        while(i<11){
            int producto = tabla *i;
            System.out.println(tabla + " x " + i + " = " + producto);
            i ++; // i = i + 2
       
        }
    }
}
