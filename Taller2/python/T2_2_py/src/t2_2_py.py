

A = [5, 2, 2, 4, 3, 5, 4, 7, 3]

NRepetidos = 0
for i in range(9):
    print("%d" % A[i])

for i in range(9):
    for j in  range(i + 1, 9):
        if(A[i] != A[j]):
            NRepetidos = A[i];
print
print("%d" % NRepetidos)