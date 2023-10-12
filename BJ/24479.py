import sys
sys.setrecursionlimit(10 ** 6)

def DFS(graph,v,visited):
    global counter
    visited[v] = counter
    for i in graph[v]:
        if not visited[i]:
            counter +=1
            DFS(graph,i,visited)

input = sys.stdin.readline

n,m,r = map(int,input().split())

visited = [0] * (n+1) # 방문 순서 저장. 0이면 방문 X

graph = [[] for _ in range(n+1)]
counter = 1


for i in range(m):
    u,v = map(int,input().split())
    graph[u].append(v)
    graph[v].append(u)
    
graph =  [sorted(row)for row in graph]


DFS(graph,r,visited)

for i in range(1, n+1):
    print(visited[i])

