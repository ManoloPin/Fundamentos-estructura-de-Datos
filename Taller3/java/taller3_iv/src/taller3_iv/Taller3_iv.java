package taller3_iv;

import java.util.Scanner;

/**
 *
 * @author manuel
 */
public class Taller3_iv {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("ingrese tamaño del Array");
        int n = tec.nextInt();
        int A[][] = new int[n][n];
        int AT[][] = new int[n][n];
        int llenar = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                A[i][j] = llenar;
                llenar++;
            }
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.printf(A[i][j] + "\t");
            }
            System.out.println("");
            System.out.println("");
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                AT[j][i] = A[i][j];
            }
        }
        System.out.println("transpuesta");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.printf(AT[i][j] + "\t");
            }
            System.out.println("");
            System.out.println("");
        }
    }

}
