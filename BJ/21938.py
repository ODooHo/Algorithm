from collections import deque
import sys


input = sys.stdin.readline



def bfs2(x,y):
    q = deque()
    q.append((x,y))
    visited[x][y] = True
    while q:
        x,y = q.popleft()
        for i in range(4):
            a,b = x+dx[i], y+dy[i]
            if 0<=a<n and 0<=b<m and not visited[a][b] and result[a][b] >=t:
                visited[a][b] = True
                q.append((a,b))



n,m = map(int,input().split())

result = []
for i in range(n):
    graph = list(map(int,input().split()))
    temp = []
    for j in range(m):
        temp.append(sum(graph[3*j:3*(j+1)]))
    result.append(temp)

t = int(input())
t = 3*t
dx = [0,1,0,-1]
dy = [1,0,-1,0]
cnt = 0

visited = [[False] *m for _ in range(n)]


for i in range(n):
    for j in range(m):
        if not visited[i][j] and result[i][j] >= t:
            cnt +=1
            bfs2(i,j)
print(cnt)