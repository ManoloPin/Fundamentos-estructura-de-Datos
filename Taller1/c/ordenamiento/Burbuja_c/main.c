#include "stdio.h"
int main(void) {
 int aux,i,j;
 int A[] = {4,0,1,3,2,5,6,8,9,7};
 int n = 10;
 for(i = 0 ; i < n ; i++){
   for(j = 0 ; j <n; j++){
     if(A[j]>= A[j+1]){
       aux = A[j];
       A[j] = A[j+1];
       A[j+1] = aux;
     }
   }
 }
 for(i = 0 ; i < n; i++){
   printf("%d , ",A[i]);
 }
  return 0;
}

