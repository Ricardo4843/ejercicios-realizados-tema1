package tema1;

import java.util.Random;

/**
 * Algoritmo de la amistad de Sheldon (The Big Bang Theory): traduccion del
 * diagrama de flujo a Java.
 *
 * El metodo hacerAmigo() es el ejercicio. Los metodos auxiliares son stubs
 * sencillos (respuestas aleatorias) para que el programa se pueda ejecutar.
 */
public class AmistadSheldon {

    enum Bebida { TEA, COFFEE, COCOA }

    private static final Random random = new Random();
    private static final String[] INTERESES = {"futbol", "trenes", "comics", "fisica"};

    public static void hacerAmigo() {
        // 1. Llamar hasta que este en casa
        do {
            llamarPorTelefono();
            if (!estaEnCasa()) {
                dejarMensajeYEsperarRespuesta();
            }
        } while (!estaEnCasa());

        // 2. Comida / bebida caliente
        if (preguntarCompartirComida()) {
            cenarJuntos();
        } else if (preguntarBebidaCaliente()) {
            switch (elegirBebida()) {
                case TEA: tomarTe(); break;
                case COFFEE: tomarCafe(); break;
                case COCOA: tomarCacao(); break;
            }
        }

        // 3. Actividad recreativa compartida
        int N = 0;
        int LIMITE = 5;
        String interes = preguntarInteres();
        while (!compartenInteres(interes) && N < LIMITE) {
            N++;
            interes = preguntarInteres();
        }
        if (compartenInteres(interes)) {
        } else {
            interes = elegirInteresMenosObjetable();
        }
        participarActividad(interes);

        empezarAmistad();
    }

    // ---- Metodos auxiliares (stubs) ----

    private static boolean enCasa = false;

    static void llamarPorTelefono() {
        System.out.println("Llamando por telefono...");
        enCasa = random.nextBoolean();
    }

    static boolean estaEnCasa() {
        return enCasa;
    }

    static void dejarMensajeYEsperarRespuesta() {
        System.out.println("No esta en casa. Dejo mensaje y espero respuesta.");
    }

    static boolean preguntarCompartirComida() {
        System.out.println("Quieres compartir una comida?");
        return random.nextBoolean();
    }

    static boolean preguntarBebidaCaliente() {
        System.out.println("Te apetece una bebida caliente?");
        return random.nextBoolean();
    }

    static void cenarJuntos() {
        System.out.println("Cenamos juntos.");
    }

    static Bebida elegirBebida() {
        return Bebida.values()[random.nextInt(Bebida.values().length)];
    }

    static void tomarTe() {
        System.out.println("Tomamos te.");
    }

    static void tomarCafe() {
        System.out.println("Tomamos cafe.");
    }

    static void tomarCacao() {
        System.out.println("Tomamos cacao.");
    }

    static String preguntarInteres() {
        String interes = INTERESES[random.nextInt(INTERESES.length)];
        System.out.println("Cual es uno de tus intereses? -> " + interes);
        return interes;
    }

    static boolean compartenInteres(String interes) {
        return interes.equals("comics") || interes.equals("fisica");
    }

    static String elegirInteresMenosObjetable() {
        System.out.println("No hay interes comun: elijo el menos objetable.");
        return "trenes";
    }

    static void participarActividad(String interes) {
        System.out.println("Participamos juntos en: " + interes);
    }

    static void empezarAmistad() {
        System.out.println("Empieza la amistad.");
    }

    public static void main(String[] args) {
        hacerAmigo();
    }
}
