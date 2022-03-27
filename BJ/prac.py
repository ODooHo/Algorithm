import sys
from collections import deque
DRIVER = 5
P = 6
D = 7
#a,b 승객 c,d 목적지
def bfs(n,m,a,b,c,d):
    visited = [[False]*(N+1) for _ in range(N+1)]
    queue = deque()
    queue.append((n,m))
    visited[n][m] = True
    while queue:
        x,y = queue.popleft()



    





dx=[0,1,0,-1]
dy=[1,0,-1,0]
N,M,fuel = map(int,sys.stdin.readline().split())
DEST = [[] for _ in range(N+1)] #목적지 배열로 접근
PASS = [[] for _ in range(N+1)] #승객 위치 배열로 접근

DD = []  #목적지 좌표/순서대로 넣어보기
PP = []  #승객 좌표/순서대로 넣어보기

graph = [list(map(int,sys.stdin.readline().split()))for _ in range(N)]
n,m = map(int,sys.stdin.readline().split())
graph[n][m] = DRIVER
for i in range(M):
    q,w,e,r = map(int,sys.stdin.readline().split())
    graph[q-1][w-1] = P
    graph[e-1][r-1] = D
    PP.append((q,w))
    DD.append((e,r))

print(graph)
print(PP,DD)

# for j in range(M):
#     a,b =PP[j]
#     c,d =DD[j]
#     bfs(n,m,a,b,c,d)
#     n,m = c,d
#

