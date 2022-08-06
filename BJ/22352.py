from collections import deque
import sys


input = sys.stdin.readline


def bfs(x,y):
    last_v = last[x][y]
    last[x][y] = post[x][y]
    q = deque()
    q.append((x,y))
    while q:
        x,y = q.popleft()
        for i in range(4):
            a,b = x+dx[i],y+dy[i]
            if a < 0 or b< 0 or a>=n or b >= m:
                continue
            if last_v == last[a][b]:
                q.append((a,b))
                last[a][b] = post[x][y]




n,m = map(int,input().split())

last = [list(map(int,input().split()))for _ in range(n)]
post = [list(map(int,input().split()))for _ in range(n)]
visited = [[False] * m for _ in range(n)]


dx = [1,0,-1,0]
dy = [0,1,0,-1]

check = True

for i in range(n):
    for j in range(m):
        if last[i][j] != post[i][j]:
            bfs(i,j) #백신 투여 1회만 해야함
            check = False
            break
        if not check:
            break


if last == post:
    print("YES")
else:
    print("NO")