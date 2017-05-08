#include "stdio.h"

int main(void) {
    int salto, aux, i;
    int A[] = {4, 3, 5, 2, 6, 8, 0, 7, 9, 1};
    int tam = 10;
    bool cambios;
    for (salto = tam / 2; salto != 0; salto /= 2) {
        cabios = true;
        while (cambios) {
            for (i = salto; i < tam; i++) {
                if (A[i - salto] > A[i]) {
                    aux = A[i];
                    A[i] = A[i - salto];
                    A[i - salto] = aux;
                    cabios = true;
                }
            }
        }
    }
    for (i = 0; i < tam; i++) {
        printf("%d , ", A[i]);
    }
    return 0;
}
