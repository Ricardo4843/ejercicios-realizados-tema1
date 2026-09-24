package tema1;

/**
 * Ejercicio 4: sumar todos los valores de un array.
 */
public class Ejercicio4Suma {

    public static int suma(int[] enteros) {
        int suma = 0;
        for (int i = 0; i < enteros.length; i++) {
            suma = suma + enteros[i];
        }
        return suma;
    }

    public static void main(String[] args) {
        int[] enteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Suma: " + suma(enteros));
    }
}
