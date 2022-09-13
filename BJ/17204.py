from collections import deque
import sys

input = sys.stdin.readline

def bfs(v):
    q = deque()
    q.append(v)
    cnt = 0
    for _ in range(n):
        x = q.popleft()
        cnt+=1
        if graph[x] == m:
            return cnt

        q.append(graph[x])

    return -1


n,m = map(int,input().split())


graph = [int(input()) for _ in range(n)]
visited = [0]*(n)

result = bfs(0)
print(result)
