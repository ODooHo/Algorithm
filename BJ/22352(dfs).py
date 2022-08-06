import sys

sys.setrecursionlimit(10 ** 6)

input = sys.stdin.readline


def dfs(x, y, v):
    visited[x][y] = True
    last_v = last[x][y]
    last[x][y] = v
    for i in range(4):
        a, b = x + dx[i], y + dy[i]
        if 0 <= a <= n-1 and 0 <= b <= m-1 and last[a][b] == last_v and not visited[a][b]:
            dfs(a, b, v)


n, m = map(int, input().split())

last = [list(map(int, input().split())) for _ in range(n)]
post = [list(map(int, input().split())) for _ in range(n)]
visited = [[False for _ in range(m)] for _ in range(n)]

dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]

check = True

for i in range(n):
    for j in range(m):
        if last[i][j] != post[i][j]:
            dfs(i, j, post[i][j])  # 백신 투여 1회만 해야함
            check = False
            break
        if not check:
            break

check = True

for i in range(n):
    for j in range(m):
        if last[i][j] != post[i][j]:
            check = False
            break

if check:
    print("YES")
else:
    print("NO")
