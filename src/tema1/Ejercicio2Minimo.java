package tema1;

/**
 * Ejercicio 2: obtener el valor minimo de un array.
 */
public class Ejercicio2Minimo {

    public static int minimo(int[] datos) {
        int minimo = datos[0];
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] < minimo) {
                minimo = datos[i];
            }
        }
        return minimo;
    }

    public static void main(String[] args) {
        int[] datos = {7, 3, 9, -2, 5};
        System.out.println("Minimo: " + minimo(datos));
    }
}
