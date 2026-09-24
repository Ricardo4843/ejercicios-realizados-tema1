package tema1;

/**
 * Ejercicio 7: contar las vocales de un String.
 */
public class Ejercicio7Vocales {

    public static int contarVocales(String nombre) {
        int contador = 0;
        for (int i = 0; i < nombre.length(); i++) {
            switch (nombre.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    contador++;
                    break;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        String nombre = "murcielago";
        System.out.println("Vocales en \"" + nombre + "\": " + contarVocales(nombre));
    }
}
