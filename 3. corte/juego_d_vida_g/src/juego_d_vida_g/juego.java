package juego_d_vida_g;

/**
 *
 * @author manuel
 */
public class juego {

    public int[][] juego(int length) {
        int A[][] = new int[length][length];
        int n = A.length;
        int i = 0, j = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                A[i][j] = Math.random() < 0.5 ? 0 : 1;
            }
        }
        int contador = 0;
        while (true) {
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    contador = A[(i - 1 + n) % n][(j - 1 + n) % n] + A[(i - 1 + n) % n][1]
                            + A[(i - 1 + n) % n][(j + 1) % n] + A[i][(j - 1 + n) % n]
                            + A[i][(j + 1) % n] + A[(i + 1) % n][(j - 1 + n) % n]
                            + A[(i + 1) % n][j] + A[(i + 1) % n][(j + 1) % n];

                    if (A[i][j] == 1) {//vivo
                        if (contador < 2 || contador > 3) {
                            A[i][j] = 0;
                        }
                    } else {
                        if (contador == 3) {
                            A[i][j] = 1;
                        }
                    }// fin vivo o muerto
                }//fin for j
            }// fin for i 
            return A;

        }
    }
}
