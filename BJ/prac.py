import sys
from collections import deque

input = sys.stdin.readline


def dfs(graph,v,visited):
    visited[v] = True
    print(v,end=" ")
    for i in graph[v]:
        if not visited[i]:
            dfs(graph,i,visited)

def bfs(graph,start,visited):
    queue = deque([start])
    visited[start] = True
    while queue:
        v = queue.popleft()
        print(v,end = " ")
        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                visited[i] = True




N,M,V = map(int,input().split())



graph = [[]for _ in range(N+1)]
visited = [False]*(N+1)

for i in range(1,M+1):
    a,b = map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)

dfs(graph,1,visited)
visited = [False]*(N+1)
print("")
bfs(graph,1,visited)