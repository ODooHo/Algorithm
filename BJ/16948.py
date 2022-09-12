from collections import deque
import sys


input = sys.stdin.readline

def bfs(a,b):
    q = deque()
    q.append((a,b))
    graph[a][b] = 0
    while q:
        a,b = q.popleft()
        if a == c and b == d:
            return
        for i in range(6):
            x = a+dx[i]
            y = b+dy[i]
            if 0<=x<n and 0<=y<n and graph[x][y] == -1:
                q.append((x,y))
                graph[x][y] = graph[a][b] + 1



n = int(input())
dx = [-2,-2,0,0,2,2]
dy = [-1,1,-2,2,-1,1]
graph = [[-1]*n for _ in range(n)]

a,b,c,d = map(int,input().split())

bfs(a,b)
print(graph[c][d])