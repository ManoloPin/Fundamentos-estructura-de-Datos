
print("ingrese tamaño")
n = int(raw_input())

A = [0 for i in range(n)]
a = 0
for i in range(n):
    A[i] = a 
    a += 1
for i in range(n):
    print("%d" % A[i])

p = int(raw_input())
q = int(raw_input())

dismin = 0
for i in range(n):
    for j in range(n):
        if(p == A[i] & q == A[j]):
            dismin = abs(i-j)
      
print("la distancia minima entre [%d] y [%d] = %d" % (p, q, dismin))