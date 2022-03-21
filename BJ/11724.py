import sys

sys.setrecursionlimit(10**8)

def dfs(graph,v,visited):
    visited[v] = True
    for i in graph[v]:
        if not visited[i]:
            dfs(graph,i,visited)

global count
count = 0

N,M = map(int,input().split())
visited = [False]*(N+1)
graph = [[] for _ in range(N+1)]


for i in range(M):
    a,b = map(int,sys.stdin.readline().split())
    graph[a].append(b)
    graph[b].append(a)

for j in range(1,N+1): #1~ 연결되지 않은 노드들도 파악하기 위해 전부 탐색
    if not visited[j]:
        dfs(graph,j,visited)
        count +=1 #연결 요소 = 그래프를 이루고있는 요소들의 숫자
                  # 그래프 간의 분리된 노드를 의미?
print(count)