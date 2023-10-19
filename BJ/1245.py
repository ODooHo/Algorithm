import sys
sys.setrecursionlimit(10**6)

input = sys.stdin.readline




def dfs(i,j):
    global flag
    
    visited[i][j] = True

    for k in range(8):
        x,y = i + dx[k], j + dy[k]

        if 0<=x<n and 0<=y<m:
            if graph[i][j] < graph[x][y]:
                flag = False
             
            if graph[x][y] == graph[i][j] and not visited[x][y]:
                dfs(x,y)
            




                                                                                                                                                                                         

n,m = map(int,input().split())

graph = [list(map(int,input().split())) for _ in range(n)]

visited = [[False] * m for _ in range(n)]

cnt = 0

dx = [-1,0,1,1,1,0,-1,-1]
dy = [1,1,1,0,-1,-1,-1,0]


flag = False




for i in range(n):
    for j in range(m):
        if graph[i][j] > 0 and not visited[i][j]:
            flag = True
            dfs(i,j)


            if flag:
                cnt+=1

print(cnt)