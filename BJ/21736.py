from collections import deque

import sys

input = sys.stdin.readline

def bfs(x,y):
    cnt = 0
    visited[x][y] = True
    q = deque()
    q.append((x,y))

    while q:
        x,y = q.popleft()
        for i in range(4):
            a,b = x+dx[i],y+dy[i]
            if 0<=a<n and 0<=b<m and not visited[a][b] and graph[a][b] !="X":
                if graph[a][b] == "P":
                    cnt += 1
                q.append((a,b))
                visited[a][b] = True
    return cnt



n,m = map(int,input().split())

dx = [0,1,0,-1]
dy = [1,0,-1,0]

graph = [list(input().rstrip())for _ in range(n)]
visited = [[False]*m for _ in range(n)]
result = 0

for i in range(n):
    for j in range(m):
        if not visited[i][j] and graph[i][j] == "I":
            result += bfs(i,j)

if result == 0:
    print("TT")
else:
    print(result)