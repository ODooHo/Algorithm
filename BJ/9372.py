import sys

sys.setrecursionlimit(10 ** 7)

input = sys.stdin.readline

def dfs(v):
    visited[v] = True
    for i in graph[v]:
        if not visited[i]:
            dfs(i)



T = int(input())

for _ in range(T):
    n, m = map(int, input().split())
    cnt = 0
    graph = [[] for _ in range(n+1)]
    visited = [False]*(n+1)
    for i in range(m):
        a, b = map(int, input().split())
        graph[a].append(b)
        graph[b].append(a)
        for j in range(1,len(graph)):
            if not visited[j]:
                dfs(j)
                cnt += 1
    print(cnt)

# import sys
#
# input = sys.stdin.readline
#
#
# for _ in range(int(input())):
#     N, M = map(int, input().split())
#     for _ in range(M):
#         u, v = map(int, input().split())
#     print(N-1)