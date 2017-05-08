
A = [5, 1, 0, 6, 7, 4, 3, 2, 8, 9]
for i in range(10):
    print ("%d" % A[i] + "\t")
  
print ("ingrese elementos")

p = int(raw_input())
q = int(raw_input())
distancia = 0
for x in range(10):
    if (q > p):
        for i in range(10):
            for j in range(10):
                if(p == A[i] & q == A[j]):
                    distancia = abs(A[i]- A[j])
    else:
        print("ingrese elementos")
        p = int(raw_input())
        q = int(raw_input())
          
print(" la diferencia mas grande entre %d y %d = %d" % (p, q, distancia))
