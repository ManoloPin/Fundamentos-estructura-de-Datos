package ordenamiento;

/**
 *
 * @author manuel
 */
public class Seleccion {

    public void seleccion(int A[]) {//metodo

        int i, j, menor, pos, tmp;
        for (i = 0; i < A.length - 1; i++) { // tomamos como menor el primero
            menor = A[i]; // de los elementos que quedan por ordenar
            pos = i; // y guardamos su posición
            for (j = i + 1; j < A.length; j++) { // buscamos en el resto
                if (A[j] < menor) { // del array algún elemento
                    menor = A[j]; // menor que el actual
                    pos = j;
                }
            }
            if (pos != i) { // si hay alguno menor se intercambia
                tmp = A[i];
                A[i] = A[pos];
                A[pos] = tmp;
            }
        }
    }
        public void mostrar(int A[], int tam) {//metodo
        for (int i = 0; i < A.length; i++) {
            System.out.printf(A[i]+"\t");// se imprime el Array
        }
            System.out.println("");//salto
    }

}
