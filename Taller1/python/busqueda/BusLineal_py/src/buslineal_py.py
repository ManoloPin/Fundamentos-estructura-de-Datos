
A = [9, 7, 8, 5, 3, 4, 8, 2, 0, 1]

for i in range(10-1):
    menor = A[i]
    pos = i
    for j in range(10):
        if A[j] < menor:
            menor = A[j]
            pos = j
  
    if pos != i:
        tmp = A[i]
        A[i] = A[pos]
        A[pos] = tmp
  
for i in range(10):
    print("%d" % A[i])