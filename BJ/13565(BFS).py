import sys
from collections import deque #큐를 사용하기 위한 라이브러리

def bfs():
    while queue:
        a,b = queue.popleft() #왼쪽부터 뽑음 (왼쪽이 가장 먼저 들어간 정보)
        if a == N-1:
            print("YES")
            return
        for i in range(4):
            a , b = a+dx[i],b+dy[i]
            if 0 <= a < N and 0 <= b < M:
                if not visited[a][b] and graph[a][b] == 0:
                    visited[a][b] = True
                    queue.append((a,b))
    print("NO")





dx = [0,1,0,-1]
dy = [1,0,-1,0]
N,M = map(int,sys.stdin.readline().split())
graph = [list(map(int,sys.stdin.readline().rstrip()))for _ in range(N)]
visited = [[False]*M for _ in range(N)]

queue = deque()
for i in range(M):
    if graph[0][i]==0:
        queue.append((0,i))
        visited[0][i] = True
bfs()




