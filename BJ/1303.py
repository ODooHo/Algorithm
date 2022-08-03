from collections import deque

import sys


input = sys.stdin.readline

def bfs1(x,y):
    q = deque()
    q.append((x,y))
    cnt = 0
    visited[x][y] = True

    while q:
        x,y = q.popleft()
        if graph[x][y] == "W":
            cnt+=1
        for i in range(4):
            a = x+dx[i]
            b = y+dy[i]
            if 0<=a<m and 0<=b<n and not visited[a][b] and graph[a][b] == "W":
                q.append((a,b))
                visited[a][b] =True
    return cnt**2

def bfs2(x,y):
    q = deque()
    q.append((x,y))
    cnt = 0
    visited[x][y] = True

    while q:
        x,y = q.popleft()
        if graph[x][y] == "B":
            cnt+=1
        for i in range(4):
            a = x+dx[i]
            b = y+dy[i]
            if 0<=a<m and 0<=b<n and not visited[a][b] and graph[a][b] == "B":
                q.append((a,b))
                visited[a][b] =True
    return cnt**2




n,m = map(int,input().split())

graph = [input().rstrip() for _ in range(m)]
visited = [[False]*(n) for _ in range(m)]
dx = [0,1,0,-1]
dy = [1,0,-1,0]
reW = 0
reB = 0


for i in range(m):
    for j in range(n):
        if not visited[i][j] and graph[i][j] == "W":
            reW +=bfs1(i,j)
        elif not visited[i][j] and graph[i][j] == "B":
            reB +=bfs2(i,j)
print(reW,reB)