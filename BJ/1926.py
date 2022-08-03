import sys

sys.setrecursionlimit(10**9)

input = sys.stdin.readline



def dfs(x,y):
    global cnt
    graph[x][y] = 0
    cnt +=1

    for i in range(4):
        a = x+dx[i]
        b = y+dy[i]
        if 0<=a<n and 0<=b<m:
            if graph[a][b] == 1:
                dfs(a,b)
    return cnt



n,m = map(int,input().split())

graph = [list(map(int,input().split()))for _ in range(n)]
dx = [0,1,0,-1]
dy = [1,0,-1,0]
count = []
num = 0


for i in range(n):
    for j in range(m):
        if graph[i][j] == 1:
            num+=1
            cnt=0
            count.append(dfs(i,j))
if len(count)==0:
    print(len(count))
    print(0)
else:
    print(len(count))
    print(max(count))