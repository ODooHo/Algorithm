import sys
from collections import deque

input = sys.stdin.readline

def BFS(graph,start,visited,depth):
    queue = deque()
    queue.append((start,depth))
    visited[start] = True
    result[start] = depth

    while queue:
        v,depth = queue.popleft()
        result[v] = depth
        for i in graph[v]:
            if not visited[i]:
                visited[i] = True
                queue.append((i,depth+1))
                



n,m,r = map(int,input().split())

graph = [[]for _ in range(n+1)]
visited = [False] * (n+1)
result = [-1] * (n+1)


for _ in range(m):
    u,v = map(int,input().split())
    graph[u].append(v)
    graph[v].append(u)

graph = [sorted(row) for row in graph]

BFS(graph,r,visited,0)


for i in range(1,n+1):
    print(result[i])