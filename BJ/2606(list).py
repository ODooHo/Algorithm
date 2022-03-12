import sys
def dfs(graph,v,visited):
    visited[v] = True
    temp.append(v)
    for i in graph[v]:
        if not visited[i]:
            dfs(graph,i,visited)
global temp
temp = []
N = int(input())
graph = [[]]*(N+1)
visited = [False]*(N+1)
for i in range(N):
    graph[i+1]=[]
k = int(input())
for j in range(k):
    a,b = map(int,sys.stdin.readline().split())
    graph[a].append(b)
    graph[b].append(a)

dfs(graph,1,visited)
print(len(temp)-1)



