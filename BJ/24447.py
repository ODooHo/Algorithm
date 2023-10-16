import sys
from collections import deque

input = sys.stdin.readline

def BFS(graph,start,visited,depth):
    global cnt

    queue = deque()
    queue.append((start,depth))
    visited[start] = cnt
    result[start] = depth

    while queue:
        v,depth = queue.popleft()
        result[v] = depth
        for i in graph[v]:
            if not visited[i]:
                cnt+=1
                visited[i] = cnt
                queue.append((i,depth+1))
                



n,m,r = map(int,input().split())

graph = [[]for _ in range(n+1)]
visited = [0] * (n+1)
result = [-1] * (n+1)
cnt = 1

for _ in range(m):
    u,v = map(int,input().split())
    graph[u].append(v)
    graph[v].append(u)

graph = [sorted(row) for row in graph]

BFS(graph,r,visited,0)


temp = []

for i in range(1,n+1):
    a = visited[i] * result[i]
    temp.append(a)

print(sum(temp))