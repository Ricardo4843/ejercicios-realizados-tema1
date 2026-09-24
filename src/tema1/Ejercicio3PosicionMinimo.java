package tema1;

/**
 * Ejercicio 3: obtener la posicion del valor minimo de un array.
 */
public class Ejercicio3PosicionMinimo {

    public static int posicionMinimo(int[] datos) {
        int minimo = datos[0];
        int posicion = 0;
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] < minimo) {
                minimo = datos[i];
                posicion = i;
            }
        }
        return posicion;
    }

    public static void main(String[] args) {
        int[] datos = {7, 3, 9, -2, 5};
        System.out.println("Posicion del minimo: " + posicionMinimo(datos));
    }
}
