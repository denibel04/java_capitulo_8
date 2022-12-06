/**
 * Capítulo 8 - funciones 
 * Ejercicio 12: Añade un dígito a un número por delante usando la función pegaPorDelante.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import funciones.matematicas;

import java.util.Scanner;
public class Ejercicio12 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long num = sc.nextLong();
        System.out.print("Introduzca el dígito que quiera añadirle por delante: ");
        int digito  = sc.nextInt();
        sc.close();

        System.out.printf("El número se queda así: " + matematicas.pegaPorDelante(num, digito));
    }
}
