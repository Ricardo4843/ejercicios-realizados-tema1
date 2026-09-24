package repasoparcial1;

import java.util.Arrays;

/**
 * Ejercicio D - Busqueda de posicion minima en una matriz irregular.
 *
 * Devuelve {fila, columna} del valor minimo. Si hay varios minimos iguales,
 * devuelve el primero encontrado recorriendo por filas.
 */
public class MatrizIrregular {

    public static int[] posicionMinima(int[][] datos) {
        int minimo = datos[0][0];
        int[] posicion = {0, 0};
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                if (datos[i][j] < minimo) {
                    minimo = datos[i][j];
                    posicion[0] = i;
                    posicion[1] = j;
                }
            }
        }
        return posicion;
    }

    public static void main(String[] args) {
        int[][] datos = {
            {7, 3, 9},
            {4, 1},
            {8, 6, 1, 5}
        };
        System.out.println("Posicion del minimo: " + Arrays.toString(posicionMinima(datos)));
    }
}
