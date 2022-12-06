/**
 * Capítulo 8 - funciones 
 * Ejercicio 3: Devuelve el menor primo que es mayor al número introducido usando la funcion siguientePrimo
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import funciones.matematicas;

import java.util.Scanner;
public class Ejercicio03 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int num = sc.nextInt();
        sc.close();
        System.out.printf("El siguiente número primo a ese es: " + matematicas.siguientePrimo(num));
    }
}
