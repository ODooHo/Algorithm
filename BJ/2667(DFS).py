import sys
sys.setrecursionlimit(10**9)

input = sys.stdin.readline

N = int(input())

graph = [list(map(int,input().rstrip()))for _ in range(N)]
visited = [[False]*N for _ in range(N)]

dx = [0,1,0,-1]
dy = [1,0,-1,0]

apart = [1000000000]*(N**2)
building = 0
unit = 0


def dfs(x,y):
    global visited
    global building
    global unit
    visited[x][y] = True
    graph[x][y] = building
    unit +=1
    for i in range(4):
        a,b = x + dx[i],y+dy[i]
        if 0<= a < N and 0 <= b < N:
            if not visited[a][b] and graph[a][b] ==1:
                visited[a][b] = True
                dfs(a,b)


for i in range(N):
    for j in range(N):
        if not visited[i][j] and graph[i][j] == 1:
            unit = 0
            dfs(i,j)
            apart[building] = unit
            building+=1
apart.sort()
print(building)
for k in range(building):
    print(apart[k])


