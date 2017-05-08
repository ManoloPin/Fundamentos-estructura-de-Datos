A = [3, 8, 7, 9, 6, 5, 4, 2, 1, 10]

for i in range(10):
    for j in range(10-1):
        if A[j] > A[j + 1]:
            aux = A[j]
            A[j] = A[j + 1]
            A[j + 1] = aux

for i in range(10):
    print("%d" % A[i])

