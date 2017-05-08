package ordenamiento;

/**
 *
 * @author manuel
 */
public class Shell {

    public void shell(int A[]) {//metodo
        int salto, aux, i;
        boolean cambios;
        for (salto = A.length / 2; salto != 0; salto /= 2) {//salto empiesa en la mitad y se va dividiendo por 2 
            cambios = true;
            while (cambios) { // Mientras se intercambie algún elemento
                cambios = false;
                for (i = salto; i < A.length; i++) // se da una pasada
                {
                    if (A[i - salto] > A[i]) { // y si están desordenados
                        aux = A[i]; // se reordenan
                        A[i] = A[i - salto];
                        A[i - salto] = aux;
                        cambios = true; // y se marca como cambio.
                    }
                }
            }
        }
    }

    public void mostrar(int A[], int tam) {//metodo
        for (int i = 0; i < A.length; i++) {
            System.out.printf(A[i] + "\t");//imprimir
        }
        System.out.println("");//salto
    }
}
