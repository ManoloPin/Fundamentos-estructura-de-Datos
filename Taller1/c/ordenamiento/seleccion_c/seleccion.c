#include "stdio.h"

int main(void) {
    int i, j, menor, tmp;
    int A[] = {4, 3, 5, 2, 6, 8, 0, 7, 9, 1};
    int tam = 10;
    for (i = 0; i < tam - 1; i++) {
        menor = A[i];
        int pos = i;
        for (j = i + 1; j < tam; j++) {
            if (A[j] < menor) {
                menor = A[j];
                pos = j;
            }
        }
        if (pos != i) {
            tmp = A[i];
            A[i] = A[pos];
            A[pos] = tmp;
        }
    }
    for (i = 0; i < tam; i++) {
        printf("%d , ", A[i]);
    }
    return 0;
}
