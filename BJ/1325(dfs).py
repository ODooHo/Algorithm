import sys
sys.setrecursionlimit(10**9)

input = sys.stdin.readline

def dfs(start):
    global count
    global graph
    global visited
    count += 1
    visited[start] = True
    for i in graph[start]:
        if not visited[i]:
            visited[i] = True
            dfs(i)
    return count


n,m = map(int,input().split())
hack = []
graph = [[]for _ in range(n+1)]


for i in range(m):
    a,b = map(int,input().split())
    graph[b].append(a)
max_value = -1
for i in range(1, n + 1):
    visited = [False] * (n + 1)
    count = 0
    result = dfs(i)
    if result > max_value:
        hack = [i]
        max_value = result
    elif result == max_value:
        hack.append(i)

for re in hack:
    print(re, end=" ")