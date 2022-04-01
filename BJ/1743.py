import sys
sys.setrecursionlimit(10**9)

input = sys.stdin.readline

def dfs(x, y):
    global visited
    global trash
    visited[x][y] = True
    trash+=1
    for i in range(4):
        a, b = x + dx[i], y + dy[i]
        if 0 <= a < N+1 and 0 <= b < M+1:
            if not visited[a][b] and graph[a][b] == "#":
                visited[a][b] = True
                dfs(a, b)


N,M,K = map(int,input().split())
graph = [["."]*(M+1) for _ in range(N+1)]
visited = [[False]*(M+1)for _ in range(N+1)]
trash = 0
maximum = 0
dx = [0,1,0,-1]
dy = [1,0,-1,0]


for i in range(1,K+1):
    x,y = map(int,input().split())
    graph[x][y] = "#"


for a in range(1,N+1):
    for b in range(1,M+1):
        if graph[a][b] == "#":
            trash = 0
            dfs(a,b)
            maximum = max(maximum,trash)

print(maximum)