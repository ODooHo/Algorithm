import sys
sys.setrecursionlimit(10**9)

input = sys.stdin.readline

def dfs(s,v):
    global graph
    global visited
    visited[s][v] = True
    for i in range(8):
        x,y = s+dx[i],v+dy[i]
        if 0<=x<h and 0<=y<w:
            if graph[x][y] == 1 and not visited[x][y]:
                visited[x][y] = True
                dfs(x,y)



w=1
h=1

while True:
    counter = 0
    w, h = map(int,input().split())
    if w+h == 0:
        break
    graph = []
    dx = [-1,0,1,1,1,0,-1,-1]
    dy = [1,1,0,1,-1,-1,-1,0]
    visited = [[False]*w for _ in range(h)]
    for i in range(h):
        temp = list(map(int,input().split()))
        graph.append(temp)

    for i in range(h):
        for j in range(w):
            if graph[i][j] == 1 and not visited[i][j]:
                counter +=1
                dfs(i,j)
    print(counter)