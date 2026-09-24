package tema1;

/**
 * Triangulo de Pascal usando combinaciones: C(n, k) = n! / (k! * (n - k)!)
 */
public class TrianguloPascal {

    public static int factorial(int x) {
        int factorial = 1;
        for (int i = 1; i <= x; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void pascal(int N) {
        for (int n = 0; n < N; n++) {
            for (int k = 0; k <= n; k++) {
                int combinacion = factorial(n) / (factorial(k) * factorial(n - k));
                System.out.print(combinacion + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pascal(6);
    }
}
