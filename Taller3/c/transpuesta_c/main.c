
#include "stdio.h"

int main(void) {
    printf("ingrese tamaño");
    int n = scanf("%d", &n);
    int A[n][n];
    int AT[n][n];
    int llenar = 0;
    int i, j;
    for (i = 0; i < n; i++) {
        for (j = 0; j < n; j++) {
            A[i][j] = llenar;
            llenar++;
        }
    }
    for (i = 0; i < n; i++) {
        for (j = 0; j < n; j++) {
            printf("%d\n", A[i][j]);
        }
    }
    for (i = 0; i < n; i++) {
        for (j = 0; j < n; j++) {
            AT[j][i] = A[i][j];
        }
    }
    printf("transpuesta\n");
    for (i = 0; i < n; i++) {
        for (j = 0; j < n; j++) {
            printf("%d\n", AT[i][j]);
        }
    }

}