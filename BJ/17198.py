import sys
from collections import deque

input = sys.stdin.readline


def bfs(x,y):
    q = deque()
    q.append((x,y))
    field[x][y] = 0
    while q:
        x,y = q.popleft()
        for i in range(4):
            a,b = x+dx[i],y+dy[i]
            if 0<=a<10 and 0<=b<10:
                if field[a][b] == 'L':
                    return field[x][y]
                if field[a][b] == '.':
                    q.append((a,b))
                    field[a][b] = field[x][y] + 1






field =[list(input())for _ in range(10)]

dx = [-1,0,1,0]
dy = [0,-1,0,1]




for i in range(10):
    for j in range(10):
        if field[i][j] == 'B':
            cnt = bfs(i,j)
print(cnt)