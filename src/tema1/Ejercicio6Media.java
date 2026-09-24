package tema1;

/**
 * Ejercicio 6: calcular el valor medio de los elementos de un array.
 */
public class Ejercicio6Media {

    public static double media(int[] entero) {
        int contador = 0;
        int posicion = 0;
        for (int i = 0; i < entero.length; i++) {
            posicion++;
            contador = contador + entero[i];
        }
        return (double) contador / posicion;
    }

    public static void main(String[] args) {
        int[] entero = {4, 8, 15, 16, 23, 42};
        System.out.println("Media: " + media(entero));
    }
}
