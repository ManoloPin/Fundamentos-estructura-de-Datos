#include "stdio.h"

int main(void) {
    int i, j;
    int A[] = {4, 3, 5, 2, 6, 8, 0, 7, 9, 1};
    int tam = 10;
    for (i = 0; i < tam; i++) {
        int a = A[i];
        for (j = i - 1; j >= 0 && A[j] > a; j--) {
            A[j + 1] = A[j];
        }
        A[j + 1] = a;
    }
    for (i = 0; i < tam; i++) {
        printf("%d , ", A[i]);
    }
    return 0;
}

