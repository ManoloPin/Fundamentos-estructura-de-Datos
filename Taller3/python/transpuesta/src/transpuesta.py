

A = [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]
AT = [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]
llenar = 0
n = 4
for i in range(n):
    for j in range(n):
        A[i][j] = llenar
        llenar += 1
for i in range(n):
    for j in range(n):
        print("A[%d][%d] = %d" % (i, j, A[i][j]))

for i in range(n):
    for j in range(n):
        AT[j][i] = A[i][j]

print("transpuesta =")
for i in range(n):
    for j in range(n):
        print("AT[%d][%d] = %d" % (i, j, AT[i][j]))