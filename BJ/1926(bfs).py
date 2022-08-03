from collections import deque
import sys


input = sys.stdin.readline



def bfs(x,y):
    q = deque()
    q.append((x,y))
    visited[x][y] = True
    cnt =1
    while q:
        x,y = q.popleft()
        for i in range(4):
            a = x+dx[i]
            b = y+dy[i]
            if 0<=a<n and 0<=b<m:
                if graph[a][b] == 1 and not visited[a][b]:
                    visited[a][b] = True
                    q.append((a,b))
                    cnt+=1
    return cnt



n,m = map(int,input().split())

graph = [list(map(int,input().split()))for _ in range(n)]
visited = [[False]*(m)for _ in range(n)]
dx = [0,1,0,-1]
dy = [1,0,-1,0]
count = [0]
num = 0


for i in range(n):
    for j in range(m):
        if graph[i][j] == 1 and not visited[i][j]:
            num+=1
            count.append(bfs(i,j))
print(num)
print(max(count))