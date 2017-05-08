package busqueda;

/**
 *
 * @author manuel
 */
public class Lineal {//clase

    public int lineal(int A[], int dato) {//metod
        int N = A.length; // pasamos el tamaño a una variable
        int pos = -1;// en caso de que no este es -1
        for (int i = 0; i < A.length; i++) {
            if (A[i] == dato) {// comparar lo que esta en la pocicion i es igual a dato
                pos = i;//si es asi por = i
            }
        }
        return pos;// retorar la pocicion 
    }
}
