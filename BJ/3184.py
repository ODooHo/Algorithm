from collections import deque


import sys


input = sys.stdin.readline

def bfs(x,y):
    q = deque()
    tw = 0
    ts = 0
    q.append((x,y))
    visited[x][y] = True
    while q:
        x,y = q.popleft()
        if graph[x][y] == 'o':
            ts +=1
        elif graph[x][y] == 'v':
            tw +=1
        for i in range(4):
            a = x+dx[i]
            b = y+dy[i]
            if 0<=a<r and 0<=b<c and graph[a][b]!='#' and not visited[a][b]:
                q.append((a,b))
                visited[a][b] = True
    return tw,ts





r,c = map(int,input().split())

graph = [input()for _ in range(r)]
visited = [[False]*(c) for _ in range(r)]
dx = [0,1,0,-1]
dy = [1,0,-1,0]
wolf = 0
sheep = 0

for i in range(r):
    for j in range(c):
        if not visited[i][j] and graph[i][j] !="#":
            w,s = bfs(i,j)
            if s > w:
                w = 0
            else:
                s = 0
            wolf +=w
            sheep +=s
print(sheep,wolf)