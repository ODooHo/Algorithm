import sys
from collections import deque

input = sys.stdin.readline


def bfs(i,j):
    queue = deque()
    queue.append((i,j))
    visited[i][j] = 0

    while queue:
        x,y = queue.popleft()
        for v in range(2):
            nx = [0,graph[x][y]]
            ny = [graph[x][y],0]
            dx,dy = x + nx[v], y + ny[v]

            if 0<=dx<n and 0<=dy<n and visited[dx][dy] == -1:
                if(graph[dx][dy] == -1):
                    ment = "HaruHaru"
                    return ment
                visited[dx][dy] = 0
                queue.append((dx,dy))



n = int(input())


graph = [list(map(int,input().split()))for _ in range(n)]

visited = [[-1]*n for _ in range(n)]


ment = bfs(0,0)
if(ment == None):
    print("Hing")
else:
    print(ment)
