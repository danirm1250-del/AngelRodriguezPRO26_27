/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testeogithub;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class TesteoGithub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc = new Scanner(System.in);
        
       System.out.println("Introduce un numero");
       int num1 = sc.nextInt();
       System.out.println("Introduce otro numero");
       int num2 = sc.nextInt();
       
       int suma = num1 + num2;
       int resta = num1 - num2;
       int producto = num1 * num2;
       
      System.out.println("Suma: " + suma);
      System.out.println("Resta: " + resta);  
      System.out.println("Multiplicacion: " + producto);
    
    
    
    }
    
}
