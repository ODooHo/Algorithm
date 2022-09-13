from collections import deque
import sys

input = sys.stdin.readline

def bfs(v):
    q = deque()
    q.append(v)
    cnt = 1
    for _ in range(1,n+1):
        x = q.popleft()
        if graph[x] == n:
            return cnt
        cnt+=1
        q.append(graph[x])

    return 0

t = int(input())
for _ in range(t):
    n = int(input())
    graph = [[]for _ in range(n+1)]
    for i in range(1,n+1):
        a = int(input())
        graph[i] = a

    result = bfs(1)
    print(result)
