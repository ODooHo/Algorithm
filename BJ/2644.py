import sys
from collections import deque

def bfs(x):
    global graph
    global result
    queue = deque()
    queue.append(x)
    visited[x] = True
    while queue:
        v = queue.popleft()
        for i in graph[v]:
            if not visited[i]:
                result[i] = result[v]+1
                queue.append(i)
                visited[i] = True





n = int(input())
x,y = map(int,sys.stdin.readline().split())
m = int(input())
result = [0 for _ in range(n+1)]

graph = [[] for _ in range(n+1)]

visited = [False]*(n+1)

for i in range(1,m+1):
    a,b = map(int,sys.stdin.readline().split())
    graph[a].append(b)
    graph[b].append(a)

bfs(x)
if result[y] != 0:
    print(result[y])
else:
    print(-1)


