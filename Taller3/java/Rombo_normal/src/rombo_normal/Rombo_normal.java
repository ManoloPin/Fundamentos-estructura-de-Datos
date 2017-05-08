
package rombo_normal;

import java.util.Scanner;

/**
 *
 * @author manuel
 * 
 * rombo
 * no e usado numeros aleatoios para que el rombo quedara es notorio pero en dado caso es solo una linea
 */
public class Rombo_normal {

    
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("ingrese tamaño del array\n"
                + " solo numeros impares ");
        int tam = tec.nextInt();

        char A[][] = new char[tam][tam];
        int n = A.length - 1;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {

                if ((j < (n / 2 - i) || j > (n - i + n / 2)) 
                    ||   (j > i + n / 2 || j < i - n / 2)) {
                    A[i][j] = ' ';
                }else{
                    A[i][j] = 'a';
                }
                
            }
        }
        for (char[] A1 : A) {
            for (int j = 0; j < A.length; j++) {
                System.out.printf(A1[j] + "\t");
            }
            System.out.println("");
            System.out.println("");
            System.out.println("");
        }

    }
    
}
