package repasoparcial1;

/**
 * Ejercicio E - Clase con validacion en el constructor.
 *
 * Un asalto de esgrima. El constructor lanza IllegalArgumentException si
 * algun numero de tocados es negativo o si los dos tiradores se llaman igual.
 */
public class Asalto {
    private String tiradorA, tiradorB;
    private int tocadosA, tocadosB;

    public Asalto(String tiradorA, String tiradorB, int tocadosA, int tocadosB) {
        if (tocadosA < 0 || tocadosB < 0) {
            throw new IllegalArgumentException("Los tocados no pueden ser negativos");
        }
        if (tiradorA.equals(tiradorB)) {
            throw new IllegalArgumentException("Los dos tiradores no pueden ser el mismo");
        }
        this.tiradorA = tiradorA;
        this.tiradorB = tiradorB;
        this.tocadosA = tocadosA;
        this.tocadosB = tocadosB;
    }

    public String ganador() {
        if (tocadosA > tocadosB) {
            return tiradorA;
        } else if (tocadosB > tocadosA) {
            return tiradorB;
        } else {
            return "empate";
        }
    }

    public static void main(String[] args) {
        System.out.println("Ganador: " + new Asalto("Sanchez", "Lopez", 15, 12).ganador());
        System.out.println("Ganador: " + new Asalto("Sanchez", "Lopez", 5, 5).ganador());

        try {
            new Asalto("Sanchez", "Lopez", -1, 5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            new Asalto("Sanchez", "Sanchez", 15, 10);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
