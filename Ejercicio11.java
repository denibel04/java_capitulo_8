/**
 * Capítulo 8 - funciones 
 * Ejercicio 11: Añade un dígito a un número por detrás usando la función pegaPorDetrás
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import funciones.matematicas;

import java.util.Scanner;
public class Ejercicio11 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long num = sc.nextLong();
        System.out.print("Introduzca el dígito que quiera añadirle por detrás: ");
        int digito  = sc.nextInt();
        sc.close();

        System.out.printf("El número se queda así: " + matematicas.pegaPorDetras(num, digito));
    }
}
