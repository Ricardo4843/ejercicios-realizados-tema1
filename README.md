# Ejercicios realizados - Tema 1 (ALED)

Ejercicios resueltos del Tema 1 de Algoritmos y Estructuras de Datos (repaso de programación en Java: arrays, bucles, Strings, métodos y estructuras de control).

Proyecto de Eclipse. Cada ejercicio es una clase en `src/tema1/` con su propio `main` que lo prueba con datos de ejemplo.

| Ejercicio | Clase |
|---|---|
| 1. Array de 100 enteros con el cuadrado de cada posición | `Ejercicio1CuadradoPosicion` |
| 2. Valor mínimo de un array | `Ejercicio2Minimo` |
| 3. Posición del valor mínimo | `Ejercicio3PosicionMinimo` |
| 4. Suma de los valores de un array | `Ejercicio4Suma` |
| 5. Invertir un array (array nuevo e in-place) | `Ejercicio5Invertir` |
| 6. Valor medio de un array | `Ejercicio6Media` |
| 7. Contar vocales de un String | `Ejercicio7Vocales` |
| 8. Factorial de cada elemento de un array | `Ejercicio8FactorialArray` |
| Triángulo de Pascal (método de combinaciones) | `TrianguloPascal` |
| Algoritmo de la amistad de Sheldon (diagrama de flujo a Java) | `AmistadSheldon` |

## Repaso para el Parcial 1

Ejercicios del estilo del examen de 2025-26 (filtros sobre listas de objetos, parseo de Strings, arrays), con contexto de esgrima y entrenamiento. Están en `src/repasoparcial1/`.

| Ejercicio | Clase |
|---|---|
| A. Filtro por duración mínima | `MinDurationFilter` |
| B. Validar la consistencia de un CSV de asaltos de esgrima | `Competicion` |
| C. Filtro combinado con dos condiciones | `HighVolumeFilter` |
| D. Posición mínima en una matriz irregular | `MatrizIrregular` |
| E. Clase `Asalto` con validación en el constructor | `Asalto` |

Clases de apoyo: `Filter`, `TrainingSession`, `Exercise`.

## Cómo ejecutarlo

- **Eclipse:** File > Import > Existing Projects into Workspace, y Run As > Java Application sobre cualquier clase.
- **Terminal:**
  ```
  javac -d bin src/tema1/*.java src/repasoparcial1/*.java
  java -cp bin tema1.TrianguloPascal
  java -cp bin repasoparcial1.Competicion
  ```
