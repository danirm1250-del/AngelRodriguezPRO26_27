/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class condicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
        System.out.println("Dame tu edad");
        int edad = sc.nextInt();
        
        String determinarEdad = (edad >= 18)? "Eres adulto" : "Eres menor de edad";
        System.out.println(determinarEdad);
              
              
              
              
              
              
              
    }
}
