import sys
from collections import deque #큐를 사용하기 위한 라이브러리

def bfs(graph, start, visited):
    queue = deque([start])

    visited[start] = True

    while queue:
        v = queue.popleft() #왼쪽부터 뽑음 (왼쪽이 가장 먼저 들어간 정보)
        print(v,end=' ')

        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                visited[i] = True

N = int(input())

graph =[[] for _ in range(N+1)]
visited = [False] * (N+1)

for i in range(1,N+1):
    a,b = map(int,sys.stdin.readline().split())
    graph[a].append(b)
    graph[b].append(a)

bfs(graph,1,visited)
print(graph)
