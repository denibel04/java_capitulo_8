/**
 * Capítulo 8 - funciones 
 * Ejercicio 5: Imprime el número de digitos que tiene un número usando la función digitos
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import funciones.matematicas;

import java.util.Scanner;
public class Ejercicio05 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long num = sc.nextInt();
        sc.close();

        System.out.printf("%d tiene %d dígitos", num, matematicas.digitos(num));
    }
}
