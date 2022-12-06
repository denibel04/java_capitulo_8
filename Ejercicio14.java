/**
 * Capítulo 8 - funciones 
 * Ejercicio 14: Pega dos números para formar uno.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import funciones.matematicas;
import java.util.Scanner;
public class Ejercicio14 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduzca el primer número: ");
        long num1 = sc.nextLong();
        System.out.printf("Introduzca el segundo número: ");
        long num2 = sc.nextLong();
        sc.close();

        System.out.print("Ambos números juntos sería: " + matematicas.juntaNumeros(num1,num2));
    }
}
