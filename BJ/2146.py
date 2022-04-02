import sys
from collections import deque

input = sys.stdin.readline
N = int(input())
graph = [list(map(int,input().split()))for _ in range(N)]
visited = [[False]*N for _ in range(N)]
result = 1000000000
def bfs(x,y):
    global cnt
    queue = deque()
    queue.append((x,y))
    visited[x][y] = True
    graph[x][y] = cnt
    while queue:
        x,y = queue.popleft()

        for i in range(4):
            a,b = x+dx[i],y+dy[i]
            if 0 <= a < N and 0 <= b < N:
                if not visited[a][b] and graph[a][b] == 1:
                    visited[a][b] = True
                    graph[a][b] = cnt #섬을 구분함. 1번섬,2번섬,3번섬
                    queue.append((a,b))
def bridge(k):
    global result
    distance = [[-1] * N for _ in range(N)]
    queue = deque()
    for i in range(N):
        for j in range(N):
            if graph[i][j] == k: #해당 섬일 경우
                queue.append((i,j))
                distance[i][j] = 0
    while queue:
        x,y = queue.popleft()

        for q in range(4):
            a,b = x+dx[q],y+dy[q]
            if a>=N or a<0 or b>=N or b<0:
                continue
            if graph[a][b] > 0 and graph[a][b] != k: #다른 땅을 만난다면,
                result = min(result,distance[x][y])
                return

            if graph[a][b] == 0 and distance[a][b] == -1: #바다 라면
                distance[a][b] = distance[x][y] +1
                queue.append((a,b))




dx = [0,1,0,-1]
dy = [1,0,-1,0]
cnt = 1

for i in range(N):  #배추.
    for j in range(N):
        if graph[i][j] == 1:
            if not visited[i][j]:
                bfs(i,j)
                cnt+=1

for k in range(1,cnt):
    bridge(k)

print(result)