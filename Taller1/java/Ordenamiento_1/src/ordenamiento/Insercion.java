
package ordenamiento;

/**
 *
 * @author manuel
 */
public class Insercion {
   public void insertionSort(int[] A) {//metodo
        
        int j;
        for (int i = 1; i < A.length; i++) {//se recoore el Array desde la pocicion 1
            int a = A[i]; // guardamos la pocicion i en una variable a
            for (j = i - 1; j >= 0 && A[j] > a; j--) {// se vuelve arecorrer el Array pero j= la pocicion i -1 mientras sea >= a 0 yy la pocicion j sea mayor A a ntonces se disminulle 
                A[j + 1] = A[j];// se guarda en j+1 el valor que esta en j
            }
            A[j + 1] = a;// guardar en j+1 el valor de la variable a
        }
        
    }

    public void mostrar(int A[], int tam) {// metodo
        for (int i = 0; i < A.length; i++) {// se recorre el Array 
            System.out.printf(A[i]+"\t");// se muestra el array ordenado
        }
        System.out.println("");//salto
    }  
}
