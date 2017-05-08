package ordenamiento;

import java.util.Scanner;

/**
 *
 * @author manuel
 */
public class Burbuja {

    public void burbuja(int tam, int A[]) {// metodo 

        int aux;
        for (int i = 1; i < tam; i++) {// recorrer Array 
            for (int j = 0; j < tam - 1; j++) {// recorrer array
                if (A[j] > A[j + 1]) {// comparar pociciones del array y si es el caso hacer
                    aux = A[j];// aux toma el valor de A[j]
                    A[j] = A[j + 1];// ya que el valor de A[j] queda guardado en aux entonces A[j] toma el valor de A[j+1]
                    A[j + 1] = aux;// y A[j+1] toma el valor de aux para cambiar las pocciones y poder ir organizando los valores de menor a mayor 
                }
            }
        }
    }

    public void Mostrar(int tam, int A[]) {// metodo
       
        for (int i = 0; i < tam; i++) {// recorrer el Array
            System.out.printf(A[i]+"\t"); // mostrar el Array ordenado de forma seguida y con espacio   
        }
        System.out.println("");// salto 
        
    }
}
