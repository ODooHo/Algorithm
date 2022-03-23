import sys
sys.setrecursionlimit(10**8)

def dfs(x,y):
    global result
    global visited
    visited[x][y] = True
    if x == N-1:
        result = True
        return result
    graph[x][y]=2
    for i in range(4):
        a,b = x + dx[i],y + dy[i]
        if 0 <= a < N and 0 <= b < M:
            if not visited[a][b] and graph[a][b]==0:
                visited[a][b] = True
                dfs(a,b)


N,M = map(int,sys.stdin.readline().split())

graph = [list(map(int,list(sys.stdin.readline().rstrip())))for _ in range(N)]
visited = [[False]*(M) for _ in range(N)]
result = False
dx = [0,1,0,-1]
dy = [1,0,-1,0]

for j in range(M):
    if graph[0][j] ==0:
        dfs(0,j)
        if result:
            print("YES")
            break
if not result:
    print("NO")


