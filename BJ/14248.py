import sys

sys.setrecursionlimit(10**6)


input = sys.stdin.readline


def dfs(x,a):
    visited[x] = True
    left = x-a
    right = x+a
    if 0<=left<n and not visited[left]:
        dfs(left, graph[left])
    if 0 <= right < n and not visited[right]:
        dfs(right,graph[right])




cnt = 0
n = int(input())
graph = list(map(int,input().split()))
visited = [False]* n
A = int(input())
result = dfs(A-1,graph[A-1])
print(visited.count(True))
