import sys

sys.setrecursionlimit(10 ** 8)


def dfs(x, y):  # v = 현재 탐색 노드
    global visited
    visited[x][y] = True  # 현재 노드를 방문 처리
    graph[x][y] = 2
    for i in range(4):
        a, b = x + dx[i], y + dy[i]
        if 0 <= a < N and 0 <= b < M:
            if not visited[a][b] and graph[a][b] == 1:
                visited[a][b] = True
                dfs(a, b)


T = int(input())
for B in range(T):
    bug = 0
    M, N, K = map(int, sys.stdin.readline().split())

    graph = [[0] * (M) for _ in range(N)]

    visited = [[False] * (M) for _ in range(N)]
    dx = [0, 1, 0, -1]
    dy = [1, 0, -1, 0]
    for i in range(K):
        x, y = map(int, sys.stdin.readline().split())
        graph[y][x] = 1

    for a in range(N):
        for b in range(M):
            if graph[a][b] == 1:
                dfs(a, b)
                bug += 1

    print(bug)
