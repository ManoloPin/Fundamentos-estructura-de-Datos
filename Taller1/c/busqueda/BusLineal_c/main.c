#include "stdio.h"

int main(void) {
    int i, n;
    int dato;
    printf("ingrese dato a buscar:\n ");
    scanf("%d", &dato);
    int A[] = {4, 3, 5, 2, 6, 8, 0, 7, 9, 1};
    int tam = 10;
    int pos = -1;
    for (i = 0; i < tam; i++) {
        if (A[i] == dato) {
            pos = i;
        }
    }
    printf("en la pocicion: %d", pos);

    return 0;
}

