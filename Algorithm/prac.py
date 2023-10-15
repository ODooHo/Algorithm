import sys
from collections import deque

input = sys.stdin.readline



def dfs(graph,v,visited):
    visited[v] = True
    print(v)
    for i in graph[v]:
        if not visited[i]:
            dfs(graph,i,visited)


def bfs(graph,start,visited):
    queue = deque([start])
    visited[start] = True
    print(start)

    while queue:
        v = queue.popleft()

        for i in graph[v]:
            if not visited[i]:
                visited[i] = True
                queue.append(i)
    


a,b,c = map(int(input().split()))

result = []
