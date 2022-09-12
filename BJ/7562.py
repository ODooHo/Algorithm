from collections import deque

import sys

input = sys.stdin.readline


def bfs(sx,sy,ax,ay):
    q = deque()
    q.append((sx,sy))
    graph[sx][sy] = 1
    while q:
        a,b = q.popleft()
        if a == ax and b == ay:
            print(graph[ax][ay]-1)
            return
        for i in range(8):
            x , y = a+dx[i],b+dy[i]
            if 0<=x<n and 0<=y<n and graph[x][y] == 0:
                q.append((x,y))
                graph[x][y] = graph[a][b] +1





T = int(input())

dx = [-2,-1,1,2,2,1,-1,-2]
dy = [1,2,2,1,-1,-2,-2,-1]


for _ in range(T):
    n = int(input())
    graph = [[0]* n for _ in range(n)]
    a,b = map(int,input().split())
    c,d = map(int,input().split())
    bfs(a,b,c,d)













