from collections import deque
import sys



input = sys.stdin.readline


def bfs(x,y):
    visited[x] = True
    q = deque()
    q.append((x,y))
    while q:
        x,y = q.popleft()
        left = x-y
        right = x+y
        if 0<=left<n and not visited[left]:
            q.append((left,graph[left]))
        if 0 <= right < n and not visited[right]:
            q.append((right,graph[right]))




n = int(input())
graph = list(map(int,input().split()))
visited = [False]* n
A = int(input())
result = bfs(A-1,graph[A-1])
print(visited.count(True))
