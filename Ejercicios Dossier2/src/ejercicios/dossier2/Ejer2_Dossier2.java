/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.dossier2;

/**
 *
 * @author Ángel Daniel Rodríguez Reyes
 */
public class Ejer2_Dossier2 {
/*Practica 2. Dados los siguientes identificadores, indicar si son válidos o no. Justificar las
    respuestas. Si algún caso son válidos pero no recomendables por algún motivos detallarlo.
    mi variable
    num_de_cte
    ___programa
    3tema
    cierto?
    númerodeCliente
    jose~
    año
    PI
    int
    */
    public static void main(String[] args) {
        System.out.println("mi variable. No valida, si la variable tiene mas de una palabra deben de escribirse juntas");
        System.out.println("num_de_cte. Valido pero no recomendable. Para unir palabras se usa el camelCase y no el snake_case");
        System.out.println("___programa. Valido pero no recomendable. Se recomienda que el nombre de las variables no empiecen por _" );
        System.out.println("3tema. No valida. Los nombres de variables no pueden comenzar por numeros");
        System.out.println("cierto?. No valida. El simbolo '?' es un operador asi que no deberia de usarse en nombres de variables");
        System.out.println("númerodeCliente. Valida pero no recomendable. No todos los idiomas cuentan con tildes asi que es mejor evitarlas, asi como que 'de' tendria que empezar por mayus");
        System.out.println("jose~. No valida. El simbolo '~' es un operador");
        System.out.println("año. Valida pero no recomendable. La letra 'ñ' es única del español por lo que deberia de evitarse");
        System.out.println("PI. No valida. PI en mayusculas es una constante con valor asociado (el valor de PI) por lo que no es recomendable utilizar este identificador");
        System.out.println("int. No valida. Es una de las palabras reservadas en Java");
        
         
    }

}
