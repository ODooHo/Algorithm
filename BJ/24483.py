import sys
sys.setrecursionlimit(10**6)

input = sys.stdin.readline

def DFS(graph,v,visited,depth):
    global cnt

    visited[v] = cnt
    deep[v] = depth

    for i in graph[v]:
        if not visited[i]:
            cnt+=1
            DFS(graph,i,visited,depth+1)



n,m,r = map(int,input().split())

graph = [[] for _ in range(n+1)]
visited = [0]*(n+1)
deep = [-1] * (n+1)
cnt = 1
result = []


for i in range(m):
    u,v = map(int,input().split())
    graph[u].append(v)
    graph[v].append(u)

graph = [sorted(row) for row in graph]
DFS(graph,r,visited,0)



for i in range(1,n+1):
    temp = visited[i] * deep[i]
    result.append(temp)

print(sum(result))
