import sys
def dfs(graph,v,visited):
    visited[v] = True
    temp.append(v)
    for i in graph[v]:
        if not visited[i]:
            dfs(graph,i,visited)
    return temp

virus = 0
global virus
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

A = dfs(graph,1,visited)
print(len(A)-1)



