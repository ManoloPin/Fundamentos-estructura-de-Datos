package t2_3;

import java.util.Scanner;

/**
 *
 * @author manuel
 */
public class T2_3 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("ingrese tamaño del array");
        int tam = tec.nextInt();
        int A[] = new int[tam];
        int rango = 100;
        for (int i = 1; i < A.length; i++) {// numeros aleatorios sin repeticion
            A[i] = (int) (Math.random() * rango);
            for (int j = 0; j < 1; j++) {
                if (A[i] == A[j]) {
                    i--;
                }
            }
        }
        for (int i = 0; i < A.length; i++) {
            System.out.printf(A[i] + "\t");// mostrar el array
        }
        System.out.println("");
        // comparar para saver si son iguales y cuantas parejas 
        System.out.println("ingrese parametro");
        int d = tec.nextInt();// ingresa parametro 
        int a1 = 0;
        int a2 = 0;
        int VAbsoluto = 0;
        for (int i = 0; i < A.length; i++) {
             for (int j = 0; j < A.length; j++) {
                VAbsoluto = Math.abs(A[i] - A[j]);
                if (VAbsoluto == d) {
                    a1 = A[i];
                    a2 = A[j];
                    System.out.println("[" + a1 + "]" + " menos " + "[" + a2 + "]" + " = " + d);
                }
            }       
        }       
    }
}
