import sys

input = sys.stdin.readline


n = int(input())


graph = [list(map(int,input().split(" "))) for _ in range(n)]
cnt = [0]*n

result = [[0 for _ in range(n)] for _ in range(n)]


for i in range(5):
    for j in range(n):
        for k in range(j+1,n):
            if graph[j][i] == graph[k][i]:
                result[j][k] = 1
                result[k][j] = 1

cnt = []

for i in result:
    cnt.append(i.count(1))

print(cnt.index(max(cnt))+1)