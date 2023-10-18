import sys
sys.setrecursionlimit(10**6)


input = sys.stdin.readline


def dfs(i):
    global cnt
    visited[i] = cnt
    v = graph[i][0]
    if visited[v] == -1:
        cnt+=1
        dfs(v)
    return cnt

n = int(input())

graph = [[] for _ in range(n+1)]

for i in range(1,n+1):
    num = int(input())
    graph[i].append(num)

result = [0]*(n+1)


for i in range(1,n+1):
    visited = [-1] * (n+1)
    cnt = 1
    temp = dfs(i)
    result[i] = temp

print(result.index(max(result)))