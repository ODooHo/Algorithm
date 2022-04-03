import sys
from collections import deque

input = sys.stdin.readline

N,M = map(int,input().split())

graph = [list(map(int,input().rstrip()))for _ in range(N)]
visited = [[False]*M for _ in range(N)]
result = [[0]*M for _ in range(N)]

dx = [0,1,0,-1]
dy = [1,0,-1,0]


def bfs(x,y):
    queue = deque()
    queue.append((x,y))
    visited[x][y] = True
    result[x][y] = 1
    while queue:
        x,y = queue.popleft()
        for i in range(4):
            a,b = x + dx[i], y + dy[i]
            if 0<=a<N and 0<=b<M:
                if not visited[a][b] and graph[a][b] == 1:
                    result[a][b] = result[x][y] + 1
                    visited[a][b] = True
                    queue.append((a,b))

bfs(0,0)
print(result[N-1][M-1])