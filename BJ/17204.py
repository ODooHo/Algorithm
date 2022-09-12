import sys
sys.setrecursionlimit(10**6)


input = sys.stdin.readline


def dfs(v):
    global visited
    global graph
    global cnt
    visited[v] = True
    cnt += 1
    for i in graph[v]:
        if not visited[i]:
            if i == m:
                return cnt












n,m = map(int,input().split())


cnt = 0
graph = [[] for _ in range(n)]
visited = [[False]*n]
for i in range(n):
    a = int(input())
    graph[i].append(a)
    graph[a].append(i)


result = dfs(0)
print(result)