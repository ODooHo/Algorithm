import sys
sys.setrecursionlimit(10**6)

input = sys.stdin.readline

def DFS(graph,v,visited):
    global cnt
    visited[v] = cnt
    for i in graph[v]:
        if not visited[i]:
            cnt +=1
            DFS(graph,i,visited)



n,m,r = map(int,input().split())

graph = [[] for _ in range(n+1)]
visited = [0]*(n+1)
cnt = 1

for i in range(m):
    u,v = map(int,input().split())
    graph[u].append(v)
    graph[v].append(u)

graph = [sorted(row,reverse= True) for row in graph]
DFS(graph,r,visited)


for i in range(1,n+1):
    print(visited[i])