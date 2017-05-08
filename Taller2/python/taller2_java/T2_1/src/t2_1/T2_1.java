
package t2_1;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class T2_1 {

    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);
        System.out.println("ingrese tamaño");
        int tam = tec.nextInt();
        int A[]= new int [tam];
        int n = A.length;
        int a = 0;
        for (int i = 0; i < A.length; i++) {          
            A[i] = a;
              a++;      
        }
        for (int i = 0; i < A.length; i++) {
            System.out.printf(A[i]+"\t");
        }
        System.out.println("");
        
        System.out.println("ingrese numeros a comparar");
        int p = tec.nextInt();
        int q = tec.nextInt();
        T2_1 m = new T2_1();
        System.out.println("distancia minima entre "+p+" - "+q+" = "+m.distanciaMi(A, n, p, q));
    }
    public int distanciaMi(int A[], int n , int p, int q){
        int Dismin = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (p == A[i] && q == A[j] || q == A[i] && p == A[j]) {
                     Dismin = Math.abs(i - j);
                }
            }
        }
        return Dismin;
    }
}
