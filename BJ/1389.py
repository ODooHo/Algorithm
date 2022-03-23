import sys
from collections import deque

def bfs(graph, start):
    counter = [0] * (N + 1) #노드를 표현하기위한 리스트, 안엔 시작 노드와의 거리를 담고있다.
    queue = deque([start])
    visited = [start] #bool로 방문처리를 할 경우, 계속 리셋해줘야하고, 탐색이 원활이 안됨
                      #따라서, 방문한 노드의 번호를 넣어두고, 탐색함.
    queue.append(start)
    while queue:
        v = queue.popleft() #왼쪽부터 뽑음 (왼쪽이 가장 먼저 들어간 정보)
        for i in graph[v]:
            if i not in visited:
                counter[i] = counter[v] + 1 #해당 노드까지의 거리 +1
                queue.append(i)
                visited.append(i)
    print(counter)
    return sum(counter)

N,M = map(int,sys.stdin.readline().split())

graph =[[] for _ in range(N+1)]
result = []

for i in range(M):
    a,b = map(int,sys.stdin.readline().split())
    graph[a].append(b)
    graph[b].append(a)


for j in range(1,N+1):  #각 노드마다 dfs를 시행하여, 거리를 계산한다.
    result.append(bfs(graph,j))

print(result.index(min(result))+1)