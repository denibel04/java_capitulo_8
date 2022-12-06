/**
 * Capítulo 8 - funciones 
 * Ejercicio 9: Le quita a un número n dígitos por detrás (por la derecha) usando la función quitaPorDetrás.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import funciones.matematicas;

import java.util.Scanner;
public class Ejercicio09 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long num = sc.nextLong();
        System.out.print("Introduzca el número de dígitos que quiera quitarle por detrás: ");
        int cant  = sc.nextInt();
        sc.close();

        System.out.printf("El número se queda así: " + matematicas.quitaPorDetras(num, cant));
    }
}
