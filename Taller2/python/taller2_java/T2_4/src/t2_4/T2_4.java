package t2_4;

import java.util.Scanner;

/**
 *
 * @author manuel
 */
public class T2_4 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int A[] = {5, 1, 0, 6, 7, 4, 3, 2, 8, 9};
        for (int i = 0; i < A.length; i++) {
            System.out.printf(A[i] + "\t");
        }
        System.out.println("");
        System.out.println("ingrese elementos");
        int p = tec.nextInt();
        int q = tec.nextInt();
        int d = 0;
        for (int x = 0; x < A.length; x++) {
            if (q > p) {
                for (int i = 0; i < A.length; i++) {
                    for (int j = 0; j < A.length; j++) {
                        if (p == A[i] && q == A[j] || q == A[i] && p == A[j]) {
                            d = Math.abs(A[i] - A[j]);
                        }
                    }
                }
            } else {
                System.out.println("ingrese elementos");
                p = tec.nextInt();
                q = tec.nextInt();
            }
        }
        System.out.println("la diferencia mas grande entre " + p + " y " + q + " = " + d);

    }

}
