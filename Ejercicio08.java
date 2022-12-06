/**
 * Capítulo 8 - funciones 
 * Ejercicio 8: Da la posición de la primera ocurrencia de un dígito dentro de un número entero usando la funcion posicionDigito. Si no se encuentra,
 * devuelve -1.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import funciones.matematicas;

import java.util.Scanner;
public class Ejercicio08 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long num = sc.nextLong();
        System.out.print("Introduzca el dígito del que quiera saber la posición: ");
        int digito  = sc.nextInt();
        sc.close();

        System.out.printf("El dígito %d se encuentra en la posición: %d", digito, matematicas.posicionDeDigito(num, digito));
    }
}
