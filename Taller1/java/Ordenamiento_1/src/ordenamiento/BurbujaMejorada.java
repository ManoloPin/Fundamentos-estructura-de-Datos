package ordenamiento;

/**
 *
 * @author manuel
 */
public class BurbujaMejorada {

    public void bMejorada(int A[], int tam) {//metodo
        
        int aux;
        for (int i = 1; i < tam; i++) {// se recorre la matriz 
            for (int j = 0; j < i; j++) {// recoore la matriz
                if (A[i] < A[j]) {//compara el valor que esta en la pociion i con la posicion j
                    aux = A[j];// si es el caso aux toma el valor guardado en pa pocicion j
                    A[j] = A[i];// j toma el valor almacenado en i
                    A[i] = aux;// e i toma el valor que se almaceno en j
                }
            }
        }
    }

    public void mostrar(int A[], int tam) {//metod
        for (int i = 0; i < tam; i++) {//recoorer el Array
            System.out.printf(A[i]+"\t");//mostar por panatalla el Array ordenado
        }
        System.out.println("");//salto
    }

}
