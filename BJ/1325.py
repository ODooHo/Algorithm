import sys

input = sys.stdin.readline

def dfs(start):
    global visited
    global graph

    visited[start] = True




hack = [[]]
n,m = map(int,input().split())
graph = [[]for _ in range(n+1)]
visited = [False]*(n+1)


for i in range(m):
    a,b = map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)

for i in range(1,n+1):
    if not visited[i]:

