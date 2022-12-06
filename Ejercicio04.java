/**
 * Capítulo 8 - funciones 
 * Ejercicio 4: Eleva un número dado a la potencia dada usando la funcion potencia
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import funciones.matematicas;

import java.util.Scanner;
public class Ejercicio04 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la base: ");
        int base = sc.nextInt();
        System.out.print("Introduzca el número al que lo quiera elevar: ");
        int exp = sc.nextInt();
        sc.close();
        System.out.printf("%d^%d = %d", base, exp, matematicas.potencia(base, exp));
    }
}
