from collections import deque

import sys



input = sys.stdin.readline

def bfs(x,y):
    graph[x][y] = 0
    q = deque()
    q.append((x,y))
    while q:
        x,y = q.popleft()
        for i in range(8):
            a = x+dx[i]
            b = y+dy[i]
            if 0<=a<m and 0<=b<n:
                if graph[a][b] == 1:
                    graph[a][b] = 0
                    q.append((a,b))




m,n = map(int,input().split())
dx = [-1,0,1,1,1,0,-1,-1]
dy = [1,1,1,0,-1,-1,-1,0]


graph = [list(map(int,input().split()))for _ in range(m)]
num = 0

for i in range(m):
    for j in range(n):
        if graph[i][j] == 1:
             num +=1
             bfs(i,j)

print(num)