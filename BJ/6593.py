import sys
from collections import deque


def bfs(c,a,b):
    global result
    global graph
    global visited
    queue = deque()
    queue.append((c,a,b))
    result[c][a][b] = 0
    while queue:
        c,a,b = queue.popleft() #왼쪽부터 뽑음 (왼쪽이 가장 먼저 들어간 정보)
        for i in range(6):
            x , y, z = a+dx[i],b+dy[i],c + dz[i]
            if 0 <= x < R and 0 <= y < C and 0 <= z < L:
                if graph[z][x][y] == "E":
                    print(f"Escaped in {result[c][a][b]+1} minute(s).")
                    return
                if not visited[z][x][y] and graph[z][x][y] == ".":
                    result[z][x][y] = result[c][a][b]+1
                    visited[z][x][y] = True
                    queue.append((z,x,y))
    print("Trapped!")

while(1):
    L,R,C = map(int,sys.stdin.readline().split())
    if L+R+C ==0:
        break

    dx = [0,1,0,-1,0,0]
    dy = [1,0,-1,0,0,0]
    dz = [0,0,0,0,1,-1]

    result = [[[0]*C for _ in range(R)]for _ in range(L)]
    graph = [[[]for _ in range(R)]for _ in range(L)]
    visited = [[[False]*C for _ in range(R)]for _ in range(L)]


    for i in range(L):
        graph[i] = [list(map(str,sys.stdin.readline().rstrip()))for _ in range(R)]
        sys.stdin.readline()

    for z in range(L):
        for x in range(R):
            for y in range(C):
                if graph[z][x][y] == "S":
                    bfs(z,x,y)