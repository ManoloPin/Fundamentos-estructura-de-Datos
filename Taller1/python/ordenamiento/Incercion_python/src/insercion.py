
A = [6, 4, 5, 3, 1, 7, 8, 9, 2, 0]

for i in range(10):
    a = A[i]
    j = i-1
    while j >= 0 and A[j] > a:
        A[j + 1] = A[j]
        j = j-1
    A[j + 1] = a
  
for i in range(10):
    print("%d" % A[i])
