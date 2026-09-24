package repasoparcial1;

import java.util.List;

/**
 * Sesion de entrenamiento: lista de Exercise. Clase dada por el enunciado
 * (ejercicios A y C).
 */
public class TrainingSession {
    private List<Exercise> exercises;

    public TrainingSession(List<Exercise> exercises) {
        this.exercises = exercises;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }
}
