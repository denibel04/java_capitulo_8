/**
 * Capítulo 8 - funciones 
 * Ejercicio 7: Devuelve el dígito de la posición que introduzca el usuario usando la funcion digitoN
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import funciones.matematicas;

import java.util.Scanner;
public class Ejercicio07 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long num = sc.nextLong();
        System.out.print("Introduzca la posición del dígito que quiera mostrar por pantalla: ");
        int pos  = sc.nextInt();
        sc.close();

        System.out.printf("El dígito de la posición %d es: %d", pos, matematicas.digitoN(num, pos));
    }
}
