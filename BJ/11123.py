from collections import deque
import sys

input = sys.stdin.readline


def bfs(x, y):
    visited[x][y] = True
    q = deque()
    q.append((x, y))

    while q:
        x, y = q.popleft()
        for i in range(4):
            a, b = x + dx[i], y + dy[i]
            if 0 <= a < H and 0 <= b < W and not visited[a][b] and graph[a][b] == "#":
                q.append((a, b))
                visited[a][b] = True


T = int(input())

for _ in range(T):
    H,W = map(int, input().split())
    graph = [list(input().rstrip()) for _ in range(H)]
    visited = [[False] * W for _ in range(H)]
    num = 0
    dx = [0, 1, 0, -1]
    dy = [1, 0, -1, 0]

    for i in range(H):
        for j in range(W):
            if not visited[i][j] and graph[i][j] == "#":
                num += 1
                bfs(i, j)
    print(num)
