package repasoparcial1;

/**
 * Interfaz comun de los filtros sobre una TrainingSession (ejercicios A y C).
 */
public interface Filter {
    TrainingSession applyFilter(TrainingSession session);
}
