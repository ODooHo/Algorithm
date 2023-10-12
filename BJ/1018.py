import sys

input = sys.stdin.readline

a,b = map(int,input().split())

chess = []

ex = []

for _ in range(a):
    temp = input().strip()
    ex.append(temp)

for i in range(a - 7):
    for j in range(b - 7):
        case_1  = 0
        case_2 = 0
        for k in range(i, i+8):
            for x in range(j, j+8):
                if (k+x) % 2 == 0:
                    if ex[k][x] != 'W':
                        case_1 +=1
                    if ex[k][x] != 'B':
                        case_2 += 1
                else:
                    if ex[k][x] != 'B':
                        case_1 += 1
                    if ex[k][x] != 'W':
                        case_2 += 1
        chess.append(min(case_1,case_2))

print(min(chess))