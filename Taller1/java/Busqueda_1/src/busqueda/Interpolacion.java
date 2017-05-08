package busqueda;

/**
 *
 * @author manuel
 */
public class Interpolacion {// clase 

    public int busInterpolacion(int A[], int dato, int inf, int sup) {// metodo
        int indice = -1; // en caso de que no este es -1
        while (inf != sup) {// se repite varias veces la siguiente operacion hasta encontrar la pocicion  
            int mitad = inf + ((sup - inf) / (A[sup] - A[inf])) * (dato - A[inf]);// se calcula la pocicion mas cercana al dato buscado
            if (A[mitad] == dato) {// se compara la pocicion con el dato
                indice = mitad;// si es el caso se iguala indice  la pocicion 
                break;// se cierra para que no se siga la operacion 
            } else {// en el caso de que no sea asi 
                if (dato < A[mitad]) {// se compara si es menor
                    sup = mitad;// en el caso sup = la mitad
                } else {// en el caso de que no sea asi 
                    inf = mitad;// inf es la que se iguala a mitad 
                }
            }
        }
        if (inf == sup && A[inf] == dato) {// en caso de que inf y superios sean iguales y hay este el dato almacenado
            indice = inf;// indice toma el valor de cualquiera de los dos en este caso inf
        }
        return indice;// retornar lo guardado en indice 
    }
}
