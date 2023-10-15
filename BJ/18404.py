import sys
from collections import deque


input = sys.stdin.readline


def bfs(x,y):
    queue = deque()
    queue.append((x,y))
    visited[x][y] = 0
    while queue:
        x,y = queue.popleft()
        for i in range(8):
            nx,ny = x+dx[i],y+dy[i]
            if 0<=nx<n and 0<=ny<n and visited[nx][ny] == -1:
                queue.append((nx,ny))
                visited[nx][ny] = visited[x][y] + 1
    





n,m = map(int,input().split())
x,y = map(int,input().split())

dx = [-2,-2,-1,-1,1,1,2,2]
dy = [-1,1,-2,2,-2,2,-1,1]



opp = []
result = []
visited = [[-1]* (n) for _ in range(n)]
for _ in range(m):
    a,b = map(int,input().split())
    opp.append((a,b))


bfs(x-1,y-1)

for i,j in opp:
    print(visited[i-1][j-1],end=" ")
print()