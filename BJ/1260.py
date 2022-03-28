import sys
from collections import deque #큐를 사용하기 위한 라이브러리

def bfs(graph, start, visited):
    queue = deque([start])

    visited[start] = True

    while queue:
        v = queue.popleft() #왼쪽부터 뽑음 (왼쪽이 가장 먼저 들어간 정보)
        print(v, end=" ")
        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                visited[i] = True

def dfs(graph, v, visited):  # v = 현재 탐색 노드
    print(v, end=' ')
    visited[v] = True  # 현재 노드를 방문 처리
    for i in graph[v]:  # 현재 노드와 연결된 다른 노드를 재귀적으로 방문
        if not visited[i]:
            dfs(graph, i, visited)


N,M,V = map(int,sys.stdin.readline().split())


graph =[[] for _ in range(N+1)]
visited = [False] * (N+1)
visited2 = [False] * (N+1)

for i in range(1,M+1):
    a,b = map(int,sys.stdin.readline().split())
    graph[a].append(b)
    graph[b].append(a)
for i in range(1,N+1):
    graph[i].sort()
dfs(graph,V,visited)
print()
bfs(graph,V,visited2)

