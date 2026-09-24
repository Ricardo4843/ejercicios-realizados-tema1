package repasoparcial1;

import java.util.Arrays;

/**
 * Ejercicio de una sesion de entrenamiento: repeticiones por serie y
 * duracion en segundos. Clase dada por el enunciado (ejercicios A y C).
 */
public class Exercise {
    private int[] repsPerSet;
    private int durationSeconds;

    public Exercise(int[] repsPerSet, int durationSeconds) {
        this.repsPerSet = repsPerSet;
        this.durationSeconds = durationSeconds;
    }

    public int[] getRepsPerSet() {
        return repsPerSet;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    @Override
    public String toString() {
        return Arrays.toString(repsPerSet) + " " + durationSeconds + "s";
    }
}
