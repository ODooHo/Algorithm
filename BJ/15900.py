from collections import deque

import sys


input = sys.stdin.readline




def bfs(v):
    q = deque([v])
    cnt = 0

    while q:
        x = q.popleft()
        if len(graph[x])==1 and x!=1:
            cnt += visited[x]
            continue

        for i in graph[x]:
            if visited[i]==0:
                visited[i] = visited[x]+1
                q.append(i)
    return cnt






n = int(input())
graph = [[]for _ in range(n+1)]
visited = [0] *(n+1)



for i in range(n-1):
    a,b = map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)

result = bfs(1)

if result %2:
    print("Yes")
else:
    print("No")



