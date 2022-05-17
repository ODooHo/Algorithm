import sys

input = sys.stdin.readline
INF = 1000000000000

cnt = 0
N = int(input())
asc = list([[1]*10])
for _ in range(N):
    asc.append(list([0]*10)) #N자리수 케이스 저장
for i in range(1,N+1):
    for j in range(0,10):
        for temp in range(j+1):
            asc[i][j] += asc[i-1][temp]
print(asc[N][9]% 10007)