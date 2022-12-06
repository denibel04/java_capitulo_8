/**
 * Capítulo 8 - funciones 
 * Ejercicio 10: Le quita a un número n dígitos por delante (por la izquierda) usando la función quitaPorDelante.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import funciones.matematicas;

import java.util.Scanner;
public class Ejercicio10 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long num = sc.nextLong();
        System.out.print("Introduzca el número de dígitos que quiera quitarle por delante: ");
        int cant  = sc.nextInt();
        sc.close();

        System.out.printf("El número se queda así: " + matematicas.quitaPorDelante(num, cant));
    }
}
