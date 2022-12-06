/**
 * Capítulo 8 - funciones 
 * Ejercicio 13: Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente usando la
 * función TrozoDeNúmero.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import funciones.matematicas;

import java.util.Scanner;
public class Ejercicio13 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long num = sc.nextLong();
        System.out.print("Introduzca la posición del primer dígito: ");
        int posInicial = sc.nextInt();
        System.out.print("Introduzca la posición del último dígito: ");
        int posFinal = sc.nextInt();
        sc.close();

        System.out.print("El trozo de número es: " + matematicas.trozoDeNumero(num, posInicial, posFinal));
    }
}
