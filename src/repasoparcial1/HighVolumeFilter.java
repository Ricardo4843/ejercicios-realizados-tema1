package repasoparcial1;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio C - Filtro combinado con dos condiciones.
 *
 * Conserva solo los Exercise donde la suma de repsPerSet supera
 * minTotalReps Y la duracion es menor que maxSeconds.
 */
public class HighVolumeFilter implements Filter {
    private int minTotalReps;
    private int maxSeconds;

    public HighVolumeFilter(int minTotalReps, int maxSeconds) {
        this.minTotalReps = minTotalReps;
        this.maxSeconds = maxSeconds;
    }

    public TrainingSession applyFilter(TrainingSession session) {
        List<Exercise> ogExercises = session.getExercises();
        List<Exercise> filteredExercises = new ArrayList<Exercise>();
        for (Exercise exercise : ogExercises) {
            int[] reps = exercise.getRepsPerSet();
            int totalReps = 0;
            for (int i = 0; i < reps.length; i++) {
                totalReps = totalReps + reps[i];
            }
            if (totalReps > minTotalReps && exercise.getDurationSeconds() < maxSeconds) {
                filteredExercises.add(exercise);
            }
        }
        TrainingSession filteredSession = new TrainingSession(filteredExercises);
        return filteredSession;
    }

    public static void main(String[] args) {
        List<Exercise> exercises = new ArrayList<Exercise>();
        exercises.add(new Exercise(new int[] {10, 10, 8}, 90));   // 28 reps, 90 s -> fuera (duracion)
        exercises.add(new Exercise(new int[] {12, 12}, 45));      // 24 reps, 45 s -> dentro
        exercises.add(new Exercise(new int[] {5, 5, 5, 5}, 60));  // 20 reps, 60 s -> fuera (reps)
        TrainingSession session = new TrainingSession(exercises);

        Filter filtro = new HighVolumeFilter(20, 80);
        System.out.println("Original:                     " + session.getExercises());
        System.out.println("Filtrado (> 20 reps, < 80 s): " + filtro.applyFilter(session).getExercises());
    }
}
