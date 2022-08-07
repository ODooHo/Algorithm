from collections import deque

import sys

input = sys.stdin.readline

def bfs(x,y):
    visited = [False] * (n + 1)
    dist = [0] * (n + 1)
    q = deque()
    q.append(a)
    visited[a] = True
    while q:
        v = q.popleft()
        if v == b:
            print(dist[v])
            return
        for i,distance in graph[v]:
            if not visited[i]:
                q.append(i)
                visited[i] = True
                dist[i]+=dist[v]+ distance





n,m = map(int,input().split())

graph = [[]for _ in range(n+1)]



for i in range(n-1):
    a,b,c = map(int,input().split())
    graph[a].append((b,c))
    graph[b].append((a,c))
for i in range(m):
    a,b = map(int,input().split())
    bfs(a,b)
