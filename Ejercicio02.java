/**
 * Capítulo 8 - funciones 
 * Ejercicio 2: usa la función esPrimo para decir si el número introducido es primo o no
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
import funciones.matematicas;
public class Ejercicio02 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int num = sc.nextInt();
        sc.close();

        if (matematicas.esPrimo(num)) {
            System.out.print(num + " es primo");
        } else {
            System.out.print(num + " no es primo");
        }
    }
}
