import sys
from collections import deque #큐를 사용하기 위한 라이브러리

def bfs():
    queue = deque()
    while queue:
       x,y = queue.popleft() #왼쪽부터 뽑음 (왼쪽이 가장 먼저 들어간 정보)
       if x == M-1:
           print("YES")
           return
       else:
        for i in range(4):
            a,b = x+dx[i], y +dy[i]

            if 0<= a < M and 0<= b < N:
                if not visited[a][b] and graph[a][b] == 0:
                    visited[a][b] = True
                    queue.append((a,b))
    print("NO")



dx = [0, 1, 0, -1] #동 남 서 북
dy = [1, 0, -1, 0]
N,M= map(int,sys.stdin.readline().split())

graph =[list(map(int,input()))for _ in range(N)]
visited = [[False] * (N+1) for _ in range(M)]
bfs()

