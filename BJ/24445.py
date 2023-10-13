import sys
from collections import deque

input = sys.stdin.readline

def BFS(graph,start,visited):
    global cnt
    queue = deque([start])

    visited[start] = cnt

    while queue:
        v = queue.popleft()
        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                cnt+=1
                visited[i] = cnt



n,m,r = map(int,input().split())

graph = [[]for _ in range(n+1)]
visited = [0] * (n+1)
cnt = 1

for _ in range(m):
    u,v = map(int,input().split())
    graph[u].append(v)
    graph[v].append(u)

graph = [sorted(row,reverse = True) for row in graph]

BFS(graph,r,visited)


for i in range(1,n+1):
    print(visited[i])