package tema1;

import java.util.Arrays;

/**
 * Ejercicio 8: calcular el factorial de cada elemento de un array.
 */
public class Ejercicio8FactorialArray {

    public static int[] factoriales(int[] entero) {
        int[] contador = new int[entero.length];
        for (int i = 0; i < entero.length; i++) {
            int factorial = 1;
            for (int j = 1; j <= entero[i]; j++) {
                factorial = factorial * j;
            }
            contador[i] = factorial;
        }
        return contador;
    }

    public static void main(String[] args) {
        int[] entero = {0, 1, 3, 5, 7};
        System.out.println(Arrays.toString(entero) + " -> " + Arrays.toString(factoriales(entero)));
    }
}
