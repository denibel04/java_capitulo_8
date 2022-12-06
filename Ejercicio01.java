/**
 * Capítulo 8 - funciones
 * Ejercicio 1: Dice si un numero es capicuo usando la funcion esCapicua
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import funciones.matematicas;

import java.util.Scanner;
public class Ejercicio01 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long num = sc.nextLong();
        sc.close();

        if (matematicas.esCapicua(num)) {
            System.out.printf("%d al revés es %d, por tanto, es capicuo", num, matematicas.voltea(num));
        } else {
            System.out.printf("%d al revés es %d, por tanto, no es capicuo", num, matematicas.voltea(num));
        }
    }
}