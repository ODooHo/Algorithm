import sys

sys.setrecursionlimit(10**9)
input = sys.stdin.readline


def dfs(x, y, num):
    if len(num) == 6:
        if num not in temp:
            temp.append(num)
        return

    for i in range(4):
        a = x + dx[i]
        b = y + dy[i]
        if 0<=a<5 and 0<=b<5:
            dfs(a,b,num+graph[a][b])

dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]
graph = []
temp = []

for _ in range(5):
    a = list(map(str, input().split()))
    graph.append(a)
for i in range(5):
    for j in range(5):
        dfs(i,j,graph[i][j])

print(len(temp))