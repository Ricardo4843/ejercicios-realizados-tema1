package tema1;

import java.util.Arrays;

/**
 * Ejercicio 1: crear un array de 100 enteros donde cada posicion guarda
 * el cuadrado de su indice.
 */
public class Ejercicio1CuadradoPosicion {

    public static int[] cuadrados() {
        int[] entero = new int[100];
        for (int i = 0; i < 100; i++) {
            entero[i] = i * i;
        }
        return entero;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(cuadrados()));
    }
}
