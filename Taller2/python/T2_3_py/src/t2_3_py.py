

import random
;
n = int(raw_input())

A = [0 for i in range(n)]
a = 0
for i in range(n):
    A[i] = random.randint(1, 100);
for i in range(n):
    print("%d" % A[i])
print("ingrese parametro")
d = int (raw_input())
a1 = 0 
a2 = 0
VAbsoluto = 0 

for i in range(n):
    for j in range(n):
        VAbsoluto = abs(A[i]-A[j])
        if (VAbsoluto == d):
            a1 = A[i]
            a2 = A[j]
            print("[%d] - [%d]  = %d" % (a1, a2, d))