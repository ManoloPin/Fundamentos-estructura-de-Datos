
A = [10, 4, 1, 6, 2]
n = 5
B = [0 for i in range(n)]

producto = 1 
for i in range(n):
    print("%d" % A[i])

for i in range(n):
    producto *= A[i]

for i in range(n):
    B[i] = producto / A[i]

print(" array B :")
for i in range(n):
    print ("%d" % B[i])