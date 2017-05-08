package busqueda;

import java.util.Scanner;
/**
 *
 * @author manuel
 */
public class binaria {// clase 

    public int busBinaria(int A[], int dato, int inf, int sup) {// metodo
      int indice = -1;// en caso de que no este la pocicion es -1
      while(inf != sup){// se comparan para despues repetir la siguinete operacion 
          int mitad = (sup + inf)/2;// se calcula la mitad 
          if(A[mitad]==dato){// si la mitad es = al dato buscado 
              indice = mitad;// indice toma el valor de la pocicion 
              break;// y se sierra para que no se siga con la operacion 
          }else{// en caso de que no 
              if( dato < A[mitad]){// se compara si dato es menor o mayor que l mitad 
                  sup = mitad;// en caso de que sea menor la parte superior se iguala o toma el valor de mitad 
              }else{
                  inf = mitad;// en caso de que sea mayor // el que toma el valor es inf 
              }
          }
      }
      if (inf == sup && A[inf] == dato){// en caso de que el recorrido llegue a la misma pocicion por los dos lados entonces
          indice = inf;// mostrar cualquiera de los dos en este caso inf 
      }
      return indice;// al terminar mostrar el valor almacenado en indice 
    }
}
