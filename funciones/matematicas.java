package funciones;
public class matematicas {

    // Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario.
    public static boolean esPrimo(int x) {
        for (int i = 2; i<x; i++) {
            if (x%i==0) {
                return false;
            }
        }
        return true;
    }

    // Devuelve el menor primo que es mayor al número que se pasa como parámetro.
    public static int siguientePrimo(int x) {
        x++;
        while(!esPrimo(x)) {
            x++;
        }
        return x;
    }

    // Dada una base y un exponente devuelve la potencia.
    public static int potencia(int base, int exp) {
        return (int)(Math.pow(base, exp));
    }

    // Cuenta el número de dígitos de un número entero.
    public static int digitos(long x) {
        int i=0;
        while (x>0) {
            x/=10;
            i++;
        }
        return i;
    }

    // Le da la vuelta a un número
    public static long voltea(long x) {
        long num = 0;
        while (x>0) {
            num = num*10+(x%10);
            x/=10;
        }
        return num;
    }

    // Comprueba si un número es capicuo
    public static boolean esCapicua(long x) {
        return x == voltea(x);
    }

    //  Devuelve el dígito que está en la posición n de un número entero. Se empieza contando por el 0 y de izquierda a derecha.
    public static long digitoN(long num, int pos) {
        num = voltea(num);
        pos--;
        while (pos--> 0) {
            num /= 10;
        }
        return num%10;
    }

    // Da la posición de la primera ocurrencia de un dígito dentro de un número entero. Si no se encuentra, devuelve -1.
    public static int posicionDeDigito(long num, int digito) {
        int i = 0;
        boolean coincide = false;
        while (i++<digitos(num) && !coincide) {
            if (digito == digitoN(num, i)) {
                coincide = true;
            }
        }
        if (coincide) {
            return i;
        } else {
            return -1;
        }
    }

    // Le quita a un número n dígitos por detrás (por la derecha).
    public static long quitaPorDetras(long num, int cant) {
        for (int i = 0; i<cant; i++) {
            num/=10;
        }
        return num;
    }

    // Le quita a un número n dígitos por delante (por la izquierda).
    public static long quitaPorDelante (long num, int cant) {
        num = voltea(num);
        return voltea(quitaPorDetras(num, cant));
    }

    // Añade un dígito a un número por detrás.
    public static long pegaPorDetras(long num, int digito) {
        return num*10+digito;
    }

    // Añade un dígito a un número por delante.
    public static long pegaPorDelante (long num, int digito) {
        return voltea(pegaPorDetras(voltea(num), digito));
    }

    // Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente.
    public static long trozoDeNumero (long num, int posInicial, int posFinal) {
        int digitos = digitos(num);
        num = quitaPorDetras(num, digitos-posFinal);
        num = quitaPorDelante(num, posInicial-1);
        return num;
    }

    // Pega dos números para formar uno.
    public static long juntaNumeros (long num1, long num2) {
        return num1*(long)Math.pow(10, digitos(num2))+num2;
    }
}
