package tema1;

import java.util.Arrays;

/**
 * Ejercicio 5: invertir un array.
 * a) generando un array nuevo
 * b) in-place, intercambiando los extremos hacia el centro
 */
public class Ejercicio5Invertir {

    public static int[] invertirNuevo(int[] enteros) {
        int[] nuevo = new int[enteros.length];
        for (int i = 0; i < enteros.length; i++) {
            nuevo[i] = enteros[enteros.length - i - 1];
        }
        return nuevo;
    }

    public static void invertirInPlace(int[] enteros) {
        int temp;
        for (int i = 0; i < enteros.length / 2; i++) {
            temp = enteros[i];
            enteros[i] = enteros[enteros.length - i - 1];
            enteros[enteros.length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] enteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("a) Nuevo array: " + Arrays.toString(invertirNuevo(enteros)));
        invertirInPlace(enteros);
        System.out.println("b) In-place:    " + Arrays.toString(enteros));
    }
}
