from collections import deque


import sys

def bfs():
    while q:
        a,b = q.popleft()
        for i in range(8):
            x = a + dx[i]
            y = b + dy[i]
            if 0<=x<n and 0<=y<m and graph[x][y] == 0:
                q.append((x,y))
                graph[x][y] = graph[a][b] + 1





input = sys.stdin.readline




n,m = map(int,input().split())
graph = [list(map(int,input().split()))for _ in range(n)]
dx = [-1,0,1,1,1,0,-1,-1]
dy = [1,1,1,0,-1,-1,-1,0]
q = deque()


dist = 0

for i in range(n):
    for j in range(m):
        if graph[i][j] == 1:
            q.append((i,j))
bfs()
dist = 0

for i in range(n):
    for j in range(m):
        dist = max(graph[i][j],dist)

print(dist-1)