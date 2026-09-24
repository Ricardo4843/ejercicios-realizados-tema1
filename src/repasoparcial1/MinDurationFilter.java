package repasoparcial1;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio A - Filtro por duracion minima.
 *
 * Devuelve una TrainingSession nueva que conserva solo los Exercise cuya
 * durationSeconds sea mayor o igual que minSeconds.
 */
public class MinDurationFilter implements Filter {
    private int minSeconds;

    public MinDurationFilter(int minSeconds) {
        this.minSeconds = minSeconds;
    }

    public TrainingSession applyFilter(TrainingSession session) {
        List<Exercise> ogExercises = session.getExercises();
        List<Exercise> filteredExercises = new ArrayList<Exercise>();
        for (Exercise exercise : ogExercises) {
            if (exercise.getDurationSeconds() >= minSeconds) {
                filteredExercises.add(exercise);
            }
        }
        TrainingSession filteredSession = new TrainingSession(filteredExercises);
        return filteredSession;
    }

    public static void main(String[] args) {
        List<Exercise> exercises = new ArrayList<Exercise>();
        exercises.add(new Exercise(new int[] {10, 10, 8}, 90));
        exercises.add(new Exercise(new int[] {12, 12}, 45));
        exercises.add(new Exercise(new int[] {5, 5, 5, 5}, 60));
        TrainingSession session = new TrainingSession(exercises);

        Filter filtro = new MinDurationFilter(60);
        System.out.println("Original:           " + session.getExercises());
        System.out.println("Filtrado (>= 60 s): " + filtro.applyFilter(session).getExercises());
    }
}
