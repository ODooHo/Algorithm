import sys
def dfs(graph,v,visited):
    visited[v] = True
    global virus
    for i in graph[v]:
        if not visited[i]:
            dfs(graph,i,visited)
            virus+=1

virus = 0
N = int(input())
graph = [[]]*(N+1)
visited = [False]*(N+1)
for j in range(N):
    graph[j+1]=[]
k = int(input())
for i in range(k):
    a,b = map(int,sys.stdin.readline().split())
    graph[a].append(b)
    graph[b].append(a)
dfs(graph,1,visited)
print(virus)



