package repasoparcial1;

/**
 * Ejercicio B - Validar consistencia de un CSV de asaltos de esgrima.
 *
 * Cada linea: numeroAsalto, tiradorA, tiradorB, tocadosA, tocadosB.
 * Los numeros de asalto deben ser consecutivos empezando en 1. Devuelve
 * false si no lo son o si alguno no es un entero valido.
 */
public class Competicion {

    public static boolean checkConsistency(String contenido) {
        String[] lineas = contenido.split("\\n");
        int asaltoEsperado = 1;
        for (String linea : lineas) {
            String[] valores = linea.split(",");
            try {
                int asaltoActual = Integer.parseInt(valores[0].trim());
                if (asaltoActual != asaltoEsperado) {
                    return false;
                }
                asaltoEsperado++;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String correcto = "1, Sanchez, Lopez, 15, 12\n"
                + "2, Garcia, Martin, 10, 15\n"
                + "3, Sanchez, Martin, 15, 14";
        String saltoDeAsalto = "1, Sanchez, Lopez, 15, 12\n"
                + "3, Garcia, Martin, 10, 15";
        String noEntero = "1, Sanchez, Lopez, 15, 12\n"
                + "dos, Garcia, Martin, 10, 15";

        System.out.println("Consecutivos:      " + checkConsistency(correcto));
        System.out.println("Salta del 1 al 3:  " + checkConsistency(saltoDeAsalto));
        System.out.println("Indice no entero:  " + checkConsistency(noEntero));
    }
}
