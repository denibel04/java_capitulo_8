/**
 * Capítulo 8 - funciones 
 * Ejercicio 6: Voltea el número introducido usando la función voltea
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import funciones.matematicas;

import java.util.Scanner;
public class Ejercicio06 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduzca el número que quiera voltear: ");
        long num = sc.nextLong();
        sc.close();
        System.out.printf("El número volteado es: %d", matematicas.voltea(num) );
    }
}
